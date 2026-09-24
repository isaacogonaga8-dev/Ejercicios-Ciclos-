EJERCICIO 5.
ESTACIONAMIENTO UNIVERSITARIO

OBJETIVO

Desarrollar un programa que permita registrar y controlar los vehículos que utilizan un estacionamiento universitario, calculando el costo según el tipo de vehículo y las horas estacionadas, y generando un reporte final con la cantidad de vehículos, el total recaudado y el promedio pagado. Además, se busca practicar el uso de estructuras de control como do-while y switch, junto con contadores, acumuladores y validación de datos.

2) ANALISIS
DESCRIPCIÓN DEL ANÁLISIS DEL PROBLEMA
El programa permitirá registrar varios vehículos que ingresan al estacionamiento. Primero se seleccionará el tipo de vehículo mediante un menú y se ingresarán las horas estacionadas.
Mediante un switch se determinará la tarifa correspondiente. Después se calculará el pago multiplicando la tarifa por las horas.
Se utilitazaran contadores para conocer cuántas motocicletas, automóviles y camionetas fueron registradas, y un acumulador para obtener el total recaudado.
El proceso se repetirá mediante un ciclo do-while hasta que el usuario decida terminar.

ENTRADAS
tipo → Entero: guarda el tipo de vehículo seleccionado.
horas → Entero: guarda las horas que permaneció estacionado.
continuar → Entero: indica si se desea registrar otro vehículo.

PROCESOS
tarifa → Real: guarda el precio por hora según el vehículo.
pago → Real: calcula el valor que debe pagar cada vehículo.
motocicletas → Entero: cuenta las motocicletas registradas.
automoviles → Entero: cuenta los automóviles registrados.
camionetas → Entero: cuenta las camionetas registradas.
totalVehiculos → Entero: cuenta todos los vehículos registrados.
totalRecaudado → Real: acumula el dinero recaudado.
promedio → Real: calcula el promedio pagado por vehículo.

SALIDAS
Cantidad de motocicletas.
Cantidad de automóviles.
Cantidad de camionetas.
Total de vehículos.
Total recaudado.
Promedio pagado.
Mensaje de validación de horas.

3)ALGORITMO
INICIO
1. Inicializar los contadores en cero.
2. Inicializar el total recaudado en cero.
3. Mostrar las opciones de vehículos.
4. Leer el tipo de vehículo.
5. Utilizar switch para determinar la tarifa.
6. Solicitar las horas estacionadas.
7. Validar que las horas sean mayores que cero.
8. Calcular el pago: pago = tarifa × horas.
9. Acumular el pago en totalRecaudado.
10. Aumentar el contador del vehículo correspondiente.
11. Aumentar el contador de total de vehículos.
12. Preguntar si desea registrar otro vehículo.
13. Repetir mientras el usuario indique que sí.
14. Calcular el promedio: promedio = totalRecaudado / totalVehiculos.
15. Mostrar el reporte final.
16. Finalizar.
FIN

Algoritmo Estacionamiento_Universitario

    Definir tipo, horas, continuar Como Entero
    Definir motocicletas, automoviles, camionetas Como Entero
    Definir totalVehiculos Como Entero
    Definir tarifa, pago, totalRecaudado, promedio Como Real

    motocicletas <- 0
    automoviles <- 0
    camionetas <- 0
    totalVehiculos <- 0
    totalRecaudado <- 0

    Repetir
        Escribir "=============================="
        Escribir " ESTACIONAMIENTO UNIVERSITARIO"
        Escribir "=============================="
        Escribir "1. Motocicleta - $0.50 por hora"
        Escribir "2. Automovil - $1.00 por hora"
        Escribir "3. Camioneta - $1.50 por hora"
        Escribir "Seleccione el tipo de vehiculo:"
        Leer tipo

        Segun tipo Hacer
            1:
                tarifa <- 0.50
                motocicletas <- motocicletas + 1
            2:
                tarifa <- 1.00
                automoviles <- automoviles + 1
            3:
                tarifa <- 1.50
                camionetas <- camionetas + 1
            De Otro Modo:
                tarifa <- 0
                Escribir "Tipo de vehiculo no valido."
        FinSegun

        Si tarifa > 0 Entonces
            Repetir
                Escribir "Ingrese las horas estacionado:"
                Leer horas
                Si horas <= 0 Entonces
                    Escribir "Las horas deben ser mayores que cero."
                FinSi
            Hasta Que horas > 0

            pago <- tarifa * horas
            totalRecaudado <- totalRecaudado + pago
            totalVehiculos <- totalVehiculos + 1
            Escribir "Pago: $", pago
        FinSi

        Escribir "Desea registrar otro vehiculo?"
        Escribir "1. Si"
        Escribir "0. No"
        Leer continuar
    Hasta Que continuar = 0

    Si totalVehiculos > 0 Entonces
        promedio <- totalRecaudado / totalVehiculos
    SiNo
        promedio <- 0
    FinSi

    Escribir "=============================="
    Escribir "          REPORTE"
    Escribir "=============================="
    Escribir "Motocicletas: ", motocicletas
    Escribir "Automoviles: ", automoviles
    Escribir "Camionetas: ", camionetas
    Escribir "Total vehiculos: ", totalVehiculos
    Escribir "Total recaudado: $", totalRecaudado
    Escribir "Promedio pagado: $", promedio

FinAlgoritmo
5. DIAGRAMA DE FLUJO

<img width="653" height="880" alt="image" src="https://github.com/user-attachments/assets/33bf5696-f7cf-4f2e-88d9-abbcb1919ade" />

6 .Estructuras utilizadas 
do-while → Para registrar varios vehículos hasta que el usuario decida terminar.

switch → Para seleccionar el tipo de vehículo y asignar su tarifa.

if → Para validar que las horas estacionadas sean mayores que cero.

Contadores → Para contar motocicletas, automóviles, camionetas y el total de vehículos.

Acumuladores → Para sumar el dinero recaudado.

Variables → Para almacenar tipo de vehículo, horas, tarifa y pago.

Operaciones aritméticas → Para calcular el pago y el promedio.


CASOS DE PRUEBA
| Caso | Tipo de vehículo | Horas | Resultado esperado                           |
| ---- | ---------------- | ----: | -------------------------------------------- |
| 1    | Motocicleta      |     2 | Paga **$1.00**                               |
| 2    | Automóvil        |     3 | Paga **$3.00**                               |
| 3    | Camioneta        |     4 | Paga **$6.00**                               |
| 4    | Motocicleta      |     5 | Paga **$2.50**                               |
| 5    | Automóvil        |     0 | **Error:** las horas deben ser mayores que 0 |
| 6    | Camioneta        |    -2 | **Error:** las horas deben ser mayores que 0 |
| 7    | Tipo inválido    |     3 | **Error:** seleccionar un tipo válido        |


CAPTURAS O EVIDENCIAS
<img width="803" height="439" alt="WhatsApp Image 2026-09-24 at 12 24 07 PM" src="https://github.com/user-attachments/assets/fb171e88-41cf-4af1-9e3a-807374d99eb9" />





CONCLUSIONES
Conclusiones
Se logró desarrollar un programa para controlar el ingreso de vehículos a un estacionamiento y calcular el valor a pagar.
Se aplicaron correctamente estructuras como do-while, switch e if.
Se utilizaron contadores y acumuladores para obtener el total de vehículos y el dinero recaudado.
Las validaciones permiten evitar datos incorrectos, como ingresar horas menores o iguales a cero.
El ejercicio permitió reforzar el uso de variables, operaciones aritméticas y estructuras de control en la programación.



