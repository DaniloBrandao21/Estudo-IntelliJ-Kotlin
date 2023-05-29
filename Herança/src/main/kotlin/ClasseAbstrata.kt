interface Selvagem{
    fun atacar()
}

abstract class Mamifero(val nome:String){
    fun acordar(){}
    fun dormir(){}
    abstract fun falar()
}

class Cachorro(nome:String):Mamifero(nome), Selvagem{

    override fun falar() {
        println("Au au")
    }

    override fun atacar() {
        TODO("Not yet implemented")
    }

}



fun main(){}
