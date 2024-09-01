// Generated by Karakum - do not modify it manually!

@file:JsModule("node:module")

package node.module

import node.Require
import web.url.URL
import node.Module as NodeModule
import node.Require as NodeRequire


external class Module : NodeModule {
    constructor (id: String, parent: Module = definedExternally)

    override
            /**
             * `true` if the module is running during the Node.js preload
             */
    var isPreloading: Boolean
    override var exports: Any?
    override var require: Require
    override var id: String
    override var filename: String
    override var loaded: Boolean

    override
            /**
             * @since v11.14.0
             *
             * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
             */
    var path: String
    override var paths: js.array.ReadonlyArray<String>
    override var parent: node.Module?
    override var children: js.array.ReadonlyArray<node.Module>

    companion object {
        fun runMain(): Unit
        fun wrap(code: String): String
        fun createRequire(path: String): NodeRequire

        fun createRequire(path: URL): NodeRequire
        var builtinModules: js.array.ReadonlyArray<String>
        fun isBuiltin(moduleName: String): Boolean
        var Module: Any?
        fun <Data /* default is Any? */> register(specifier: String): Unit

        fun <Data /* default is Any? */> register(
            specifier: String,
            parentURL: String = definedExternally,
            options: RegisterOptions<Data> = definedExternally,
        ): Unit

        fun <Data /* default is Any? */> register(
            specifier: String,
            parentURL: URL = definedExternally,
            options: RegisterOptions<Data> = definedExternally,
        ): Unit

        fun <Data /* default is Any? */> register(specifier: URL): Unit

        fun <Data /* default is Any? */> register(
            specifier: URL,
            parentURL: String = definedExternally,
            options: RegisterOptions<Data> = definedExternally,
        ): Unit

        fun <Data /* default is Any? */> register(
            specifier: URL,
            parentURL: URL = definedExternally,
            options: RegisterOptions<Data> = definedExternally,
        ): Unit

        fun <Data /* default is Any? */> register(
            specifier: String,
            options: RegisterOptions<Data> = definedExternally,
        ): Unit

        fun <Data /* default is Any? */> register(
            specifier: URL,
            options: RegisterOptions<Data> = definedExternally,
        ): Unit
    }
}
