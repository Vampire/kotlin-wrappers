// Generated by Karakum - do not modify it manually!

package node.inspector.profiler

sealed external interface TakePreciseCoverageReturnType {
    /**
     * Coverage data for the current isolate.
     */
    var result: js.array.ReadonlyArray<ScriptCoverage>
}
