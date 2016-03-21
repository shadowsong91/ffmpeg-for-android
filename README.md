# ffmpeg-for-android
This is a ffmpeg entry guide for android, using source code not command line executable binary. Implemented one method showing ffmpeg version, the others count on yourself.

#Example
Open eclipse, import this project andr run, then you can see ffmpeg version.

# How to build
1. Configure android ndk.
2. Add your methods in **FFMpegUtils.java**(or you can create a new one) and use **javah** command to create new ffmpeg.c file, and implement these methods in ffmpeg.c file.
3. Go to jni directory and run ndk-build.

All the .so files are prebuilt using ffmpeg-2.8.3.

# Thanks
http://blog.csdn.net/gobitan/article/details/22750719
