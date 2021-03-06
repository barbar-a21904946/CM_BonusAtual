package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

abstract class Motor : Ligavel{
    var cavalos:Int
    var cilindrada:Int
    var ligacao:Boolean

    constructor(cavalos:Int, cilindrada:Int, ligacao :Boolean){
        this.cavalos=cavalos
        this.cilindrada=cilindrada
        this.ligacao=ligacao
    }

     override fun toString():String{
        return "Motor | cavalos | cilindrada"
    }
}