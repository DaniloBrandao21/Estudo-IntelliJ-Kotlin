fun main() {

    val data = geraDados()

    /* Any e count
    println( "Tenho dados? ${if(data.any()) "sim" else "Não"}")

    //println("Tenho ${data.count()} elementos")
     */

    /* First e last

    println("Primeira receita: ${data.first().nome}")
    println("Ultima receita: ${data.last().nome}")

    println(listOf(Int).firstOrNull())
    println(listOf(Int).lastOrNull())
    */

    /* Sum e sumOf

    println(listOf(1,2,3).sum())
    println(data.sumOf { it.calorias })
    */

    /* Fielter

    println(data.filter {it.calorias > 500})
     */
    /* take e takelast

    println(data.take(2))
    println(data.takeLast(2))
     */
    /* ForEach

    data.forEach{ println(it.nome) }

     */
    /* Max e mim

    println(data.maxOf{ it.calorias })
    println(data.minOf{ it.calorias })

   println(listOf(1,2,3,4).maxOf { it })
     */
    /* Map -> Mapeamento

    println(data.map { it.calorias }.sum())
    println(data.map { ReceitaNIngredientes(it.nome, it.ingrediente.count())})

     */
    /* Average

    listOf(1,2).average()
    data.map {it.calorias}.avarage()
     */
    /* Distinct, Sorted, Reversed

    println(lst.distinct())
    println(data.distinctBy {it.nome})

    println(lst.sorted())
    println(lst.sortedDescending())

    println(lst.reversed())
     */
   val lst = listOf(1,2,4,5,7,8,10,1,1,1,3)






    //Combinando duas funções para imprimir os nome das receitas com mais de 500 cal
    // println(data.filter {it.calorias > 500}.forEach{ println(it.nome)})


}

fun geraDados(): List<Receita> {

    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}


data class Receita(val nome: String, val calorias: Int, val ingrediente: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)

data class ReceitaNIngredientes(val nome: String, val nIngredientes:Int)