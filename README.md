# Pruebas unitarias utilizando JUnit5
Agregar la dependencia JUnit en el archivo .pom

```
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.11.4</version>
    <scope>test</scope>
</dependency>
```
## Principios de las pruebas unitarias
* La estructura de carpetas de main y test, debe ser la misma.

## Objetivo de la prueba unitaria
Cuando pasa una prueba y cuando no pasa una prueba.

Se trabaja con el fin de evaluar:
* Valor esperado (Lo que creemos o pensamos que va retornar la función o método).
* Valor actual (Valor original que devuelve el método que estamos probando).

## Assertions más utilizados
Se recomienda utilizar la siguiente importación: import static org.junit.jupiter.api.Assertions.*;
* assertEquals: Evalúa un valor esperado con un valor actual.
* assertTrue: Evalúa que la condición se cumpla, siempre espera un true.
* assertFalse: Evalúa que la condición no se cumpla, siempre espera un false.
* assertNotNull: Evalúa que el resultado no sea nulo.
* assertInstanceOf: Evalúa el tipo de objeto.
* assertThrows: Evalúa el tipo de excepción.

## Estructura utilizada en las pruebas unitarias
* Given: Configuramos todos los parámetros o insumos que necesitamos del método.
* When: Ejecución del método, una vez configurado todos los parámetros o insumos.
* Then: Entonces, Evaluamos los resultados.
### Ejemplo:

```
 @Test
    public void testSumar() {
        // Given
        Example example = new Example();
        int numberA = 3;
        int numberB = 3;

        // When 
        int result = example.sumar(numberA, numberB);

        // Then 
        assertEquals(6, result);
    }
```

## Cobertura
La cobertura en pruebas unitarias en Java (y en general en otros lenguajes) es una métrica que mide el porcentaje de código que se ejecuta al realizar pruebas unitarias. Este porcentaje refleja qué tan bien están siendo probadas las clases, métodos y líneas de código en tu aplicación.

## Herramientas para medir cobertura en Java
* JaCoCo (Java Code Coverage): Es una de las herramientas más populares para medir cobertura. Se integra con herramientas de compilación como Maven y Gradle, además de tener soporte para CI/CD.


* SonarQube: Aunque no mide la cobertura directamente, se integra con herramientas como JaCoCo para mostrar reportes detallados y agregar análisis de calidad.

Ejemplo Configuración del plugin para medir cobertura de las pruebas unitarias utilizando JaCoCo (Java Code Coverage) en el archivo .pom:
```
 <build>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.12</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>jacoco-check</id>
                        <goals>
                            <goal>check</goal>
                        </goals>
                        <configuration>
                            <rules>
                                <rule>
                                    <element>PACKAGE</element>
                                    <limits>
                                        <limit>
                                            <counter>LINE</counter>
                                            <value>COVEREDRATIO</value>
                                            <minimum>0.95</minimum> <!-- LIMITE DE COVERAGE A EVALUAR  MINIMO 85% MAXIMO 95% -->
                                        </limit>
                                    </limits>
                                </rule>
                            </rules>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```

## Colores en el coverage JACOCO
* Verde: Significa que esta cubierto por test
* Amarillo: Significa parcialmente cubierto
* Rojo: No esta cubierto por test
