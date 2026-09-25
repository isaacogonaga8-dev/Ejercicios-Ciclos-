import java.util.Scanner;

public class Ejercicio9_EstadisticasEncuesta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int estudiantes;
        int edad;
        int semestre;
        int horas;

        int sumaEdades = 0;
        int sumaHoras = 0;
        int mayorHoras = 0;
        int estudiantesMenosDos = 0;

        int[] semestres = new int[11];

        System.out.print("Ingrese la cantidad de estudiantes: ");
        estudiantes = entrada.nextInt();

        for (int i = 1; i <= estudiantes; i++) {

            System.out.println("\nEstudiante " + i);

            System.out.print("Ingrese la edad: ");
            edad = entrada.nextInt();

            while (edad < 16 || edad > 80) {
                System.out.print("Edad no valida. Ingrese nuevamente: ");
                edad = entrada.nextInt();
            }

            System.out.print("Ingrese el semestre: ");
            semestre = entrada.nextInt();

            while (semestre < 1 || semestre > 10) {
                System.out.print(
                        "Semestre no valido. Ingrese nuevamente: ");
                semestre = entrada.nextInt();
            }

            System.out.print("Ingrese las horas de estudio por dia: ");
            horas = entrada.nextInt();

            while (horas < 0 || horas > 24) {
                System.out.print(
                        "Horas no validas. Ingrese nuevamente: ");
                horas = entrada.nextInt();
            }

            sumaEdades = sumaEdades + edad;
            sumaHoras = sumaHoras + horas;

            if (horas > mayorHoras) {
                mayorHoras = horas;
            }

            if (horas < 2) {
                estudiantesMenosDos = estudiantesMenosDos + 1;
            }

            semestres[semestre] = semestres[semestre] + 1;
        }

        double promedioEdad = (double) sumaEdades / estudiantes;
        double promedioHoras = (double) sumaHoras / estudiantes;

        System.out.println("\n==============================");
        System.out.println("       ESTADISTICAS");
        System.out.println("==============================");

        System.out.printf(
                "Edad promedio: %.2f%n", promedioEdad);

        System.out.printf(
                "Horas promedio de estudio: %.2f%n",
                promedioHoras);

        System.out.println(
                "Mayor cantidad de horas: " + mayorHoras);

        System.out.println(
                "Estudiantes que estudian menos de 2 horas: "
                + estudiantesMenosDos);

        System.out.println("\nESTUDIANTES POR SEMESTRE");

        for (int semestreActual = 1;
             semestreActual <= 10;
             semestreActual++) {

            System.out.println(
                    "Semestre " + semestreActual + ": "
                    + semestres[semestreActual] + " estudiantes");
        }

        entrada.close();
    }
}
