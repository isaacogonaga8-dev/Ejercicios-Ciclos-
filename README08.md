# Ejercicio 8. Detector y depurador de errores

## Integrantes

- Betancourt Steven
- Ogonaga Isaac
- Terán Julio

## Objetivo

Analizar y corregir errores relacionados con ciclos, identificando el problema, explicando su causa y aplicando una solución que permita que el programa se ejecute correctamente.

## Descripción de los ejercicios

El ejercicio consiste en analizar un código que utiliza un ciclo `while` y detectar el error que provoca que el ciclo no termine. Se debe explicar la causa del problema, corregir el código, elaborar una tabla de trazas y demostrar la solución mediante la ejecución del programa. Además, se debe crear otro ejemplo que produzca un error relacionado con ciclos y corregirlo.

## Análisis del problema

El problema presenta un ciclo `while` que utiliza la variable `numero` como condición de control. La variable comienza con el valor 1 y el ciclo se ejecuta mientras sea menor que 10. El error se encuentra en que dentro del ciclo solamente se muestra el valor de la variable, pero no se modifica. Por esta razón, `numero` siempre mantiene el valor 1 y la condición `numero < 10` siempre es verdadera, provocando un ciclo infinito. Para solucionar el problema se debe incrementar la variable en cada repetición utilizando `numero++`. De esta manera, la variable cambia de valor hasta llegar a 10 y el ciclo termina correctamente.

## Algoritmo

1. Inicio.
2. Inicializar la variable numero con 1.
3. Verificar si numero es menor que 10.
4. Mostrar el valor de numero.
5. Incrementar numero en 1.
6. Repetir mientras numero sea menor que 10.
7. Mostrar el resultado de la ejecución.
8. Crear otro ejemplo con un error relacionado con ciclos.
9. Identificar y corregir el error del segundo ejemplo.
10. Fin.

## Pseudocódigo (PSeInt)

```pseint
Algoritmo Detector_Errores

    Definir numero Como Entero

    numero <- 1

    Mientras numero < 10 Hacer

        Escribir numero

        numero <- numero + 1

    FinMientras

    Escribir "Ciclo finalizado correctamente."

FinAlgoritmo
```

## Diagrama de flujo

<img width="1097" height="1434" alt="08" src="https://github.com/user-attachments/assets/db29a814-38bb-44b8-8bcf-205993d5002a" />

## Estructuras utilizadas

- **while**: utilizada para repetir el proceso mientras la variable numero sea menor que 10.
- **do-while**: puede utilizarse para ejecutar al menos una vez un proceso relacionado con la comprobación de errores.
- **switch**: puede utilizarse para seleccionar diferentes opciones de ejemplos o soluciones.
- **if / else**: utilizada para realizar comprobaciones y determinar si existe un error.
- **Contadores**: utilizados para controlar las repeticiones del ciclo.
- **Acumuladores**: pueden utilizarse para almacenar resultados durante las repeticiones.

## Casos de prueba

| # | Situación | Datos ingresados | Resultado esperado |
|---|---|---|---|
| 1 | Ejecución correcta | numero = 1 | El programa muestra los números del 1 al 9 y finaliza el ciclo. |
| 2 | Condición inicial | numero = 5 | El programa muestra los números del 5 al 9 y finaliza correctamente. |
| 3 | Límite del ciclo | numero = 10 | El ciclo no se ejecuta porque la condición numero < 10 es falsa. |
| 4 | Error encontrado | numero = 1 sin incremento | El programa genera un ciclo infinito porque numero nunca cambia. |
| 5 | Error corregido | numero = 1 con numero++ | El programa incrementa la variable y termina cuando llega a 10. |

## Capturas o evidencias

<img width="349" height="286" alt="Captura de pantalla 2026-09-25 000539" src="https://github.com/user-attachments/assets/c0ca72d6-bff9-411e-a2d5-227f73a099ee" />
<img width="961" height="973" alt="image" src="https://github.com/user-attachments/assets/6e654065-c39b-4a70-9a0e-741361bc1504" />

## Error encontrado

La variable `numero` no cambia dentro del ciclo `while`, por lo que la condición siempre permanece verdadera y se produce un ciclo infinito.

## Causa

La causa del error es la falta de una instrucción que incremente la variable `numero` dentro del ciclo.

## Solución

Agregar la instrucción `numero++` después de mostrar el valor de la variable.

## Resultado

Después de corregir el código, el programa muestra los números del 1 al 9 y termina correctamente cuando `numero` llega a 10.

## Conclusiones

- Se identificó el error que provocaba un ciclo infinito.
- Se comprendió la importancia de modificar la variable de control dentro de un ciclo.
- La instrucción `numero++` permitió que la condición del ciclo pudiera cumplirse.
- La tabla de trazas permitió comprobar el cambio de la variable en cada repetición.
- La depuración permitió corregir el programa y comprobar su funcionamiento.
