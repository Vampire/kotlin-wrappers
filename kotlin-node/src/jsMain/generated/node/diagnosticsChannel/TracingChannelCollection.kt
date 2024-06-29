// Generated by Karakum - do not modify it manually!

package node.diagnosticsChannel

sealed external interface TracingChannelCollection<StoreType /* default is Any? */, ContextType /* default is StoreType */> {
    var start: Channel<StoreType, ContextType>
    var end: Channel<StoreType, ContextType>
    var asyncStart: Channel<StoreType, ContextType>
    var asyncEnd: Channel<StoreType, ContextType>
    var error: Channel<StoreType, ContextType>
}
