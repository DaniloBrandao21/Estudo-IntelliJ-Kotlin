fun main() {
    //endereco(cidade = "curitiba", rua = "street", estado = "pr", cep = "3232")
   //print(media(4f,5f,3f,10f,9f))
   print(mediaG(4f,5f,3f,10f,9f, "string", false))

    arrayOf(2,3,4,5,6,7,8,9,9,true)

}
fun endereco(rua: String, cidade: String, estado: String, cep: String, num: Int = 0){

}

fun media(vararg notas: Float):Float{
    var soma = 0f

    for (n in notas){
        soma += n

        println("N: $n")
        println("Soma: $soma")
    }
    return (soma/notas.size)

}

fun <T> mediaG(vararg notas: T): Float{

    var soma = 0f

    for (n in notas){

        if (n is Float){
            soma =+ n
        }
    }
    return (soma/notas.size)
}