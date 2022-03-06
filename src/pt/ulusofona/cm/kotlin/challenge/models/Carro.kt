package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel


class Carro : Veiculo(identificador),Movimentavel,Ligavel{
    var identificador:String
    var motor : Motor

    constructor(identificador:String, motor: Motor){
        this.identificador=identificador
        this.motor=motor
    }


    override fun toString():String{
        return "Carro | identificador | data de aquisicao | pt.ulusofona.cm.kotlin.challenge.Posicao | x:0 | y:0"
    }
}