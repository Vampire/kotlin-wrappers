// Generated by Karakum - do not modify it manually!

package node.inspector.debugger

/**
 * JavaScript call frame. Array of call frames form the call stack.
 */
sealed external interface CallFrame {
    /**
     * Call frame identifier. This identifier is only valid while the virtual machine is paused.
     */
    var callFrameId: CallFrameId

    /**
     * Name of the JavaScript function called on this call frame.
     */
    var functionName: String

    /**
     * Location in the source code.
     */
    var functionLocation: Location?

    /**
     * Location in the source code.
     */
    var location: Location

    /**
     * JavaScript script name or url.
     */
    var url: String

    /**
     * Scope chain for this call frame.
     */
    var scopeChain: js.array.ReadonlyArray<Scope>

    /**
     * <code>this</code> object for this call frame.
     */
    var `this`: node.inspector.runtime.RemoteObject

    /**
     * The value being returned, if the function is at return point.
     */
    var returnValue: node.inspector.runtime.RemoteObject?
}
