package ru.netology.nmedia.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val values = listOf(500F, 500F, 500F, 500F)

        findViewById<StatsView>(R.id.stats).data = listOf(
            percentCalculator(values[0], values),
            percentCalculator(values[1], values),
            percentCalculator(values[2], values),
            percentCalculator(values[3], values),
        )
    }
}

private fun percentCalculator(value: Float, values: List<Float>): Float {
    return value / values.sum()
}