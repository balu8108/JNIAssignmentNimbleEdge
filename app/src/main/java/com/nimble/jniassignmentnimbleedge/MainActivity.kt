package com.nimble.jniassignmentnimbleedge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nimble.jniassignmentnimbleedge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        val arr = floatArrayOf(20.0F, 40.0F, 70.0F)
        binding.originalArr.text = "Original Arr: ${getStringFromFloatArray(arr)}"
        binding.arrAfterDouble.text =
            "Arr after doubling: ${getStringFromFloatArray(Utils.doubleThisArray(arr))}"
    }

    private fun getStringFromFloatArray(array: FloatArray): String {
        val stringBuilder = StringBuilder()
        array.forEach {
            stringBuilder.append(it).append(" ")
        }

        return stringBuilder.toString()
    }
}