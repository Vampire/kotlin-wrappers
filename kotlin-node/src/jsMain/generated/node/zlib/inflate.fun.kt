// Generated by Karakum - do not modify it manually!

@file:JsModule("node:zlib")

package node.zlib

/**
 * @since v0.6.0
 */
external fun inflate(buf: InputType, callback: CompressCallback): Unit

external fun inflate(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit
