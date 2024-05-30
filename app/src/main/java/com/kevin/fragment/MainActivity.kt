package com.kevin.fragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.kevin.fragment.FirstFragment.Companion.ADDRESS_BUNDLE
import com.kevin.fragment.FirstFragment.Companion.NAME_BUNDLE
import com.kevin.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        if(savedInstanceState == null){
        val bundle = bundleOf(NAME_BUNDLE to "Jose David", ADDRESS_BUNDLE to "Mi casa")
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FirstFragment>(R.id.FragmentContainer, args = bundle)
        }
        }
    binding.Btn1.setOnClickListener{
        //creo un objeto de tipo fragment
        val  secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction().apply {
            //reemplazo por el second fragment por el fragment container
            replace(R.id.FragmentContainer, secondFragment)
            commit()
        }
    }
    }
}