val CONST_1 = 10
const val CONST_2 = 10

class const{

    val ADC = ""

    /*Dentro de uma classe só é possivel declarar uma const val dentro do compaion object. PQ ele não pertence à instancia
    da classe*/

    companion object{
        const val CONST_3 = false
    }
}

class ModificadorConst() {


}