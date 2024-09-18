// Generated by Karakum - do not modify it manually!

@file:JsModule("semver")

package semver

// import semver = require("../index");

// import SemVer = require("../classes/semver");

/**
 * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
 */
external fun diff(
    v1: String,
    v2: String,
): semver.ReleaseType?

/**
 * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
 */
external fun diff(
    v1: String,
    v2: SemVer,
): semver.ReleaseType?

/**
 * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
 */
external fun diff(
    v1: SemVer,
    v2: String,
): semver.ReleaseType?

/**
 * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
 */
external fun diff(
    v1: SemVer,
    v2: SemVer,
): semver.ReleaseType?

// export = diff;
