package com.ab.toastsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ab.toast.Toaster


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Toaster().toaster(this,"read succfully");
    }
}