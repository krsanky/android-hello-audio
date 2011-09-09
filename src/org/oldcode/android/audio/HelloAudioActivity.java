package org.oldcode.android.audio;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;

public class HelloAudioActivity extends Activity {
	
	private MediaPlayer mp;
	
	/** Called when the activity is first created. */
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        
	}

	/*
	irst things first. We need some audio clips. Search the web or your computer and grab some. Drop them into res/raw directory.
	Add the imports for the android.media package items and private MediaPlayer variable.

	import android.media.AudioManager;

	import android.media.MediaPlayer; 

	private MediaPlayer mp;


	In your new activity's onCreate() method, add the call to:

	setVolumeControlStream(AudioManager.STREAM_MUSIC);

	This is important, as not adding it, will cause the volume button to continue controlling the ringer volume instead of actual media volume.
	*/

	/*
	Create the override for the onKeyDown() method.
	 */
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		int resId;

		switch (keyCode) {
		case KeyEvent.KEYCODE_DPAD_UP:
			resId = R.raw.bender_7_billion_ton_r_m;
			break;
		
	 	case KeyEvent.KEYCODE_DPAD_DOWN:
			resId = R.raw.kirby_style_laser; 
			break;
		/*
	 	case KeyEvent.KEYCODEDPADLEFT: 
			resId = R.raw.left;
			break;
	 	case KeyEvent.KEYCODEDPADRIGHT: 
	 		resId = R.raw.right;
	 		break;
	 	case KeyEvent.KEYCODEDPADCENTER: 
	 	case KeyEvent.KEYCODE_ENTER:
	 		resId = R.raw.enter;
	 		break;
	 	case KeyEvent.KEYCODE_A:
	 		resId = R.raw.a;
	 		break;
	 	case KeyEvent.KEYCODE_S:
	 		resId = R.raw.s;
	 		break;
	 	case KeyEvent.KEYCODE_D:
	 		resId = R.raw.d;
	 		break;
	 	case KeyEvent.KEYCODE_F:
	 		resId = R.raw.f;
	 		break; 
		*/
		default:
			return super.onKeyDown(keyCode, event); 
		}

		// Release any resources from previous MediaPlayer
		if (mp != null) 
			mp.release(); 

		// Create a new MediaPlayer to play this sound
		mp = MediaPlayer.create(this, resId); 
		mp.start();

		// Indicate this key was handled
		return true;
	
	}	

}


