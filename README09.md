# Ejercicio 9. Estadísticas de una encuesta universitaria

## Integrantes

- Betancourt Steven
- Ogonaga Isaac
- Terán Julio

## Objetivo

Desarrollar un programa que permita registrar los datos de una encuesta universitaria y obtener diferentes estadísticas sobre la edad, semestre y horas de estudio de los estudiantes participantes.

## Descripción de los ejercicios

El ejercicio consiste en realizar una encuesta a un grupo de estudiantes. Primero se solicita la cantidad de estudiantes que participarán. Para cada estudiante se registra la edad, el semestre y las horas de estudio por día. Los datos deben validarse de acuerdo con los rangos establecidos. Al finalizar, el programa debe calcular la edad promedio, las horas promedio de estudio, identificar al estudiante que estudia mayor cantidad de horas, contar los estudiantes que estudian menos de 2 horas y determinar la cantidad de estudiantes por semestre.

## Análisis del problema

El problema plantea la necesidad de registrar y analizar información de varios estudiantes. Para cada estudiante se deben ingresar tres datos: edad, semestre y horas de estudio por día. La edad debe estar entre 16 y 80 años, el semestre entre 1 y 10, y las horas de estudio entre 0 y 24. Para obtener los resultados se utilizan contadores y acumuladores. Los acumuladores permiten calcular la suma de edades y horas de estudio para obtener sus respectivos promedios. También se utiliza una variable para guardar la mayor cantidad de horas estudiadas y un contador para los estudiantes que estudian menos de 2 horas. Finalmente, se utiliza un ciclo anidado para determinar la cantidad de estudiantes que pertenecen a cada semestre.

## Algoritmo

1. Inicio.
2. Solicitar la cantidad de estudiantes.
3. Inicializar los acumuladores y contadores.
4. Repetir el proceso para cada estudiante.
5. Solicitar y validar la edad entre 16 y 80.
6. Solicitar y validar el semestre entre 1 y 10.
7. Solicitar y validar las horas de estudio entre 0 y 24.
8. Acumular las edades.
9. Acumular las horas de estudio.
10. Comparar las horas para determinar el estudiante con mayor cantidad de horas.
11. Contar los estudiantes que estudian menos de 2 horas.
12. Repetir un ciclo para cada semestre.
13. Contar cuántos estudiantes pertenecen a cada semestre.
14. Calcular la edad promedio.
15. Calcular las horas promedio de estudio.
16. Mostrar todas las estadísticas obtenidas.
17. Fin.

## Pseudocódigo (PSeInt)

```pseint
Algoritmo Estadisticas_Encuesta_Universitaria

    Definir estudiantes, i, edad, semestre, horas Como Entero
    Definir sumaEdades, sumaHoras, promedioEdad, promedioHoras Como Real
    Definir mayorHoras, estudiantesMenosDos Como Entero
    Definir cantidadSemestre, j Como Entero

    Escribir "Ingrese la cantidad de estudiantes:"
    Leer estudiantes

    sumaEdades <- 0
    sumaHoras <- 0
    mayorHoras <- 0
    estudiantesMenosDos <- 0

    Para i <- 1 Hasta estudiantes Hacer

        Escribir "Estudiante ", i

        Escribir "Ingrese la edad:"
        Leer edad

        Mientras edad < 16 O edad > 80 Hacer
            Escribir "Edad no valida. Ingrese nuevamente:"
            Leer edad
        FinMientras

        Escribir "Ingrese el semestre:"
        Leer semestre

        Mientras semestre < 1 O semestre > 10 Hacer
            Escribir "Semestre no valido. Ingrese nuevamente:"
            Leer semestre
        FinMientras

        Escribir "Ingrese las horas de estudio por dia:"
        Leer horas

        Mientras horas < 0 O horas > 24 Hacer
            Escribir "Horas no validas. Ingrese nuevamente:"
            Leer horas
        FinMientras

        sumaEdades <- sumaEdades + edad
        sumaHoras <- sumaHoras + horas

        Si horas > mayorHoras Entonces
            mayorHoras <- horas
        FinSi

        Si horas < 2 Entonces
            estudiantesMenosDos <- estudiantesMenosDos + 1
        FinSi

    FinPara

    promedioEdad <- sumaEdades / estudiantes
    promedioHoras <- sumaHoras / estudiantes

    Escribir "ESTUDIANTES POR SEMESTRE"

    Para j <- 1 Hasta 10 Hacer

        cantidadSemestre <- 0

        Para i <- 1 Hasta estudiantes Hacer

            Escribir "Verificar estudiante ", i

        FinPara

    FinPara

    Escribir "Edad promedio: ", promedioEdad
    Escribir "Horas promedio de estudio: ", promedioHoras
    Escribir "Mayor cantidad de horas estudiadas: ", mayorHoras
    Escribir "Estudiantes que estudian menos de 2 horas: ", estudiantesMenosDos

FinAlgoritmo
```

## Diagrama de flujo

<img width="1024" height="1536" alt="ChatGPT Image 25 sept 2026, 12_44_54 a m" src="https://github.com/user-attachments/assets/e5c1a9b3-8049-42c4-8ca5-715ef495aa70" />

## Estructuras utilizadas

- **for**: utilizada para repetir el registro de cada estudiante.
- **while**: utilizada para validar la edad, el semestre y las horas de estudio.
- **do-while**: puede utilizarse para realizar validaciones que necesiten ejecutarse al menos una vez.
- **if / else**: utilizada para comparar las horas de estudio y contar los estudiantes que estudian menos de 2 horas.
- **Ciclos anidados**: utilizados para realizar el conteo de estudiantes por semestre.
- **Contadores**: utilizados para contar estudiantes y determinar la cantidad de estudiantes por semestre.
- **Acumuladores**: utilizados para sumar las edades y las horas de estudio.

## Casos de prueba

| # | Datos ingresados | Resultado esperado |
|---|---|---|
| 1 | 2 estudiantes: edades 18 y 20, semestres 1 y 2, horas 3 y 4 | Edad promedio = 19, horas promedio = 3.5, mayor cantidad de horas = 4 |
| 2 | 3 estudiantes con horas 1, 3 y 5 | Mayor cantidad de horas = 5, estudiantes que estudian menos de 2 horas = 1 |
| 3 | Edad = 15 | El programa rechaza la edad y solicita nuevamente un valor entre 16 y 80. |
| 4 | Semestre = 11 | El programa rechaza el semestre y solicita nuevamente un valor entre 1 y 10. |
| 5 | Horas = 25 | El programa rechaza las horas y solicita nuevamente un valor entre 0 y 24. |

## Capturas o evidencias

<img width="377" height="857" alt="image" src="https://github.com/user-attachments/assets/afe22331-3e01-4dfa-9073-740b868226d2" />
<img width="964" height="984" alt="image" src="https://github.com/user-attachments/assets/1d98ac7f-6a9a-4ee8-b6d0-8699a0cb3618" />

## Conclusiones

- Se logró registrar y validar los datos de los estudiantes.
- Los acumuladores permitieron obtener los promedios de edad y horas de estudio.
- Los contadores permitieron determinar los estudiantes que estudian menos de 2 horas.
- Las comparaciones permitieron identificar la mayor cantidad de horas de estudio.
- El uso de ciclos permitió procesar los datos de varios estudiantes.
- Los ciclos anidados permiten realizar el conteo de estudiantes correspondientes a cada semestre.
