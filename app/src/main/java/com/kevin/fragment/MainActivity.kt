package com.kevin.fragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.kevin.fragment.FirstFragment.Companion.ADDRESS_BUNDLE
import com.kevin.fragment.FirstFragment.Companion.NAME_BUNDLE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
        val bundle = bundleOf(NAME_BUNDLE to "Jose David", ADDRESS_BUNDLE to "Mi casa")
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FirstFragment>(R.id.FragmentContainer, args = bundle)
        }
        }
    }
}