// Generated by Karakum - do not modify it manually!

package node.fs


sealed external interface FSWatcherEvent {
    sealed interface CHANGE : node.events.LegacyEventType
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("change")
        val CHANGE: CHANGE

        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("change")
        fun change(): node.events.EventType<FSWatcher, js.array.JsTuple2<String, Any /* string | Buffer */>>

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<FSWatcher, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<FSWatcher, js.array.JsTuple1<js.errors.JsError>>
    }
}
