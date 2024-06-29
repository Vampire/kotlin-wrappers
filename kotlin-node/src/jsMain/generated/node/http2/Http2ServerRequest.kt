// Generated by Karakum - do not modify it manually!

@file:JsModule("node:http2")

package node.http2

/**
 * A `Http2ServerRequest` object is created by {@link Server} or {@link SecureServer} and passed as the first argument to the `'request'` event. It may be used to access a request status,
 * headers, and
 * data.
 * @since v8.4.0
 */
external class Http2ServerRequest : node.stream.Readable {
    constructor (
        stream: ServerHttp2Stream,
        headers: IncomingHttpHeaders,
        options: node.stream.ReadableOptions,
        rawHeaders: js.array.ReadonlyArray<String>,
    )

    /**
     * The `request.aborted` property will be `true` if the request has
     * been aborted.
     * @since v10.1.0
     */
    val aborted: Boolean

    /**
     * The request authority pseudo header field. Because HTTP/2 allows requests
     * to set either `:authority` or `host`, this value is derived from`req.headers[':authority']` if present. Otherwise, it is derived from`req.headers['host']`.
     * @since v8.4.0
     */
    val authority: String

    /**
     * See `request.socket`.
     * @since v8.4.0
     * @deprecated Since v13.0.0 - Use `socket`.
     */
    val connection: Any /* net.Socket | tls.TLSSocket */

    /**
     * The `request.complete` property will be `true` if the request has
     * been completed, aborted, or destroyed.
     * @since v12.10.0
     */
    val complete: Boolean

    /**
     * The request/response headers object.
     *
     * Key-value pairs of header names and values. Header names are lower-cased.
     *
     * ```js
     * // Prints something like:
     * //
     * // { 'user-agent': 'curl/7.22.0',
     * //   host: '127.0.0.1:8000',
     * //   accept: '*' }
     * console.log(request.headers);
     * ```
     *
     * See `HTTP/2 Headers Object`.
     *
     * In HTTP/2, the request path, host name, protocol, and method are represented as
     * special headers prefixed with the `:` character (e.g. `':path'`). These special
     * headers will be included in the `request.headers` object. Care must be taken not
     * to inadvertently modify these special headers or errors may occur. For instance,
     * removing all headers from the request will cause errors to occur:
     *
     * ```js
     * removeAllHeaders(request.headers);
     * assert(request.url);   // Fails because the :path header has been removed
     * ```
     * @since v8.4.0
     */
    val headers: IncomingHttpHeaders

    /**
     * In case of server request, the HTTP version sent by the client. In the case of
     * client response, the HTTP version of the connected-to server. Returns`'2.0'`.
     *
     * Also `message.httpVersionMajor` is the first integer and`message.httpVersionMinor` is the second.
     * @since v8.4.0
     */
    val httpVersion: String
    val httpVersionMinor: Double
    val httpVersionMajor: Double

    /**
     * The request method as a string. Read-only. Examples: `'GET'`, `'DELETE'`.
     * @since v8.4.0
     */
    val method: String

    /**
     * The raw request/response headers list exactly as they were received.
     *
     * The keys and values are in the same list. It is _not_ a
     * list of tuples. So, the even-numbered offsets are key values, and the
     * odd-numbered offsets are the associated values.
     *
     * Header names are not lowercased, and duplicates are not merged.
     *
     * ```js
     * // Prints something like:
     * //
     * // [ 'user-agent',
     * //   'this is invalid because there can be only one',
     * //   'User-Agent',
     * //   'curl/7.22.0',
     * //   'Host',
     * //   '127.0.0.1:8000',
     * //   'ACCEPT',
     * //   '*' ]
     * console.log(request.rawHeaders);
     * ```
     * @since v8.4.0
     */
    val rawHeaders: js.array.ReadonlyArray<String>

    /**
     * The raw request/response trailer keys and values exactly as they were
     * received. Only populated at the `'end'` event.
     * @since v8.4.0
     */
    val rawTrailers: js.array.ReadonlyArray<String>

    /**
     * The request scheme pseudo header field indicating the scheme
     * portion of the target URL.
     * @since v8.4.0
     */
    val scheme: String

    /**
     * Returns a `Proxy` object that acts as a `net.Socket` (or `tls.TLSSocket`) but
     * applies getters, setters, and methods based on HTTP/2 logic.
     *
     * `destroyed`, `readable`, and `writable` properties will be retrieved from and
     * set on `request.stream`.
     *
     * `destroy`, `emit`, `end`, `on` and `once` methods will be called on`request.stream`.
     *
     * `setTimeout` method will be called on `request.stream.session`.
     *
     * `pause`, `read`, `resume`, and `write` will throw an error with code`ERR_HTTP2_NO_SOCKET_MANIPULATION`. See `Http2Session and Sockets` for
     * more information.
     *
     * All other interactions will be routed directly to the socket. With TLS support,
     * use `request.socket.getPeerCertificate()` to obtain the client's
     * authentication details.
     * @since v8.4.0
     */
    val socket: Any /* net.Socket | tls.TLSSocket */

    /**
     * The `Http2Stream` object backing the request.
     * @since v8.4.0
     */
    val stream: ServerHttp2Stream

    /**
     * The request/response trailers object. Only populated at the `'end'` event.
     * @since v8.4.0
     */
    val trailers: IncomingHttpHeaders

    /**
     * Request URL string. This contains only the URL that is present in the actual
     * HTTP request. If the request is:
     *
     * ```http
     * GET /status?name=ryan HTTP/1.1
     * Accept: text/plain
     * ```
     *
     * Then `request.url` will be:
     *
     * ```js
     * '/status?name=ryan'
     * ```
     *
     * To parse the url into its parts, `new URL()` can be used:
     *
     * ```console
     * $ node
     * > new URL('/status?name=ryan', 'http://example.com')
     * URL {
     *   href: 'http://example.com/status?name=ryan',
     *   origin: 'http://example.com',
     *   protocol: 'http:',
     *   username: '',
     *   password: '',
     *   host: 'example.com',
     *   hostname: 'example.com',
     *   port: '',
     *   pathname: '/status',
     *   search: '?name=ryan',
     *   searchParams: URLSearchParams { 'name' => 'ryan' },
     *   hash: ''
     * }
     * ```
     * @since v8.4.0
     */
    var url: String

    /**
     * Sets the `Http2Stream`'s timeout value to `msecs`. If a callback is
     * provided, then it is added as a listener on the `'timeout'` event on
     * the response object.
     *
     * If no `'timeout'` listener is added to the request, the response, or
     * the server, then `Http2Stream` s are destroyed when they time out. If a
     * handler is assigned to the request, the response, or the server's `'timeout'`events, timed out sockets must be handled explicitly.
     * @since v8.4.0
     */
    fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally): Unit


    override fun readOrNull(size: Number): Any? /* Buffer | string | null */

    fun addListener(
        event: Http2ServerRequestEvent.ABORTED,
        listener: (hadError: Boolean, code: Double) -> Unit,
    ): Unit /* this */

    fun addListener(event: Http2ServerRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: Http2ServerRequestEvent.DATA,
        listener: (chunk: Any /* Buffer | string */) -> Unit,
    ): Unit /* this */

    fun addListener(event: Http2ServerRequestEvent.END, listener: () -> Unit): Unit /* this */
    fun addListener(event: Http2ServerRequestEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: Http2ServerRequestEvent.ERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun addListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun emit(event: Http2ServerRequestEvent.ABORTED, hadError: Boolean, code: Number): Boolean
    fun emit(event: Http2ServerRequestEvent.CLOSE): Boolean
    fun emit(event: Http2ServerRequestEvent.DATA, chunk: node.buffer.Buffer): Boolean

    fun emit(event: Http2ServerRequestEvent.DATA, chunk: String): Boolean
    fun emit(event: Http2ServerRequestEvent.END): Boolean
    fun emit(event: Http2ServerRequestEvent.READABLE): Boolean
    fun emit(event: Http2ServerRequestEvent.ERROR, err: Throwable /* JsError */): Boolean
    override fun emit(event: String, vararg args: Any?): Boolean

    override fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean
    fun on(event: Http2ServerRequestEvent.ABORTED, listener: (hadError: Boolean, code: Double) -> Unit): Unit /* this */
    fun on(event: Http2ServerRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: Http2ServerRequestEvent.DATA, listener: (chunk: Any /* Buffer | string */) -> Unit): Unit /* this */
    fun on(event: Http2ServerRequestEvent.END, listener: () -> Unit): Unit /* this */
    fun on(event: Http2ServerRequestEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun on(event: Http2ServerRequestEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun on(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(
        event: Http2ServerRequestEvent.ABORTED,
        listener: (hadError: Boolean, code: Double) -> Unit,
    ): Unit /* this */

    fun once(event: Http2ServerRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: Http2ServerRequestEvent.DATA, listener: (chunk: Any /* Buffer | string */) -> Unit): Unit /* this */
    fun once(event: Http2ServerRequestEvent.END, listener: () -> Unit): Unit /* this */
    fun once(event: Http2ServerRequestEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun once(event: Http2ServerRequestEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun once(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(
        event: Http2ServerRequestEvent.ABORTED,
        listener: (hadError: Boolean, code: Double) -> Unit,
    ): Unit /* this */

    fun prependListener(event: Http2ServerRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: Http2ServerRequestEvent.DATA,
        listener: (chunk: Any /* Buffer | string */) -> Unit,
    ): Unit /* this */

    fun prependListener(event: Http2ServerRequestEvent.END, listener: () -> Unit): Unit /* this */
    fun prependListener(event: Http2ServerRequestEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: Http2ServerRequestEvent.ERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependOnceListener(
        event: Http2ServerRequestEvent.ABORTED,
        listener: (hadError: Boolean, code: Double) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: Http2ServerRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: Http2ServerRequestEvent.DATA,
        listener: (chunk: Any /* Buffer | string */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: Http2ServerRequestEvent.END, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: Http2ServerRequestEvent.READABLE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: Http2ServerRequestEvent.ERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependOnceListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */
}
