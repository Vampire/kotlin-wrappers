@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Potential states for state.navigation
 */

external interface NavigationStates {
    var Idle: NavigationStatesIdle
    var Loading: NavigationStatesLoading
    var Submitting: NavigationStatesSubmitting
}

