package com.ab.toast

import android.content.Context
import android.widget.Toast

class Toaster {
    public  fun toaster( context: Context,msg:String){
        Toast.makeText(context,msg, Toast.LENGTH_LONG).show();

    }
}