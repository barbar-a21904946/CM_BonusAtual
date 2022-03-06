package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.Motor

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel


abstract class Carro: Veiculo, Movimentavel,Ligavel{
    override var identificador:String
    var motor : Motor

    constructor(identificador:String, motor: Motor) : super() {
        this.identificador=identificador
        this.motor=motor
    }


    override fun toString():String{
        return "Carro | identificador | data de aquisicao | pt.ulusofona.cm.kotlin.challenge.Posicao | x:0 | y:0"
    }
}