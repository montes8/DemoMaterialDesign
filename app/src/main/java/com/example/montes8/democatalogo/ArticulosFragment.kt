package com.example.montes8.democatalogo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ArticulosFragment : Fragment() {
    var myVista : View?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        myVista = inflater.inflate(R.layout.fragment_articulos, container, false)

        return myVista
    }


}
