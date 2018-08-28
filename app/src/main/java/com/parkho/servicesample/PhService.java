package com.parkho.servicesample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class PhService extends Service
{
    MediaPlayer mMediaPlayer;

    @Override
    public void onCreate() {
        super.onCreate();

        mMediaPlayer = MediaPlayer.create(this, R.raw.sample);
        mMediaPlayer.setLooping(false);
    }

    @Override
    public int onStartCommand(Intent a_intent, int a_flags, int a_startId) {
        final int result = super.onStartCommand(a_intent, a_flags, a_startId);

        mMediaPlayer.start();
        return result;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mMediaPlayer.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}