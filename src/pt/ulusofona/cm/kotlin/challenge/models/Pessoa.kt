package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

class Pessoa(var nome: String, var datadenascimento: Date, override var x: Int=0, override var y: Int=0) : Movimentavel {
    var veiculos = mutableListOf<Veiculo>()
    var carta: Carta? = null
    var posicao: Posicao = Posicao()

    fun comprarVeiculo(veiculo: Veiculo) {

    }


    fun temCarta(): Boolean {
        return true
    }

    fun tirarCarta() {

    }

    fun moverVeiculoPara(identificador: String, comprador: Pessoa) {

    }

    fun venderVeiculo(identificador: String, comprador: Pessoa) {

    }

    fun pesquisarVeiculo(identificador: String, x: String, y: String): Veiculo {
        return veiculos.get(0)
    }

    override fun toString(): String {
        return "Pessoa | $nome | dataDeNascimento | posicao"
    }


}