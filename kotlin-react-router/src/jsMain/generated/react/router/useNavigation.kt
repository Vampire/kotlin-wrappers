@file:JsModule("react-router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.Navigation

/**
 * Returns the current navigation, defaulting to an "idle" navigation when
 * no navigation is in progress
 */
external fun useNavigation(): /* import("@remix-run/router") */ Navigation
