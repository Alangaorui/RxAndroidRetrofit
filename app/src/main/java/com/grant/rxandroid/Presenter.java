package com.grant.rxandroid;

import android.content.Intent;
import com.grant.rxandroid.View;

/**
 * Created by grant on 2018/4/26 0026.
 */

public interface Presenter {
    void onCreate();

    void onStart();

    void onStop();

    void pause();

    void attachView(View view);

    void attachIncomingIntent(Intent intent);
}
