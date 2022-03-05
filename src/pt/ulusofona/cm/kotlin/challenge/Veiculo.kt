package pt.ulusofona.cm.kotlin.challenge

import java.util.*

class Veiculo {
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