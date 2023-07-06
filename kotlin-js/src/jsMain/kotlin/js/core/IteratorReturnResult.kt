@file:Suppress("WRONG_JS_QUALIFIER")
// language=JavaScript
@file:JsQualifier(
    """({
    __guard__: {
        [Symbol.hasInstance](instance) {
            return instance && (typeof instance === 'object') && (instance.done === true)
        }
    }
  })"""
)

package js.core

@JsName("__guard__")
sealed external class IteratorReturnResult<out TReturn> :
    IteratorResult<Void, TReturn> {
    val value: TReturn
}
