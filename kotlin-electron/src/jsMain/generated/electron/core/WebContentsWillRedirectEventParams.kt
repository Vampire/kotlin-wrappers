// Generated by Karakum - do not modify it manually!


package electron.core


external interface WebContentsWillRedirectEventParams {
    /**
     * The URL the frame is navigating to.
     */
    var url: String

    /**
     * Whether the navigation happened without changing document. Examples of same
     * document navigations are reference fragment navigations, pushState/replaceState,
     * and same page history navigation.
     */
    var isSameDocument: Boolean

    /**
     * True if the navigation is taking place in a main frame.
     */
    var isMainFrame: Boolean

    /**
     * The frame to be navigated.
     */
    var frame: WebFrameMain

    /**
     * The frame which initiated the navigation, which can be a parent frame (e.g. via
     * `window.open` with a frame's name), or null if the navigation was not initiated
     * by a frame. This can also be null if the initiating frame was deleted before the
     * event was emitted.
     */
    var initiator: WebFrameMain?
}
