import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Saldo inicial
        double saldo = 100.0;

        // Contadores
        int depositosRealizados = 0;
        int retirosRealizados = 0;

        // Acumuladores
        double totalDepositado = 0.0;
        double totalRetirado = 0.0;

        int opcion;

        do {
            System.out.println("\n==========================");
            System.out.println("     CAJERO ACADEMICO");
            System.out.println("==========================");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Mostrar movimientos");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    // Consultar saldo
                    System.out.println("\nSu saldo actual es: $" + saldo);
                    break;

                case 2:
                    // Depositar
                    System.out.print("\nIngrese el monto a depositar: $");
                    double deposito = sc.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        totalDepositado += deposito;
                        depositosRealizados++;

                        System.out.println("Deposito realizado correctamente.");
                        System.out.println("Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Error: no se permiten depositos negativos o iguales a cero.");
                    }
                    break;

                case 3:
                    // Retirar
                    System.out.print("\nIngrese el monto a retirar: $");
                    double retiro = sc.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("Error: no se permiten retiros negativos o iguales a cero.");
                    } else if (retiro > saldo) {
                        System.out.println("Error: no puede retirar mas dinero del disponible.");
                    } else {
                        saldo -= retiro;
                        totalRetirado += retiro;
                        retirosRealizados++;

                        System.out.println("Retiro realizado correctamente.");
                        System.out.println("Nuevo saldo: $" + saldo);
                    }
                    break;

                case 4:
                    // Mostrar movimientos
                    System.out.println("\n===== MOVIMIENTOS =====");
                    System.out.println("Depositos realizados: " + depositosRealizados);
                    System.out.println("Retiros realizados: " + retirosRealizados);
                    System.out.println("Total depositado: $" + totalDepositado);
                    System.out.println("Total retirado: $" + totalRetirado);
                    System.out.println("Saldo actual: $" + saldo);
                    break;

                case 5:
                    // Salir
                    System.out.println("\nSaliendo del cajero...");
                    break;

                default:
                    // Opcion inexistente
                    System.out.println("\nError: opcion inexistente.");
                    break;
            }

        } while (opcion != 5);

        // Resumen final
        System.out.println("\n==========================");
        System.out.println("      RESUMEN FINAL");
        System.out.println("==========================");
        System.out.println("Depositos realizados: " + depositosRealizados);
        System.out.println("Retiros realizados: " + retirosRealizados);
        System.out.println("Total depositado: $" + totalDepositado);
        System.out.println("Total retirado: $" + totalRetirado);
        System.out.println("Saldo final: $" + saldo);
        System.out.println("==========================");

        sc.close();
    }
}
