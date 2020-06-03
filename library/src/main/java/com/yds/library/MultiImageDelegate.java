package com.yds.library;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by yds
 * on 2020/6/3.
 */
public abstract class MultiImageDelegate {
    protected Context mContext;
    protected Object mUrl;
    public MultiImageDelegate with(Context context){
        this.mContext = context;
        return this;
    }
    public MultiImageDelegate load(Object url){
        this.mUrl = url;
        return this;
    }
    public abstract void into(ImageView imageView);
}
