
class  AnimalGet (var especie: String){
    var fala: String = ""

    get() {
        println("Acesso get")
        return field
    }
    set(value) {
        println("Acesso set")
        field = value
    }
}

fun main(){
    var a = AnimalGet("Cachorro")
    a.fala = "auuuu"
    a.fala

}