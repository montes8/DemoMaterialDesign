package com.example.montes8.democatalogo.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.montes8.democatalogo.R


class AutosFragment : Fragment() {
    var myVista : View?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        myVista = inflater.inflate(R.layout.fragment_autos, container, false)

        return myVista
    }


}
