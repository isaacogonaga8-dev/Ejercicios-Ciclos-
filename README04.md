Ejercicio 4: Cajero Automático Básico

1. Objetivo
Diseñar e implementar un programa que simule un cajero automático académico, aplicando las estructuras de control do-while y switch, junto con el uso de contadores y acumuladores, para gestionar operaciones bancarias básicas (consulta de saldo, depósitos y retiros) validando los datos ingresados por el usuario.

2. Descripción del ejercicio
Se debe construir un menú interactivo llamado "Cajero Académico" con las siguientes opciones:
Consultar saldo
Depositar
Retirar
Mostrar movimientos
Salir


El usuario inicia con un saldo de $100. El programa debe permanecer activo hasta que se seleccione la opción Salir, validando que:

no se permitan depósitos negativos,

no se permitan retiros negativos,

no se permita retirar más dinero del disponible,

no se acepten opciones inexistentes del menú.

Al finalizar, debe mostrarse un resumen con: depósitos realizados, retiros realizados, total depositado, total retirado y saldo final.



3. Análisis del problema

   
Entradas: opción del menú (entero), monto a depositar o retirar (real).

Salidas: saldo actual, mensajes de validación, resumen final de movimientos.

Datos que se deben mantener durante la ejecución:

Variable	Tipo	Función


Saldo	Real: Almacena el saldo disponible (inicia en 100)

totalDepositado	Real:	Acumulador de todos los depósitos válidos


totalRetirado	Real	:Acumulador de todos los retiros válidos


depositosRealizados	Entero:	Contador de depósitos válidos


retirosRealizados	Entero	:Contador de retiros válidos

opcion	Entero:	Opción elegida en el menú

monto	Real:	Valor ingresado para depositar/retirar



Restricciones lógicas: 
El ciclo debe repetirse mientras la opción sea distinta de 5, y cada operación debe pasar por una validación antes de modificar el saldo.


4. Algoritmo
Inicializar saldo = 100, contadores y acumuladores en 0.
Repetir:
Mostrar el menú.

Leer la opción.
Según la opción:
1: mostrar saldo.

2: leer monto; si es ≤ 0, mostrar error; si no, sumar al saldo, actualizar acumulador y contador.

3: leer monto; si es ≤ 0, mostrar error; si es mayor al saldo, mostrar error de fondos insuficientes; si no, restar del saldo, actualizar acumulador y contador.

4: mostrar depósitos, retiros, totales y saldo.

5: finalizar.
Otro: mostrar mensaje de opción inválida.
Repetir el paso 2 hasta que la opción sea 5.
Mostrar resumen final.




6. Pseudocódigo (PSeInt)
Algoritmo CajeroAcademico
	Definir opcion, depositosRealizados, retirosRealizados Como Entero;
	Definir monto, saldo, totalDepositado, totalRetirado Como Real;

	saldo <- 100;
	totalDepositado <- 0;
	totalRetirado <- 0;
	depositosRealizados <- 0;
	retirosRealizados <- 0;

	Repetir
		Escribir "====================================";
		Escribir "         CAJERO ACADEMICO";
		Escribir "====================================";
		Escribir "1. Consultar saldo";
		Escribir "2. Depositar";
		Escribir "3. Retirar";
		Escribir "4. Mostrar movimientos";
		Escribir "5. Salir";
		Escribir "====================================";
		Escribir "Seleccione una opcion:";
		Leer opcion;

		Segun opcion Hacer
			1:
				Escribir "Su saldo actual es: $", saldo;
			2:
				Escribir "Ingrese el monto a depositar:";
				Leer monto;
				Si monto <= 0 Entonces
					Escribir "Error: no se permiten depositos negativos o en cero.";
				SiNo
					saldo <- saldo + monto;
					totalDepositado <- totalDepositado + monto;
					depositosRealizados <- depositosRealizados + 1;
					Escribir "Deposito exitoso. Nuevo saldo: $", saldo;
				FinSi
			3:
				Escribir "Ingrese el monto a retirar:";
				Leer monto;
				Si monto <= 0 Entonces
					Escribir "Error: no se permiten retiros negativos o en cero.";
				SiNo
					Si monto > saldo Entonces
						Escribir "Error: fondos insuficientes.";
					SiNo
						saldo <- saldo - monto;
						totalRetirado <- totalRetirado + monto;
						retirosRealizados <- retirosRealizados + 1;
						Escribir "Retiro exitoso. Nuevo saldo: $", saldo;
					FinSi
				FinSi
			4:
				Escribir "Depositos realizados: ", depositosRealizados;
				Escribir "Retiros realizados: ", retirosRealizados;
				Escribir "Total depositado: $", totalDepositado;
				Escribir "Total retirado: $", totalRetirado;
				Escribir "Saldo actual: $", saldo;
			5:
				Escribir "Gracias por usar el cajero academico.";
			De Otro Modo:
				Escribir "Opcion invalida. Intente nuevamente.";
		FinSegun
	Hasta Que opcion = 5

	Escribir "======= RESUMEN FINAL =======";
	Escribir "Depositos realizados: ", depositosRealizados;
	Escribir "Retiros realizados: ", retirosRealizados;
	Escribir "Total depositado: $", totalDepositado;
	Escribir "Total retirado: $", totalRetirado;
	Escribir "Saldo final: $", saldo;
FinAlgoritmo




7. DIAGRAMA DE FLUJO
<img width="2720" height="2472" alt="diagrama_flujo 4" src="https://github.com/user-attachments/assets/04f9b7f6-420b-40a6-9e50-104c87cc4dd5" />











ESTRUCTURAS UTILIZADAS
| Estructura                  | Uso en el programa                                                                                                                               |
| --------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| **`do-while`**              | Mantener el menú del cajero activo y repetirlo hasta que el usuario seleccione **5. Salir**.                                                     |
| **`switch`**                | Determinar qué operación ejecutar según la opción seleccionada por el usuario: consultar saldo, depositar, retirar, mostrar movimientos o salir. |
| **Contador de depósitos**   | Contar cuántos depósitos se han realizado durante la ejecución.                                                                                  |
| **Contador de retiros**     | Contar cuántos retiros se han realizado durante la ejecución.                                                                                    |
| **Acumulador de depósitos** | Guardar la suma total de dinero depositado.                                                                                                      |
| **Acumulador de retiros**   | Guardar la suma total de dinero retirado.                                                                                                        |
| **Variable saldo**          | Mantener y actualizar el saldo disponible. Comienza en **$100**.                                                                                 |
| **Condicional `if`**        | Validar que los depósitos/retiros sean positivos y que un retiro no supere el saldo disponible.                                                  |
| **Variables de entrada**    | Almacenar la opción del menú y los valores de depósitos o retiros.                                                                               |




CASOS DE PRUEBA

| N.º | Opción                 | Entrada                     | Resultado esperado                              | Validación                            |
| --: | ---------------------- | --------------------------- | ----------------------------------------------- | ------------------------------------- |
|   1 | 1. Consultar saldo     | —                           | Mostrar **Saldo: $100**                         | Correcto                              |
|   2 | 2. Depositar           | $50                         | Saldo pasa a **$150**                           | Depósito positivo aceptado            |
|   3 | 2. Depositar           | $0                          | Mostrar mensaje de error y mantener saldo       | No se acepta depósito no positivo     |
|   4 | 2. Depositar           | -$20                        | Mostrar mensaje de error y mantener saldo       | No se aceptan depósitos negativos     |
|   5 | 3. Retirar             | $30                         | Saldo pasa de $100 a **$70**                    | Retiro válido                         |
|   6 | 3. Retirar             | $0                          | Mostrar mensaje de error                        | No se acepta retiro no positivo       |
|   7 | 3. Retirar             | -$20                        | Mostrar mensaje de error                        | No se aceptan retiros negativos       |
|   8 | 3. Retirar             | $150                        | Mostrar que no hay saldo suficiente             | No permite retirar más del disponible |
|   9 | 4. Mostrar movimientos | —                           | Mostrar cantidad y totales de depósitos/retiros | Correcto                              |
|  10 | 6. Opción inexistente  | 6                           | Mostrar mensaje de opción inválida              | No se acepta opción inexistente       |
|  11 | 5. Salir               | —                           | Mostrar resumen final y terminar programa       | Finalización correcta                 |
|  12 | 2 → 3                  | Depositar $100, retirar $50 | Saldo final **$150**                            | Operaciones consecutivas correctas    |








CAPTURAS O EVIDENCIAS
<img width="822" height="875" alt="image" src="https://github.com/user-attachments/assets/45636781-6d74-4cf3-be90-258049749ab2" />







CONCLUSION
En conclusión, este ejercicio permitió aplicar estructuras fundamentales de programación como **`do-while`**, **`switch`**,
contadores y acumuladores para desarrollar un cajero automático funcional. Además, las validaciones permiten controlar correctamente los depósitos,
retiros y opciones ingresadas por el usuario. Con ello, se fortaleció la **lógica de programación, el manejo de datos y la creación de programas interactivos y confiables.








