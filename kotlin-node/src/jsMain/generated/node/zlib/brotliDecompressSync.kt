// Generated by Karakum - do not modify it manually!

@file:JsModule("node:zlib")

package node.zlib

/**
 * Decompress a chunk of data with `BrotliDecompress`.
 * @since v11.7.0, v10.16.0
 */
external fun brotliDecompressSync(buf: InputType, options: BrotliOptions = definedExternally): node.buffer.Buffer<*>
