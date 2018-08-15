import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import javax.sound.sampled.AudioInputStream;
import marytts.LocalMaryInterface;
import marytts.MaryInterface;
import marytts.exceptions.MaryConfigurationException;
import marytts.exceptions.SynthesisException;
import marytts.modules.synthesis.Voice;
import marytts.signalproc.effects.AudioEffect;
import marytts.signalproc.effects.AudioEffects;
import marytts.util.data.audio.AudioPlayer;
public class TextToSpeech {
	
	private AudioPlayer tts;
	private MaryInterface marytts;
		public TextToSpeech() {
		try {
			marytts = new LocalMaryInterface();
			
		} catch (MaryConfigurationException ex) {
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
		}
	}
	public void speak(String text , float gainValue , boolean daemon , boolean join) {
		stopSpeaking();
		try (AudioInputStream audio = marytts.generateAudio(text)) {
			tts = new AudioPlayer();
			tts.setAudio(audio);
			tts.setDaemon(daemon);
			tts.start();
                       if (join)
				tts.join();
			
		} catch (SynthesisException ex) {
			Logger.getLogger(getClass().getName()).log(Level.WARNING, "Error saying phrase.", ex);
		} catch (IOException ex) {
			Logger.getLogger(getClass().getName()).log(Level.WARNING, "IO Exception", ex);
		} catch (InterruptedException ex) {
			Logger.getLogger(getClass().getName()).log(Level.WARNING, "Interrupted ", ex);
			tts.interrupt();
		}
	}
	public void stopSpeaking() {
		if (tts != null)
			tts.cancel();
	}
	public Collection<Voice> getAvailableVoices() {
		return Voice.getAvailableVoices();
	}
	public MaryInterface getMarytts() {
		return marytts;
	}
	public List<AudioEffect> getAudioEffects() {
		return StreamSupport.stream(AudioEffects.getEffects().spliterator(), false).collect(Collectors.toList());
	}
	public void setVoice(String voice) {
		marytts.setVoice(voice);
	}
}
