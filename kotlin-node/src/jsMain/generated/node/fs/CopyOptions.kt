// Generated by Karakum - do not modify it manually!

package node.fs

sealed external interface CopyOptions : CopyOptionsBase {
    /**
     * Function to filter copied files/directories. Return
     * `true` to copy the item, `false` to ignore it.
     */
    val filter: ((source: String, destination: String) -> js.promise.PromiseResult<Boolean>)?
}
