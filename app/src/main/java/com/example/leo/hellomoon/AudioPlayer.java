package com.example.leo.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by leo on 15-11-30.
 */
public class AudioPlayer {
    private MediaPlayer mPlayer;

    public void stop(){
        if(mPlayer != null){
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c){
        mPlayer = MediaPlayer.create(c,R.raw.one_small_step);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            public void onCompletion(MediaPlayer mp){
                stop();
            }
        });
        mPlayer.start();
    }
}
