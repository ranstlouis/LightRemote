package com.example.lightremote

import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        val ipadd = findViewById<TextInputEditText>(R.id.ip_address)

        Green_on.setOnClickListener {
            val ipadd1 = ipadd.text.toString()
            val ipadd2 = ipadd1.trim()
            webview.loadUrl("http://$ipadd2/gr_on")
            webview.webViewClient = WebViewClient()
        }
        Green_off.setOnClickListener {
            val ipadd1 = ipadd.text.toString()
            val ipadd2 = ipadd1.trim()
            webview.loadUrl("http://$ipadd2/gr_off")
            webview.webViewClient = WebViewClient()
        }
        Yellow_on.setOnClickListener {
            val ipadd1 = ipadd.text.toString()
            val ipadd2 = ipadd1.trim()
            webview.loadUrl("http://$ipadd2/yellow_on")
            webview.webViewClient = WebViewClient()
        }
        Yellow_off.setOnClickListener {
            val ipadd1 = ipadd.text.toString()
            val ipadd2 = ipadd1.trim()
            webview.loadUrl("http://$ipadd2/yellow_off")
            webview.webViewClient = WebViewClient()
        }
    }


}
