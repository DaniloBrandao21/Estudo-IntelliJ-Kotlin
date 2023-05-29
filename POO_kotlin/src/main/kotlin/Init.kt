class Animal(var especie: String){

    var fala :String? = null
    init {
       fala = if (especie == "cachorro"){
             "au"
        } else if (especie == "gato"){
             "miau"
        }else {
             ""
        }

    }

    init {
        println("$especie ")
    }

    fun falar (){
        println(fala)
    }
}
fun main (){
    
    Animal("cachorro").falar()
}