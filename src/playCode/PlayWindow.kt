package playCode

class PlayWindow private constructor() {

    // 单例写法
    companion object {
        fun instance(): PlayWindow {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = PlayWindow()
    }

    fun showPlayer(user: User) {

        MediaPlay(getPlayer(user.playerType)).showView()
    }
}