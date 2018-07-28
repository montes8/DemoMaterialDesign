package com.example.montes8.democatalogo.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.example.listcard.Coche
import com.example.listcard.CocheAdapter
import com.example.montes8.democatalogo.R
import kotlinx.android.synthetic.main.fragment_autos.*


class AutosFragment : Fragment() {
    var myVista : View?= null
    var adapter : CocheAdapter? = null
    var grip : GridView? = null
    var listadeCoches = ArrayList<Coche>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        myVista = inflater.inflate(R.layout.fragment_autos, container, false)

        grip = myVista?.findViewById(R.id.gridView)

        listadeCoches.add(Coche(R.drawable.camaro,"Camaro","coche de camaro ","Precio: $350",false))
        listadeCoches.add(Coche(R.drawable.hw,"shake","coche de shake","Precio: $350",true))
        listadeCoches.add(Coche(R.drawable.hwbudy,"Budy","coche de budy","Precio: $350",false))
        listadeCoches.add(Coche(R.drawable.hwcharnger,"Changer","coche de Changer","Precio: $350",true))
        listadeCoches.add(Coche(R.drawable.hwfunger,"Funger","coche de funger","Precio: $350",false))
        listadeCoches.add(Coche(R.drawable.mario,"Mario","coche de super mario","Precio: $350",false))
        listadeCoches.add(Coche(R.drawable.toad,"Toad","coche de Toad","Precio: $350",true))
        listadeCoches.add(Coche(R.drawable.yoshi,"Yoshi","coche de yoshi","Precio: $350",true))

        adapter= CocheAdapter(context!!,listadeCoches)
        grip!!.adapter=adapter


        return myVista
    }


}
