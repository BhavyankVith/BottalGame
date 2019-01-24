package com.example.my.bottalgame;

import android.app.Service;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by BK on 6/1/2018.
 */

class MyServices extends Service{

    Ringtone r1;
    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);

        Uri path= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
        r1=RingtoneManager.getRingtone(this,path);
        r1.play();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        r1.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
