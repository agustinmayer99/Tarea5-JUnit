import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClaseTester {

    private ClaseATestear CAT = new ClaseATestear();

    @Test
    public void esImparTest(){
        boolean resultado = CAT.esImpar(3);
        assertTrue(resultado);
    }

    @Test
    public void cuadradoDelNumeroTest(){
        int resultado = CAT.cuadradoDelNumero(3);
        assertEquals(11,resultado);
    }

    @Test
    public void longitudStringTest(){
        int resultado = CAT.longitudString("Testing");
        assertEquals(7,resultado);
    }
}
