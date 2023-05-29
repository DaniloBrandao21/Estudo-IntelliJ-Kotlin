
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class teste {
    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testePortaria(){
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "vip", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "comum", "1516"), "Negado.")
        Assertions.assertEquals(portaria(25, "comum", "xt1516"), "Welcome.")
        Assertions.assertEquals(portaria(25, "premium", "xt1516"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "xl1516"), "Welcome.")
        Assertions.assertEquals(portaria(25, "luxo", "xl1516"), "Welcome.")
        Assertions.assertEquals(portaria(25, "premium", "1516"), "Negado.")
    }

}