// Generated by Karakum - do not modify it manually!

package node.perfHooks

sealed external interface PerformanceObserverEntryList {
    /**
     * Returns a list of `PerformanceEntry` objects in chronological order
     * with respect to `performanceEntry.startTime`.
     *
     * ```js
     * const {
     *   performance,
     *   PerformanceObserver,
     * } = require('node:perf_hooks');
     *
     * const obs = new PerformanceObserver((perfObserverList, observer) => {
     *   console.log(perfObserverList.getEntries());
     *
     *    * [
     *    *   PerformanceEntry {
     *    *     name: 'test',
     *    *     entryType: 'mark',
     *    *     startTime: 81.465639,
     *    *     duration: 0,
     *    *     detail: null
     *    *   },
     *    *   PerformanceEntry {
     *    *     name: 'meow',
     *    *     entryType: 'mark',
     *    *     startTime: 81.860064,
     *    *     duration: 0,
     *    *     detail: null
     *    *   }
     *    * ]
     *
     *   performance.clearMarks();
     *   performance.clearMeasures();
     *   observer.disconnect();
     * });
     * obs.observe({ type: 'mark' });
     *
     * performance.mark('test');
     * performance.mark('meow');
     * ```
     * @since v8.5.0
     */
    fun getEntries(): js.array.ReadonlyArray<PerformanceEntry>

    /**
     * Returns a list of `PerformanceEntry` objects in chronological order
     * with respect to `performanceEntry.startTime` whose `performanceEntry.name` is
     * equal to `name`, and optionally, whose `performanceEntry.entryType` is equal to`type`.
     *
     * ```js
     * const {
     *   performance,
     *   PerformanceObserver,
     * } = require('node:perf_hooks');
     *
     * const obs = new PerformanceObserver((perfObserverList, observer) => {
     *   console.log(perfObserverList.getEntriesByName('meow'));
     *
     *    * [
     *    *   PerformanceEntry {
     *    *     name: 'meow',
     *    *     entryType: 'mark',
     *    *     startTime: 98.545991,
     *    *     duration: 0,
     *    *     detail: null
     *    *   }
     *    * ]
     *
     *   console.log(perfObserverList.getEntriesByName('nope')); // []
     *
     *   console.log(perfObserverList.getEntriesByName('test', 'mark'));
     *
     *    * [
     *    *   PerformanceEntry {
     *    *     name: 'test',
     *    *     entryType: 'mark',
     *    *     startTime: 63.518931,
     *    *     duration: 0,
     *    *     detail: null
     *    *   }
     *    * ]
     *
     *   console.log(perfObserverList.getEntriesByName('test', 'measure')); // []
     *
     *   performance.clearMarks();
     *   performance.clearMeasures();
     *   observer.disconnect();
     * });
     * obs.observe({ entryTypes: ['mark', 'measure'] });
     *
     * performance.mark('test');
     * performance.mark('meow');
     * ```
     * @since v8.5.0
     */
    fun getEntriesByName(name: String, type: EntryType = definedExternally): js.array.ReadonlyArray<PerformanceEntry>

    /**
     * Returns a list of `PerformanceEntry` objects in chronological order
     * with respect to `performanceEntry.startTime` whose `performanceEntry.entryType`is equal to `type`.
     *
     * ```js
     * const {
     *   performance,
     *   PerformanceObserver,
     * } = require('node:perf_hooks');
     *
     * const obs = new PerformanceObserver((perfObserverList, observer) => {
     *   console.log(perfObserverList.getEntriesByType('mark'));
     *
     *    * [
     *    *   PerformanceEntry {
     *    *     name: 'test',
     *    *     entryType: 'mark',
     *    *     startTime: 55.897834,
     *    *     duration: 0,
     *    *     detail: null
     *    *   },
     *    *   PerformanceEntry {
     *    *     name: 'meow',
     *    *     entryType: 'mark',
     *    *     startTime: 56.350146,
     *    *     duration: 0,
     *    *     detail: null
     *    *   }
     *    * ]
     *
     *   performance.clearMarks();
     *   performance.clearMeasures();
     *   observer.disconnect();
     * });
     * obs.observe({ type: 'mark' });
     *
     * performance.mark('test');
     * performance.mark('meow');
     * ```
     * @since v8.5.0
     */
    fun getEntriesByType(type: EntryType): js.array.ReadonlyArray<PerformanceEntry>
}
