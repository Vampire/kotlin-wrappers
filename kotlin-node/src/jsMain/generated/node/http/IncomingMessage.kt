// Generated by Karakum - do not modify it manually!

@file:JsModule("node:http")

package node.http

import node.net.Socket

/**
 * An `IncomingMessage` object is created by {@link Server} or {@link ClientRequest} and passed as the first argument to the `'request'` and `'response'` event respectively. It may be used to
 * access response
 * status, headers, and data.
 *
 * Different from its `socket` value which is a subclass of `stream.Duplex`, the `IncomingMessage` itself extends `stream.Readable` and is created separately to
 * parse and emit the incoming HTTP headers and payload, as the underlying socket
 * may be reused multiple times in case of keep-alive.
 * @since v0.1.17
 */
open external class IncomingMessage : node.stream.Readable {
    constructor (socket: Socket)

    /**
     * The `message.aborted` property will be `true` if the request has
     * been aborted.
     * @since v10.1.0
     * @deprecated Since v17.0.0,v16.12.0 - Check `message.destroyed` from <a href="stream.html#class-streamreadable" class="type">stream.Readable</a>.
     */
    var aborted: Boolean

    /**
     * In case of server request, the HTTP version sent by the client. In the case of
     * client response, the HTTP version of the connected-to server.
     * Probably either `'1.1'` or `'1.0'`.
     *
     * Also `message.httpVersionMajor` is the first integer and `message.httpVersionMinor` is the second.
     * @since v0.1.1
     */
    var httpVersion: String
    var httpVersionMajor: Double
    var httpVersionMinor: Double

    /**
     * The `message.complete` property will be `true` if a complete HTTP message has
     * been received and successfully parsed.
     *
     * This property is particularly useful as a means of determining if a client or
     * server fully transmitted a message before a connection was terminated:
     *
     * ```js
     * const req = http.request({
     *   host: '127.0.0.1',
     *   port: 8080,
     *   method: 'POST',
     * }, (res) => {
     *   res.resume();
     *   res.on('end', () => {
     *     if (!res.complete)
     *       console.error(
     *         'The connection was terminated while the message was still being sent');
     *   });
     * });
     * ```
     * @since v0.3.0
     */
    var complete: Boolean

    /**
     * Alias for `message.socket`.
     * @since v0.1.90
     * @deprecated Since v16.0.0 - Use `socket`.
     */
    var connection: Socket

    /**
     * The `net.Socket` object associated with the connection.
     *
     * With HTTPS support, use `request.socket.getPeerCertificate()` to obtain the
     * client's authentication details.
     *
     * This property is guaranteed to be an instance of the `net.Socket` class,
     * a subclass of `stream.Duplex`, unless the user specified a socket
     * type other than `net.Socket` or internally nulled.
     * @since v0.3.0
     */
    var socket: Socket

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
     * Duplicates in raw headers are handled in the following ways, depending on the
     * header name:
     *
     * * Duplicates of `age`, `authorization`, `content-length`, `content-type`, `etag`, `expires`, `from`, `host`, `if-modified-since`, `if-unmodified-since`, `last-modified`, `location`,
     * `max-forwards`, `proxy-authorization`, `referer`, `retry-after`, `server`, or `user-agent` are discarded.
     * To allow duplicate values of the headers listed above to be joined,
     * use the option `joinDuplicateHeaders` in {@link request} and {@link createServer}. See RFC 9110 Section 5.3 for more
     * information.
     * * `set-cookie` is always an array. Duplicates are added to the array.
     * * For duplicate `cookie` headers, the values are joined together with `; `.
     * * For all other headers, the values are joined together with `, `.
     * @since v0.1.5
     */
    var headers: IncomingHttpHeaders

    /**
     * Similar to `message.headers`, but there is no join logic and the values are
     * always arrays of strings, even for headers received just once.
     *
     * ```js
     * // Prints something like:
     * //
     * // { 'user-agent': ['curl/7.22.0'],
     * //   host: ['127.0.0.1:8000'],
     * //   accept: ['*'] }
     * console.log(request.headersDistinct);
     * ```
     * @since v18.3.0, v16.17.0
     */
    var headersDistinct: node.Dict<js.array.ReadonlyArray<String>>

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
     * @since v0.11.6
     */
    var rawHeaders: js.array.ReadonlyArray<String>

    /**
     * The request/response trailers object. Only populated at the `'end'` event.
     * @since v0.3.0
     */
    var trailers: node.Dict<String>

    /**
     * Similar to `message.trailers`, but there is no join logic and the values are
     * always arrays of strings, even for headers received just once.
     * Only populated at the `'end'` event.
     * @since v18.3.0, v16.17.0
     */
    var trailersDistinct: node.Dict<js.array.ReadonlyArray<String>>

    /**
     * The raw request/response trailer keys and values exactly as they were
     * received. Only populated at the `'end'` event.
     * @since v0.11.6
     */
    var rawTrailers: js.array.ReadonlyArray<String>

    /**
     * Calls `message.socket.setTimeout(msecs, callback)`.
     * @since v0.5.9
     */
    fun setTimeout(msecs: Number, callback: () -> Unit = definedExternally): Unit /* this */

    /**
     * **Only valid for request obtained from {@link Server}.**
     *
     * The request method as a string. Read only. Examples: `'GET'`, `'DELETE'`.
     * @since v0.1.1
     */
    var method: String?

    /**
     * **Only valid for request obtained from {@link Server}.**
     *
     * Request URL string. This contains only the URL that is present in the actual
     * HTTP request. Take the following request:
     *
     * ```http
     * GET /status?name=ryan HTTP/1.1
     * Accept: text/plain
     * ```
     *
     * To parse the URL into its parts:
     *
     * ```js
     * new URL(`http://${process.env.HOST ?? 'localhost'}${request.url}`);
     * ```
     *
     * When `request.url` is `'/status?name=ryan'` and `process.env.HOST` is undefined:
     *
     * ```console
     * $ node
     * > new URL(`http://${process.env.HOST ?? 'localhost'}${request.url}`);
     * URL {
     *   href: 'http://localhost/status?name=ryan',
     *   origin: 'http://localhost',
     *   protocol: 'http:',
     *   username: '',
     *   password: '',
     *   host: 'localhost',
     *   hostname: 'localhost',
     *   port: '',
     *   pathname: '/status',
     *   search: '?name=ryan',
     *   searchParams: URLSearchParams { 'name' => 'ryan' },
     *   hash: ''
     * }
     * ```
     *
     * Ensure that you set `process.env.HOST` to the server's host name, or consider replacing this part entirely. If using `req.headers.host`, ensure proper
     * validation is used, as clients may specify a custom `Host` header.
     * @since v0.1.90
     */
    var url: String?

    /**
     * **Only valid for response obtained from {@link ClientRequest}.**
     *
     * The 3-digit HTTP response status code. E.G. `404`.
     * @since v0.1.1
     */
    var statusCode: Double?

    /**
     * **Only valid for response obtained from {@link ClientRequest}.**
     *
     * The HTTP response status message (reason phrase). E.G. `OK` or `Internal Server Error`.
     * @since v0.11.10
     */
    var statusMessage: String?

    /**
     * Calls `destroy()` on the socket that received the `IncomingMessage`. If `error` is provided, an `'error'` event is emitted on the socket and `error` is passed
     * as an argument to any listeners on the event.
     * @since v0.3.0
     */
    override fun destroy(error: js.errors.JsError): Unit /* this */
}
