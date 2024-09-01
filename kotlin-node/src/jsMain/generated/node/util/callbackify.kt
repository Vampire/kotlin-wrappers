// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util

import js.promise.Promise

/**
 * Takes an `async` function (or a function that returns a `Promise`) and returns a
 * function following the error-first callback style, i.e. taking
 * an `(err, value) => ...` callback as the last argument. In the callback, the
 * first argument will be the rejection reason (or `null` if the `Promise` resolved), and the second argument will be the resolved value.
 *
 * ```js
 * const util = require('node:util');
 *
 * async function fn() {
 *   return 'hello world';
 * }
 * const callbackFunction = util.callbackify(fn);
 *
 * callbackFunction((err, ret) => {
 *   if (err) throw err;
 *   console.log(ret);
 * });
 * ```
 *
 * Will print:
 *
 * ```text
 * hello world
 * ```
 *
 * The callback is executed asynchronously, and will have a limited stack trace.
 * If the callback throws, the process will emit an `'uncaughtException'` event, and if not handled will exit.
 *
 * Since `null` has a special meaning as the first argument to a callback, if a
 * wrapped function rejects a `Promise` with a falsy value as a reason, the value
 * is wrapped in an `Error` with the original value stored in a field named `reason`.
 *
 * ```js
 * function fn() {
 *   return Promise.reject(null);
 * }
 * const callbackFunction = util.callbackify(fn);
 *
 * callbackFunction((err, ret) => {
 *   // When the Promise was rejected with `null` it is wrapped with an Error and
 *   // the original value is stored in `reason`.
 *   err &#x26;&#x26; Object.hasOwn(err, 'reason') &#x26;&#x26; err.reason === null;  // true
 * });
 * ```
 * @since v8.2.0
 * @param fn An `async` function
 * @return a callback style function
 */
external fun callbackify(fn: () -> Promise<js.core.Void>): (callback: (err: node.ErrnoException) -> Unit) -> Unit

external fun <TResult> callbackify(fn: () -> Promise<TResult>): (callback: (err: node.ErrnoException, result: TResult) -> Unit) -> Unit

external fun <T1> callbackify(fn: (arg1: T1) -> Promise<js.core.Void>): (arg1: T1, callback: (err: node.ErrnoException) -> Unit) -> Unit

external fun <T1, TResult> callbackify(fn: (arg1: T1) -> Promise<TResult>): (arg1: T1, callback: (err: node.ErrnoException, result: TResult) -> Unit) -> Unit

external fun <T1, T2> callbackify(fn: (arg1: T1, arg2: T2) -> Promise<js.core.Void>): (arg1: T1, arg2: T2, callback: (err: node.ErrnoException) -> Unit) -> Unit

external fun <T1, T2, TResult> callbackify(fn: (arg1: T1, arg2: T2) -> Promise<TResult>): (arg1: T1, arg2: T2, callback: (err: node.ErrnoException?, result: TResult) -> Unit) -> Unit

external fun <T1, T2, T3> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3) -> Promise<js.core.Void>): (arg1: T1, arg2: T2, arg3: T3, callback: (err: node.ErrnoException) -> Unit) -> Unit

external fun <T1, T2, T3, TResult> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3) -> Promise<TResult>): (arg1: T1, arg2: T2, arg3: T3, callback: (err: node.ErrnoException?, result: TResult) -> Unit) -> Unit

external fun <T1, T2, T3, T4> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4) -> Promise<js.core.Void>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, callback: (err: node.ErrnoException) -> Unit) -> Unit

external fun <T1, T2, T3, T4, TResult> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4) -> Promise<TResult>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, callback: (err: node.ErrnoException?, result: TResult) -> Unit) -> Unit

external fun <T1, T2, T3, T4, T5> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5) -> Promise<js.core.Void>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, callback: (err: node.ErrnoException) -> Unit) -> Unit

external fun <T1, T2, T3, T4, T5, TResult> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5) -> Promise<TResult>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, callback: (err: node.ErrnoException?, result: TResult) -> Unit) -> Unit

external fun <T1, T2, T3, T4, T5, T6> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6) -> Promise<js.core.Void>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, callback: (err: node.ErrnoException) -> Unit) -> Unit

external fun <T1, T2, T3, T4, T5, T6, TResult> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6) -> Promise<TResult>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, callback: (err: node.ErrnoException?, result: TResult) -> Unit) -> Unit
