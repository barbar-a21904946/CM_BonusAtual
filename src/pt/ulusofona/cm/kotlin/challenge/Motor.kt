package pt.ulusofona.cm.kotlin.challenge

class Motor {
    var cavalos:Int
    var cilindrada:Int
    var ligacao:Boolean

    constructor(cavalos:Int, cilindrada:Int, ligacao :Boolean){
        this.cavalos=cavalos
        this.cilindrada=cilindrada
        this.ligacao=ligacao
    }

    fun toString():String{
        return "Motor | cavalos | cilindrada"
    }
}