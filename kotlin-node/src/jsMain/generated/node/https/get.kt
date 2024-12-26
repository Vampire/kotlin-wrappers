// Generated by Karakum - do not modify it manually!

@file:JsModule("node:https")

package node.https

import web.url.URL

/**
 * Like `http.get()` but for HTTPS.
 *
 * `options` can be an object, a string, or a `URL` object. If `options` is a
 * string, it is automatically parsed with `new URL()`. If it is a `URL` object, it will be automatically converted to an ordinary `options` object.
 *
 * ```js
 * import https from 'node:https';
 *
 * https.get('https://encrypted.google.com/', (res) => {
 *   console.log('statusCode:', res.statusCode);
 *   console.log('headers:', res.headers);
 *
 *   res.on('data', (d) => {
 *     process.stdout.write(d);
 *   });
 *
 * }).on('error', (e) => {
 *   console.error(e);
 * });
 * ```
 * @since v0.3.6
 * @param options Accepts the same `options` as {@link request}, with the `method` always set to `GET`.
 */
external fun get(
    options: RequestOptions,
    callback: (res: node.http.IncomingMessage) -> Unit = definedExternally,
): node.http.ClientRequest

/**
 * Like `http.get()` but for HTTPS.
 *
 * `options` can be an object, a string, or a `URL` object. If `options` is a
 * string, it is automatically parsed with `new URL()`. If it is a `URL` object, it will be automatically converted to an ordinary `options` object.
 *
 * ```js
 * import https from 'node:https';
 *
 * https.get('https://encrypted.google.com/', (res) => {
 *   console.log('statusCode:', res.statusCode);
 *   console.log('headers:', res.headers);
 *
 *   res.on('data', (d) => {
 *     process.stdout.write(d);
 *   });
 *
 * }).on('error', (e) => {
 *   console.error(e);
 * });
 * ```
 * @since v0.3.6
 * @param options Accepts the same `options` as {@link request}, with the `method` always set to `GET`.
 */
external fun get(
    options: String,
    callback: (res: node.http.IncomingMessage) -> Unit = definedExternally,
): node.http.ClientRequest

/**
 * Like `http.get()` but for HTTPS.
 *
 * `options` can be an object, a string, or a `URL` object. If `options` is a
 * string, it is automatically parsed with `new URL()`. If it is a `URL` object, it will be automatically converted to an ordinary `options` object.
 *
 * ```js
 * import https from 'node:https';
 *
 * https.get('https://encrypted.google.com/', (res) => {
 *   console.log('statusCode:', res.statusCode);
 *   console.log('headers:', res.headers);
 *
 *   res.on('data', (d) => {
 *     process.stdout.write(d);
 *   });
 *
 * }).on('error', (e) => {
 *   console.error(e);
 * });
 * ```
 * @since v0.3.6
 * @param options Accepts the same `options` as {@link request}, with the `method` always set to `GET`.
 */
external fun get(
    options: URL,
    callback: (res: node.http.IncomingMessage) -> Unit = definedExternally,
): node.http.ClientRequest

external fun get(
    url: String,
    options: RequestOptions,
    callback: (res: node.http.IncomingMessage) -> Unit = definedExternally,
): node.http.ClientRequest

external fun get(
    url: URL,
    options: RequestOptions,
    callback: (res: node.http.IncomingMessage) -> Unit = definedExternally,
): node.http.ClientRequest
