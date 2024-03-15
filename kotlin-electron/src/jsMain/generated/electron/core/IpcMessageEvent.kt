// Generated by Karakum - do not modify it manually!


package electron.core


@Suppress("INTERFACE_WITH_SUPERCLASS")

external interface IpcMessageEvent : DOMEvent {
    /**
     * pair of `[processId, frameId]`.
     */
    var frameId: js.array.JsTuple2<Double, Double>
    var channel: String
    var args: js.array.ReadonlyArray<Any?>
}
