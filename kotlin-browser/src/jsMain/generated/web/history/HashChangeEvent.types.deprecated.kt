// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import web.events.EventType

sealed external class HashChangeEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("HashChangeEvent.HASH_CHANGE"),
    )
    @JsValue("hashchange")
    fun hashChange(): EventType<HashChangeEvent>
}
