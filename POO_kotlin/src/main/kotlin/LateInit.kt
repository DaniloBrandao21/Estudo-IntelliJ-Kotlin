class Receita{
    lateinit var instrucoes: String

    fun geraReceita(){
        instrucoes = "Lave as mãos."
    }

    fun imprimeReceita(){
        if (!this::instrucoes.isInitialized){
            geraReceita()
        }
    }
}

fun main(){
    var r: Receita = Receita()
    r.imprimeReceita()
    println(r.instrucoes)
}