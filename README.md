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
    implementation 'com.github.Yedongsheng:MultiImageView:Tag'
}
```

Share this release:

Tweet

Link
That's it! The first time you request a project JitPack checks out the code, builds it and serves the build artifacts (jar, aar).

If the project doesn't have any GitHub Releases you can use the short commit hash or 'master-SNAPSHOT' as the version.
