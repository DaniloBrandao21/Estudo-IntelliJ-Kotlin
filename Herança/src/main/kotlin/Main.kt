private class y
class x private constructor()
open class Eletronico(var marca: String){

    private fun ativarCorrente(){}

    fun ligar(){
        ativarCorrente()
    }

    open fun desligar(){}
}

class Computador(marca: String): Eletronico(marca){

    fun instalarSoftware(){}

    fun processador(){

    }

}

fun main() {

    var c: Computador = Computador("acer")
    var e: Eletronico = Eletronico("acer")

    c.ligar()
    c.marca


    var YY: y = y()


}