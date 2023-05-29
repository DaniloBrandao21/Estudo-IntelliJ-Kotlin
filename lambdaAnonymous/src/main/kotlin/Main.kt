import java.text.Normalizer

interface EventListener{

    fun click()

}

class Form {
    fun clickJava(e: EventListenerJava){}

    fun clickK0tlin(e: EventListener){}
}

class Main{
    fun main(){

       Form().clickJava(object : EventListenerJava{
           override fun click() {
           }

       })
       Form().clickK0tlin(object : EventListener{
           override fun click() {
           }

       })

    }

}