fun main(){
    var f1: FormaData = FormaData(10, 8)
    var f2: FormaData = FormaData(10, 8)
   // println(f1.equals(f2))
   // println(f1.toString())
   // println(f1.hashCode())

   // println("---------------")
   // println(f2.toString())
   // println(f2.hashCode())

    f2 = f1.copy()

    var End: Endereco = Endereco("pinhais", "Salgado", "2243242")
    endereco(End)

    println(End.toString())
}

class Forma(val a:Int,val b: Int){
    override fun equals(other: Any?): Boolean {
        return if(other is Forma){
             (other.a == other.a && other.b == other.b)
        }else{
            return false
        }
    }
}
data class FormaData(val a:Int, val d: Int)


data class Endereco(val cidade: String, val rua: String, val cep: String)

fun endereco(e: Endereco){}