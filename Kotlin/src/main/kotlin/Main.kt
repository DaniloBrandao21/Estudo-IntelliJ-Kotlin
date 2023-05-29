import kotlin.math.sqrt

fun converter(ano:Int){

    var meses = ano * 12
    var dias = meses * 30 + 5 * 2
    var horas = dias * 24
    var minutos = horas * 60
    var segundos = minutos * 60

    println("$ano anos são: $meses meses")
    println("$ano anos são: $dias dias")
    println("$ano anos são: $horas horas")
    println("$ano anos são: $minutos minutos")
    println("$ano anos são: $segundos segundos")

}


fun separarString(a:String):Unit = println("$a tem ${a.length} letras")

fun calcularCubo(b:Double): Unit = println("Raiz cubica de $b é: ${Math.pow(b, 3.0)}")

fun converterMilhas(m:Float): Unit = println("$m Milhas são ${m * 1.6} Km")

fun trocar(a: String){
    a.replace("a", "x").replace("A", "x").lowercase()
}

fun main() {

    converter(2)
    separarString("Danilo")
    calcularCubo(3.0)
    converterMilhas(3.0f)


}