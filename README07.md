# Ejercicio 7. Control de ventas de cafetería

## Integrantes

- Betancourt Steven
- Ogonaga Isaac
- Terán Julio

## Objetivo

Desarrollar un programa en Java que permita controlar las ventas de una cafetería universitaria, utilizando estructuras de repetición y selección para registrar productos, cantidades, precios y obtener estadísticas de las ventas realizadas.

## Descripción de los ejercicios

El ejercicio consiste en construir un sistema de control de ventas para una cafetería universitaria. El programa debe presentar un menú para registrar ventas, mostrar estadísticas, mostrar los productos disponibles y salir del sistema. Para cada venta se registra el producto y la cantidad, se calcula el subtotal y se actualizan los contadores y acumuladores correspondientes.

## Análisis del problema

El problema plantea la necesidad de automatizar el registro y control de las ventas de una cafetería universitaria, evitando errores comunes como seleccionar un producto inexistente o ingresar una cantidad menor o igual a cero. Para resolverlo, el programa debe mostrar un menú principal que permita registrar una venta, consultar las estadísticas, mostrar los productos disponibles o finalizar el sistema. Al registrar una venta se debe solicitar el producto y validar que corresponda a una de las opciones disponibles. Luego se solicita la cantidad y se valida que sea mayor que cero. Con los datos válidos se obtiene el precio del producto y se calcula el subtotal multiplicando el precio por la cantidad. Durante el procesamiento se deben mantener contadores y acumuladores que se actualizan con cada venta. El contador de ventas permite conocer cuántas ventas se han realizado, mientras que el contador de productos permite conocer la cantidad total de productos vendidos. El acumulador permite obtener el total recaudado. Finalmente, el programa muestra las estadísticas solicitadas y permite consultar nuevamente el menú hasta seleccionar la opción de salir.

## Algoritmo

1. Inicio.
2. Inicializar totalRecaudado = 0, cantidadVentas = 0 y cantidadProductos = 0.
3. Mostrar el menú principal.
4. Leer la opción seleccionada.
5. Validar que la opción sea correcta.
6. Si selecciona registrar venta, mostrar los productos disponibles.
7. Solicitar el producto.
8. Validar el producto.
9. Solicitar la cantidad.
10. Validar que la cantidad sea mayor que cero.
11. Obtener el precio del producto.
12. Calcular el subtotal.
13. Actualizar los contadores y acumuladores.
14. Si selecciona estadísticas, mostrar los resultados.
15. Si selecciona productos, mostrar los productos disponibles.
16. Repetir hasta seleccionar salir.
17. Fin.

## Pseudocódigo (PSeInt)

```pseint
Algoritmo Control_Ventas_Cafeteria

    Definir opcion, producto, cantidad Como Entero
    Definir precio, subtotal, totalRecaudado Como Real
    Definir cantidadVentas, cantidadProductos Como Entero

    totalRecaudado <- 0
    cantidadVentas <- 0
    cantidadProductos <- 0

    Repetir

        Escribir "=============================="
        Escribir "     CAFETERIA UNIVERSITARIA"
        Escribir "=============================="
        Escribir "1. Registrar venta"
        Escribir "2. Mostrar estadisticas"
        Escribir "3. Mostrar productos"
        Escribir "4. Salir"
        Escribir "Seleccione una opcion:"
        Leer opcion

        Segun opcion Hacer

            1:
                Escribir "PRODUCTOS"
                Escribir "1. Cafe - $1.50"
                Escribir "2. Sandwich - $2.50"
                Escribir "3. Jugo - $1.00"
                Escribir "Seleccione el producto:"
                Leer producto

                Mientras producto < 1 O producto > 3 Hacer
                    Escribir "Producto no valido. Ingrese nuevamente:"
                    Leer producto
                FinMientras

                Escribir "Ingrese la cantidad:"
                Leer cantidad

                Mientras cantidad <= 0 Hacer
                    Escribir "Cantidad no valida. Ingrese nuevamente:"
                    Leer cantidad
                FinMientras

                Segun producto Hacer
                    1:
                        precio <- 1.50
                    2:
                        precio <- 2.50
                    3:
                        precio <- 1.00
                FinSegun

                subtotal <- precio * cantidad
                totalRecaudado <- totalRecaudado + subtotal
                cantidadVentas <- cantidadVentas + 1
                cantidadProductos <- cantidadProductos + cantidad

                Escribir "Venta registrada correctamente."
                Escribir "Subtotal: $", subtotal

            2:
                Escribir "Cantidad de ventas: ", cantidadVentas
                Escribir "Cantidad de productos vendidos: ", cantidadProductos
                Escribir "Total recaudado: $", totalRecaudado

            3:
                Escribir "PRODUCTOS DISPONIBLES"
                Escribir "1. Cafe - $1.50"
                Escribir "2. Sandwich - $2.50"
                Escribir "3. Jugo - $1.00"

            4:
                Escribir "Saliendo del sistema..."

            De Otro Modo:
                Escribir "Opcion no valida."

        FinSegun

    Hasta Que opcion = 4

    Escribir "Programa finalizado."

FinAlgoritmo
```

## Diagrama de flujo

<img width="1024" height="1536" alt="07" src="https://github.com/user-attachments/assets/964905d8-6fd9-4e6c-996a-6e0c0be20a7a" />

## Estructuras utilizadas

- **while**: utilizada para validar que el producto seleccionado sea válido y que la cantidad ingresada sea mayor que cero.
- **do-while**: utilizada para mantener activo el menú hasta seleccionar la opción de salida.
- **switch**: utilizada para seleccionar las opciones del menú y determinar el precio correspondiente al producto.
- **if / else**: utilizada para realizar las validaciones de los datos ingresados.
- **Contadores**: utilizados para conocer la cantidad de ventas realizadas y la cantidad de productos vendidos.
- **Acumuladores**: utilizados para calcular el total recaudado.

## Casos de prueba

| # | Opción | Datos ingresados | Resultado esperado |
|---|---|---|---|
| 1 | Registrar venta | Producto: Café, Cantidad: 2 | Subtotal = $3.00, cantidad de ventas = 1, productos vendidos = 2, total recaudado = $3.00 |
| 2 | Registrar venta | Producto: Sandwich, Cantidad: 3 | Subtotal = $7.50, cantidad de ventas = 1, productos vendidos = 3, total recaudado = $7.50 |
| 3 | Registrar venta | Producto: Jugo, Cantidad: 4 | Subtotal = $4.00, cantidad de ventas = 1, productos vendidos = 4, total recaudado = $4.00 |
| 4 | Validación | Producto: 5 → Producto: 1, Cantidad: 2 | El programa rechaza el producto 5 y solicita nuevamente un producto válido. Luego registra la venta de 2 cafés por $3.00. |
| 5 | Validación | Producto: 2, Cantidad: 0 → 3 | El programa rechaza la cantidad 0 y solicita nuevamente hasta recibir una cantidad válida. Subtotal = $7.50. |

## Capturas o evidencias

<img width="312" height="386" alt="image" src="https://github.com/user-attachments/assets/a22c044f-6cd8-43e4-8c81-75e1ba18fc37" />
<img width="969" height="1007" alt="image" src="https://github.com/user-attachments/assets/40c6361a-1724-46ae-b868-11928c82bebe" />

## Conclusiones

- El uso de estructuras de repetición permitió mantener activo el menú de la cafetería hasta que el usuario seleccionó la opción de salida.
- Las validaciones permitieron evitar el ingreso de productos y cantidades incorrectas.
- Los contadores y acumuladores permitieron obtener las estadísticas de las ventas realizadas.
- La estructura `switch` permitió organizar las diferentes opciones del menú y determinar los precios de los productos.
- El programa permitió aplicar estructuras de repetición y selección para resolver el problema de control de ventas de una cafetería.
