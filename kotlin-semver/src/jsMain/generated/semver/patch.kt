// Generated by Karakum - do not modify it manually!

@file:JsModule("semver")

package semver

// import SemVer = require("../classes/semver");

// import semver = require("../index");

/**
 * Return the patch version number.
 */
external fun patch(version: String): Int

/**
 * Return the patch version number.
 */
external fun patch(
    version: String,
    optionsOrLoose: Boolean = definedExternally,
): Int

/**
 * Return the patch version number.
 */
external fun patch(
    version: String,
    optionsOrLoose: semver.Options = definedExternally,
): Int

/**
 * Return the patch version number.
 */
external fun patch(version: SemVer): Int

/**
 * Return the patch version number.
 */
external fun patch(
    version: SemVer,
    optionsOrLoose: Boolean = definedExternally,
): Int

/**
 * Return the patch version number.
 */
external fun patch(
    version: SemVer,
    optionsOrLoose: semver.Options = definedExternally,
): Int

// export = patch;
