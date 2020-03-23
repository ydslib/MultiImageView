# MultiImageView
多图加载，适用于与RecyclerView结合使用，用于博客卡片图文加载

# How to

To get a Git project into your build:

**Step 1**. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
}
```

**Step 2**. Add the dependency
```gradle
dependencies {
    implementation 'com.github.ydslib:MultiImageView:1.0.1'
}
```

Share this release:

Tweet

Link
That's it! The first time you request a project JitPack checks out the code, builds it and serves the build artifacts (jar, aar).

If the project doesn't have any GitHub Releases you can use the short commit hash or 'master-SNAPSHOT' as the version.

# Use
 use in xml file
```xml
    <com.yds.library.MultiImageView
        android:id="@+id/image_multi"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:imgGap="3dp"
        app:maxSize="9"
        />
```
 use in java file
 ```java
     private int[] src = new int[]{
            R.drawable.test01,R.drawable.test02,R.drawable.test03,
            R.drawable.test04,R.drawable.test05,R.drawable.test06,
            R.drawable.test07,R.drawable.test08,R.drawable.test09,R.drawable.test10
    };
    for(int i=0;i<src.length;i++){
        mList.add(src[i]);
    }
    ...
    mMultiImageView.setImagesData(mList);
 ```
 test
 
 <p>
  <h3>app:maxSize="2"</h3>
  <img src="https://github.com/ydslib/Picture/blob/master/MultiImageView/maxSize2.jpg" width="300" height="600"/>
  
  <h3>app:maxSize="5"</h3>
  <img src="https://github.com/ydslib/Picture/blob/master/MultiImageView/maxSize5.jpg" width="300" height="600"/>
  
  <h3>app:maxSize="9"</h3>
  <img src="https://github.com/ydslib/Picture/blob/master/MultiImageView/maxSize9.jpg" width="300" height="600"/>
</p>
 
