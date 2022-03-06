import pt.ulusofona.cm.kotlin.challenge.Motor
import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import pt.ulusofona.cm.kotlin.challenge.models.Veiculo

abstract class Carro(override var identificador : String, var motor : Motor) : Veiculo(identificador), Movimentavel, Ligavel
{


    override fun toString(): String {
        return "Carro | identificador | dataDeAquisicao | posicao"
    }

}