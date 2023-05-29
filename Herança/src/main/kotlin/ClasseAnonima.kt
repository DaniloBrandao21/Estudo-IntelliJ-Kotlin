interface Event{
    fun OnSucces()
}

class Programa{
    fun salvar(e: Event){
        println("Abrindo conexões")
        println("Salvando valores")
        println("Sucesso. Conexões fechadas")
        e.OnSucces()
    }
}

fun main(){
    val p = Programa()
    p.salvar(object : Event{
        override fun OnSucces() {
            println("OnSuccess!")
        }

    })

}