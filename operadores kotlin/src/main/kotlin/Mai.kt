fun ex1(cargo: String): Float {

    var bonus = 0f

    if (cargo.equals("Gerente")) {
        bonus = 2000f
    } else if (cargo.equals("Coordenador")) {
        bonus = 1500f
    } else if (cargo.equals("Engenheiro")) {
        bonus = 1000f
    } else if (cargo.equals("Estagiário")) {
        bonus = 500f
    }

    return bonus
}

fun ex2(cargo: String, meses: Int): Float {

    var bonus = 0f

    if (cargo.equals("Gerente")) {
        if (meses >= 24) {
            bonus = 3000f
        } else {
            bonus = 2000f
        }
    } else if (cargo.equals("Coordenador")) {
        if (meses >= 12) {
            bonus = 1800f
        } else {
            bonus = 1500f
        }
    } else if (cargo.equals("Engenheiro")) {
        bonus = 1000f
    } else if (cargo.equals("Estagiário")) {
        bonus = 500f
    }

    return bonus
}

fun bonusWhen(cargo: String): Float {
    var bonus = 0f
    when (cargo) {
        "Gerente" -> bonus = 2000f

        "Coordenador" -> bonus = 1500f

        "Engenheiro" -> bonus = 1000f

        "Estagiário" -> bonus = 500f
    }

    return bonus
}


fun main() {

    val bonus2 = bonusWhen("Gerente")

    println(bonus2)
}