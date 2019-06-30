package playCode

import javax.swing.JOptionPane

val TITLE = "播放器标题"
val MESSAGE = "播放器消息"

class VIPPlayer (var title: String?, var message: String?): Player {

    init {
        title = title ?: TITLE
        message = message ?: MESSAGE
    }

    constructor(): this(TITLE, MESSAGE)

    constructor(title: String?): this(title, MESSAGE)

    override fun showView() {
        JOptionPane.showConfirmDialog(null, message, title, JOptionPane.DEFAULT_OPTION)
    }

    override fun getPlayButton() {
        println("VIP button")
    }

}