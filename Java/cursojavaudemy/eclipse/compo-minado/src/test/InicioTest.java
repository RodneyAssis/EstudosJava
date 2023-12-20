package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InicioTest {
    @Test
    public void verifyJUnit() {
        int a = 1 + 1;
        Assertions.assertEquals(2, a);
    }

    @Test
    void testaIgualaTres(){
        int b = 2 + 1;

        Assertions.assertEquals(3, b);
    }

}