// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

/**
 * Host to create watch with root files and options
 */
sealed external interface WatchCompilerHostOfFilesAndCompilerOptions<T : BuilderProgram> : WatchCompilerHost<T> {
    /** root files to use to generate program */
    var rootFiles: ReadonlyArray<String>

    /** Compiler options */
    var options: CompilerOptions
    var watchOptions: WatchOptions?

    /** Project References */
    var projectReferences: ReadonlyArray<ProjectReference>?
}
