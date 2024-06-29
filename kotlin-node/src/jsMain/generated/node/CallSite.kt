// Generated by Karakum - do not modify it manually!

package node

sealed external interface CallSite {
    /**
     * Value of "this"
     */
    fun getThis(): Any?

    /**
     * Type of "this" as a string.
     * This is the name of the function stored in the constructor field of
     * "this", if available.  Otherwise the object's [[Class]] internal
     * property.
     */
    fun getTypeName(): String?

    /**
     * Current function
     */
    fun getFunction(): Function<*>?

    /**
     * Name of the current function, typically its name property.
     * If a name property is not available an attempt will be made to try
     * to infer a name from the function's context.
     */
    fun getFunctionName(): String?

    /**
     * Name of the property [of "this" or one of its prototypes] that holds
     * the current function
     */
    fun getMethodName(): String?

    /**
     * Name of the script [if this function was defined in a script]
     */
    fun getFileName(): String?

    /**
     * Current line number [if this function was defined in a script]
     */
    fun getLineNumber(): Double?

    /**
     * Current column number [if this function was defined in a script]
     */
    fun getColumnNumber(): Double?

    /**
     * A call site object representing the location where eval was called
     * [if this function was created using a call to eval]
     */
    fun getEvalOrigin(): String?

    /**
     * Is this a toplevel invocation, that is, is "this" the global object?
     */
    fun isToplevel(): Boolean

    /**
     * Does this call take place in code defined by a call to eval?
     */
    fun isEval(): Boolean

    /**
     * Is this call in native V8 code?
     */
    fun isNative(): Boolean

    /**
     * Is this a constructor call?
     */
    fun isConstructor(): Boolean

    /**
     * is this an async call (i.e. await, Promise.all(), or Promise.any())?
     */
    fun isAsync(): Boolean

    /**
     * is this an async call to Promise.all()?
     */
    fun isPromiseAll(): Boolean

    /**
     * returns the index of the promise element that was followed in
     * Promise.all() or Promise.any() for async stack traces, or null
     * if the CallSite is not an async
     */
    fun getPromiseIndex(): Double?
    fun getScriptNameOrSourceURL(): String
    fun getScriptHash(): String
    fun getEnclosingColumnNumber(): Double
    fun getEnclosingLineNumber(): Double
    fun getPosition(): Double
    override fun toString(): String
}
