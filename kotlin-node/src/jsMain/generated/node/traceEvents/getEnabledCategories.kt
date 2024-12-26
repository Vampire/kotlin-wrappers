// Generated by Karakum - do not modify it manually!

@file:JsModule("node:trace_events")

package node.traceEvents

/**
 * Returns a comma-separated list of all currently-enabled trace event
 * categories. The current set of enabled trace event categories is determined
 * by the _union_ of all currently-enabled `Tracing` objects and any categories
 * enabled using the `--trace-event-categories` flag.
 *
 * Given the file `test.js` below, the command `node --trace-event-categories node.perf test.js` will print `'node.async_hooks,node.perf'` to the console.
 *
 * ```js
 * import trace_events from 'node:trace_events';
 * const t1 = trace_events.createTracing({ categories: ['node.async_hooks'] });
 * const t2 = trace_events.createTracing({ categories: ['node.perf'] });
 * const t3 = trace_events.createTracing({ categories: ['v8'] });
 *
 * t1.enable();
 * t2.enable();
 *
 * console.log(trace_events.getEnabledCategories());
 * ```
 * @since v10.0.0
 */
external fun getEnabledCategories(): String?
