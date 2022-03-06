package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo (open var identificador: String) : Movimentavel {
    var posicao : Posicao = Posicao()
    var datadeAquisicao : Date = Date()
    var countPosicao:Int=0
    var xi :Int=0
    var xf: Int =0
    var yi: Int =0
    var yf: Int =0

    abstract override fun moverPara(x:Int, y:Int)

    abstract fun requerCarta(): Boolean



}