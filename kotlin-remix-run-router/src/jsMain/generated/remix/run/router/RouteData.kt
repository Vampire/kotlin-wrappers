// Generated by Karakum - do not modify it manually!

package remix.run.router

/**
 * Map of routeId -> data returned from a loader/action/error
 */
sealed external interface RouteData {
    @seskar.js.JsNative
    operator fun get(key: String): Any?

    @seskar.js.JsNative
    operator fun set(key: String, value: Any?)
}
