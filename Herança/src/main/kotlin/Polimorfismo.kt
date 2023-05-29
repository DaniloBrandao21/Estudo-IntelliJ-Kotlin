abstract class Funcionario(var salario: Float){

    abstract fun bonus(): Float

}

class Gerente(salario: Float): Funcionario(salario){

    override fun bonus(): Float {

        return salario * 0.5f
    }
}
class Analista(salario: Float ): Funcionario(salario){
    override fun bonus(): Float {

        return salario * 0.3f
    }
}

fun mostraBonus(func: Funcionario){
    println(func.bonus())
}


fun main(){
    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(4000f))
}