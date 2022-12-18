import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTest2 {
    Calculadora calculadora = new Calculadora(); //Instanciación

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
      assertEquals(expectedResult, calculadora.suma(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
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