import java.util.Scanner;

public class SerieNumerosPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Ingrese N (numero entero positivo): ");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.print("Valor invalido. N debe ser un entero positivo. Ingrese N nuevamente: ");
            n = sc.nextInt();
        }

        int contador = 0;
        int suma = 0;
        StringBuilder serie = new StringBuilder();

        for (int i = 2; i <= n; i += 2) {
            contador++;
            suma += i;
            serie.append(i).append(" ");
        }

        double promedio = (contador > 0) ? (double) suma / contador : 0;

        System.out.println("\nSerie:");
        if (contador > 0) {
            System.out.println(serie.toString().trim());
        } else {
            System.out.println("No existen numeros pares en el rango de 2 a " + n + ".");
        }

        System.out.println("\nCantidad de pares: " + contador);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

        sc.close();
    }
}
