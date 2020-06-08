package com.yds.library;

import android.util.Log;

/**
 * Created by yds
 * on 2020/6/7.
 */
public class NotSetImageLoaderException extends RuntimeException {
    public static final String TAG = NotSetImageLoaderException.class.getSimpleName();

    public NotSetImageLoaderException(String msg) {
        super(msg);
        Log.w(TAG, getMessage());
    }
}
