// Automatically generated - do not modify!

package webrtc

import js.core.ReadonlyArray

sealed external class RTCRtpTransceiver {
    val currentDirection: RTCRtpTransceiverDirection?
    var direction: RTCRtpTransceiverDirection
    val mid: String?
    val receiver: RTCRtpReceiver
    val sender: RTCRtpSender
    fun setCodecPreferences(codecs: ReadonlyArray<RTCRtpCodecCapability>)
    fun stop()
}
