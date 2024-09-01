// Generated by Karakum - do not modify it manually!

package node.test

sealed external interface TestFailDetails {
    /**
     * The duration of the test in milliseconds.
     */
    var duration_ms: Double

    /**
     * An error wrapping the error thrown by the test if it did not pass.
     */
    var error: js.errors.JsError

    /**
     * The type of the test, used to denote whether this is a suite.
     * @since v20.0.0, v19.9.0, v18.17.0
     */
    var type: String /* "suite" */?
}
