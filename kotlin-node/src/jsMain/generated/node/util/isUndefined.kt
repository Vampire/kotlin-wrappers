// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util

/**
 * Returns `true` if the given `object` is `undefined`. Otherwise, returns `false`.
 *
 * ```js
 * import util from 'node:util';
 *
 * const foo = undefined;
 * util.isUndefined(5);
 * // Returns: false
 * util.isUndefined(foo);
 * // Returns: true
 * util.isUndefined(null);
 * // Returns: false
 * ```
 * @since v0.11.5
 * @deprecated Since v4.0.0 - Use `value === undefined` instead.
 */

@JsName("isUndefined")
external fun isUndefinedRaw(value: Any?): Boolean /* object is undefined */
