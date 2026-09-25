# Ejercicio 10. Sistema integrador de parqueadero

## Integrantes

- Betancourt Steven
- Ogonaga Isaac
- Terán Julio

## Objetivo

Desarrollar un sistema de parqueadero universitario que permita registrar vehículos, controlar la información de los usuarios, calcular los valores a pagar y mostrar diferentes estadísticas utilizando estructuras de repetición, selección, contadores, acumuladores, validaciones y ciclos anidados.

## Descripción de los ejercicios

El ejercicio consiste en construir un sistema integrado para controlar un parqueadero universitario. El programa debe presentar un menú con diferentes opciones para registrar vehículos, mostrar los vehículos registrados, consultar estadísticas, mostrar la recaudación y salir del sistema. Para cada vehículo se debe registrar el tipo de vehículo, el rol de la persona, el número de horas, el día de la semana y si perdió el boleto. El programa debe aplicar las tarifas definidas y calcular el valor correspondiente. Finalmente, debe mostrar información sobre los vehículos registrados, cantidades por tipo y rol, total de horas, promedio de permanencia, total recaudado, mayor valor pagado y menor valor pagado.

## Análisis del problema

El problema plantea la necesidad de controlar las operaciones de un parqueadero universitario mediante un programa que permita registrar y consultar información de los vehículos. Primero se presenta un menú principal que permanece activo hasta seleccionar la opción de salir. Para registrar un vehículo se solicita el tipo, el rol, las horas de permanencia, el día y si existe un boleto perdido. Cada dato debe ser validado para evitar valores incorrectos. Luego se obtiene una tarifa dependiendo del tipo de vehículo y del rol, se calcula el valor a pagar y se actualizan los contadores y acumuladores. Los contadores permiten conocer la cantidad de vehículos registrados y las cantidades por tipo y rol, mientras que los acumuladores permiten obtener el total de horas y el total recaudado. También se comparan los valores pagados para determinar el mayor y el menor valor. Finalmente, se utilizan ciclos anidados para recorrer los diferentes tipos de vehículos y roles y mostrar un resumen.

## Algoritmo

1. Inicio.
2. Inicializar los contadores, acumuladores y arreglos.
3. Mostrar el menú principal.
4. Leer la opción seleccionada.
5. Validar la opción.
6. Si selecciona registrar vehículo, mostrar los tipos de vehículos.
7. Solicitar y validar el tipo de vehículo.
8. Solicitar y validar el rol.
9. Solicitar y validar el número de horas.
10. Solicitar y validar el día de la semana.
11. Solicitar y validar si perdió el boleto.
12. Obtener la tarifa correspondiente.
13. Calcular el valor a pagar.
14. Aplicar el valor adicional por boleto perdido cuando corresponda.
15. Actualizar los contadores y acumuladores.
16. Comparar el valor pagado para obtener el mayor y menor valor.
17. Si selecciona vehículos registrados, mostrar las cantidades por tipo.
18. Si selecciona estadísticas, mostrar las cantidades por tipo y rol, total de horas, promedio de permanencia, mayor y menor valor pagado.
19. Utilizar ciclos anidados para mostrar el resumen por tipo y rol.
20. Si selecciona recaudación, mostrar el total recaudado.
21. Repetir el menú hasta seleccionar la opción de salir.
22. Fin.

## Pseudocódigo (PSeInt)

```pseint
Algoritmo Sistema_Parqueadero
	Definir opcion, tipo, rol, horas, dia, boletoPerdido Como Entero
	Definir tarifa, pago, totalRecaudado Como Real
	Definir vehiculosRegistrados, totalHoras Como Entero
	Definir mayorValor, menorValor Como Real
	Definir i, j Como Entero
	
	// Definir y dimensionar los arreglos
	Definir cantidadTipo Como Entero
	Definir cantidadRol Como Entero
	Dimension cantidadTipo[4]
	Dimension cantidadRol[4]
	
	// Inicializar variables generales
	vehiculosRegistrados <- 0
	totalHoras <- 0
	totalRecaudado <- 0
	mayorValor <- 0
	menorValor <- 0
	
	// IMPORTANTE: Inicializar los arreglos en cero para evitar errores de ejecución
	Para i <- 1 Hasta 3 Hacer
		cantidadTipo[i] <- 0
		cantidadRol[i] <- 0
	FinPara
	
	Repetir
		Escribir "=================================="
		Escribir "    PARQUEADERO UNIVERSITARIO"
		Escribir "=================================="
		Escribir "1. Registrar vehiculo"
		Escribir "2. Mostrar vehiculos registrados"
		Escribir "3. Mostrar estadisticas"
		Escribir "4. Mostrar recaudacion"
		Escribir "5. Salir"
		Escribir "Seleccione una opcion:"
		Leer opcion
		
		Segun opcion Hacer
			1:
				Escribir "TIPO DE VEHICULO"
				Escribir "1. Automovil"
				Escribir "2. Motocicleta"
				Escribir "3. Bicicleta"
				Leer tipo
				Mientras tipo < 1 O tipo > 3 Hacer
					Escribir "Tipo no valido. Ingrese nuevamente:"
					Leer tipo
				FinMientras
				
				Escribir "ROL"
				Escribir "1. Estudiante"
				Escribir "2. Docente"
				Escribir "3. Visitante"
				Leer rol
				Mientras rol < 1 O rol > 3 Hacer
					Escribir "Rol no valido. Ingrese nuevamente:"
					Leer rol
				FinMientras
				
				Escribir "Ingrese el numero de horas:"
				Leer horas
				Mientras horas <= 0 Hacer
					Escribir "Horas no validas. Ingrese nuevamente:"
					Leer horas
				FinMientras
				
				Escribir "Ingrese el dia de la semana (1-7):"
				Leer dia
				Mientras dia < 1 O dia > 7 Hacer
					Escribir "Dia no valido. Ingrese nuevamente:"
					Leer dia
				FinMientras
				
				Escribir "Boleto perdido"
				Escribir "1. Si"
				Escribir "2. No"
				Leer boletoPerdido
				Mientras boletoPerdido < 1 O boletoPerdido > 2 Hacer
					Escribir "Opcion no valida. Ingrese nuevamente:"
					Leer boletoPerdido
				FinMientras
				
				// Asignación de tarifas según tipo y rol
				Segun tipo Hacer
					1:
						Segun rol Hacer
							1: tarifa <- 0.50
							2: tarifa <- 0.75
							3: tarifa <- 1.00
						FinSegun
					2:
						Segun rol Hacer
							1: tarifa <- 0.75
							2: tarifa <- 1.00
							3: tarifa <- 1.25
						FinSegun
					3:
						Segun rol Hacer
							1: tarifa <- 1.00
							2: tarifa <- 1.25
							3: tarifa <- 1.50
						FinSegun
				FinSegun
				
				pago <- tarifa * horas
				
				Si boletoPerdido = 1 Entonces
					pago <- pago + 5
				FinSi
				
				// Acumuladores e incrementos
				vehiculosRegistrados <- vehiculosRegistrados + 1
				totalHoras <- totalHoras + horas
				totalRecaudado <- totalRecaudado + pago
				cantidadTipo[tipo] <- cantidadTipo[tipo] + 1
				cantidadRol[rol] <- cantidadRol[rol] + 1
				
				// Control de máximos y mínimos
				Si pago > mayorValor Entonces
					mayorValor <- pago
				FinSi
				
				Si vehiculosRegistrados = 1 Entonces
					menorValor <- pago
				SiNo
					Si pago < menorValor Entonces
						menorValor <- pago
					FinSi
				FinSi
				
				Escribir "Vehiculo registrado correctamente."
				Escribir "Valor a pagar: $", pago
				
			2:
				Escribir "VEHICULOS REGISTRADOS"
				Escribir "Total de vehiculos: ", vehiculosRegistrados
				Escribir "Automoviles: ", cantidadTipo[1]
				Escribir "Motocicletas: ", cantidadTipo[2]
				Escribir "Bicicletas: ", cantidadTipo[3]
				
			3:
				Escribir "ESTADISTICAS"
				Escribir "Vehiculos registrados: ", vehiculosRegistrados
				Escribir "Automoviles: ", cantidadTipo[1]
				Escribir "Motocicletas: ", cantidadTipo[2]
				Escribir "Bicicletas: ", cantidadTipo[3]
				Escribir "Estudiantes: ", cantidadRol[1]
				Escribir "Docentes: ", cantidadRol[2]
				Escribir "Visitantes: ", cantidadRol[3]
				
				Si vehiculosRegistrados > 0 Entonces
					Escribir "Total de horas: ", totalHoras
					Escribir "Promedio de permanencia: ", totalHoras / vehiculosRegistrados
					Escribir "Mayor valor pagado: $", mayorValor
					Escribir "Menor valor pagado: $", menorValor
				SiNo
					Escribir "No existen vehiculos registrados."
				FinSi
				
				Escribir "RESUMEN POR TIPO Y ROL"
				Para i <- 1 Hasta 3 Hacer
					Para j <- 1 Hasta 3 Hacer
						Escribir "Tipo ", i, " - Rol ", j
					FinPara
				FinPara
				
			4:
				Escribir "RECAUDACION"
				Escribir "Total recaudado: $", totalRecaudado
				
			5:
				Escribir "Saliendo del sistema..."
				
			De Otro Modo:
				Escribir "Opcion no valida."
		FinSegun
		
	Hasta Que opcion = 5
	
	Escribir "Programa finalizado."
FinAlgoritmo
```

## Diagrama de flujo

<img width="1024" height="1536" alt="10" src="https://github.com/user-attachments/assets/15436993-8604-448a-8039-0f68ed705fb1" />

## Estructuras utilizadas

- **for**: utilizada para recorrer los tipos de vehículos y roles en el resumen de estadísticas.
- **while**: utilizada para validar el tipo de vehículo, rol, horas, día y boleto perdido.
- **do-while**: utilizada para mantener activo el menú principal hasta seleccionar la opción de salida.
- **switch**: utilizada para seleccionar las opciones del menú y determinar las tarifas según el tipo de vehículo y el rol.
- **Ciclos anidados**: utilizados para recorrer los diferentes tipos de vehículos y roles.
- **if / else**: utilizada para validar condiciones, aplicar el recargo por boleto perdido y determinar los valores mayor y menor.
- **Contadores**: utilizados para contar los vehículos registrados y las cantidades por tipo y rol.
- **Acumuladores**: utilizados para obtener el total de horas y el total recaudado.

## Casos de prueba

| # | Opción | Datos ingresados | Resultado esperado |
|---|---|---|---|
| 1 | Registrar vehículo | Automóvil, estudiante, 2 horas, lunes, boleto no perdido | Se registra el vehículo y se calcula un pago de $1.00. |
| 2 | Registrar vehículo | Motocicleta, docente, 3 horas, martes, boleto no perdido | Se registra el vehículo y se calcula un pago de $3.00. |
| 3 | Registrar vehículo | Bicicleta, visitante, 2 horas, viernes, boleto perdido | Se registra el vehículo y se calcula un pago de $8.00 incluyendo el recargo. |
| 4 | Validación | Tipo de vehículo: 5 | El programa rechaza el valor y solicita nuevamente un tipo válido. |
| 5 | Validación | Rol: 4 | El programa rechaza el valor y solicita nuevamente un rol válido. |
| 6 | Validación | Horas: 0 | El programa rechaza el valor y solicita nuevamente una cantidad de horas válida. |
| 7 | Estadísticas | 2 vehículos registrados | Se muestran vehículos registrados, cantidades por tipo y rol, total de horas y promedio de permanencia. |
| 8 | Recaudación | Vehículos registrados con pagos realizados | Se muestra el total recaudado correctamente. |

## Capturas o evidencias

<img width="358" height="642" alt="{67473D22-C48B-43AF-AE62-2A7CDE0D588C}" src="https://github.com/user-attachments/assets/20391cc8-7c9a-440e-84e1-a98a0fab05f4" />
<img width="1096" height="786" alt="{D106AE9D-E19E-452B-99BF-6D3F618317D9}" src="https://github.com/user-attachments/assets/237aa5ab-597c-46ab-ba7e-fbeeb2055e74" />

## Conclusiones

- Se desarrolló un sistema para registrar y controlar vehículos de un parqueadero universitario.
- Las validaciones permitieron evitar el ingreso de datos incorrectos.
- Los contadores permitieron obtener las cantidades de vehículos por tipo y por rol.
- Los acumuladores permitieron calcular el total de horas y la recaudación.
- Las estructuras `switch` permitieron organizar las opciones del menú y las tarifas.
- El uso de ciclos anidados permitió recorrer los tipos de vehículos y roles.
- El programa permitió aplicar diferentes estructuras de programación para resolver un problema completo de control de parqueadero.
