// Generated by Karakum - do not modify it manually!

package node.crypto

sealed external interface ECDHConvertKeyOutputEncoding {
    companion object {
        @seskar.js.JsValue("latin1")
        val latin1: ECDHConvertKeyOutputEncoding

        @seskar.js.JsValue("hex")
        val hex: ECDHConvertKeyOutputEncoding

        @seskar.js.JsValue("base64")
        val base64: ECDHConvertKeyOutputEncoding

        @seskar.js.JsValue("base64url")
        val base64url: ECDHConvertKeyOutputEncoding
    }
}
