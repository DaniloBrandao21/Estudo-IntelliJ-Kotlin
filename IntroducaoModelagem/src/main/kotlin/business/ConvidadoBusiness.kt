package business

import entity.Convite

class ConvidadoBusiness {

    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun maiorDeIdade(idade: Int)  = idade >= 18

    fun convidadoValido(convite: Convite) = when (convite.tipo){
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }

   /*fun codigoValido(convite: Convite): Boolean{

        println("Entrou no codigo")

        return if (convite.tipo == "comum" && convite.codigo.startsWith("xt")) {
            true
        } else ((convite.tipo == "premium" || convite.tipo == "luxo") && convite.codigo.startsWith("xl"))

    }*/
}
