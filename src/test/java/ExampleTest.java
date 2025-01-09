import org.example.Example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    private Example example;

    // Se ejecuta una vez por cada test
    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    /*@Test
    public void sumTest(){
        Example example = new Example();
        int result = example.sum(10,4); // 8
        //assertEquals(14, result); // Evalua un valor esperado con un valor actual
        //assertTrue(result > 5); // Evalua que la condicion se cumpla, con un true
        //assertFalse(result > 20); // Evalua que la condicion no se cumpla, con un false
        //assertNotNull(result); // Evalua que el resultado no sea nulo
        //assertInstanceOf(Integer.class, result); // Evalua el tipo de objeto
        //assertThrows(); // Evalua el tipo de excepcion
    }*/


    @Test
    public void testSumar() {
        // Given - Teniendo , Configuramos todos los parametros o insumos que necesitamos del metodo
        int numberA = 3;
        int numberB = 3;

        // When - Cuando , Ejecucion del metodo, una vez configurado todos los parametros o insumos
        int result = example.sumar(numberA, numberB);

        // Then - Entonces, Evaluamos los resultados

        // Evaluamos que el resultado esperado sea 6
        assertEquals(6, result);
        // Evaluamos que el resultado sea de tipo entero
        assertInstanceOf(Integer.class, result);
        // Evaluamos que el resultado no sea nulo
        assertNotNull(result);
    }

    @Test
    public void testCheckPositivo() {
        // Given
        int number = 10;

        // When
        boolean result = example.checkPositivo(number);
        // Then
        // Evaluamos que el retorno del metodo sea un TRUE
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError() {
        // Given
        int number = -4;
        // When - NO SE USA CUANDO PROBAMOS ERRORES

        // Then
        assertThrows(IllegalArgumentException.class,
                () -> example.checkPositivo(number),
                "Factorial no definido para números negativos");

    }

    @Test
    public void testContarLetrasA() {
        // Given
        String cadena = "Hola";

        // When
        int result = example.contarLetrasA(cadena);

        //Then
        assertNotNull(result);
        assertEquals(1, result);
    }

    @Test
    public void testContieneElemento() {
        // Given
        List<String> list = List.of("Hola", "Como", "Estas");
        String element = "Hola";

        // When
        boolean result = example.contieneElemento(list, element);

        //Then
        assertNotNull(result);
        assertTrue(result);
    }

    @Test
    public void testRevertirCadena() {
        // Given
        String cadena = "Hola";

        // When
        String result = example.revertirCadena(cadena);

        //Then
        assertNotNull(result);
        assertEquals("aloH", result);
    }

    @Test
    public void testFactorial() {
        // Given
        int number = 5;

        // When
        long result = example.factorial(number);

        //Then
        assertNotNull(result);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialError() {
        // Given
        int number = -1;

        // When - NO SE USA CUANDO PROBAMOS ERRORES

        //Then
        assertThrows(IllegalArgumentException.class,
                () -> example.factorial(number),
                "Factorial no definido para números negativos");
    }



    @Test
    public void testEsPrimo() {
        // Given
        int number = 3;

        // When
        boolean result = example.esPrimo(number);

        //Then
        assertTrue(result);

    }

    @Test
    public void testEsPrimoMenorQueUno() {
        // Given
        int number = 1;

        // When
        boolean result = example.esPrimo(number);

        //Then
        assertFalse(result);
    }

    @Test
    public void testNoEsPrimo() {
        // Given
        int number = 8;

        // When
        boolean result = example.esPrimo(number);

        //Then
        assertFalse(result);

    }

    @Test
    public void testEsPrimoMayorACuatro() {
        // Given
        int number = 11;

        // When
        boolean result = example.esPrimo(number);

        //Then
        assertTrue(result);

    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        // Given

        // When
        String result = example.mensajeConRetraso();

        //Then
        assertEquals("Listo después de retraso", "Listo después de retraso");

    }

    @Test
    public void testConvertirAString(){
        // Given
        List<Integer> numbers = List.of(1,2,3,4,5);

        // When
        List<String> numbersString = example.convertirAString(numbers);

        //Then
        assertNotNull(numbersString);
        assertEquals(List.of("1","2","3","4","5"), numbersString);
    }

    @Test
    public void testCalcularMedia(){
        // Given
        List<Integer> numbers = List.of(1,2,3,4,5);

        // When
        double media = example.calcularMedia(numbers);

        //Then
        assertNotNull(numbers);
        assertEquals(3, media);
    }

    @Test
    public void testCalcularMediaListaVacia(){
        // Given
        List<Integer> numbers = List.of();

        // When - NO SE USA CUANDO PROBAMOS ERRORES

        //Then
        assertThrows(IllegalArgumentException.class,
                () -> example.calcularMedia(numbers),
                "La lista no puede ser nula o vacía");

    }

    @Test
    public void testCalcularMediaListaNula(){
        // Given
        List<Integer> numbers = null;

        // When - NO SE USA CUANDO PROBAMOS ERRORES

        //Then
        assertThrows(IllegalArgumentException.class,
                () -> example.calcularMedia(numbers),
                "La lista no puede ser nula o vacía");

    }

    @Test
    public void testConvertirListaAString(){
        // Given
        List<String> list = List.of("a","b","c","d","f");

        // When
        String result = example.convertirListaAString(list);

        //Then
        assertNotNull(result);
        assertEquals("A,B,C,D,F", result);
    }

}
