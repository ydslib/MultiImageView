package com.yds.multiimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.yds.library.MultiImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MultiImageView mMultiImageView;
    private List<Integer> mList = new ArrayList<>();
    private int[] src = new int[]{
            R.drawable.test01, R.drawable.test02, R.drawable.test03,
            R.drawable.test04, R.drawable.test05, R.drawable.test06,
            R.drawable.test07, R.drawable.test08, R.drawable.test09, R.drawable.test10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < src.length; i++) {
            mList.add(src[i]);
        }

        mMultiImageView = findViewById(R.id.image_multi);
        mMultiImageView.setImagesData(mList);
        mMultiImageView.setMultiImageLoader(new GlideLoadImage());

        mMultiImageView.setOnItemImageClickListener(new MultiImageView.OnItemImageClickListener() {
            @Override
            public void onItemImageClick(Context context, ImageView imageView, int index, List list) {
                Toast.makeText(context, "测试", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
