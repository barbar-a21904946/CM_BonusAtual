package pt.ulusofona.cm.kotlin.challenge

interface Movimentavel {
    var x:Int
    var y:Int
  fun  moverPara(x:Int, y:Int){
      this.x=x
      this.y=y
  }
}