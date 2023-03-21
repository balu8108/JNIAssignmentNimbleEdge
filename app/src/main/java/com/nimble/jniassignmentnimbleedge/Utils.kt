package com.nimble.jniassignmentnimbleedge

object Utils {
    init {
        System.loadLibrary("jniassignmentnimbleedge")
    }

    external fun doubleThisArray(arr: FloatArray): FloatArray
}