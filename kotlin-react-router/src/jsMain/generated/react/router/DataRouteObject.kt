@file:JsModule("react-router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


external interface DataRouteObject : RouteObject {
    var children: js.core.ReadonlyArray<DataRouteObject>?
    var id: String
}

