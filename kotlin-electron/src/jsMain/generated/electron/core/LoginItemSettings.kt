package electron.core


external interface LoginItemSettings {
    /**
     * `true` if the app is set to open at login.
     */
    var openAtLogin: Boolean

    /**
     * `true` if the app is set to open as hidden at login. This setting is not
     * available on MAS builds.
     *
     * @platform darwin
     */
    var openAsHidden: Boolean

    /**
     * `true` if the app was opened at login automatically. This setting is not
     * available on MAS builds.
     *
     * @platform darwin
     */
    var wasOpenedAtLogin: Boolean

    /**
     * `true` if the app was opened as a hidden login item. This indicates that the app
     * should not open any windows at startup. This setting is not available on MAS
     * builds.
     *
     * @platform darwin
     */
    var wasOpenedAsHidden: Boolean

    /**
     * `true` if the app was opened as a login item that should restore the state from
     * the previous session. This indicates that the app should restore the windows
     * that were open the last time the app was closed. This setting is not available
     * on MAS builds.
     *
     * @platform darwin
     */
    var restoreState: Boolean

    /**
     * `true` if app is set to open at login and its run key is not deactivated. This
     * differs from `openAtLogin` as it ignores the `args` option, this property will
     * be true if the given executable would be launched at login with **any**
     * arguments.
     *
     * @platform win32
     */
    var executableWillLaunchAtLogin: Boolean
    var launchItems: js.core.ReadonlyArray<LaunchItems>
}
