fun Main(){

    val str: String? = null

    if (str == null){
        println("Nulo")
    }else {
        println(str)
    }


    //Se a val for nula, executa a parte da direita
    println(str ?: "nulo")
}
