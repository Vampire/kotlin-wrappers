// Generated by Karakum - do not modify it manually!

@file:JsModule("node:stream/promises")

package node.stream

import js.promise.Promise


@JsName("finished")
external fun finishedAsync(
    stream: node.ReadableStream,
    options: FinishedOptions = definedExternally,
): Promise<js.core.Void>


@JsName("finished")
external fun finishedAsync(
    stream: node.WritableStream,
    options: FinishedOptions = definedExternally,
): Promise<js.core.Void>


@JsName("finished")
external fun finishedAsync(
    stream: node.ReadWriteStream,
    options: FinishedOptions = definedExternally,
): Promise<js.core.Void>
