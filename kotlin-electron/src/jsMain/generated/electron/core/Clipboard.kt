package electron.core

import node.buffer.Buffer


external interface Clipboard {
// Docs: https://electronjs.org/docs/api/clipboard
    /**
     * An array of supported formats for the clipboard `type`.
     */
    fun availableFormats(type: ClipboardAvailableFormatsType = definedExternally): js.core.ReadonlyArray<String>

    /**
     * Clears the clipboard content.
     */
    fun clear(type: ClipboardClearType = definedExternally): Unit

    /**
     * Whether the clipboard supports the specified `format`.
     *
     * @experimental
     */
    fun has(format: String, type: ClipboardHasType = definedExternally): Boolean

    /**
     * Reads `format` type from the clipboard.
     *
     * `format` should contain valid ASCII characters and have `/` separator. `a/c`,
     * `a/bc` are valid formats while `/abc`, `abc/`, `a/`, `/a`, `a` are not valid.
     *
     * @experimental
     */
    fun read(format: String): String

    /**
     * * `title` string
     * * `url` string
     *
     * Returns an Object containing `title` and `url` keys representing the bookmark in
     * the clipboard. The `title` and `url` values will be empty strings when the
     * bookmark is unavailable.  The `title` value will always be empty on Windows.
     *
     * @platform darwin,win32
     */
    fun readBookmark(): ReadBookmark

    /**
     * Reads `format` type from the clipboard.
     *
     * @experimental
     */
    fun readBuffer(format: String): Buffer

    /**
     * The text on the find pasteboard, which is the pasteboard that holds information
     * about the current state of the active application’s find panel.
     *
     * This method uses synchronous IPC when called from the renderer process. The
     * cached value is reread from the find pasteboard whenever the application is
     * activated.
     *
     * @platform darwin
     */
    fun readFindText(): String

    /**
     * The content in the clipboard as markup.
     */
    fun readHTML(type: ClipboardReadHTMLType = definedExternally): String

    /**
     * The image content in the clipboard.
     */
    fun readImage(type: ClipboardReadImageType = definedExternally): NativeImage

    /**
     * The content in the clipboard as RTF.
     */
    fun readRTF(type: ClipboardReadRTFType = definedExternally): String

    /**
     * The content in the clipboard as plain text.
     */
    fun readText(type: ClipboardReadTextType = definedExternally): String

    /**
     * Writes `data` to the clipboard.
     */
    fun write(data: Data, type: ClipboardWriteType = definedExternally): Unit

    /**
     * Writes the `title` (macOS only) and `url` into the clipboard as a bookmark.
     *
     * **Note:** Most apps on Windows don't support pasting bookmarks into them so you
     * can use `clipboard.write` to write both a bookmark and fallback text to the
     * clipboard.
     *
     * @platform darwin,win32
     */
    fun writeBookmark(title: String, url: String, type: ClipboardWriteBookmarkType = definedExternally): Unit

    /**
     * Writes the `buffer` into the clipboard as `format`.
     *
     * @experimental
     */
    fun writeBuffer(format: String, buffer: Buffer, type: ClipboardWriteBufferType = definedExternally): Unit

    /**
     * Writes the `text` into the find pasteboard (the pasteboard that holds
     * information about the current state of the active application’s find panel) as
     * plain text. This method uses synchronous IPC when called from the renderer
     * process.
     *
     * @platform darwin
     */
    fun writeFindText(text: String): Unit

    /**
     * Writes `markup` to the clipboard.
     */
    fun writeHTML(markup: String, type: ClipboardWriteHTMLType = definedExternally): Unit

    /**
     * Writes `image` to the clipboard.
     */
    fun writeImage(image: NativeImage, type: ClipboardWriteImageType = definedExternally): Unit

    /**
     * Writes the `text` into the clipboard in RTF.
     */
    fun writeRTF(text: String, type: ClipboardWriteRTFType = definedExternally): Unit

    /**
     * Writes the `text` into the clipboard as plain text.
     */
    fun writeText(text: String, type: ClipboardWriteTextType = definedExternally): Unit
}
