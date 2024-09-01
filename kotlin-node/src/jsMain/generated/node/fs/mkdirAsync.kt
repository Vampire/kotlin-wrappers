// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * Asynchronously creates a directory.
 *
 * The optional `options` argument can be an integer specifying `mode` (permission
 * and sticky bits), or an object with a `mode` property and a `recursive` property indicating whether parent directories should be created. Calling `fsPromises.mkdir()` when `path` is a directory
 * that exists results in a
 * rejection only when `recursive` is false.
 *
 * ```js
 * import { mkdir } from 'node:fs/promises';
 *
 * try {
 *   const projectFolder = new URL('./test/project/', import.meta.url);
 *   const createDir = await mkdir(projectFolder, { recursive: true });
 *
 *   console.log(`created ${createDir}`);
 * } catch (err) {
 *   console.error(err.message);
 * }
 * ```
 * @since v10.0.0
 * @return Upon success, fulfills with `undefined` if `recursive` is `false`, or the first directory path created if `recursive` is `true`.
 */

@JsName("mkdir")
external fun mkdirAsync(path: PathLike, options: MkdirRecursiveAsyncOptions): Promise<String?>


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */

@JsName("mkdir")
external fun mkdirAsync(path: PathLike): Promise<js.core.Void>


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */

@JsName("mkdir")
external fun mkdirAsync(path: PathLike, options: Mode? = definedExternally): Promise<js.core.Void>


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */

@JsName("mkdir")
external fun mkdirAsync(path: PathLike, options: (MkdirAsyncOptions)? = definedExternally): Promise<js.core.Void>


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */

@JsName("mkdir")
external fun mkdirAsync(path: PathLike, options: MakeDirectoryOptions? = definedExternally): Promise<String?>
