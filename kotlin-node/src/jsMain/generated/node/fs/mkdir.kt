// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs

/**
 * Asynchronously creates a directory.
 *
 * The callback is given a possible exception and, if `recursive` is `true`, the
 * first directory path created, `(err[, path])`.`path` can still be `undefined` when `recursive` is `true`, if no directory was
 * created (for instance, if it was previously created).
 *
 * The optional `options` argument can be an integer specifying `mode` (permission
 * and sticky bits), or an object with a `mode` property and a `recursive`property indicating whether parent directories should be created. Calling`fs.mkdir()` when `path` is a directory that
 * exists results in an error only
 * when `recursive` is false. If `recursive` is false and the directory exists,
 * an `EEXIST` error occurs.
 *
 * ```js
 * import { mkdir } from 'node:fs';
 *
 * // Create ./tmp/a/apple, regardless of whether ./tmp and ./tmp/a exist.
 * mkdir('./tmp/a/apple', { recursive: true }, (err) => {
 *   if (err) throw err;
 * });
 * ```
 *
 * On Windows, using `fs.mkdir()` on the root directory even with recursion will
 * result in an error:
 *
 * ```js
 * import { mkdir } from 'node:fs';
 *
 * mkdir('/', { recursive: true }, (err) => {
 *   // => [Error: EPERM: operation not permitted, mkdir 'C:\']
 * });
 * ```
 *
 * See the POSIX [`mkdir(2)`](http://man7.org/linux/man-pages/man2/mkdir.2.html) documentation for more details.
 * @since v0.1.8
 */
external fun mkdir(
    path: PathLike,
    options: MkdirRecursiveOptions,
    callback: (err: node.ErrnoException?, path: String? /* use undefined for default */) -> Unit,
): Unit

/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */
external fun mkdir(path: PathLike, options: Mode?, callback: NoParamCallback): Unit

/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */
external fun mkdir(path: PathLike, options: (MkdirOptions)?, callback: NoParamCallback): Unit

/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */
external fun mkdir(
    path: PathLike,
    options: Mode?,
    callback: (err: node.ErrnoException?, path: String? /* use undefined for default */) -> Unit,
): Unit

/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */
external fun mkdir(
    path: PathLike,
    options: MakeDirectoryOptions?,
    callback: (err: node.ErrnoException?, path: String? /* use undefined for default */) -> Unit,
): Unit

/**
 * Asynchronous mkdir(2) - create a directory with a mode of `0o777`.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 */
external fun mkdir(path: PathLike, callback: NoParamCallback): Unit
