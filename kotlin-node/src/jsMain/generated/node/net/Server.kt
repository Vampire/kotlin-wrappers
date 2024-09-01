// Generated by Karakum - do not modify it manually!

@file:JsModule("node:net")

package node.net

import node.events.EventEmitter

/**
 * This class is used to create a TCP or `IPC` server.
 * @since v0.1.90
 */
open external class Server : EventEmitter {
    constructor (connectionListener: (socket: Socket) -> Unit = definedExternally)
    constructor (
        options: ServerOpts = definedExternally,
        connectionListener: (socket: Socket) -> Unit = definedExternally,
    )

    /**
     * Start a server listening for connections. A `net.Server` can be a TCP or
     * an `IPC` server depending on what it listens to.
     *
     * Possible signatures:
     *
     * * `server.listen(handle[, backlog][, callback])`
     * * `server.listen(options[, callback])`
     * * `server.listen(path[, backlog][, callback])` for `IPC` servers
     * * `server.listen([port[, host[, backlog]]][, callback])` for TCP servers
     *
     * This function is asynchronous. When the server starts listening, the `'listening'` event will be emitted. The last parameter `callback`will be added as a listener for the `'listening'`
     * event.
     *
     * All `listen()` methods can take a `backlog` parameter to specify the maximum
     * length of the queue of pending connections. The actual length will be determined
     * by the OS through sysctl settings such as `tcp_max_syn_backlog` and `somaxconn` on Linux. The default value of this parameter is 511 (not 512).
     *
     * All {@link Socket} are set to `SO_REUSEADDR` (see [`socket(7)`](https://man7.org/linux/man-pages/man7/socket.7.html) for
     * details).
     *
     * The `server.listen()` method can be called again if and only if there was an
     * error during the first `server.listen()` call or `server.close()` has been
     * called. Otherwise, an `ERR_SERVER_ALREADY_LISTEN` error will be thrown.
     *
     * One of the most common errors raised when listening is `EADDRINUSE`.
     * This happens when another server is already listening on the requested`port`/`path`/`handle`. One way to handle this would be to retry
     * after a certain amount of time:
     *
     * ```js
     * server.on('error', (e) => {
     *   if (e.code === 'EADDRINUSE') {
     *     console.error('Address in use, retrying...');
     *     setTimeout(() => {
     *       server.close();
     *       server.listen(PORT, HOST);
     *     }, 1000);
     *   }
     * });
     * ```
     */
    fun listen(
        port: Number = definedExternally,
        hostname: String = definedExternally,
        backlog: Number = definedExternally,
        listeningListener: () -> Unit = definedExternally,
    ): Unit /* this */

    fun listen(
        port: Number = definedExternally,
        hostname: String = definedExternally,
        listeningListener: () -> Unit = definedExternally,
    ): Unit /* this */

    fun listen(
        port: Number = definedExternally,
        backlog: Number = definedExternally,
        listeningListener: () -> Unit = definedExternally,
    ): Unit /* this */

    fun listen(port: Number = definedExternally, listeningListener: () -> Unit = definedExternally): Unit /* this */
    fun listen(
        path: String,
        backlog: Number = definedExternally,
        listeningListener: () -> Unit = definedExternally,
    ): Unit /* this */

    fun listen(path: String, listeningListener: () -> Unit = definedExternally): Unit /* this */
    fun listen(options: ListenOptions, listeningListener: () -> Unit = definedExternally): Unit /* this */
    fun listen(
        handle: Any?,
        backlog: Number = definedExternally,
        listeningListener: () -> Unit = definedExternally,
    ): Unit /* this */

    fun listen(handle: Any?, listeningListener: () -> Unit = definedExternally): Unit /* this */

    /**
     * Stops the server from accepting new connections and keeps existing
     * connections. This function is asynchronous, the server is finally closed
     * when all connections are ended and the server emits a `'close'` event.
     * The optional `callback` will be called once the `'close'` event occurs. Unlike
     * that event, it will be called with an `Error` as its only argument if the server
     * was not open when it was closed.
     * @since v0.1.90
     * @param callback Called when the server is closed.
     */
    fun close(callback: (err: js.errors.JsError? /* use undefined for default */) -> Unit = definedExternally): Unit /* this */

    /**
     * Returns the bound `address`, the address `family` name, and `port` of the server
     * as reported by the operating system if listening on an IP socket
     * (useful to find which port was assigned when getting an OS-assigned address):`{ port: 12346, family: 'IPv4', address: '127.0.0.1' }`.
     *
     * For a server listening on a pipe or Unix domain socket, the name is returned
     * as a string.
     *
     * ```js
     * const server = net.createServer((socket) => {
     *   socket.end('goodbye\n');
     * }).on('error', (err) => {
     *   // Handle errors here.
     *   throw err;
     * });
     *
     * // Grab an arbitrary unused port.
     * server.listen(() => {
     *   console.log('opened server on', server.address());
     * });
     * ```
     *
     * `server.address()` returns `null` before the `'listening'` event has been
     * emitted or after calling `server.close()`.
     * @since v0.1.90
     */
    fun address(): Any? /* AddressInfo | string | null */

    /**
     * Asynchronously get the number of concurrent connections on the server. Works
     * when sockets were sent to forks.
     *
     * Callback should take two arguments `err` and `count`.
     * @since v0.9.7
     */
    fun getConnections(cb: (error: js.errors.JsError?, count: Double) -> Unit): Unit

    /**
     * Opposite of `unref()`, calling `ref()` on a previously `unref`ed server will _not_ let the program exit if it's the only server left (the default behavior).
     * If the server is `ref`ed calling `ref()` again will have no effect.
     * @since v0.9.1
     */
    fun ref(): Unit /* this */

    /**
     * Calling `unref()` on a server will allow the program to exit if this is the only
     * active server in the event system. If the server is already `unref`ed calling`unref()` again will have no effect.
     * @since v0.9.1
     */
    fun unref(): Unit /* this */

    /**
     * Set this property to reject connections when the server's connection count gets
     * high.
     *
     * It is not recommended to use this option once a socket has been sent to a child
     * with `child_process.fork()`.
     * @since v0.2.0
     */
    var maxConnections: Double
    var connections: Double

    /**
     * Indicates whether or not the server is listening for connections.
     * @since v5.7.0
     */
    val listening: Boolean

    /**
     * events.EventEmitter
     *   1. close
     *   2. connection
     *   3. error
     *   4. listening
     *   5. drop
     */
    open fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun addListener(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: ServerEvent.CONNECTION, listener: (socket: Socket) -> Unit): Unit /* this */
    fun addListener(event: ServerEvent.ERROR, listener: (err: js.errors.JsError) -> Unit): Unit /* this */
    fun addListener(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: ServerEvent.DROP,
        listener: (data: DropArgument? /* use undefined for default */) -> Unit,
    ): Unit /* this */

    open fun emit(event: String, vararg args: Any?): Boolean

    open fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean
    fun emit(event: ServerEvent.CLOSE): Boolean
    fun emit(event: ServerEvent.CONNECTION, socket: Socket): Boolean
    fun emit(event: ServerEvent.ERROR, err: js.errors.JsError): Boolean
    fun emit(event: ServerEvent.LISTENING): Boolean
    fun emit(event: ServerEvent.DROP, data: DropArgument = definedExternally): Boolean
    open fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun on(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: ServerEvent.CONNECTION, listener: (socket: Socket) -> Unit): Unit /* this */
    fun on(event: ServerEvent.ERROR, listener: (err: js.errors.JsError) -> Unit): Unit /* this */
    fun on(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun on(
        event: ServerEvent.DROP,
        listener: (data: DropArgument? /* use undefined for default */) -> Unit,
    ): Unit /* this */

    open fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: ServerEvent.CONNECTION, listener: (socket: Socket) -> Unit): Unit /* this */
    fun once(event: ServerEvent.ERROR, listener: (err: js.errors.JsError) -> Unit): Unit /* this */
    fun once(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun once(
        event: ServerEvent.DROP,
        listener: (data: DropArgument? /* use undefined for default */) -> Unit,
    ): Unit /* this */

    open fun prependListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: ServerEvent.CONNECTION, listener: (socket: Socket) -> Unit): Unit /* this */
    fun prependListener(event: ServerEvent.ERROR, listener: (err: js.errors.JsError) -> Unit): Unit /* this */
    fun prependListener(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: ServerEvent.DROP,
        listener: (data: DropArgument? /* use undefined for default */) -> Unit,
    ): Unit /* this */

    open fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependOnceListener(event: ServerEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: ServerEvent.CONNECTION, listener: (socket: Socket) -> Unit): Unit /* this */
    fun prependOnceListener(event: ServerEvent.ERROR, listener: (err: js.errors.JsError) -> Unit): Unit /* this */
    fun prependOnceListener(event: ServerEvent.LISTENING, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: ServerEvent.DROP,
        listener: (data: DropArgument? /* use undefined for default */) -> Unit,
    ): Unit /* this */
}
