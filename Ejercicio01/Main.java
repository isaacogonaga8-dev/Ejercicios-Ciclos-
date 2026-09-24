import java.util.Scanner;

public class CalificacionesControl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Ingrese el numero de estudiantes (N > 0): ");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.print("Valor invalido. N debe ser mayor que cero. Ingrese N nuevamente: ");
            n = sc.nextInt();
        }

        double suma = 0;
        int aprobados = 0;
        int reprobados = 0;
        double notaMasAlta = Double.NEGATIVE_INFINITY;
        double notaMasBaja = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            double nota;
            System.out.print("Ingrese la calificacion del estudiante " + i + " (0 - 10): ");
            nota = sc.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.print("Calificacion fuera de rango. Ingrese un valor entre 0 y 10: ");
                nota = sc.nextDouble();
            }

            suma += nota;

            if (nota >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }

            if (nota > notaMasAlta) {
                notaMasAlta = nota;
            }
            if (nota < notaMasBaja) {
                notaMasBaja = nota;
            }
        }

        double promedio = suma / n;

        System.out.println("\n----- RESULTADOS -----");
        System.out.println("Numero de estudiantes : " + n);
        System.out.println("Suma de calificaciones: " + suma);
        System.out.println("Promedio general      : " + promedio);
        System.out.println("Cantidad de aprobados : " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
        System.out.println("Nota mas alta          : " + notaMasAlta);
        System.out.println("Nota mas baja           : " + notaMasBaja);

        sc.close();
    }
}
