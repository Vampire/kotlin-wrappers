// Generated by Karakum - do not modify it manually!

package node.inspector.runtime

sealed external interface RunScriptParameterType {
    /**
     * Id of the script to run.
     */
    var scriptId: ScriptId

    /**
     * Specifies in which execution context to perform script run. If the parameter is omitted the evaluation will be performed in the context of the inspected page.
     */
    var executionContextId: ExecutionContextId?

    /**
     * Symbolic group name that can be used to release multiple objects.
     */
    var objectGroup: String?

    /**
     * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
     */
    var silent: Boolean?

    /**
     * Determines whether Command Line API should be available during the evaluation.
     */
    var includeCommandLineAPI: Boolean?

    /**
     * Whether the result is expected to be a JSON object which should be sent by value.
     */
    var returnByValue: Boolean?

    /**
     * Whether preview should be generated for the result.
     */
    var generatePreview: Boolean?

    /**
     * Whether execution should <code>await</code> for resulting value and return once awaited promise is resolved.
     */
    var awaitPromise: Boolean?
}
