# DownloadImageURL
Android application for downloading images from URL using Picasso Library and Volley Library, also Save in Internal folder using Kotlin Programming Language.

# Android Picasso
Android [Picasso](http://square.github.io/picasso/) is an image loading/processing library developed and maintained by [Square Inc](https://squareup.com/help/us/en/article/5165-square-register-beta-for-android). It’s immensely popular since it often requires just one line of code and has a similar style of coding for each of its features(we’ll be implementing them soon!).

Android Picasso comes with its own set of features such as:

* Resizing and Scaling
* Center Cropping
* Rotation and Transformation
* Setting the Placeholder and Error images
* Fading
* Disk and Memory Caching
* Priority Requests
* Support for Request cancellation and parallel downloading

# Android Volley
Android [Volley Library](https://github.com/google/volley) is an http library that is used to manage network calls in android. By default, network calls work asynchronously. That means, you do not need to write code for Async Task. By default, it handles everything you need to do while making network calls. It’s easier to use and works faster than most of the libraries. It handles image downloading and uploading, string request, JSON apis such as JSON Array request, JSON object request etc. If you are using Volley library then you do not need to write a ton of code to handle standard way of network calls using HttpURLConnection. The core of every network operation performed by Volley library is RequestQueue. Whenever we need to send a network call, we create a RequestQueue and pass a request object in it. It manages the thread running the network operation, reading from and writing to the cache and finally parsing the response etc.

Some of the important features of Volley library are as follows –
1. Automatic scheduling of network requests.
2. Many concurrent network connections.
3. Transparent memory and disc caching.
4. You can prioritize a request.
5. You can cancel a single request or a set of request at any time.
6. You can easily customize for retry or backoff a request.
7. Built in debugging and tracing tools that makes enable to get the root cause of the error, if any.

# Add Dependencies
dependencies {

    implementation 'com.squareup.picasso:picasso:2.5.2'
    implementation 'com.android.volley:volley:1.1.0'
}

IMAGE 1    |  IMAGE 2 |  IMAGE 3 |
:---------:|:----------:|:---------:
![](https://github.com/AndroidCodility/DownloadImageURL/blob/master/design/menu.png?raw=true)  |  ![](https://github.com/AndroidCodility/DownloadImageURL/blob/master/design/picasso.png?raw=true) |  ![](https://github.com/AndroidCodility/DownloadImageURL/blob/master/design/volley.png?raw=true) 

# Play Video
[![](https://github.com/AndroidCodility/DownloadImageURL/blob/master/design/download_url.png?raw=true)](https://youtu.be/oOGML5jDUeA "Click here to watch")

# Like Facebook Page
[![](https://github.com/AndroidCodility/Barchart-Graph/blob/master/design/fb.png?raw=true)](https://www.facebook.com/androidcodility/ "Click here")
