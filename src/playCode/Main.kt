package playCode

fun main(args: Array<String>) {
    val user = User(1, "我兜里有糖", PlayerType.VIP("VIP", "VIP播放器"))
    PlayWindow.instance().showPlayer(user)
}
