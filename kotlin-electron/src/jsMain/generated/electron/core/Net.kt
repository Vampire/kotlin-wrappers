// Generated by Karakum - do not modify it manually!


package electron.core

import kotlin.js.Promise


external interface Net {
// Docs: https://electronjs.org/docs/api/net
    /**
     * see Response.
     *
     * Sends a request, similarly to how `fetch()` works in the renderer, using
     * Chrome's network stack. This differs from Node's `fetch()`, which uses Node.js's
     * HTTP stack.
     *
     * Example:
     *
     * This method will issue requests from the default session. To send a `fetch`
     * request from another session, use ses.fetch().
     *
     * See the MDN documentation for `fetch()` for more details.
     *
     * Limitations:
     *
     * * `net.fetch()` does not support the `data:` or `blob:` schemes.
     * * The value of the `integrity` option is ignored.
     * * The `.type` and `.url` values of the returned `Response` object are incorrect.
     *
     * By default, requests made with `net.fetch` can be made to custom protocols as
     * well as `file:`, and will trigger webRequest handlers if present. When the
     * non-standard `bypassCustomProtocolHandlers` option is set in RequestInit, custom
     * protocol handlers will not be called for this request. This allows forwarding an
     * intercepted request to the built-in handler. webRequest handlers will still be
     * triggered when bypassing custom protocols.
     *
     * Note: in the utility process custom protocols are not supported.
     */
    fun fetch(input: String, init: NetFetchInit = definedExternally): Promise<GlobalResponse>

    fun fetch(input: GlobalRequest, init: NetFetchInit = definedExternally): Promise<GlobalResponse>

    /**
     * Whether there is currently internet connection.
     *
     * A return value of `false` is a pretty strong indicator that the user won't be
     * able to connect to remote sites. However, a return value of `true` is
     * inconclusive; even if some link is up, it is uncertain whether a particular
     * connection attempt to a particular remote site will be successful.
     */
    fun isOnline(): Boolean

    /**
     * Creates a `ClientRequest` instance using the provided `options` which are
     * directly forwarded to the `ClientRequest` constructor. The `net.request` method
     * would be used to issue both secure and insecure HTTP requests according to the
     * specified protocol scheme in the `options` object.
     */
    fun request(options: ClientRequestConstructorOptions): ClientRequest

    fun request(options: String): ClientRequest

    /**
     * Resolves with the resolved IP addresses for the `host`.
     *
     * This method will resolve hosts from the default session. To resolve a host from
     * another session, use ses.resolveHost().
     */
    fun resolveHost(host: String, options: ResolveHostOptions = definedExternally): Promise<ResolvedHost>

    /**
     * A `boolean` property. Whether there is currently internet connection.
     *
     * A return value of `false` is a pretty strong indicator that the user won't be
     * able to connect to remote sites. However, a return value of `true` is
     * inconclusive; even if some link is up, it is uncertain whether a particular
     * connection attempt to a particular remote site will be successful.
     *
     */
    val online: Boolean
}
