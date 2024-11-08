// Generated by Karakum - do not modify it manually!

@file:JsModule("@remix-run/router")

package remix.run.router

/**
 * Matches the given routes to a location and returns the match data.
 *
 * @see https://reactrouter.com/v6/utils/match-routes
 */
external fun <RouteObjectType : AgnosticRouteObject /* default is AgnosticRouteObject */> matchRoutes(
    routes: js.array.ReadonlyArray<RouteObjectType>,
    locationArg: Location<*>,
    basename: String = definedExternally,
): js.array.ReadonlyArray<AgnosticRouteMatch<RouteObjectType>>?

/**
 * Matches the given routes to a location and returns the match data.
 *
 * @see https://reactrouter.com/v6/utils/match-routes
 */
external fun <RouteObjectType : AgnosticRouteObject /* default is AgnosticRouteObject */> matchRoutes(
    routes: js.array.ReadonlyArray<RouteObjectType>,
    locationArg: String,
    basename: String = definedExternally,
): js.array.ReadonlyArray<AgnosticRouteMatch<RouteObjectType>>?
