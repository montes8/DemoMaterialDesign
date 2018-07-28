package com.example.listcard

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.montes8.democatalogo.R
import com.example.montes8.democatalogo.view.CocheActivity
import com.example.montes8.democatalogo.view.VentaActivity
import kotlinx.android.synthetic.main.molde_coche_grid.view.*


class CocheAdapter(contexto: Context, var listadeCoches:ArrayList<Coche>):BaseAdapter(){

    var contexto:Context?=contexto
    //
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val coche=listadeCoches[position]
        if (coche.venta==true) {
            val inflater = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater//nos permite inflar nuestrp layout
            val miVista = inflater.inflate(R.layout.molde_coche_grid, null)//mi vista la renderiss aqui,la estamos rellenando o inflando en este layout
            miVista.image_view_card.setImageResource(coche.imagen!!)
            miVista.text_view_titulo.text = coche.titulo!!
            miVista.text_descripcion.text = coche.description!!
            miVista.text_precio.text = coche.precio!!
            miVista.image_view_card.setOnClickListener {

                val intent = Intent(contexto, CocheActivity::class.java)
                intent.putExtra("imagen", coche.imagen!!)
                intent.putExtra("titulo", coche.titulo!!)
                intent.putExtra("descripcion", coche.description!!)
                intent.putExtra("precio", coche.precio!!)
                contexto!!.startActivity(intent)
            }

            return miVista
        }else{
            val inflater = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater//nos permite inflar nuestrp layout
            val miVista = inflater.inflate(R.layout.molde_venta_grid, null)//mi vista la renderiss aqui,la estamos rellenando o inflando en este layout
            miVista.image_view_card.setImageResource(coche.imagen!!)
            miVista.text_view_titulo.text = coche.titulo!!
            miVista.text_descripcion.text = coche.description!!
            miVista.text_precio.text = coche.precio!!
            miVista.image_view_card.setOnClickListener {

                val intent = Intent(contexto, VentaActivity::class.java)
                intent.putExtra("imagen", coche.imagen!!)
                intent.putExtra("titulo", coche.titulo!!)
                intent.putExtra("descripcion", coche.description!!)
                intent.putExtra("precio", coche.precio!!)
                contexto!!.startActivity(intent)
            }

            return miVista
        }
    }
    //esta esperando el id de cada item,
    override fun getItem(position: Int): Any {
        return listadeCoches[position]
    }
    //
    override fun getItemId(position: Int): Long {
        return position.toLong()//para no tener error al correr la app
    }
    //devuelve el tamaño de nuestra lista
    override fun getCount(): Int {
        return listadeCoches.size
    }


}
