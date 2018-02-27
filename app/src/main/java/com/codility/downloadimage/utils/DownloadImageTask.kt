package com.codility.downloadimage.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.v7.widget.AppCompatImageView
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.ImageRequest
import com.android.volley.toolbox.Volley
import com.squareup.picasso.Picasso


/**
 * Created by Govind on 2/23/2018.
 */
class DownloadImageTask {

    fun downloadPicasso(context: Context, url: String?, imageView: AppCompatImageView, progressBar: ProgressBar, tvImagePath: TextView) {
        Picasso.with(context)
                .load(url)
                .into(object : com.squareup.picasso.Target {
                    override fun onBitmapLoaded(bitmap: Bitmap, from: Picasso.LoadedFrom) {
                        Utility.saveImage(context, bitmap, imageView, tvImagePath)
                        progressBar.visibility = View.GONE
                    }

                    override fun onBitmapFailed(errorDrawable: Drawable?) {
                        progressBar.visibility = View.GONE
                        Utility.showToast(context, "Bitmap failed to load")
                    }

                    override fun onPrepareLoad(placeHolderDrawable: Drawable?) {
                        imageView.setImageDrawable(placeHolderDrawable)
                        progressBar.visibility = View.GONE
                    }
                })
    }

    fun volleyDownload(context: Context, imageUrl: String, imageView: AppCompatImageView, progressBar: ProgressBar, tvImagePath: TextView) {
        Volley.newRequestQueue(context).add(object : ImageRequest(imageUrl,
                Response.Listener { bitmap ->
                    progressBar.visibility = View.GONE
                    Utility.saveImage(context, bitmap, imageView, tvImagePath)
                }, 0, 0, null,
                Response.ErrorListener { error ->
                    Utility.showToast(context, error.toString())
                }) {})
    }
}