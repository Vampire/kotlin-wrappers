// Generated by Karakum - do not modify it manually!

package node.https

import node.http.IncomingMessage
import node.http.ServerResponse
import node.stream.Duplex


sealed external interface ServerEvent {
    sealed interface KEYLOG : node.events.LegacyEventType
    sealed interface NEWSESSION : node.events.LegacyEventType
    sealed interface OCSPREQUEST : node.events.LegacyEventType
    sealed interface RESUMESESSION : node.events.LegacyEventType
    sealed interface SECURECONNECTION : node.events.LegacyEventType
    sealed interface TLSCLIENTERROR : node.events.LegacyEventType
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface CONNECTION : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface LISTENING : node.events.LegacyEventType
    sealed interface CHECKCONTINUE : node.events.LegacyEventType
    sealed interface CHECKEXPECTATION : node.events.LegacyEventType
    sealed interface CLIENTERROR : node.events.LegacyEventType
    sealed interface CONNECT : node.events.LegacyEventType
    sealed interface REQUEST : node.events.LegacyEventType
    sealed interface UPGRADE : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("keylog")
        val KEYLOG: KEYLOG

        @seskar.js.JsValue("newSession")
        val NEWSESSION: NEWSESSION

        @seskar.js.JsValue("OCSPRequest")
        val OCSPREQUEST: OCSPREQUEST

        @seskar.js.JsValue("resumeSession")
        val RESUMESESSION: RESUMESESSION

        @seskar.js.JsValue("secureConnection")
        val SECURECONNECTION: SECURECONNECTION

        @seskar.js.JsValue("tlsClientError")
        val TLSCLIENTERROR: TLSCLIENTERROR

        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("connection")
        val CONNECTION: CONNECTION

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("listening")
        val LISTENING: LISTENING

        @seskar.js.JsValue("checkContinue")
        val CHECKCONTINUE: CHECKCONTINUE

        @seskar.js.JsValue("checkExpectation")
        val CHECKEXPECTATION: CHECKEXPECTATION

        @seskar.js.JsValue("clientError")
        val CLIENTERROR: CLIENTERROR

        @seskar.js.JsValue("connect")
        val CONNECT: CONNECT

        @seskar.js.JsValue("request")
        val REQUEST: REQUEST

        @seskar.js.JsValue("upgrade")
        val UPGRADE: UPGRADE

        @seskar.js.JsValue("keylog")
        fun keylog(): node.events.EventType<Server<*, *>, js.array.JsTuple2<node.buffer.Buffer, node.tls.TLSSocket>>

        @seskar.js.JsValue("newSession")
        fun newSession(): node.events.EventType<Server<*, *>, js.array.JsTuple3<node.buffer.Buffer, node.buffer.Buffer, (err: js.errors.JsError, resp: node.buffer.Buffer) -> Unit>>

        @seskar.js.JsValue("OCSPRequest")
        fun OCSPRequest(): node.events.EventType<Server<*, *>, js.array.JsTuple3<node.buffer.Buffer, node.buffer.Buffer, (err: js.errors.JsError?, resp: node.buffer.Buffer) -> Unit>>

        @seskar.js.JsValue("resumeSession")
        fun resumeSession(): node.events.EventType<Server<*, *>, js.array.JsTuple2<node.buffer.Buffer, (err: js.errors.JsError, sessionData: node.buffer.Buffer) -> Unit>>

        @seskar.js.JsValue("secureConnection")
        fun secureConnection(): node.events.EventType<Server<*, *>, js.array.JsTuple1<node.tls.TLSSocket>>

        @seskar.js.JsValue("tlsClientError")
        fun tlsClientError(): node.events.EventType<Server<*, *>, js.array.JsTuple2<js.errors.JsError, node.tls.TLSSocket>>

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<Server<*, *>, js.array.JsTuple>

        @seskar.js.JsValue("connection")
        fun connection(): node.events.EventType<Server<*, *>, js.array.JsTuple1<Duplex>>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Server<*, *>, js.array.JsTuple1<js.errors.JsError>>

        @seskar.js.JsValue("listening")
        fun listening(): node.events.EventType<Server<*, *>, js.array.JsTuple>

        @seskar.js.JsValue("checkContinue")
        fun <Request : IncomingMessage, Response : ServerResponse<*>> checkContinue(): node.events.EventType<Server<Request, Response>, js.array.JsTuple2<Request, Response>>

        @seskar.js.JsValue("checkExpectation")
        fun <Request : IncomingMessage, Response : ServerResponse<*>> checkExpectation(): node.events.EventType<Server<Request, Response>, js.array.JsTuple2<Request, Response>>

        @seskar.js.JsValue("clientError")
        fun clientError(): node.events.EventType<Server<*, *>, js.array.JsTuple2<js.errors.JsError, Duplex>>

        @seskar.js.JsValue("connect")
        fun <Request : IncomingMessage> connect(): node.events.EventType<Server<Request, *>, js.array.JsTuple3<Request, Duplex, node.buffer.Buffer>>

        @seskar.js.JsValue("request")
        fun <Request : IncomingMessage, Response : ServerResponse<*>> request(): node.events.EventType<Server<Request, Response>, js.array.JsTuple2<Request, Response>>

        @seskar.js.JsValue("upgrade")
        fun <Request : IncomingMessage> upgrade(): node.events.EventType<Server<Request, *>, js.array.JsTuple3<Request, Duplex, node.buffer.Buffer>>
    }
}
