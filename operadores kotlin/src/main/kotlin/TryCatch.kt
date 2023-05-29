import java.lang.NullPointerException

fun main(){

    try {
        val  a = 10 / 0
        val s: String? = null
        println(s!!.length)
    }catch (e: NullPointerException){
        println("Variavel nula!")

    }
    catch (e: ArithmeticException){

    }finally {
        println("Finally!")
    }
    println("fim")
}