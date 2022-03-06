package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

abstract class Bicicleta : Veiculo, Movimentavel{
    override var identificador:String

   constructor(identificador:String){
       this.identificador=identificador

   }

    override fun toString(): String {
        return "Bicicleta | $identificador | dataDeAquisicao | posicao"
    }
}