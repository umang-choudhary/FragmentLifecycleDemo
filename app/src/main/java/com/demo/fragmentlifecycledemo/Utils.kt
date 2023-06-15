package com.demo.fragmentlifecycledemo

import android.util.Log
import androidx.fragment.app.Fragment

private const val MY_TAG = "FragmentTag"

fun printLog(fragment: Fragment, methodName: String) {
    Log.d(MY_TAG, "=====${fragment.javaClass.name} $methodName=====")
}