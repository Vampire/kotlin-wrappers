@file:JsModule("node:util/types")

package node.util.types

/**
 * Returns `true` if the value is a built-in [`Map`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map) instance.
 *
 * ```js
 * util.types.isMap(new Map());  // Returns true
 * ```
 * @since v10.0.0
 */
@JsName("isMap")
external fun isMapRaw(target: Any?): Boolean
