// Generated by Karakum - do not modify it manually!

package node.test


suspend fun todo(
    name: String = undefined.unsafeCast<Nothing>(),
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: TestFn = undefined.unsafeCast<Nothing>(),
): js.core.Void =
    todoAsync(
        name, options, fn
    ).await()


suspend fun todo(
    name: String = undefined.unsafeCast<Nothing>(),
    fn: TestFn = undefined.unsafeCast<Nothing>(),
): js.core.Void =
    todoAsync(
        name, fn
    ).await()


suspend fun todo(
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: TestFn = undefined.unsafeCast<Nothing>(),
): js.core.Void =
    todoAsync(
        options, fn
    ).await()


suspend fun todo(fn: TestFn = undefined.unsafeCast<Nothing>()): js.core.Void =
    todoAsync(
        fn
    ).await()


suspend fun todo(): js.core.Void =
    todoAsync(

    ).await()
