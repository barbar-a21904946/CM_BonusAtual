package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Bicicleta(override var identificador: String, override var x: Int=0) : Veiculo(identificador), Movimentavel {


    override fun toString(): String {
        return "Bicicleta | $identificador | dataDeAquisicao | posicao"
    }

    override fun requerCarta(): Boolean {
        return true
    }

    override var y: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun moverPara(x: Int, y: Int) {

    }
}