package playCode

import javax.swing.JOptionPane

class GreenPlay: Player {

    override fun getPlayButton() {
        println("绿色播放器")
    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null, "绿色播放器", "绿色", JOptionPane.DEFAULT_OPTION)
    }
}