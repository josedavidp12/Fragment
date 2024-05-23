package com.kevin.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


//private const val ARG_PARAM1 = "param1"
// private const val ARG_PARAM2 = "param2"


class FirstFragment : Fragment() {
   private var name: String? = null
   private var address: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      arguments?.let {
          name = it.getString(NAME_BUNDLE)
          address = it.getString(ADDRESS_BUNDLE)
          Log.i("aris", name.orEmpty())
       }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object {

       const val NAME_BUNDLE = "name_bundle"
        const val ADDRESS_BUNDLE = "address_bundle"
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(name: String, address: String) =
            FirstFragment().apply {
               arguments = Bundle().apply {
                   putString(NAME_BUNDLE, name)
                    putString(ADDRESS_BUNDLE, address)
                }
            }
    }
}