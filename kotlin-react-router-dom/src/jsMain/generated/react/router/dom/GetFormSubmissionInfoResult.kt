// Generated by Karakum - do not modify it manually!

package react.router.dom

import web.form.FormData

sealed external interface GetFormSubmissionInfoResult {
    var action: String?
    var method: String
    var encType: String
    var formData: FormData?
    var body: Any?
}
