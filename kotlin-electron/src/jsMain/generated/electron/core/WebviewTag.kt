// Generated by Karakum - do not modify it manually!

package electron.core

import js.typedarrays.Uint8Array
import web.html.HTMLElement
import kotlin.js.Promise

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface WebviewTag : HTMLElement {
// Docs: https://electronjs.org/docs/api/webview-tag
    /**
     * Fired when a load has committed. This includes navigation within the current
     * document as well as subframe document-level loads, but does not include
     * asynchronous resource loads.
     */

    /**
     * Fired when the navigation is done, i.e. the spinner of the tab will stop
     * spinning, and the `onload` event is dispatched.
     */

    /**
     * This event is like `did-finish-load`, but fired when the load failed or was
     * cancelled, e.g. `window.stop()` is invoked.
     */

    /**
     * Fired when a frame has done navigation.
     */

    /**
     * Corresponds to the points in time when the spinner of the tab starts spinning.
     */

    /**
     * Corresponds to the points in time when the spinner of the tab stops spinning.
     */

    /**
     * Fired when attached to the embedder web contents.
     */

    /**
     * Fired when document in the given frame is loaded.
     */

    /**
     * Fired when page title is set during navigation. `explicitSet` is false when
     * title is synthesized from file url.
     */

    /**
     * Fired when page receives favicon urls.
     */

    /**
     * Fired when page enters fullscreen triggered by HTML API.
     */

    /**
     * Fired when page leaves fullscreen triggered by HTML API.
     */

    /**
     * Fired when the guest window logs a console message.
     *
     * The following example code forwards all log messages to the embedder's console
     * without regard for log level or other properties.
     */

    /**
     * Fired when a result is available for `webview.findInPage` request.
     */

    /**
     * Emitted when a user or the page wants to start navigation. It can happen when
     * the `window.location` object is changed or a user clicks a link in the page.
     *
     * This event will not emit when the navigation is started programmatically with
     * APIs like `<webview>.loadURL` and `<webview>.back`.
     *
     * It is also not emitted during in-page navigation, such as clicking anchor links
     * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
     * this purpose.
     *
     * Calling `event.preventDefault()` does **NOT** have any effect.
     */

    /**
     * Emitted when a user or the page wants to start navigation anywhere in the
     * `<webview>` or any frames embedded within. It can happen when the
     * `window.location` object is changed or a user clicks a link in the page.
     *
     * This event will not emit when the navigation is started programmatically with
     * APIs like `<webview>.loadURL` and `<webview>.back`.
     *
     * It is also not emitted during in-page navigation, such as clicking anchor links
     * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
     * this purpose.
     *
     * Calling `event.preventDefault()` does **NOT** have any effect.
     */

    /**
     * Emitted when any frame (including main) starts navigating. `isInPlace` will be
     * `true` for in-page navigations.
     */

    /**
     * Emitted after a server side redirect occurs during navigation. For example a 302
     * redirect.
     */

    /**
     * Emitted when a navigation is done.
     *
     * This event is not emitted for in-page navigations, such as clicking anchor links
     * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
     * this purpose.
     */

    /**
     * Emitted when any frame navigation is done.
     *
     * This event is not emitted for in-page navigations, such as clicking anchor links
     * or updating the `window.location.hash`. Use `did-navigate-in-page` event for
     * this purpose.
     */

    /**
     * Emitted when an in-page navigation happened.
     *
     * When in-page navigation happens, the page URL changes but does not cause
     * navigation outside of the page. Examples of this occurring are when anchor links
     * are clicked or when the DOM `hashchange` event is triggered.
     */

    /**
     * Fired when the guest page attempts to close itself.
     *
     * The following example code navigates the `webview` to `about:blank` when the
     * guest attempts to close itself.
     */

    /**
     * Fired when the guest page has sent an asynchronous message to embedder page.
     *
     * With `sendToHost` method and `ipc-message` event you can communicate between
     * guest page and embedder page:
     */

    /**
     * Fired when the renderer process unexpectedly disappears. This is normally
     * because it was crashed or killed.
     */

    /**
     * Fired when a plugin process is crashed.
     */

    /**
     * Fired when the WebContents is destroyed.
     */

    /**
     * Emitted when media starts playing.
     */

    /**
     * Emitted when media is paused or done playing.
     */

    /**
     * Emitted when a page's theme color changes. This is usually due to encountering a
     * meta tag:
     */

    /**
     * Emitted when mouse moves over a link or the keyboard moves the focus to a link.
     */

    /**
     * Emitted when a link is clicked in DevTools or 'Open in new tab' is selected for
     * a link in its context menu.
     */

    /**
     * Emitted when DevTools is opened.
     */

    /**
     * Emitted when DevTools is closed.
     */

    /**
     * Emitted when DevTools is focused / opened.
     */

    /**
     * Emitted when there is a new context menu that needs to be handled.
     */


    /**
     * Adjusts the current text selection starting and ending points in the focused
     * frame by the given amounts. A negative amount moves the selection towards the
     * beginning of the document, and a positive amount moves the selection towards the
     * end of the document.
     *
     * See `webContents.adjustSelection` for examples.
     */
    fun adjustSelection(options: AdjustSelectionOptions): Unit

    /**
     * Whether the guest page can go back.
     */
    fun canGoBack(): Boolean

    /**
     * Whether the guest page can go forward.
     */
    fun canGoForward(): Boolean

    /**
     * Whether the guest page can go to `offset`.
     */
    fun canGoToOffset(offset: Double): Boolean

    /**
     * Resolves with a NativeImage
     *
     * Captures a snapshot of the page within `rect`. Omitting `rect` will capture the
     * whole visible page.
     */
    fun capturePage(rect: Rectangle = definedExternally): Promise<NativeImage>

    /**
     * Centers the current text selection in page.
     */
    fun centerSelection(): Unit

    /**
     * Clears the navigation history.
     */
    fun clearHistory(): Unit

    /**
     * Closes the DevTools window of guest page.
     */
    fun closeDevTools(): Unit

    /**
     * Executes editing command `copy` in page.
     */
    fun copy(): Unit

    /**
     * Executes editing command `cut` in page.
     */
    fun cut(): Unit

    /**
     * Executes editing command `delete` in page.
     */
    fun delete(): Unit

    /**
     * Initiates a download of the resource at `url` without navigating.
     */
    fun downloadURL(url: String, options: DownloadURLOptions = definedExternally): Unit

    /**
     * A promise that resolves with the result of the executed code or is rejected if
     * the result of the code is a rejected promise.
     *
     * Evaluates `code` in page. If `userGesture` is set, it will create the user
     * gesture context in the page. HTML APIs like `requestFullScreen`, which require
     * user action, can take advantage of this option for automation.
     */
    fun executeJavaScript(code: String, userGesture: Boolean = definedExternally): Promise<Any?>

    /**
     * The request id used for the request.
     *
     * Starts a request to find all matches for the `text` in the web page. The result
     * of the request can be obtained by subscribing to `found-in-page` event.
     */
    fun findInPage(text: String, options: FindInPageOptions = definedExternally): Double

    /**
     * The title of guest page.
     */
    fun getTitle(): String

    /**
     * The URL of guest page.
     */
    fun getURL(): String

    /**
     * The user agent for guest page.
     */
    fun getUserAgent(): String

    /**
     * The WebContents ID of this `webview`.
     */
    fun getWebContentsId(): Double

    /**
     * the current zoom factor.
     */
    fun getZoomFactor(): Double

    /**
     * the current zoom level.
     */
    fun getZoomLevel(): Double

    /**
     * Makes the guest page go back.
     */
    fun goBack(): Unit

    /**
     * Makes the guest page go forward.
     */
    fun goForward(): Unit

    /**
     * Navigates to the specified absolute index.
     */
    fun goToIndex(index: Double): Unit

    /**
     * Navigates to the specified offset from the "current entry".
     */
    fun goToOffset(offset: Double): Unit

    /**
     * A promise that resolves with a key for the inserted CSS that can later be used
     * to remove the CSS via `<webview>.removeInsertedCSS(key)`.
     *
     * Injects CSS into the current web page and returns a unique key for the inserted
     * stylesheet.
     */
    fun insertCSS(css: String): Promise<String>

    /**
     * Inserts `text` to the focused element.
     */
    fun insertText(text: String): Promise<Unit>

    /**
     * Starts inspecting element at position (`x`, `y`) of guest page.
     */
    fun inspectElement(x: Double, y: Double): Unit

    /**
     * Opens the DevTools for the service worker context present in the guest page.
     */
    fun inspectServiceWorker(): Unit

    /**
     * Opens the DevTools for the shared worker context present in the guest page.
     */
    fun inspectSharedWorker(): Unit

    /**
     * Whether guest page has been muted.
     */
    fun isAudioMuted(): Boolean

    /**
     * Whether the renderer process has crashed.
     */
    fun isCrashed(): Boolean

    /**
     * Whether audio is currently playing.
     */
    fun isCurrentlyAudible(): Boolean

    /**
     * Whether DevTools window of guest page is focused.
     */
    fun isDevToolsFocused(): Boolean

    /**
     * Whether guest page has a DevTools window attached.
     */
    fun isDevToolsOpened(): Boolean

    /**
     * Whether guest page is still loading resources.
     */
    fun isLoading(): Boolean

    /**
     * Whether the main frame (and not just iframes or frames within it) is still
     * loading.
     */
    fun isLoadingMainFrame(): Boolean

    /**
     * Whether the guest page is waiting for a first-response for the main resource of
     * the page.
     */
    fun isWaitingForResponse(): Boolean

    /**
     * The promise will resolve when the page has finished loading (see
     * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
     *
     * Loads the `url` in the webview, the `url` must contain the protocol prefix, e.g.
     * the `http://` or `file://`.
     */
    fun loadURL(url: String, options: LoadURLOptions = definedExternally): Promise<Unit>

    /**
     * Opens a DevTools window for guest page.
     */
    fun openDevTools(): Unit

    /**
     * Executes editing command `paste` in page.
     */
    fun paste(): Unit

    /**
     * Executes editing command `pasteAndMatchStyle` in page.
     */
    fun pasteAndMatchStyle(): Unit

    /**
     * Prints `webview`'s web page. Same as `webContents.print([options])`.
     */
    fun print(options: WebviewTagPrintOptions = definedExternally): Promise<Unit>

    /**
     * Resolves with the generated PDF data.
     *
     * Prints `webview`'s web page as PDF, Same as `webContents.printToPDF(options)`.
     */
    fun printToPDF(options: PrintToPDFOptions): Promise<Uint8Array>

    /**
     * Executes editing command `redo` in page.
     */
    fun redo(): Unit

    /**
     * Reloads the guest page.
     */
    fun reload(): Unit

    /**
     * Reloads the guest page and ignores cache.
     */
    fun reloadIgnoringCache(): Unit

    /**
     * Resolves if the removal was successful.
     *
     * Removes the inserted CSS from the current web page. The stylesheet is identified
     * by its key, which is returned from `<webview>.insertCSS(css)`.
     */
    fun removeInsertedCSS(key: String): Promise<Unit>

    /**
     * Executes editing command `replace` in page.
     */
    fun replace(text: String): Unit

    /**
     * Executes editing command `replaceMisspelling` in page.
     */
    fun replaceMisspelling(text: String): Unit

    /**
     * Scrolls to the bottom of the current `<webview>`.
     */
    fun scrollToBottom(): Unit

    /**
     * Scrolls to the top of the current `<webview>`.
     */
    fun scrollToTop(): Unit

    /**
     * Executes editing command `selectAll` in page.
     */
    fun selectAll(): Unit

    /**
     * Send an asynchronous message to renderer process via `channel`, you can also
     * send arbitrary arguments. The renderer process can handle the message by
     * listening to the `channel` event with the `ipcRenderer` module.
     *
     * See webContents.send for examples.
     */
    fun send(channel: String, vararg args: Any?): Promise<Unit>

    /**
     * Sends an input `event` to the page.
     *
     * See webContents.sendInputEvent for detailed description of `event` object.
     */
    fun sendInputEvent(event: MouseInputEvent): Promise<Unit>

    /**
     * Sends an input `event` to the page.
     *
     * See webContents.sendInputEvent for detailed description of `event` object.
     */
    fun sendInputEvent(event: MouseWheelInputEvent): Promise<Unit>

    /**
     * Sends an input `event` to the page.
     *
     * See webContents.sendInputEvent for detailed description of `event` object.
     */
    fun sendInputEvent(event: KeyboardInputEvent): Promise<Unit>

    /**
     * Send an asynchronous message to renderer process via `channel`, you can also
     * send arbitrary arguments. The renderer process can handle the message by
     * listening to the `channel` event with the `ipcRenderer` module.
     *
     * See webContents.sendToFrame for examples.
     */
    fun sendToFrame(frameId: js.array.JsTuple2<Double, Double>, channel: String, vararg args: Any?): Promise<Unit>

    /**
     * Set guest page muted.
     */
    fun setAudioMuted(muted: Boolean): Unit

    /**
     * Overrides the user agent for the guest page.
     */
    fun setUserAgent(userAgent: String): Unit

    /**
     * Sets the maximum and minimum pinch-to-zoom level.
     */
    fun setVisualZoomLevelLimits(minimumLevel: Double, maximumLevel: Double): Promise<Unit>

    /**
     * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
     * divided by 100, so 300% = 3.0.
     */
    fun setZoomFactor(factor: Double): Unit

    /**
     * Changes the zoom level to the specified level. The original size is 0 and each
     * increment above or below represents zooming 20% larger or smaller to default
     * limits of 300% and 50% of original size, respectively. The formula for this is
     * `scale := 1.2 ^ level`.
     *
     * > **NOTE**: The zoom policy at the Chromium level is same-origin, meaning that
     * the zoom level for a specific domain propagates across all instances of windows
     * with the same domain. Differentiating the window URLs will make zoom work
     * per-window.
     */
    fun setZoomLevel(level: Double): Unit

    /**
     * Shows pop-up dictionary that searches the selected word on the page.
     *
     * @platform darwin
     */
    fun showDefinitionForSelection(): Unit

    /**
     * Stops any pending navigation.
     */
    fun stop(): Unit

    /**
     * Stops any `findInPage` request for the `webview` with the provided `action`.
     */
    fun stopFindInPage(action: WebviewTagStopFindInPageAction): Unit

    /**
     * Executes editing command `undo` in page.
     */
    fun undo(): Unit

    /**
     * Executes editing command `unselect` in page.
     */
    fun unselect(): Unit

    /**
     * A `boolean`. When this attribute is present the guest page will be allowed to
     * open new windows. Popups are disabled by default.
     */
    var allowpopups: Boolean

    /**
     * A `string` which is a list of strings which specifies the blink features to be
     * disabled separated by `,`. The full list of supported feature strings can be
     * found in the RuntimeEnabledFeatures.json5 file.
     */
    var disableblinkfeatures: String

    /**
     * A `boolean`. When this attribute is present the guest page will have web
     * security disabled. Web security is enabled by default.
     *
     * This value can only be modified before the first navigation.
     */
    var disablewebsecurity: Boolean

    /**
     * A `string` which is a list of strings which specifies the blink features to be
     * enabled separated by `,`. The full list of supported feature strings can be
     * found in the RuntimeEnabledFeatures.json5 file.
     */
    var enableblinkfeatures: String

    /**
     * A `string` that sets the referrer URL for the guest page.
     */
    var httpreferrer: String

    /**
     * A `boolean`. When this attribute is present the guest page in `webview` will
     * have node integration and can use node APIs like `require` and `process` to
     * access low level system resources. Node integration is disabled by default in
     * the guest page.
     */
    var nodeintegration: Boolean

    /**
     * A `boolean` for the experimental option for enabling NodeJS support in
     * sub-frames such as iframes inside the `webview`. All your preloads will load for
     * every iframe, you can use `process.isMainFrame` to determine if you are in the
     * main frame or not. This option is disabled by default in the guest page.
     */
    var nodeintegrationinsubframes: Boolean

    /**
     * A `string` that sets the session used by the page. If `partition` starts with
     * `persist:`, the page will use a persistent session available to all pages in the
     * app with the same `partition`. if there is no `persist:` prefix, the page will
     * use an in-memory session. By assigning the same `partition`, multiple pages can
     * share the same session. If the `partition` is unset then default session of the
     * app will be used.
     *
     * This value can only be modified before the first navigation, since the session
     * of an active renderer process cannot change. Subsequent attempts to modify the
     * value will fail with a DOM exception.
     */
    var partition: String

    /**
     * A `boolean`. When this attribute is present the guest page in `webview` will be
     * able to use browser plugins. Plugins are disabled by default.
     */
    var plugins: Boolean

    /**
     * A `string` that specifies a script that will be loaded before other scripts run
     * in the guest page. The protocol of script's URL must be `file:` (even when using
     * `asar:` archives) because it will be loaded by Node's `require` under the hood,
     * which treats `asar:` archives as virtual directories.
     *
     * When the guest page doesn't have node integration this script will still have
     * access to all Node APIs, but global objects injected by Node will be deleted
     * after this script has finished executing.
     */
    var preload: String

    /**
     * A `string` representing the visible URL. Writing to this attribute initiates
     * top-level navigation.
     *
     * Assigning `src` its own value will reload the current page.
     *
     * The `src` attribute can also accept data URLs, such as `data:text/plain,Hello,
     * world!`.
     */
    var src: String

    /**
     * A `string` that sets the user agent for the guest page before the page is
     * navigated to. Once the page is loaded, use the `setUserAgent` method to change
     * the user agent.
     */
    var useragent: String

    /**
     * A `string` which is a comma separated list of strings which specifies the web
     * preferences to be set on the webview. The full list of supported preference
     * strings can be found in BrowserWindow.
     *
     * The string follows the same format as the features string in `window.open`. A
     * name by itself is given a `true` boolean value. A preference can be set to
     * another value by including an `=`, followed by the value. Special values `yes`
     * and `1` are interpreted as `true`, while `no` and `0` are interpreted as
     * `false`.
     */
    var webpreferences: String
}
