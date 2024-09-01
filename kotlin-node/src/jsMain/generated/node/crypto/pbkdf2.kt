// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Provides an asynchronous Password-Based Key Derivation Function 2 (PBKDF2)
 * implementation. A selected HMAC digest algorithm specified by `digest` is
 * applied to derive a key of the requested byte length (`keylen`) from the `password`, `salt` and `iterations`.
 *
 * The supplied `callback` function is called with two arguments: `err` and `derivedKey`. If an error occurs while deriving the key, `err` will be set;
 * otherwise `err` will be `null`. By default, the successfully generated `derivedKey` will be passed to the callback as a `Buffer`. An error will be
 * thrown if any of the input arguments specify invalid values or types.
 *
 * The `iterations` argument must be a number set as high as possible. The
 * higher the number of iterations, the more secure the derived key will be,
 * but will take a longer amount of time to complete.
 *
 * The `salt` should be as unique as possible. It is recommended that a salt is
 * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
 *
 * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
 *
 * ```js
 * const {
 *   pbkdf2,
 * } = await import('node:crypto');
 *
 * pbkdf2('secret', 'salt', 100000, 64, 'sha512', (err, derivedKey) => {
 *   if (err) throw err;
 *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
 * });
 * ```
 *
 * An array of supported digest functions can be retrieved using {@link getHashes}.
 *
 * This API uses libuv's threadpool, which can have surprising and
 * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
 * @since v0.5.5
 */
external fun pbkdf2(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Number,
    keylen: Number,
    digest: String,
    callback: (err: js.errors.JsError?, derivedKey: node.buffer.Buffer) -> Unit,
): Unit
