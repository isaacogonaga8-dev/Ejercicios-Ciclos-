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
                    
