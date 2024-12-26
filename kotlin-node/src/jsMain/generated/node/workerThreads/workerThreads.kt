// Generated by Karakum - do not modify it manually!

@file:JsModule("node:worker_threads")

package node.workerThreads

/**
 * The `node:worker_threads` module enables the use of threads that execute
 * JavaScript in parallel. To access it:
 *
 * ```js
 * import worker from 'node:worker_threads';
 * ```
 *
 * Workers (threads) are useful for performing CPU-intensive JavaScript operations.
 * They do not help much with I/O-intensive work. The Node.js built-in
 * asynchronous I/O operations are more efficient than Workers can be.
 *
 * Unlike `child_process` or `cluster`, `worker_threads` can share memory. They do
 * so by transferring `ArrayBuffer` instances or sharing `SharedArrayBuffer` instances.
 *
 * ```js
 * import {
 *   Worker, isMainThread, parentPort, workerData,
 * } from 'node:worker_threads';
 * import { parse } from 'some-js-parsing-library';
 *
 * if (isMainThread) {
 *   module.exports = function parseJSAsync(script) {
 *     return new Promise((resolve, reject) => {
 *       const worker = new Worker(__filename, {
 *         workerData: script,
 *       });
 *       worker.on('message', resolve);
 *       worker.on('error', reject);
 *       worker.on('exit', (code) => {
 *         if (code !== 0)
 *           reject(new Error(`Worker stopped with exit code ${code}`));
 *       });
 *     });
 *   };
 * } else {
 *   const script = workerData;
 *   parentPort.postMessage(parse(script));
 * }
 * ```
 *
 * The above example spawns a Worker thread for each `parseJSAsync()` call. In
 * practice, use a pool of Workers for these kinds of tasks. Otherwise, the
 * overhead of creating Workers would likely exceed their benefit.
 *
 * When implementing a worker pool, use the `AsyncResource` API to inform
 * diagnostic tools (e.g. to provide asynchronous stack traces) about the
 * correlation between tasks and their outcomes. See `"Using AsyncResource for a Worker thread pool"` in the `async_hooks` documentation for an example implementation.
 *
 * Worker threads inherit non-process-specific options by default. Refer to `Worker constructor options` to know how to customize worker thread options,
 * specifically `argv` and `execArgv` options.
 * @see [source](https://github.com/nodejs/node/blob/v22.x/lib/worker_threads.js)
 */


/* export * from "worker_threads"; */
