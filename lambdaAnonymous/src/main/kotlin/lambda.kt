import java.time.Instant

//{parâmtros -> corpo}
fun main(){

    val a = { println("Hello") }
    receiveA(a)

    /*Também podemos chamar assim diretamente
    receiveA{println("Hello")}*/


    val b = {x: Int -> x * x}
    receiveB(b)

    val c = {x: Int, y: Int ->
        println("Executando")
        x*y }
    receiveC(c)
}

fun receiveA (lambda: () -> Unit){
    lambda()
}

fun receiveB (lambda: (x:Int) -> Int){
   println(lambda(6))
}

fun receiveC (lamb:(x: Int, y: Int) -> Int){
    println(lamb(2, 3))
}