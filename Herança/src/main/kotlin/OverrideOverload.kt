open class Eletronicos(var marca: String){

    private fun corrente(ativo: Boolean){}

    fun ligar(){
        corrente(true)
    }

   open fun desligar(){

        corrente(false)
    }
}

class PC(marca: String): Eletronico(marca){

     override fun desligar(){
        save()
         super.desligar()
    }

    fun save(){}
    fun save(a: Int){}
    fun save(a: Float){}
    fun save(a: Double){}

}
fun main (){}