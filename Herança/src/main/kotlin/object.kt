class Matematica{

    companion object{
        val PI = 3.1415
        fun teste(){}
    }

    object obj1{
        val e = 2.71
    }
    object obj2{}
    object obj3{}
}

fun main () {

  Matematica.PI
  Matematica.teste()

  Matematica.obj1.e
}