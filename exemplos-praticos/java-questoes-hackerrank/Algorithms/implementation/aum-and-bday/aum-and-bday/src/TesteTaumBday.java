import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteTaumBday {

    @Test
    public void testeCaso1() {

        int numeroPresentesPretos = 10; 
        int numeroPresentesBrancos = 10; 
        int custoPresentePreto = 1;
        int custoPresenteBranco = 1; 
        int custoParaConverter = 1;
        long esperado = 20;
        long resultado = Resultado.taumBday(numeroPresentesPretos, numeroPresentesBrancos, custoPresentePreto, custoPresenteBranco, custoParaConverter);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int numeroPresentesPretos = 5; 
        int numeroPresentesBrancos = 9; 
        int custoPresentePreto = 2;
        int custoPresenteBranco = 3; 
        int custoParaConverter = 4;
        long esperado = 37;
        long resultado = Resultado.taumBday(numeroPresentesPretos, numeroPresentesBrancos, custoPresentePreto, custoPresenteBranco, custoParaConverter);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        int numeroPresentesPretos = 3; 
        int numeroPresentesBrancos = 6; 
        int custoPresentePreto = 9;
        int custoPresenteBranco = 1; 
        int custoParaConverter = 1;
        long esperado = 12;
        long resultado = Resultado.taumBday(numeroPresentesPretos, numeroPresentesBrancos, custoPresentePreto, custoPresenteBranco, custoParaConverter);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        int numeroPresentesPretos = 7; 
        int numeroPresentesBrancos = 7; 
        int custoPresentePreto = 4;
        int custoPresenteBranco = 2; 
        int custoParaConverter = 1;
        long esperado = 35;
        long resultado = Resultado.taumBday(numeroPresentesPretos, numeroPresentesBrancos, custoPresentePreto, custoPresenteBranco, custoParaConverter);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso5() {

        int numeroPresentesPretos = 3; 
        int numeroPresentesBrancos = 3; 
        int custoPresentePreto = 1;
        int custoPresenteBranco = 9; 
        int custoParaConverter = 2;
        long esperado = 12;
        long resultado = Resultado.taumBday(numeroPresentesPretos, numeroPresentesBrancos, custoPresentePreto, custoPresenteBranco, custoParaConverter);

        assertEquals(esperado, resultado);
    }
    
}
