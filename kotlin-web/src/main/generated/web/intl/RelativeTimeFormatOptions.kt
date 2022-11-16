// Automatically generated - do not modify!

package web.intl

sealed external interface RelativeTimeFormatOptions {
    /** The locale matching algorithm to use. For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation). */
    var localeMatcher: RelativeTimeFormatLocaleMatcher?

    /** The format of output message. */
    var numeric: RelativeTimeFormatNumeric?

    /** The length of the internationalized message. */
    var style: RelativeTimeFormatStyle?
}
