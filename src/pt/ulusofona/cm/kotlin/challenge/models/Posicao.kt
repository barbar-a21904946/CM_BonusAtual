package pt.ulusofona.cm.kotlin.challenge.models

class Posicao{
    var x:Int
    var y:Int

   constructor(x:Int , y :Int){
       this.x=x;
       this.y=y;
   }
fun alterarPositionException(){
    throw Exception("Quanto tentas um movimento para a posição onde já te encontras.")
}
    override fun toString():String{
        return "Posicao | x:0 | y:0"
    }
}