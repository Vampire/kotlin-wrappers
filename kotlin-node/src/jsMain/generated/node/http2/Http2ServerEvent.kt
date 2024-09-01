// Generated by Karakum - do not modify it manually!

package node.http2


sealed external interface Http2ServerEvent {
    sealed interface CHECKCONTINUE : node.events.LegacyEventType
    sealed interface REQUEST : node.events.LegacyEventType
    sealed interface SESSION : node.events.LegacyEventType
    sealed interface SESSIONERROR : node.events.LegacyEventType
    sealed interface STREAM : node.events.LegacyEventType
    sealed interface TIMEOUT : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("checkContinue")
        val CHECKCONTINUE: CHECKCONTINUE

        @seskar.js.JsValue("request")
        val REQUEST: REQUEST

        @seskar.js.JsValue("session")
        val SESSION: SESSION

        @seskar.js.JsValue("sessionError")
        val SESSIONERROR: SESSIONERROR

        @seskar.js.JsValue("stream")
        val STREAM: STREAM

        @seskar.js.JsValue("timeout")
        val TIMEOUT: TIMEOUT

        @seskar.js.JsValue("checkContinue")
        fun checkContinue(): node.events.EventType<Http2Server, js.array.JsTuple2<Http2ServerRequest, Http2ServerResponse>>

        @seskar.js.JsValue("request")
        fun request(): node.events.EventType<Http2Server, js.array.JsTuple2<Http2ServerRequest, Http2ServerResponse>>

        @seskar.js.JsValue("session")
        fun session(): node.events.EventType<Http2Server, js.array.JsTuple1<ServerHttp2Session>>

        @seskar.js.JsValue("sessionError")
        fun sessionError(): node.events.EventType<Http2Server, js.array.JsTuple1<js.errors.JsError>>

        @seskar.js.JsValue("stream")
        fun stream(): node.events.EventType<Http2Server, js.array.JsTuple3<ServerHttp2Stream, IncomingHttpHeaders, Double>>

        @seskar.js.JsValue("timeout")
        fun timeout(): node.events.EventType<Http2Server, js.array.JsTuple>
    }
}
