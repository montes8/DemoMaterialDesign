package com.example.listcard

class Coche{

    var imagen:Int?=null
    var titulo:String?=null
    var description:String?=null
    var precio:String?=null
    var venta:Boolean?=null

    constructor(imagen: Int, titulo: String, description: String, precio: String, venta: Boolean) {
        this.imagen = imagen
        this.titulo = titulo
        this.description = description
        this.precio = precio
        this.venta = venta
    }
}
