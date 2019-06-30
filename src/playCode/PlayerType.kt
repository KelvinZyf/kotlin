package playCode

/**
 * 枚举类型
 */
sealed class PlayerType {
    object GREEN: PlayerType()
    object BLUE: PlayerType()

    // 自定义枚举类型
    class VIP(val title: String? = null, val content: String? = null) : PlayerType()
}

// 工厂，根据传入的类型创建不同的播放器
fun getPlayer(type: PlayerType) = when(type) {
        PlayerType.GREEN -> GreenPlay()
        PlayerType.BLUE -> BluePlay()
        is PlayerType.VIP -> VIPPlayer(type.title, type.content)
}
