```Java
import java.util.Scanner;

public class Ejercicio7_ControlVentasCafeteria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int producto;
        int cantidad;

        double precio;
        double subtotal;
        double totalRecaudado = 0;

        int cantidadVentas = 0;
        int cantidadProductos = 0;

        do {

            System.out.println("==============================");
            System.out.println("     CAFETERIA UNIVERSITARIA");
            System.out.println("==============================");
            System.out.println("1. Registrar venta");
            System.out.println("2. Mostrar estadisticas");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("PRODUCTOS");
                    System.out.println("1. Cafe - $1.50");
                    System.out.println("2. Sandwich - $2.50");
                    System.out.println("3. Jugo - $1.00");
                    System.out.print("Seleccione el producto: ");

                    producto = entrada.nextInt();

                    while (producto < 1 || producto > 3) {

                        System.out.println(
                                "Producto no valido. Ingrese nuevamente:");

                        producto = entrada.nextInt();
                    }

                    System.out.print("Ingrese la cantidad: ");
                    cantidad = entrada.nextInt();

                    while (cantidad <= 0) {

                        System.out.println(
                                "Cantidad no valida. Ingrese nuevamente:");

                        cantidad = entrada.nextInt();
                    }

                    switch (producto) {

                        case 1:
                            precio = 1.50;
                            break;

                        case 2:
                            precio = 2.50;
                            break;

                        case 3:
                            precio = 1.00;
                            break;

                        default:
                            precio = 0;
                    }

                    subtotal = precio * cantidad;

                    totalRecaudado =
                            totalRecaudado + subtotal;

                    cantidadVentas =
                            cantidadVentas + 1;

                    cantidadProductos =
                            cantidadProductos + cantidad;

                    System.out.println(
                            "Venta registrada correctamente.");

                    System.out.printf(
                            "Subtotal: $%.2f%n", subtotal);

                    break;

                case 2:

                    System.out.println("ESTADISTICAS");

                    System.out.println(
                            "Cantidad de ventas: "
                            + cantidadVentas);

                    System.out.println(
                            "Cantidad de productos vendidos: "
                            + cantidadProductos);

                    System.out.printf(
                            "Total recaudado: $%.2f%n",
                            totalRecaudado);

                    break;

                case 3:

                    System.out.println(
                            "PRODUCTOS DISPONIBLES");

                    System.out.println(
                            "1. Cafe - $1.50");

                    System.out.println(
                            "2. Sandwich - $2.50");

                    System.out.println(
                            "3. Jugo - $1.00");

                    break;

                case 4:

                    System.out.println(
                            "Saliendo del sistema...");

                    break;

                default:

                    System.out.println(
                            "Opcion no valida.");
            }

        } while (opcion != 4);

        System.out.println(
                "Programa finalizado.");

        entrada.close();
    }
}
```
