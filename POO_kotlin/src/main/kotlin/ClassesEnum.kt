enum class Prioridade(val id: Int){
    baixa(1){
        override fun toString(): String {
            return "Baixa Prioridade"
        }
            },
    media(5),
    alta(15)
}

enum class AnimalEnum(){
    cachorro,gato, cavalo, Vaca
}

fun x (p:Prioridade){}
fun main(){
    var soma = 0
    for(p in Prioridade.values()){
        println(p)
    }


}