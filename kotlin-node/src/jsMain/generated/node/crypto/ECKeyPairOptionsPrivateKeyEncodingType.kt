// Generated by Karakum - do not modify it manually!

package node.crypto

sealed external interface ECKeyPairOptionsPrivateKeyEncodingType {
    companion object {
        @seskar.js.JsValue("sec1")
        val sec1: ECKeyPairOptionsPrivateKeyEncodingType

        @seskar.js.JsValue("pkcs8")
        val pkcs8: ECKeyPairOptionsPrivateKeyEncodingType
    }
}
