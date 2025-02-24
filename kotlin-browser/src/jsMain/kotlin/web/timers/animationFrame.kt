package web.timers

import js.core.HighResTimeStamp

sealed external interface FrameRequestId

typealias FrameRequestCallback = (
    time: HighResTimeStamp,
) -> Unit

external fun requestAnimationFrame(
    callback: FrameRequestCallback,
): FrameRequestId

external fun cancelAnimationFrame(
    requestId: FrameRequestId,
)
