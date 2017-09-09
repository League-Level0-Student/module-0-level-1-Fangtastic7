import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		
		int userMood = JOptionPane.showOptionDialog(null, "How do you feel?", "What is your mood?", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Angry", "Sad", "Happy" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
			System.out.println(userMood);
		// 3. Use the playVideo method below to play a song from YouTube that matches their mood.
				if(userMood == 2) {
				playVideo("http://bit.ly/video-for-happy");
				}
		// 4. Play different songs for each mood.
				if(userMood == 1) {
				playVideo("http://bit.ly/video-for-sad");
				}
				else {
					playVideo("http://bit.ly/video-for-angry");
				}
					
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
* If you can’t think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/

