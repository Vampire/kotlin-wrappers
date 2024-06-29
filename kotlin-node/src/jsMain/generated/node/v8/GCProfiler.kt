// Generated by Karakum - do not modify it manually!

@file:JsModule("node:v8")

package node.v8

/**
 * This API collects GC data in current thread.
 * @since v19.6.0, v18.15.0
 */
external class GCProfiler {
    /**
     * Start collecting GC data.
     * @since v19.6.0, v18.15.0
     */
    fun start(): Unit

    /**
     * Stop collecting GC data and return an object.The content of object
     * is as follows.
     *
     * ```json
     * {
     *   "version": 1,
     *   "startTime": 1674059033862,
     *   "statistics": [
     *     {
     *       "gcType": "Scavenge",
     *       "beforeGC": {
     *         "heapStatistics": {
     *           "totalHeapSize": 5005312,
     *           "totalHeapSizeExecutable": 524288,
     *           "totalPhysicalSize": 5226496,
     *           "totalAvailableSize": 4341325216,
     *           "totalGlobalHandlesSize": 8192,
     *           "usedGlobalHandlesSize": 2112,
     *           "usedHeapSize": 4883840,
     *           "heapSizeLimit": 4345298944,
     *           "mallocedMemory": 254128,
     *           "externalMemory": 225138,
     *           "peakMallocedMemory": 181760
     *         },
     *         "heapSpaceStatistics": [
     *           {
     *             "spaceName": "read_only_space",
     *             "spaceSize": 0,
     *             "spaceUsedSize": 0,
     *             "spaceAvailableSize": 0,
     *             "physicalSpaceSize": 0
     *           }
     *         ]
     *       },
     *       "cost": 1574.14,
     *       "afterGC": {
     *         "heapStatistics": {
     *           "totalHeapSize": 6053888,
     *           "totalHeapSizeExecutable": 524288,
     *           "totalPhysicalSize": 5500928,
     *           "totalAvailableSize": 4341101384,
     *           "totalGlobalHandlesSize": 8192,
     *           "usedGlobalHandlesSize": 2112,
     *           "usedHeapSize": 4059096,
     *           "heapSizeLimit": 4345298944,
     *           "mallocedMemory": 254128,
     *           "externalMemory": 225138,
     *           "peakMallocedMemory": 181760
     *         },
     *         "heapSpaceStatistics": [
     *           {
     *             "spaceName": "read_only_space",
     *             "spaceSize": 0,
     *             "spaceUsedSize": 0,
     *             "spaceAvailableSize": 0,
     *             "physicalSpaceSize": 0
     *           }
     *         ]
     *       }
     *     }
     *   ],
     *   "endTime": 1674059036865
     * }
     * ```
     *
     * Here's an example.
     *
     * ```js
     * const { GCProfiler } = require('v8');
     * const profiler = new GCProfiler();
     * profiler.start();
     * setTimeout(() => {
     *   console.log(profiler.stop());
     * }, 1000);
     * ```
     * @since v19.6.0, v18.15.0
     */
    fun stop(): GCProfilerResult
}
