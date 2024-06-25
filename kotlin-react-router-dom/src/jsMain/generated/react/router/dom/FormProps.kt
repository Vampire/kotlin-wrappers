// Generated by Karakum - do not modify it manually!

package react.router.dom

import web.html.HTMLFormElement


sealed external interface FormProps : react.Props, react.PropsWithRef<HTMLFormElement>, FetcherFormProps {
    /**
     * Indicate a specific fetcherKey to use when using navigate=false
     */
    var fetcherKey: String?

    /**
     * navigate=false will use a fetcher instead of a navigation
     */
    var navigate: Boolean?

    /**
     * Forces a full document navigation instead of a fetch.
     */
    var reloadDocument: Boolean?

    /**
     * Replaces the current entry in the browser history stack when the form
     * navigates. Use this if you don't want the user to be able to click "back"
     * to the page with the form on it.
     */
    var replace: Boolean?

    /**
     * State object to add to the history stack entry for this navigation
     */
    var state: Any?

    /**
     * Enable view transitions on this Form navigation
     */
    var unstable_viewTransition: Boolean?
}
