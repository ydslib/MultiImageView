package com.yds.multiimageview;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yds.library.MultiImageDelegate;

/**
 * Created by yds
 * on 2020/6/3.
 */
public class GlideLoadImageDelegate extends MultiImageDelegate {
    @Override
    public void into(ImageView imageView) {
        Glide.with(mContext).load(mUrl).into(imageView);
    }
}
