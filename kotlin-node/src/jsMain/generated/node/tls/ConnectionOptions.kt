// Generated by Karakum - do not modify it manually!

package node.tls

external interface ConnectionOptions : SecureContextOptions, CommonConnectionOptions {
    var host: String?
    var port: Double?
    var path: String?// Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.

    var socket: node.stream.Duplex?// Establish secure connection on a given socket rather than creating a new socket

    var checkServerIdentity: ((hostname: String, cert: PeerCertificate) -> js.errors.JsError?)?
    var servername: String?// SNI TLS Extension

    var session: node.buffer.Buffer?
    var minDHSize: Double?
    var lookup: node.net.LookupFunction?
    var timeout: Double?

    /**
     * When negotiating TLS-PSK (pre-shared keys), this function is called
     * with optional identity `hint` provided by the server or `null`
     * in case of TLS 1.3 where `hint` was removed.
     * It will be necessary to provide a custom `tls.checkServerIdentity()`
     * for the connection as the default one will try to check hostname/IP
     * of the server against the certificate but that's not applicable for PSK
     * because there won't be a certificate present.
     * More information can be found in the RFC 4279.
     *
     * @param hint message sent from the server to help client
     * decide which identity to use during negotiation.
     * Always `null` if TLS 1.3 is used.
     * @returns Return `null` to stop the negotiation process. `psk` must be
     * compatible with the selected cipher's digest.
     * `identity` must use UTF-8 encoding.
     */
    val pskCallback: ((hint: String?) -> PSKCallbackNegotation?)?
}
