package control

import business.ConvidadoBusiness
import entity.Convite

class Portaria {

    private var conviteBusiness = ConvidadoBusiness()


    /*Quando a classe Portaria é iniciada, chama direto a função init, que chama as demais funções. Não precisando
       especificar nenhuma funçao de dentro da classe Portaria*/
    init {
        println("Portaria inicializada")
        println(controle())

    }

     private fun controle():String{

        val idade = Console.readInt("Qual a sua idade? ")
        val convidado = Convite(idade = idade)


        if(!conviteBusiness.maiorDeIdade(convidado.idade)){
            return("Negado. Menores de idade não são permitidos.")
        }

        convidado.tipo = Console.readString("Qual é o tipo do convite?")

        if (!conviteBusiness.tipoValido(convidado.tipo)){
            return "Negado. Convite inválido."
        }

         convidado.codigo = Console.readString("Qual é o codigo do convite?")

        if (!conviteBusiness.convidadoValido(convidado)){
            return "Negado. Convite inválido."
        }

         return  "Welcome!"
    }

}