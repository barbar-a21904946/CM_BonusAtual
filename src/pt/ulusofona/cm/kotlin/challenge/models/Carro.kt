package pt.ulusofona.cm.kotlin.challenge

class Carro {
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