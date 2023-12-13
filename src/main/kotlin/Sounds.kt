import java.io.File
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.FloatControl

open class Sounds {



    open fun playSound(audioPath: String) {

        val audio: File = File(audioPath)


        val audioInput: AudioInputStream = AudioSystem.getAudioInputStream(audio)


        val clip: Clip = AudioSystem.getClip()


        clip.open(audioInput)


        clip.start()




        if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
            val volume: FloatControl = clip.getControl(FloatControl.Type.MASTER_GAIN) as FloatControl

            volume.value = volume.minimum + (0.99f * (volume.maximum - volume.minimum))
        } else {
            println("Master Gain control not supported.")
        }
    }
}

