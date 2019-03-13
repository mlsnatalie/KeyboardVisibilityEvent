package com.tencent.liteav.keyboardlistener

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        KeyboardVisibilityEvent.setEventListener(this
        ) {isOpen ->
            if (isOpen) {
                Log.e("aaaddd", "键盘打开")
            } else {
                Log.e("aaaddd", "键盘关闭")
            }

        }

    }
}
