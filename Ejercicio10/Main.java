import java.util.Scanner;

public class SistemaParqueadero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Variables principales
        int opcion, tipo, rol, horas, dia, boletoPerdido;
        double tarifa = 0.0, pago = 0.0, totalRecaudado = 0.0;
        int vehiculosRegistrados = 0, totalHoras = 0;
        double mayorValor = 0.0, menorValor = 0.0;
        
        // Arreglos (Java inicia los arreglos numéricos automáticamente en 0)
        // Usamos tamaño 4 para mantener la lógica de índices 1, 2 y 3 de tu diseño original
        int[] cantidadTipo = new int[4]; 
        int[] cantidadRol = new int[4];
        
        do {
            System.out.println("==================================");
            System.out.println("    PARQUEADERO UNIVERSITARIO");
            System.out.println("==================================");
            System.out.println("1. Registrar vehiculo");
            System.out.println("2. Mostrar vehiculos registrados");
            System.out.println("3. Mostrar estadisticas");
            System.out.println("4. Mostrar recaudacion");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\nTIPO DE VEHICULO");
                    System.out.println("1. Automovil");
                    System.out.println("2. Motocicleta");
                    System.out.println("3. Bicicleta");
                    System.out.print("Seleccione el tipo: ");
                    tipo = teclado.nextInt();
                    while (tipo < 1 || tipo > 3) {
                        System.out.print("Tipo no valido. Ingrese nuevamente: ");
                        tipo = teclado.nextInt();
                    }
                    
                    System.out.println("\nROL");
                    System.out.println("1. Estudiante");
                    System.out.println("2. Docente");
                    System.out.println("3. Visitante");
                    System.out.print("Seleccione el rol: ");
                    rol = teclado.nextInt();
                    while (rol < 1 || rol > 3) {
                        System.out.print("Rol no valido. Ingrese nuevamente: ");
                        rol = teclado.nextInt();
                    }
                    
                    System.out.print("\nIngrese el numero de horas: ");
                    horas = teclado.nextInt();
                    while (horas <= 0) {
                        System.out.print("Horas no validas. Ingrese nuevamente: ");
                        horas = teclado.nextInt();
                    }
                    
                    System.out.print("Ingrese el dia de la semana (1-7): ");
                    dia = teclado.nextInt();
                    while (dia < 1 || dia > 7) {
                        System.out.print("Dia no valido. Ingrese nuevamente: ");
                        dia = teclado.nextInt();
                    }
                    
                    System.out.println("\n¿Boleto perdido?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.print("Seleccione una opcion: ");
                    boletoPerdido = teclado.nextInt();
                    while (boletoPerdido < 1 || boletoPerdido > 2) {
                        System.out.print("Opcion no valida. Ingrese nuevamente: ");
                        boletoPerdido = teclado.nextInt();
                    }
                    
                    // Asignación de tarifas según tipo y rol
                    switch (tipo) {
                        case 1: // Automóvil
                            switch (rol) {
                                case 1 -> tarifa = 0.50;
                                case 2 -> tarifa = 0.75;
                                case 3 -> tarifa = 1.00;
                            }
                            break;
                        case 2: // Motocicleta
                            switch (rol) {
                                case 1 -> tarifa = 0.75;
                                case 2 -> tarifa = 1.00;
                                case 3 -> tarifa = 1.25;
                            }
                            break;
                        case 3: // Bicicleta
                            switch (rol) {
                                case 1 -> tarifa = 1.00;
                                case 2 -> tarifa = 1.25;
                                case 3 -> tarifa = 1.50;
                            }
                            break;
                    }
                    
                    pago = tarifa * horas;
                    
                    if (boletoPerdido == 1) {
                        pago += 5.0;
                    }
                    
                    // Acumuladores e incrementos
                    vehiculosRegistrados++;
                    totalHoras += horas;
                    totalRecaudado += pago;
                    cantidadTipo[tipo]++;
                    cantidadRol[rol]++;
                    
                    // Control de máximos y mínimos
                    if (pago > mayorValor) {
                        mayorValor = pago;
                    }
                    
                    if (vehiculosRegistrados == 1) {
                        menorValor = pago;
                    } else if (pago < menorValor) {
                        menorValor = pago;
                    }
                    
                    System.out.println("\nVehiculo registrado correctamente.");
                    System.out.printf("Valor a pagar: $%.2f\n\n", pago);
                    break;
                    
                case 2:
                    System.out.println("\nVEHICULOS REGISTRADOS");
                    System.out.println("Total de vehiculos: " + vehiculosRegistrados);
                    System.out.println("Automoviles: " + cantidadTipo[1]);
                    System.out.println("Motocicletas: " + cantidadTipo[2]);
                    System.out.println("Bicicletas: " + cantidadTipo[3]);
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.println("\nESTADISTICAS");
                    System.out.println("Vehiculos registrados: " + vehiculosRegistrados);
                    System.out.println("Automoviles: " + cantidadTipo[1]);
                    System.out.println("Motocicletas: " + cantidadTipo[2]);
                    System.out.println("Bicicletas: " + cantidadTipo[3]);
                    System.out.println("Estudiantes: " + cantidadRol[1]);
                    System.out.println("Docentes: " + cantidadRol[2]);
                    System.out.println("Visitantes: " + cantidadRol[3]);
                    
                    if (vehiculosRegistrados > 0) {
                        System.out.println("Total de horas: " + totalHoras);
                        System.out.printf("Promedio de permanencia: %.2f horas\n", ((double) totalHoras / vehiculosRegistrados));
                        System.out.printf("Mayor valor pagado: $%.2f\n", mayorValor);
                        System.out.printf("Menor valor pagado: $%.2f\n", menorValor);
                    } else {
                        System.out.println("No existen vehiculos registrados.");
                    }
                    
                    System.out.println("\nRESUMEN POR TIPO Y ROL");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 3; j++) {
                            System.out.println("Tipo " + i + " - Rol " + j);
                        }
                    }
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println("\nRECAUDACION");
                    System.out.printf("Total recaudado: $%.2f\n\n", totalRecaudado);
                    break;
                    
                case 5:
                    System.out.println("\nSaliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("\nOpcion no valida.\n");
            }
        } while (opcion != 5);
        
        System.out.println("Programa finalizado.");
        teclado.close();
    }
}
