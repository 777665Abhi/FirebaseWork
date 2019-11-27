package com.abhishek.FirebaseWork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.crashlytics.android.Crashlytics
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bnCrash.setOnClickListener(View.OnClickListener {
            Crashlytics.getInstance().crash(); // Force a crash
        })
    }
}
