// Generated by Karakum - do not modify it manually!

package node.fs


suspend fun lchown(path: PathLike, uid: Number, gid: Number): js.core.Void =
    lchownAsync(
        path, uid, gid
    ).await()
