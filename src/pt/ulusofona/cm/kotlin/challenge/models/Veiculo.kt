package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo : Movimentavel {
    open lateinit var identificador:String
    lateinit var posicao: Posicao
    lateinit var dataDeAquisicao:Date

    constructor(identificador:String){
        this.identificador=identificador
    }

    constructor()

    fun requerCarta():Boolean{
        return true

    }

}