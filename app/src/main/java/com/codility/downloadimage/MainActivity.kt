package com.codility.downloadimage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.codility.downloadimage.utils.DownloadImageTask
import com.codility.downloadimage.utils.Utility
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btDownPicasso -> {
                if (Utility.checkPermission(this)) {
                    progressBar.visibility = View.VISIBLE
                    DownloadImageTask().downloadPicasso(this, Utility.IMAGE_URL, imageView, progressBar, tvImagePath)
                }
            }

            R.id.btDownVolley -> {
                if (Utility.checkPermission(this)) {
                    progressBar.visibility = View.VISIBLE
                    DownloadImageTask().volleyDownload(this, Utility.VOLLEY_IMAGE_URL, imageView, progressBar, tvImagePath)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btDownPicasso.setOnClickListener(this)
        btDownVolley.setOnClickListener(this)
    }
}