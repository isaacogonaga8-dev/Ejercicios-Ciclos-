Ejercicio 7. Control de ventas de cafetería
Integrantes
•	Betancourt Steven
•	Ogonaga Isaac
•	Terán Julio
Objetivo
Desarrollar un programa en Java que permita registrar las ventas de una cafetería universitaria, utilizando estructuras de repetición y selección para controlar productos, cantidades, precios y estadísticas.
Descripción de los ejercicios
El ejercicio consiste en construir un sistema de control de ventas para una cafetería universitaria. El programa presenta un menú para registrar ventas, mostrar estadísticas, mostrar productos y salir. Para cada venta se registra producto y cantidad, se calcula el subtotal y se actualizan contadores y acumuladores.
Análisis del problema
El problema plantea la necesidad de controlar las ventas realizadas en una cafetería universitaria. Se deben validar los datos ingresados, calcular cada subtotal y mantener acumuladores para obtener el total recaudado. También se utilizan contadores para las ventas y productos y una estructura de menú que se mantiene activa hasta seleccionar salir.
Algoritmo
1.	Inicio.
2.	Inicializar contadores y acumuladores.
3.	Mostrar el menú.
4.	Leer la opción.
5.	Validar la opción.
6.	Registrar venta y validar producto y cantidad.
7.	Determinar precio y calcular subtotal.
8.	Actualizar contadores y acumuladores.
9.	Mostrar estadísticas o productos según la opción.
10.	Repetir hasta seleccionar salir.
11.	Fin.
Pseudocódigo (PSeInt)
Algoritmo Control_Ventas_Cafeteria
    Definir opcion, producto, cantidad Como Entero
    Definir ventas, totalProductos Como Entero
    Definir precio, subtotal, total, promedio Como Real
    ventas <- 0
    totalProductos <- 0
    total <- 0
    Repetir
        Escribir "1. Registrar venta"
        Escribir "2. Mostrar estadisticas"
        Escribir "3. Mostrar productos"
        Escribir "4. Salir"
        Leer opcion
        Segun opcion Hacer
            1:
                Escribir "1. Cafe $1.00"
                Escribir "2. Sandwich $2.50"
                Escribir "3. Jugo $1.50"
                Escribir "4. Empanada $1.25"
                Leer producto
                Mientras producto < 1 O producto > 4 Hacer
                    Escribir "Producto no valido."
                    Leer producto
                FinMientras
                Escribir "Ingrese cantidad:"
                Leer cantidad
                Mientras cantidad <= 0 Hacer
                    Escribir "Cantidad invalida."
                    Leer cantidad
                FinMientras
                Segun producto Hacer
                    1: precio <- 1.00
                    2: precio <- 2.50
                    3: precio <- 1.50
                    4: precio <- 1.25
                FinSegun
                subtotal <- precio * cantidad
                ventas <- ventas + 1
                totalProductos <- totalProductos + cantidad
                total <- total + subtotal
            2:
                Si ventas > 0 Entonces
                    promedio <- total / ventas
                    Escribir "Ventas: ", ventas
                    Escribir "Productos: ", totalProductos
                    Escribir "Total recaudado: $", total
                    Escribir "Promedio por venta: $", promedio
                SiNo
                    Escribir "No existen ventas."
                FinSi
            3:
                Escribir "Cafe $1.00"
                Escribir "Sandwich $2.50"
                Escribir "Jugo $1.50"
                Escribir "Empanada $1.25"
            4:
                Escribir "Programa finalizado."
            De Otro Modo:
                Escribir "Opcion no valida."
        FinSegun
    Hasta Que opcion = 4
FinAlgoritmo
Diagrama de flujo
<img width="1024" height="1536" alt="07" src="https://github.com/user-attachments/assets/01b2a18d-1621-44f3-8cd2-f71eafa19f26" />
Estructuras utilizadas
•	`do-while`: mantiene activo el menú.
•	`switch`: selecciona opciones y productos.
•	`while`: valida datos.
•	Contadores y acumuladores: calculan ventas, productos y recaudación.
•	`if / else`: valida resultados.
Casos de prueba
#	Datos ingresados	Resultado esperado
1	Café, cantidad 2	Subtotal = $2.00
2	Sándwich, cantidad 3	Subtotal = $7.50
3	Producto 5	Rechazar producto
4	Cantidad 0	Rechazar cantidad
Capturas o evidencias
•	Captura del ingreso de datos.
•	Captura de las estadísticas.
Conclusiones
•	El menú permitió organizar las opciones del sistema.
•	Los contadores y acumuladores permitieron obtener las estadísticas.
•	Las validaciones evitaron datos incorrectos.
