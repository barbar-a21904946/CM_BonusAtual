package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class VeiculoLigadoException {
    var identificador:String
    lateinit var posicao: Posicao
    lateinit var dataDeAquisicao:Date

    constructor(identificador:String){
        this.identificador=identificador
    }
    fun requerCarta():Boolean{
        return true

    }

}