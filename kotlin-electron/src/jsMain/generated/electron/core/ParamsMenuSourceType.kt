// Generated by Karakum - do not modify it manually!

package electron.core

sealed external interface ParamsMenuSourceType {
    companion object {
        @seskar.js.JsValue("none")
        val none: ParamsMenuSourceType

        @seskar.js.JsValue("mouse")
        val mouse: ParamsMenuSourceType

        @seskar.js.JsValue("keyboard")
        val keyboard: ParamsMenuSourceType

        @seskar.js.JsValue("touch")
        val touch: ParamsMenuSourceType

        @seskar.js.JsValue("touchMenu")
        val touchMenu: ParamsMenuSourceType

        @seskar.js.JsValue("longPress")
        val longPress: ParamsMenuSourceType

        @seskar.js.JsValue("longTap")
        val longTap: ParamsMenuSourceType

        @seskar.js.JsValue("touchHandle")
        val touchHandle: ParamsMenuSourceType

        @seskar.js.JsValue("stylus")
        val stylus: ParamsMenuSourceType

        @seskar.js.JsValue("adjustSelection")
        val adjustSelection: ParamsMenuSourceType

        @seskar.js.JsValue("adjustSelectionReset")
        val adjustSelectionReset: ParamsMenuSourceType
    }
}
