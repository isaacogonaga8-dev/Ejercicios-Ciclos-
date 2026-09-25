import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tablaInicial, tablaFinal;

        System.out.print("Ingrese la tabla inicial: ");
        tablaInicial = sc.nextInt();

        System.out.print("Ingrese la tabla final: ");
        tablaFinal = sc.nextInt();

        while (tablaInicial > tablaFinal) {
            System.out.println("Error: la tabla inicial no puede ser mayor que la tabla final.");
            System.out.print("Ingrese la tabla inicial: ");
            tablaInicial = sc.nextInt();
            System.out.print("Ingrese la tabla final: ");
            tablaFinal = sc.nextInt();
        }

        int multiplicadorFinal;
        System.out.print("Ingrese hasta que multiplicador desea generar las tablas (ej. 10): ");
        multiplicadorFinal = sc.nextInt();

        while (multiplicadorFinal <= 0) {
            System.out.print("Valor invalido. El multiplicador debe ser mayor que cero. Ingrese nuevamente: ");
            multiplicadorFinal = sc.nextInt();
        }

        for (int tabla = tablaInicial; tabla <= tablaFinal; tabla++) {
            System.out.println("\nTABLA DEL " + tabla);
            for (int i = 1; i <= multiplicadorFinal; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
            }
        }

        sc.close();
    }
}
