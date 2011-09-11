package org.oldcode.video;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;

public class HelloVideoActivity extends Activity {

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        VideoView video = (VideoView) findViewById(R.id.video);
        
        // Load and start the movie 
        //video.setVideoPath("/data/irene_bridge_bf.3gp" ); 
        video.setVideoPath("/data/samplevideo.3gp" ); 
        
        video.start();
        
    }


}


