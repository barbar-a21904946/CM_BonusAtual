package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa {
     var nome:String
     var veiculos:List<Veiculo>
     var dataDeNascimento:Date
     var carta: Carta
     var posicao: Posicao

     constructor(nome:String, veiculos:List<Veiculo>, dataDeNascimento:Date, carta: Carta, posicao: Posicao){
         this.nome=nome
         this.veiculos=veiculos
         this.dataDeNascimento=dataDeNascimento
         this.carta=carta
         this.posicao=posicao
     }


    override fun toString():String{
       return "Pessoa | nome | data de nascimento | pt.ulusofona.cm.kotlin.challenge.Posicao | x:0 | y:0"
    }
}