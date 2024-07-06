// Generated by Karakum - do not modify it manually!

package electron.core

external interface Privileges {
    /**
     * Default false.
     */
    var standard: Boolean?

    /**
     * Default false.
     */
    var secure: Boolean?

    /**
     * Default false.
     */
    var bypassCSP: Boolean?

    /**
     * Default false.
     */
    var allowServiceWorkers: Boolean?

    /**
     * Default false.
     */
    var supportFetchAPI: Boolean?

    /**
     * Default false.
     */
    var corsEnabled: Boolean?

    /**
     * Default false.
     */
    var stream: Boolean?

    /**
     * Enable V8 code cache for the scheme, only works when `standard` is also set to
     * true. Default false.
     */
    var codeCache: Boolean?
}
