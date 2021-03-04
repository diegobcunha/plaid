package io.plaidapp.enjoeimodule.view.list

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import io.plaidapp.enjoeimodule.R
import io.plaidapp.enjoeimodule.databinding.ActivityEnjoeiBinding

class EnjoeiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEnjoeiBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityEnjoeiBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_enjoei)
    }
}