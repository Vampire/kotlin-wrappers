// Generated by Karakum - do not modify it manually!

@file:JsModule("node:inspector")

package node.inspector

/**
 * Blocks until a client (existing or connected later) has sent`Runtime.runIfWaitingForDebugger` command.
 *
 * An exception will be thrown if there is no active inspector.
 * @since v12.7.0
 */
external fun waitForDebugger(): Unit
