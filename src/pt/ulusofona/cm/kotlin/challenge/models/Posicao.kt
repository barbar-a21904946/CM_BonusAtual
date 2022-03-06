package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

 class Posicao(var x: Int = 0, var y: Int = 0) {

    fun alterarPosicaoPara(x: Int, y: Int) {

    }

    override fun toString(): String {
        return "Posicao | x:0 | y:0"
    }
}