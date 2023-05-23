package com.assignment.fibonacci_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun getFibonacciSequence(): List<Int> {
    val num = mutableListOf(0, 1)
    while (num.size < 100) {
        val nextNumber = num[num.size - 1] + num[num.size - 2]
        num.add(nextNumber)
    }
    return num
}
