// Generated by Karakum - do not modify it manually!

package node.fs

import js.array.ReadonlyArray
import js.buffer.ArrayBufferView
import js.promise.Promise
import js.typedarrays.Uint8Array
import web.streams.ReadableStream
import node.readline.Interface as ReadlineInterface

// TODO: Add `EventEmitter` close
sealed external interface FileHandle {
    /**
     * The numeric file descriptor managed by the {FileHandle} object.
     * @since v10.0.0
     */
    val fd: Double

    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("appendFile")
    fun appendFileAsync(data: String): Promise<js.core.Void>


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("appendFile")
    fun appendFileAsync(
        data: String,
        options: (FileHandleAppendFileAsyncOptions)? = definedExternally,
    ): Promise<js.core.Void>


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("appendFile")
    fun appendFileAsync(data: String, options: node.buffer.BufferEncoding? = definedExternally): Promise<js.core.Void>


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("appendFile")
    fun appendFileAsync(data: Uint8Array): Promise<js.core.Void>


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("appendFile")
    fun appendFileAsync(
        data: Uint8Array,
        options: (FileHandleAppendFileAsyncOptions)? = definedExternally,
    ): Promise<js.core.Void>


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("appendFile")
    fun appendFileAsync(
        data: Uint8Array,
        options: node.buffer.BufferEncoding? = definedExternally,
    ): Promise<js.core.Void>


    @seskar.js.JsAsync
    suspend fun appendFile(data: String): js.core.Void


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @seskar.js.JsAsync
    suspend fun appendFile(data: String, options: (FileHandleAppendFileAsyncOptions)? = definedExternally): js.core.Void


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @seskar.js.JsAsync
    suspend fun appendFile(data: String, options: node.buffer.BufferEncoding? = definedExternally): js.core.Void


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @seskar.js.JsAsync
    suspend fun appendFile(data: Uint8Array): js.core.Void


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @seskar.js.JsAsync
    suspend fun appendFile(
        data: Uint8Array,
        options: (FileHandleAppendFileAsyncOptions)? = definedExternally,
    ): js.core.Void


    /**
     * Alias of `filehandle.writeFile()`.
     *
     * When operating on file handles, the mode cannot be changed from what it was set
     * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @seskar.js.JsAsync
    suspend fun appendFile(data: Uint8Array, options: node.buffer.BufferEncoding? = definedExternally): js.core.Void

    /**
     * Changes the ownership of the file. A wrapper for [`chown(2)`](http://man7.org/linux/man-pages/man2/chown.2.html).
     * @since v10.0.0
     * @param uid The file's new owner's user id.
     * @param gid The file's new group's group id.
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("chown")
    fun chownAsync(uid: Number, gid: Number): Promise<js.core.Void>


    @seskar.js.JsAsync
    suspend fun chown(uid: Number, gid: Number): js.core.Void

    /**
     * Modifies the permissions on the file. See [`chmod(2)`](http://man7.org/linux/man-pages/man2/chmod.2.html).
     * @since v10.0.0
     * @param mode the file mode bit mask.
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("chmod")
    fun chmodAsync(mode: Mode): Promise<js.core.Void>


    @seskar.js.JsAsync
    suspend fun chmod(mode: Mode): js.core.Void

    /**
     * Unlike the 16 KiB default `highWaterMark` for a `stream.Readable`, the stream
     * returned by this method has a default `highWaterMark` of 64 KiB.
     *
     * `options` can include `start` and `end` values to read a range of bytes from
     * the file instead of the entire file. Both `start` and `end` are inclusive and
     * start counting at 0, allowed values are in the
     * \[0, [`Number.MAX_SAFE_INTEGER`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_SAFE_INTEGER)\] range. If `start` is
     * omitted or `undefined`, `filehandle.createReadStream()` reads sequentially from
     * the current file position. The `encoding` can be any one of those accepted by `Buffer`.
     *
     * If the `FileHandle` points to a character device that only supports blocking
     * reads (such as keyboard or sound card), read operations do not finish until data
     * is available. This can prevent the process from exiting and the stream from
     * closing naturally.
     *
     * By default, the stream will emit a `'close'` event after it has been
     * destroyed.  Set the `emitClose` option to `false` to change this behavior.
     *
     * ```js
     * import { open } from 'node:fs/promises';
     *
     * const fd = await open('/dev/input/event0');
     * // Create a stream from some character device.
     * const stream = fd.createReadStream();
     * setTimeout(() => {
     *   stream.close(); // This may not close the stream.
     *   // Artificially marking end-of-stream, as if the underlying resource had
     *   // indicated end-of-file by itself, allows the stream to close.
     *   // This does not cancel pending read operations, and if there is such an
     *   // operation, the process may still not be able to exit successfully
     *   // until it finishes.
     *   stream.push(null);
     *   stream.read(0);
     * }, 100);
     * ```
     *
     * If `autoClose` is false, then the file descriptor won't be closed, even if
     * there's an error. It is the application's responsibility to close it and make
     * sure there's no file descriptor leak. If `autoClose` is set to true (default
     * behavior), on `'error'` or `'end'` the file descriptor will be closed
     * automatically.
     *
     * An example to read the last 10 bytes of a file which is 100 bytes long:
     *
     * ```js
     * import { open } from 'node:fs/promises';
     *
     * const fd = await open('sample.txt');
     * fd.createReadStream({ start: 90, end: 99 });
     * ```
     * @since v16.11.0
     */
    fun createReadStream(options: CreateReadStreamOptions = definedExternally): ReadStream

    /**
     * `options` may also include a `start` option to allow writing data at some
     * position past the beginning of the file, allowed values are in the
     * \[0, [`Number.MAX_SAFE_INTEGER`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_SAFE_INTEGER)\] range. Modifying a file rather than
     * replacing it may require the `flags` `open` option to be set to `r+` rather than
     * the default `r`. The `encoding` can be any one of those accepted by `Buffer`.
     *
     * If `autoClose` is set to true (default behavior) on `'error'` or `'finish'` the file descriptor will be closed automatically. If `autoClose` is false,
     * then the file descriptor won't be closed, even if there's an error.
     * It is the application's responsibility to close it and make sure there's no
     * file descriptor leak.
     *
     * By default, the stream will emit a `'close'` event after it has been
     * destroyed.  Set the `emitClose` option to `false` to change this behavior.
     * @since v16.11.0
     */
    fun createWriteStream(options: CreateWriteStreamOptions = definedExternally): WriteStream

    /**
     * Forces all currently queued I/O operations associated with the file to the
     * operating system's synchronized I/O completion state. Refer to the POSIX [`fdatasync(2)`](http://man7.org/linux/man-pages/man2/fdatasync.2.html) documentation for details.
     *
     * Unlike `filehandle.sync` this method does not flush modified metadata.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("datasync")
    fun datasyncAsync(): Promise<js.core.Void>


    @seskar.js.JsAsync
    suspend fun datasync(): js.core.Void

    /**
     * Request that all data for the open file descriptor is flushed to the storage
     * device. The specific implementation is operating system and device specific.
     * Refer to the POSIX [`fsync(2)`](http://man7.org/linux/man-pages/man2/fsync.2.html) documentation for more detail.
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("sync")
    fun syncAsync(): Promise<js.core.Void>


    @seskar.js.JsAsync
    suspend fun sync(): js.core.Void

    /**
     * Reads data from the file and stores that in the given buffer.
     *
     * If the file is not modified concurrently, the end-of-file is reached when the
     * number of bytes read is zero.
     * @since v10.0.0
     * @param buffer A buffer that will be filled with the file data read.
     * @param offset The location in the buffer at which to start filling.
     * @param length The number of bytes to read.
     * @param position The location where to begin reading data from the file. If `null`, data will be read from the current file position, and the position will be updated. If `position` is an
     * integer, the current file position will remain unchanged.
     * @return Fulfills upon success with an object with two properties:
     */

    @JsName("read")
    fun <T : ArrayBufferView> readAsync(
        buffer: T,
        offset: Double? = definedExternally,
        length: Double? = definedExternally,
        position: Double? = definedExternally,
    ): Promise<FileReadResult<T>>


    @seskar.js.JsAsync
    suspend fun <T : ArrayBufferView> read(
        buffer: T,
        offset: Double? = definedExternally,
        length: Double? = definedExternally,
        position: Double? = definedExternally,
    ): FileReadResult<T>


    @JsName("read")
    fun <T : ArrayBufferView /* default is node.buffer.Buffer */> readAsync(options: FileReadOptions<T> = definedExternally): Promise<FileReadResult<T>>


    @seskar.js.JsAsync
    suspend fun <T : ArrayBufferView /* default is node.buffer.Buffer */> read(options: FileReadOptions<T> = definedExternally): FileReadResult<T>

    /**
     * Returns a `ReadableStream` that may be used to read the files data.
     *
     * An error will be thrown if this method is called more than once or is called
     * after the `FileHandle` is closed or closing.
     *
     * ```js
     * import {
     *   open,
     * } from 'node:fs/promises';
     *
     * const file = await open('./some/file/to/read');
     *
     * for await (const chunk of file.readableWebStream())
     *   console.log(chunk);
     *
     * await file.close();
     * ```
     *
     * While the `ReadableStream` will read the file to completion, it will not
     * close the `FileHandle` automatically. User code must still call the`fileHandle.close()` method.
     * @since v17.0.0
     * @experimental
     */
    fun readableWebStream(options: ReadableWebStreamOptions = definedExternally): ReadableStream<*>

    /**
     * Asynchronously reads the entire contents of a file.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support reading.
     *
     * If one or more `filehandle.read()` calls are made on a file handle and then a `filehandle.readFile()` call is made, the data will be read from the current
     * position till the end of the file. It doesn't always read from the beginning
     * of the file.
     * @since v10.0.0
     * @return Fulfills upon a successful read with the contents of the file. If no encoding is specified (using `options.encoding`), the data is returned as a {Buffer} object. Otherwise, the
     * data will be a string.
     */

    @JsName("readFile")
    fun readFileAsync(options: (FileHandleReadFileBufferAsyncOptions)? = definedExternally): Promise<node.buffer.Buffer>


    @seskar.js.JsAsync
    suspend fun readFile(options: (FileHandleReadFileBufferAsyncOptions)? = definedExternally): node.buffer.Buffer

    /**
     * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
     * The `FileHandle` must have been opened for reading.
     * @param options An object that may contain an optional flag.
     * If a flag is not provided, it defaults to `'r'`.
     */

    @JsName("readFile")
    fun readFileAsync(options: FileHandleReadFileStringAsyncOptions): Promise<String>


    /**
     * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
     * The `FileHandle` must have been opened for reading.
     * @param options An object that may contain an optional flag.
     * If a flag is not provided, it defaults to `'r'`.
     */

    @JsName("readFile")
    fun readFileAsync(options: node.buffer.BufferEncoding): Promise<String>


    @seskar.js.JsAsync
    suspend fun readFile(options: FileHandleReadFileStringAsyncOptions): String


    /**
     * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
     * The `FileHandle` must have been opened for reading.
     * @param options An object that may contain an optional flag.
     * If a flag is not provided, it defaults to `'r'`.
     */

    @seskar.js.JsAsync
    suspend fun readFile(options: node.buffer.BufferEncoding): String

    /**
     * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
     * The `FileHandle` must have been opened for reading.
     * @param options An object that may contain an optional flag.
     * If a flag is not provided, it defaults to `'r'`.
     */

    @JsName("readFile")
    fun readFileAsync(): Promise<Any /* string | Buffer */>


    /**
     * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
     * The `FileHandle` must have been opened for reading.
     * @param options An object that may contain an optional flag.
     * If a flag is not provided, it defaults to `'r'`.
     */

    @JsName("readFile")
    fun readFileAsync(options: (FileHandleReadFileAsyncOptions)? = definedExternally): Promise<Any /* string | Buffer */>


    /**
     * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
     * The `FileHandle` must have been opened for reading.
     * @param options An object that may contain an optional flag.
     * If a flag is not provided, it defaults to `'r'`.
     */

    @JsName("readFile")
    fun readFileAsync(options: node.buffer.BufferEncoding? = definedExternally): Promise<Any /* string | Buffer */>


    @seskar.js.JsAsync
    suspend fun readFile(): Any /* string | Buffer */


    /**
     * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
     * The `FileHandle` must have been opened for reading.
     * @param options An object that may contain an optional flag.
     * If a flag is not provided, it defaults to `'r'`.
     */

    @seskar.js.JsAsync
    suspend fun readFile(options: (FileHandleReadFileAsyncOptions)? = definedExternally): Any /* string | Buffer */


    /**
     * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
     * The `FileHandle` must have been opened for reading.
     * @param options An object that may contain an optional flag.
     * If a flag is not provided, it defaults to `'r'`.
     */

    @seskar.js.JsAsync
    suspend fun readFile(options: node.buffer.BufferEncoding? = definedExternally): Any /* string | Buffer */

    /**
     * Convenience method to create a `readline` interface and stream over the file.
     * See `filehandle.createReadStream()` for the options.
     *
     * ```js
     * import { open } from 'node:fs/promises';
     *
     * const file = await open('./some/file/to/read');
     *
     * for await (const line of file.readLines()) {
     *   console.log(line);
     * }
     * ```
     * @since v18.11.0
     */
    fun readLines(options: CreateReadStreamOptions = definedExternally): ReadlineInterface

    /**
     * @since v10.0.0
     * @return Fulfills with an {fs.Stats} for the file.
     */

    @JsName("stat")
    fun statAsync(opts: FileHandleStatOpts = definedExternally): Promise<Stats>


    @seskar.js.JsAsync
    suspend fun stat(opts: FileHandleStatOpts = definedExternally): Stats


    @JsName("stat")
    fun statAsync(opts: FileHandleStatBigIntOpts): Promise<BigIntStats>


    @seskar.js.JsAsync
    suspend fun stat(opts: FileHandleStatBigIntOpts): BigIntStats


    @JsName("stat")
    fun statAsync(opts: StatOptions = definedExternally): Promise<Any /* Stats | BigIntStats */>


    @seskar.js.JsAsync
    suspend fun stat(opts: StatOptions = definedExternally): Any /* Stats | BigIntStats */

    /**
     * Truncates the file.
     *
     * If the file was larger than `len` bytes, only the first `len` bytes will be
     * retained in the file.
     *
     * The following example retains only the first four bytes of the file:
     *
     * ```js
     * import { open } from 'node:fs/promises';
     *
     * let filehandle = null;
     * try {
     *   filehandle = await open('temp.txt', 'r+');
     *   await filehandle.truncate(4);
     * } finally {
     *   await filehandle?.close();
     * }
     * ```
     *
     * If the file previously was shorter than `len` bytes, it is extended, and the
     * extended part is filled with null bytes (`'\0'`):
     *
     * If `len` is negative then `0` will be used.
     * @since v10.0.0
     * @param [len=0]
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("truncate")
    fun truncateAsync(len: Number = definedExternally): Promise<js.core.Void>


    @seskar.js.JsAsync
    suspend fun truncate(len: Number = definedExternally): js.core.Void

    /**
     * Change the file system timestamps of the object referenced by the `FileHandle` then fulfills the promise with no arguments upon success.
     * @since v10.0.0
     */

    @JsName("utimes")
    fun utimesAsync(atime: TimeLike, mtime: TimeLike): Promise<js.core.Void>


    @seskar.js.JsAsync
    suspend fun utimes(atime: TimeLike, mtime: TimeLike): js.core.Void

    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @JsName("writeFile")
    fun writeFileAsync(data: String): Promise<js.core.Void>


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @JsName("writeFile")
    fun writeFileAsync(
        data: String,
        options: (FileHandleWriteFileAsyncOptions)? = definedExternally,
    ): Promise<js.core.Void>


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @JsName("writeFile")
    fun writeFileAsync(data: String, options: node.buffer.BufferEncoding? = definedExternally): Promise<js.core.Void>


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @JsName("writeFile")
    fun writeFileAsync(data: Uint8Array): Promise<js.core.Void>


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @JsName("writeFile")
    fun writeFileAsync(
        data: Uint8Array,
        options: (FileHandleWriteFileAsyncOptions)? = definedExternally,
    ): Promise<js.core.Void>


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @JsName("writeFile")
    fun writeFileAsync(
        data: Uint8Array,
        options: node.buffer.BufferEncoding? = definedExternally,
    ): Promise<js.core.Void>


    @seskar.js.JsAsync
    suspend fun writeFile(data: String): js.core.Void


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @seskar.js.JsAsync
    suspend fun writeFile(data: String, options: (FileHandleWriteFileAsyncOptions)? = definedExternally): js.core.Void


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @seskar.js.JsAsync
    suspend fun writeFile(data: String, options: node.buffer.BufferEncoding? = definedExternally): js.core.Void


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @seskar.js.JsAsync
    suspend fun writeFile(data: Uint8Array): js.core.Void


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @seskar.js.JsAsync
    suspend fun writeFile(
        data: Uint8Array,
        options: (FileHandleWriteFileAsyncOptions)? = definedExternally,
    ): js.core.Void


    /**
     * Asynchronously writes data to a file, replacing the file if it already exists. `data` can be a string, a buffer, an
     * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
     * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
     * The promise is fulfilled with no arguments upon success.
     *
     * If `options` is a string, then it specifies the `encoding`.
     *
     * The `FileHandle` has to support writing.
     *
     * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected).
     *
     * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
     * current position till the end of the file. It doesn't always write from the
     * beginning of the file.
     * @since v10.0.0
     */

    @seskar.js.JsAsync
    suspend fun writeFile(data: Uint8Array, options: node.buffer.BufferEncoding? = definedExternally): js.core.Void

    /**
     * Write `buffer` to the file.
     *
     * The promise is fulfilled with an object containing two properties:
     *
     * It is unsafe to use `filehandle.write()` multiple times on the same file
     * without waiting for the promise to be fulfilled (or rejected). For this
     * scenario, use `filehandle.createWriteStream()`.
     *
     * On Linux, positional writes do not work when the file is opened in append mode.
     * The kernel ignores the position argument and always appends the data to
     * the end of the file.
     * @since v10.0.0
     * @param offset The start position from within `buffer` where the data to write begins.
     * @param [length=buffer.byteLength - offset] The number of bytes from `buffer` to write.
     * @param [position='null'] The offset from the beginning of the file where the data from `buffer` should be written. If `position` is not a `number`, the data will be written at the current
     * position. See the POSIX pwrite(2) documentation for more detail.
     */

    @JsName("write")
    fun <TBuffer : Uint8Array> writeAsync(
        buffer: TBuffer,
        offset: Double? = definedExternally,
        length: Double? = definedExternally,
        position: Double? = definedExternally,
    ): Promise<FileHandleWriteResultPayload<TBuffer>>


    @seskar.js.JsAsync
    suspend fun <TBuffer : Uint8Array> write(
        buffer: TBuffer,
        offset: Double? = definedExternally,
        length: Double? = definedExternally,
        position: Double? = definedExternally,
    ): FileHandleWriteResultPayload<TBuffer>


    @JsName("write")
    fun writeAsync(
        data: String,
        position: Double? = definedExternally,
        encoding: node.buffer.BufferEncoding? = definedExternally,
    ): Promise<FileHandleWriteStringResultPayload>


    @seskar.js.JsAsync
    suspend fun write(
        data: String,
        position: Double? = definedExternally,
        encoding: node.buffer.BufferEncoding? = definedExternally,
    ): FileHandleWriteStringResultPayload

    /**
     * Write an array of [ArrayBufferView](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView) s to the file.
     *
     * The promise is fulfilled with an object containing a two properties:
     *
     * It is unsafe to call `writev()` multiple times on the same file without waiting
     * for the promise to be fulfilled (or rejected).
     *
     * On Linux, positional writes don't work when the file is opened in append mode.
     * The kernel ignores the position argument and always appends the data to
     * the end of the file.
     * @since v12.9.0
     * @param [position='null'] The offset from the beginning of the file where the data from `buffers` should be written. If `position` is not a `number`, the data will be written at the current
     * position.
     */

    @JsName("writev")
    fun writevAsync(
        buffers: ReadonlyArray<ArrayBufferView>,
        position: Number = definedExternally,
    ): Promise<WriteVResult>


    @seskar.js.JsAsync
    suspend fun writev(buffers: ReadonlyArray<ArrayBufferView>, position: Number = definedExternally): WriteVResult

    /**
     * Read from a file and write to an array of [ArrayBufferView](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView) s
     * @since v13.13.0, v12.17.0
     * @param [position='null'] The offset from the beginning of the file where the data should be read from. If `position` is not a `number`, the data will be read from the current position.
     * @return Fulfills upon success an object containing two properties:
     */

    @JsName("readv")
    fun readvAsync(buffers: ReadonlyArray<ArrayBufferView>, position: Number = definedExternally): Promise<ReadVResult>


    @seskar.js.JsAsync
    suspend fun readv(buffers: ReadonlyArray<ArrayBufferView>, position: Number = definedExternally): ReadVResult

    /**
     * Closes the file handle after waiting for any pending operation on the handle to
     * complete.
     *
     * ```js
     * import { open } from 'node:fs/promises';
     *
     * let filehandle;
     * try {
     *   filehandle = await open('thefile.txt', 'r');
     * } finally {
     *   await filehandle?.close();
     * }
     * ```
     * @since v10.0.0
     * @return Fulfills with `undefined` upon success.
     */

    @JsName("close")
    fun closeAsync(): Promise<js.core.Void>


    @seskar.js.JsAsync
    suspend fun close(): js.core.Void

}
