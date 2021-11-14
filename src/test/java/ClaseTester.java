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
    public void esImparTestFalla(){
        boolean resultado = CAT.esImpar(4);
        assertTrue(resultado);
    }

    @Test
    public void cuadradoDelNumeroTest(){
        int resultado = CAT.cuadradoDelNumero(3);
        assertEquals(9,resultado);
    }

    @Test
    public void cuadradoDelNumeroTestFalla(){
        int resultado = CAT.cuadradoDelNumero(3);
        assertEquals(10,resultado);
    }

    @Test
    public void longitudStringTest(){
        int resultado = CAT.longitudString("Testing");
        assertEquals(7,resultado);
    }

    @Test
    public void longitudStringTestFalla(){
        int resultado = CAT.longitudString("Ingenieria");
        assertEquals(7,resultado);
    }
}
