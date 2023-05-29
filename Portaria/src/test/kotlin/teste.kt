import org.junit.jupiter.api.*
import java.lang.NullPointerException

class teste {

    @Test
    fun testeIfElse(){
        Assertions.assertTrue(maiorDeIdade(29))
    }

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO(){

        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("XXOO"))}
        )
    }
    @Test
    @Disabled
    fun naoImplementado(){

    }

    @Test
    fun vaiFalhar()
    {
        fail ( "Não posso terminar os testes sem esse método")
    }

    @Test
    fun assumption(){
        //O assertTrue executa apenas se o AssumeTrue for verdade
        Assumptions.assumeTrue(countXO("xxo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception(){

        assertThrows<NullPointerException>{ abc() }
    }

   /* @Test
    fun provocacao(){
        Assertions.assertNotNull(countXO("xxoo"))
        Assertions.assertNotNull(countXO("dasdasdad"))
        Assertions.assertNotNull(countXO("xxxxo"))
    }*/


}