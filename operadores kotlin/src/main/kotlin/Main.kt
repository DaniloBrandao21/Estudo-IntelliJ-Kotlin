fun ex1() {

    println("Digite o valor do primeiro base da figura")
    val b = readLine()

    println("Digite o valor do primeiro altura da figuara")
    val h = readLine()

    if (b == h) {
        println("A figura é um quadrado ")
    } else {
        println("A figura não é um quadrado")
    }
}

fun ex2() {

    println("Digite o valor do primeiro lado do tringulo")
    val l1 = readLine()

    println("Digite o valor do segundo lado do tringulo")
    val l2 = readLine()

    println("Digite o valor do terceiro lado do tringulo")
    val l3 = readLine()

    if (l1 == l2 && l2 == l3) {
        println("A figura é um triangulo equilátero")
    } else {
        println("A figura não é um triangulo equilátero")
    }

}

fun ex3(num: Int) {

    if (num >= 0) {
        if (num == 0) {
            println("Primeira String")
        } else {
            println("Segunda string")
        }

        println("Terceira string")
    }
}

fun ex4() {


    println("Digite a idade ")
    var i = readLine()
    if (i != null) {

        if (i.toInt() > 18) {
        } else {
            println("Menores de idade não são permitidos ")
            return
        }
    }

    println("Digite o tipo do convite ")
    var convite = readLine()

    if (convite != null && convite != "") {

        convite = convite.lowercase()
        if (convite.equals("comum") || convite.equals("premium") || convite.equals("luxo")) {

            println("Digite o código do convite ")
            var codigo = readLine()

            if(codigo != null && codigo != ""){
                codigo = codigo.lowercase()
                if (convite == "comum" && codigo.startsWith("xt")){
                    println("Welcome")
                }else if(convite == "premium" || convite == "luxo" && codigo.startsWith("xl")){
                    println("Welcome")
                }else{
                    println("Negado. Convite inválido ")
                }
            }
        } else {
            println("Negado. Convite inválido ")
            return
        }
    }


}


fun main() {
    //  ex1()
    //ex2()
    // ex3(4)

    ex4()


}