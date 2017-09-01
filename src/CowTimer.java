import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;

public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction.
	 * Work in seconds when testing, then change to minutes
	 */

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
CowTimer timer = new CowTimer();
timer.setTime(5);
timer.start();
	}

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		
		System.out.println(5);
		Thread.sleep(60000);
		System.out.println(4);
		Thread.sleep(60000);
		System.out.println(3);
		Thread.sleep(60000);
		System.out.println(2);
		Thread.sleep(60000);
		System.out.println(1);
		Thread.sleep(60000);
		System.out.println("DONEEE");
		

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
