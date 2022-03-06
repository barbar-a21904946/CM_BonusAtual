package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

class Veiculo : Movimentavel {
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