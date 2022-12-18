import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calculadora = new Calculadora(); //Instanciación
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void suma() {
       Assertions.assertEquals(10, calculadora.suma(5, 5)); //Verificación del método
    }

    @org.junit.jupiter.api.Test
    void sumavarios() {
        double resultado = calculadora.suma(5,5);
        double resultado2 = calculadora.suma(10,10);
        assertAll(
                () -> assertEquals(10,resultado),
                () -> assertEquals(20,resultado2)
        );
    }

    @org.junit.jupiter.api.Test
    void resta() {
        assertEquals(0, calculadora.resta(5, 5)); //Verificación del método
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() {
        assertEquals(25, calculadora.multiplicacion(5, 5)); //Verificación del método
    }

    @org.junit.jupiter.api.Test
    void division() {
        assertEquals(3, calculadora.division(15, 5)); //Verificación del método
    }

    @org.junit.jupiter.api.Test
    void getResulFinal() {
    }
}