// Generated by Karakum - do not modify it manually!

package node.inspector

sealed external interface InspectorNotification<T> {
    var method: String
    var params: T
}
