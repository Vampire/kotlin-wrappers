const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "RouteObject"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `external interface RouteObject /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
