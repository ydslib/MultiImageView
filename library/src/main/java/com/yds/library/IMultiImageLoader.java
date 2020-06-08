package com.yds.library;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by yds
 * on 2020/6/7.
 */
public interface IMultiImageLoader {
    void load(Context context, Object url, ImageView imageView);
}
