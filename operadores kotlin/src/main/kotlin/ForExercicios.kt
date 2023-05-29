fun forEx1() {
    for (i in 1..50)
        println(i)
}

fun forEx2() {
    for (i in 50 downTo 1)
        println(i)
}

fun forEx3() {

    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        println("$i")
    }
}

fun forEx4() {

    var soma = 0
    for (i in 1..500) {

        soma = soma + i
    }
    println("A soma de todos os números é: $soma")
}

fun forEx5(num: Int) {
    var ii = 1
    for (i in 1..num) {
        for (i in 1..ii) {
            print("#")
        }
        print("\n")
        ii++
    }
}

fun whileEx1() {

    var qtnd = 0
    var count = 0


    while (qtnd < 2000) {
        count = count + 1
        qtnd = qtnd + 7

        if (qtnd > 2000) {
            qtnd = qtnd - 7
            break
        }
    }

    println("Cabem $count balões de água na caixa, enchendo assim $qtnd litros")

}

fun whileEx2() {
    var count = 0
    while (count <= 50) {
        count++

        if (count % 3 == 0 && count % 5 == 0) {
            println("$count divisivel por 3 e por 5 - FizzBuzz")
        } else if (count % 5 == 0) {
            println("$count divisivel por 5 - Fizz")
        } else if (count % 3 == 0) {
            println("$count divisivel por 3 - Buzz")
        } else {
            println(count)
        }
    }
}

fun whileEx3(palavra: String) {

    var dividir = palavra.trim()
    var count = dividir.length - 1


    while (count >= 0) {
        print(dividir[count])
        count = count - 1

    }

}

fun whileEx4(palavra: String): Boolean {

    val newPalavre = palavra.lowercase()
    var countX = 0
    var countO = 0

    var i = 0

    while (i < palavra.length) {

        if (newPalavre[i] == 'x') {
            countX++
        } else if (newPalavre[i] == 'o') {
            countO++
        }
        i++
    }
    return (countX == countO && countX != 0)
}

fun investimento(salario:Float){

    var investimentoAna = (salario*0.05)*2
    var petAna = 0f

    var investimentoPaula = (salario*0.05)
    var petPaula = 0f

    var meses = 0
        do {
            petAna += (salario*0.05f)*2 + (petAna * 0.002f) //1000 = 1000 + 2

            petPaula += (salario*0.05f) + (petPaula * 0.008f)//500 + 1
            meses++

    }while (petPaula <= petAna)


    println("O investimento de Paula superara o de Ana em $meses meses")
}


fun main() {
    //forEx1()
    //forEx2()
    //forEx3()
    //forEx4()
    //forEx5(20)
    //whileEx1()
    //whileEx2()
    //whileEx3("Meu nome é Julius")
    //println(whileEx4("xxooOOxx"))
    //println(whileEx4("xxxxo"))
    //println(whileEx4("bdefghjij"))
    //println(whileEx4("ooooxzzzzz"))
    investimento(10000f)

}