package react.select

import csstype.ClassName
import react.Props
import react.RefCallback
import web.html.HTMLInputElement

external interface InputSpecificProps : Props {

    /** Reference to the internal element */
    var innerRef: RefCallback<HTMLInputElement>?
    var isHidden: Boolean
    var isDisabled: Boolean?
    var form: String?
    var inputClassName: ClassName?
}
