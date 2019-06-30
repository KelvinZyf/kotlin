package playCode

import javax.swing.JOptionPane

class BluePlay: Player {

    override fun getPlayButton() {
        println("蓝色播放器")
    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null, "蓝色播放器", "蓝色", JOptionPane.DEFAULT_OPTION)
    }
}