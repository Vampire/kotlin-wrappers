import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.process.ExecOperations
import org.gradle.workers.WorkAction
import org.gradle.workers.WorkParameters
import javax.inject.Inject

abstract class PreprocessGithubWorkflowWorkAction : WorkAction<PreprocessGithubWorkflowWorkAction.Parameters> {
    @get:Inject
    abstract val execOperations: ExecOperations

    override fun execute() {
        // work-around for https://youtrack.jetbrains.com/issue/KT-74830
        (1..5).map {
            runCatching {
                execOperations.javaexec {
                    executable = parameters.javaExecutable.get().asFile.absolutePath
                    classpath(parameters.kotlinCompilerClasspath)
                    mainClass.set("org.jetbrains.kotlin.cli.jvm.K2JVMCompiler")
                    args("-no-stdlib", "-no-reflect")
                    args("-classpath", parameters.mainKtsClasspath.asPath)
                    args("-script", parameters.workflowScript.get().asFile.absolutePath)

                    // work-around for https://youtrack.jetbrains.com/issue/KT-42101
                    systemProperty("kotlin.main.kts.compiled.scripts.cache.dir", "")
                }
                return
            }
        }.last().getOrThrow<Nothing>()
    }

    interface Parameters : WorkParameters {
        val workflowScript: RegularFileProperty
        val kotlinCompilerClasspath: ConfigurableFileCollection
        val mainKtsClasspath: ConfigurableFileCollection
        val javaExecutable: RegularFileProperty
    }
}
