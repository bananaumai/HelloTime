package com.example.hellotime

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val now = Instant.now()
        Log.d("bannanaumai", "$now")

        val formatStr = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
        val formatter = DateTimeFormatter.ofPattern(formatStr).withZone(ZoneOffset.UTC)

        // val nowStr = DateTimeFormatter.ISO_INSTANT.format(now)
        val nowStr = formatter.format(now)
        Log.d("bananaumai", "now is $nowStr")

        val instant = formatter.parse("2019-04-09T11:35:54.977Z")
        Log.d("bananaumai", "instant: $instant")

        val sdf = SimpleDateFormat(formatStr)
        sdf.timeZone = TimeZone.getTimeZone("UTC")
        val dt = sdf.parse("2019-04-09T11:35:54.977Z")
        Log.d("bananaumai", "dt: $dt")

        val sdf2 = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
        sdf.timeZone = TimeZone.getTimeZone("UTC")
        val dt2 = sdf2.parse("0001-01-01T00:00:00Z")
        Log.d("bananaumai", "dt2: $dt2")
    }
}
