@file:JsModule("react-router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.Path
import remix.run.router.To

/**
 * A Navigator is a "location changer"; it's how you get to different locations.
 *
 * Every history instance conforms to the Navigator interface, but the
 * distinction is useful primarily when it comes to the low-level <Router> API
 * where both the location and a navigator must be provided separately in order
 * to avoid "tearing" that may occur in a suspense-enabled app if the action
 * and/or location were to be read directly from the history instance.
 */

external interface Navigator {
    var createHref: (to: To) -> String
    var encodeLocation: (to: To) -> Path?
    var go: (delta: Double) -> Unit
    fun push(to: To, state: Any? = definedExternally, opts: NavigateOptions = definedExternally): Unit
    fun replace(to: To, state: Any? = definedExternally, opts: NavigateOptions = definedExternally): Unit
}

