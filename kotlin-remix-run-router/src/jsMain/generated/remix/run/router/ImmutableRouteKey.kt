// Generated by Karakum - do not modify it manually!

package remix.run.router

/**
 * Keys we cannot change from within a lazy() function. We spread all other keys
 * onto the route. Either they're meaningful to the router, or they'll get
 * ignored.
 */
sealed external interface ImmutableRouteKey {
    companion object {
        @seskar.js.JsValue("lazy")
        val lazy: ImmutableRouteKey

        @seskar.js.JsValue("caseSensitive")
        val caseSensitive: ImmutableRouteKey

        @seskar.js.JsValue("path")
        val path: ImmutableRouteKey

        @seskar.js.JsValue("id")
        val id: ImmutableRouteKey

        @seskar.js.JsValue("index")
        val index: ImmutableRouteKey

        @seskar.js.JsValue("children")
        val children: ImmutableRouteKey
    }
}
