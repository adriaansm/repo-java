import java.util.Scanner;
import java.util.Arrays;

public class GeneralProjects {
    public static void main(String[] args) {

        mediaNotas();

    }

    // Función que calcula la fecha de nacimiento y dice la edad, verificando si es mayor o menor de edad
    public static int ageCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu fecha de nacimiento?");
        int nacimiento = sc.nextInt();
        sc.close();

        int edad = 2025 - nacimiento;
        
        if (edad >= 18 ) {
            System.out.println("Tienes %d años, eres mayor de edad".formatted(edad));
        } else {
            System.out.println("No eres mayor de edad, tu edad es de %d".formatted(edad));
        }

        return edad;
    }


    public static double mediaNotas () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu primera nota");
        double primeraNota = sc.nextDouble();
        System.out.println("Cual es tu segunda nota");
        double segundaNota = sc.nextDouble();
        System.out.println("Cual es tu tercera nota");
        double terceraNota = sc.nextDouble();
        sc.close();

        var notas = new double[3];
        notas[0] = primeraNota;
        notas[1] = segundaNota;
        notas[2] = terceraNota; 

        System.out.println("Tus notas: " + Arrays.toString(notas));
        double suma = 0;
        for ( double nota : notas ) {
            suma += nota;
        }

        var media = suma / notas.length;

        if (media >= 3.0) {
            System.out.println("Felicidades, su nota es de %f pasaste!".formatted(media));
        } else {
            System.out.println("Lo sentimos, tu nota fue de %f, no pasaste".formatted(media));
        }

        return media;
    }
}
