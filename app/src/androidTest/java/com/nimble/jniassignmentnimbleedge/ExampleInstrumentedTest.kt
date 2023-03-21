package com.nimble.jniassignmentnimbleedge

import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun doubleThisArray_isCorrect(){
        assertArrayEquals(Utils.doubleThisArray(floatArrayOf(10.0f,30.0f)), floatArrayOf(20.0f,60.0f),0.01f)
    }

}