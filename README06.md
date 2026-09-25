EJERCICIO 6. TRIÁNGULO Y PATRONES

1. Objetivo

Desarrollar un programa que permita al usuario ingresar un número entre 2 y 10 y,

utilizando ciclos anidados, mostrar diferentes patrones de caracteres y números.

El ejercicio busca que el estudiante comprenda cómo interactúan un ciclo exterior y un ciclo interior, especialmente cuando el número de repeticiones del ciclo interior depende del ciclo exterior


Descripción del ejercicio


El programa debe solicitar al usuario un número entero entre 2 y 10.

Por ejemplo, si el usuario ingresa 5, el programa debe mostrar tres patrones:

Primer patrón: triángulo creciente
*
**
***
****
*****
Segundo patrón: triángulo decreciente
*****
****
***
**
*
Tercer patrón: números
1
12
123
1234
12345

Para realizar estos patrones se deben utilizar ciclos for anidados, es decir, un ciclo for exterior que controla las filas y un ciclo for interior que controla los elementos que aparecen en cada fila.


3. Análisis del problema

   
Datos de entrada

Un número entero n.

El número debe estar comprendido entre 2 y 10.

Proceso

El programa debe:

Solicitar el número al usuario.

Verificar que esté entre 2 y 10.

Recorrer las filas desde 1 hasta n.

Para cada fila, imprimir una cantidad de * igual al número de fila.

Recorrer nuevamente las filas desde n hasta 1.

Para cada fila, imprimir una cantidad de * igual al número de fila.

Finalmente, recorrer las filas desde 1 hasta n.

En cada fila imprimir los números desde 1 hasta el número de fila.


Salida

Se muestran los tres patrones solicitados.


ALGORITMO

Inicio

Declarar la variable n.

Solicitar al usuario un número entre 2 y 10.

Mientras n sea menor que 2 o mayor que 10:

Mostrar un mensaje de error.

Solicitar nuevamente el número.

Mostrar el primer patrón:

Para i desde 1 hasta n:

Para j desde 1 hasta i:

Mostrar *.

Cambiar de línea.

Mostrar el segundo patrón:

Para i desde n hasta 1:

Para j desde 1 hasta i:

Mostrar *.

Cambiar de línea.

Mostrar el tercer patrón:

Para i desde 1 hasta n:

Para j desde 1 hasta i:

Mostrar j.

Cambiar de línea.

Fin.



5. Pseudocódigo en PSeInt

Algoritmo TrianguloYPatrones
	
	Definir n, i, j Como Entero
	
	// Solicitar número válido
	Repetir
		Escribir "Ingrese un número entre 2 y 10:"
		Leer n
		
		Si n < 2 O n > 10 Entonces
			Escribir "Error: el número debe estar entre 2 y 10."
		FinSi
	Hasta Que n >= 2 Y n <= 10
	
	
	// Primer patrón: triángulo creciente
	Escribir ""
	Escribir "Primer patrón:"
	
	Para i <- 1 Hasta n Hacer
		
		Para j <- 1 Hasta i Hacer
			Escribir "*" Sin Saltar
		FinPara
		
		Escribir ""
	FinPara
	
	
	// Segundo patrón: triángulo decreciente
	Escribir ""
	Escribir "Segundo patrón:"
	
	Para i <- n Hasta 1 Con Paso -1 Hacer
		
		Para j <- 1 Hasta i Hacer
			Escribir "*" Sin Saltar
		FinPara
		
		Escribir ""
	FinPara
	
	
	// Tercer patrón: números
	Escribir ""
	Escribir "Tercer patrón:"
	
	Para i <- 1 Hasta n Hacer
		
		Para j <- 1 Hasta i Hacer
			Escribir j Sin Saltar
		FinPara
		
		Escribir ""
	FinPara
	
FinAlgoritmo


DIAGRAMA DE FLUJO

              ┌─────────────┐
              │    INICIO   │
              └──────┬──────┘
                     │
                     ▼
            ┌─────────────────┐
            │ Solicitar n     │
            └────────┬────────┘
                     │
                     ▼
             ┌────────────────┐
             │ ¿2 <= n <= 10? │
             └───────┬────────┘
                 NO  │  SÍ
              ┌──────┘  └─────────────┐
              ▼                       ▼
    ┌──────────────────┐      ┌───────────────┐
    │ Mostrar error    │      │ Primer patrón │
    └────────┬─────────┘      └───────┬───────┘
             │                        │
             └────► Solicitar n       ▼
                              ┌─────────────────┐
                              │ i = 1 hasta n  │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │ j = 1 hasta i  │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │   Imprimir *    │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │ Segundo patrón  │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │ i = n hasta 1   │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │ j = 1 hasta i  │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │   Imprimir *    │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │ Tercer patrón   │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │ i = 1 hasta n  │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │ j = 1 hasta i  │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌─────────────────┐
                              │   Imprimir j    │
                              └────────┬────────┘
                                       │
                                       ▼
                              ┌───────────────┐
                              │      FIN      │
                              └───────────────┘


7. Estructuras utilizadas

En este ejercicio se utilizan principalmente estructuras repetitivas.

1. Ciclo Repetir ... Hasta Que

Se utiliza para validar que el usuario introduzca un número válido.

Repetir
    Leer n
Hasta Que n >= 2 Y n <= 10

Su función es repetir la solicitud hasta obtener un número entre 2 y 10.

2. Ciclo Para

Se utiliza para controlar las filas de los patrones.

Ejemplo:

Para i <- 1 Hasta n Hacer
3. Ciclos Para anidados

Es la estructura principal del ejercicio.

Un ciclo Para se encuentra dentro de otro:

Para i <- 1 Hasta n Hacer

    Para j <- 1 Hasta i Hacer
        Escribir "*"
    FinPara

FinPara

El ciclo exterior controla las filas, mientras que el ciclo interior controla cuántos caracteres se imprimen en cada fila.

4. Estructura condicional Si


Tabla de interacción entre ciclo exterior e interior


| Ciclo exterior `i` | Ciclo interior `j` | Cantidad de elementos | Resultado |
| -----------------: | ------------------ | --------------------: | --------- |
|                  1 | 1                  |                     1 | `*`       |
|                  2 | 1, 2               |                     2 | `**`      |
|                  3 | 1, 2, 3            |                     3 | `***`     |
|                  4 | 1, 2, 3, 4         |                     4 | `****`    |
|                  5 | 1, 2, 3, 4, 5      |                     5 | `*****`   |



CASOS DE PRUEBA

| Caso | Entrada `n` | ¿Válida? | Resultado esperado            |
| ---- | ----------: | -------- | ----------------------------- |
| 1    |           2 | Sí       | Patrones de 2 filas           |
| 2    |           3 | Sí       | Patrones de 3 filas           |
| 3    |           5 | Sí       | Patrones de 5 filas           |
| 4    |          10 | Sí       | Patrones de 10 filas          |
| 5    |           1 | No       | Solicita nuevamente el número |
| 6    |          11 | No       | Solicita nuevamente el número |
| 7    |           0 | No       | Solicita nuevamente el número |
| 8    |          -5 | No       | Solicita nuevamente el número |



CAPTURAS O EVIDENCIAS

<img width="794" height="984" alt="WhatsApp Image 2026-09-25 at 9 50 57 AM" src="https://github.com/user-attachments/assets/17b7e156-2d01-4a91-a056-833a7ca728f3" />







CONCLUSION
Este ejercicio permite comprender el funcionamiento de los ciclos anidados, una estructura fundamental en programación. El ciclo exterior se encarga de controlar las filas, mientras que el ciclo interior determina cuántos caracteres o números se muestran en cada fila.

Además, se practica la validación de datos de entrada, evitando que el programa continúe con valores que no cumplen las condiciones establecidas.

El ejercicio también demuestra que modificando las condiciones de los ciclos se pueden construir diferentes patrones, como triángulos crecientes, decrecientes y secuencias numéricas. Por esta razón, el ejercicio ayuda a desarrollar la lógica de programación y la capacidad de analizar cómo interactúan dos ciclos for dentro de un mismo programa.
















