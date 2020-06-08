package com.yds.library;

import android.content.Context;

/**
 * Created by yds
 * on 2020/6/7.
 */
public class DensityUtil {
    public static int px2sp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }
}
