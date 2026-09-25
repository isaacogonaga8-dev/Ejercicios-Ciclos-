import java.util.Scanner;

public class EstacionamientoUniversitario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tipo;
        int horas;
        int continuar;

        int motocicletas = 0;
        int automoviles = 0;
        int camionetas = 0;
        int totalVehiculos = 0;

        double tarifa = 0;
        double pago;
        double totalRecaudado = 0;
        double promedio;

        do {
            System.out.println("==============================");
            System.out.println(" ESTACIONAMIENTO UNIVERSITARIO");
            System.out.println("==============================");
            System.out.println("1. Motocicleta - $0.50 por hora");
            System.out.println("2. Automovil - $1.00 por hora");
            System.out.println("3. Camioneta - $1.50 por hora");
            System.out.print("Seleccione el tipo de vehiculo: ");

            tipo = entrada.nextInt();

            switch (tipo) {
                case 1:
                    tarifa = 0.50;
                    motocicletas++;
                    break;
                case 2:
                    tarifa = 1.00;
                    automoviles++;
                    break;
                case 3:
                    tarifa = 1.50;
                    camionetas++;
                    break;
                default:
                    tarifa = 0;
                    System.out.println("Tipo de vehiculo no valido.");
            }

            if (tarifa > 0) {
                do {
                    System.out.print("Ingrese las horas estacionado: ");
                    horas = entrada.nextInt();

                    if (horas <= 0) {
                        System.out.println("Las horas deben ser mayores que cero.");
                    }
                } while (horas <= 0);

                pago = tarifa * horas;
                totalRecaudado += pago;
                totalVehiculos++;

                System.out.println("Pago: $" + pago);
            }

            System.out.println("Desea registrar otro vehiculo?");
            System.out.println("1. Si");
            System.out.println("0. No");
            continuar = entrada.nextInt();

        } while (continuar == 1);

        if (totalVehiculos > 0) {
            promedio = totalRecaudado / totalVehiculos;
        } else {
            promedio = 0;
        }

        System.out.println("==============================");
        System.out.println("          REPORTE");
        System.out.println("==============================");
        System.out.println("Motocicletas: " + motocicletas);
        System.out.println("Automoviles: " + automoviles);
        System.out.println("Camionetas: " + camionetas);
        System.out.println("Total vehiculos: " + totalVehiculos);
        System.out.printf("Total recaudado: $%.2f%n", totalRecaudado);
        System.out.printf("Promedio pagado: $%.2f%n", promedio);

        entrada.close();
    }
}
