fun main(){
    val p = Pessoa(1930, "Mario")
    p.acordar()
    p.dormir()

    with(p){
        acordar()
        dormir()
    }
}