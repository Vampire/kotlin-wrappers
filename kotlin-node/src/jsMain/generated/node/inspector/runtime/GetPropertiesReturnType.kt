// Generated by Karakum - do not modify it manually!

package node.inspector.runtime

sealed external interface GetPropertiesReturnType {
    /**
     * Object properties.
     */
    var result: js.array.ReadonlyArray<PropertyDescriptor>

    /**
     * Internal object properties (only of the element itself).
     */
    var internalProperties: js.array.ReadonlyArray<InternalPropertyDescriptor>?

    /**
     * Exception details.
     */
    var exceptionDetails: ExceptionDetails?
}
