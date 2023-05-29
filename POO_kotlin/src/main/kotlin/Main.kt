class Pessoa(val anoNascimento: Int, var nome:String){

    var doc: String? = null

    //this -> Se refere ao obj criado pela classe

    constructor(anoNascimento: Int, nome: String, doc: String) : this(1995, ""){
            
        this.doc = doc

    }
    fun dormir(){


    }
    fun acordar(){


    }

}

class Vazia private constructor()

fun main() {

    //Classe -> (Instacia) Objeto
    var pessoa: Pessoa = Pessoa(2000, "Danilo", "1921413131")

    println(pessoa.nome)

}