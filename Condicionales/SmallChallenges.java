package Condicionales;

public class SmallChallenges {
    public static void main(String[] args) {
        // Verificador si un usuario puede votar 1
        var edadVotar = 19;

        if (edadVotar >= 18) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar");
        }

        // Declarando dos numeros y viendo cual es mayor, menor o iguales

        var numberA = 7;
        var numberB = 7;

        if (numberA > numberB ) {
            System.out.println("El numero 'A' %d es mayor que el numero 'B' %d".formatted(numberA,numberB));
        }   else if (numberB > numberA) {
            System.out.println("El numero 'B' %d es mayor que el numero 'A' %d".formatted(numberB,numberA));
        } else if (numberA == numberB) {
            System.out.println("Ambos numeros son iguales");
        }

        // Verificando si un numero es positivo, negativo o 0

        var numero1 = 2;

        System.out.println("El numero es %d, entonces".formatted(numero1));

        if (numero1 > 0) {
            System.out.println("El numero es positivo");
        }   else if (numero1 < 0) {
            System.out.println("El numero es negativo");
        } else if (numero1 == 0) {
            System.out.println("El numero es 0");
        }

        // Verificando si un numero es par o impar

        var numeroVerificador = 3;
        var divisorPar = 2;
        var residuo = numeroVerificador % divisorPar;
        
        if (residuo == 0) { 
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        // Verifica si un numero está en el rango de 1 a 100
        var numero = -1;

        if (numero >= 1  && numero <= 100) {
            System.out.println("El numero se encuentra dentro del rango");
        } else {
            System.out.println("El numero no se encuentra dentro del rango");
        }

        // Crea una variable con un día de la semana (del 1 al 7) y usa un switch para imprimir el nombre del día.

        var dia = 7;

        switch(dia) {
            case 1:
                System.out.println(" La variable es: Lunes");
                break;
            case 2:
                System.out.println("La variable es: Martes");
                break;
            case 3:
                System.out.println("La variable es: Miercoles");
                break;
            case 4:
                System.out.println("La variable es: Jueves");
                break;
            case 5:
                System.out.println("La variable es: Viernes");
                break;
            case 6:
                System.out.println("La variable es: Sabado");
                break;
            case 7:
                System.out.println("La variable es: Domingo");
                break;
        }

        // Simulador de notas

        var nota = 5;

        if (nota == 5) {
            System.out.println("Sobresaliente");
        }   else if (nota >= 3) {
            System.out.println("Aprobado");
        }   else {
            System.out.println("Suspendido");
        }

        // Requsitos para ir al cine
        var edadCine = 10;
        boolean acompañante = false;

        if (edadCine >= 15 || acompañante == true) {
            System.out.println("Entrada al cine permitida.");
        }   else {
            System.out.println("Entrada denegada");
        }

        // Sistema que permite reconocer entre vocal y consonante
        var letra = 'a';

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Es vocal");
        } else {
            System.out.println("No es vocal");
        }

        // Mostrando 3 variables y viendo cual es mayor
        var a = 11;
        var b = 11;
        var c = 11;

        if (a > b && b > c) {
            System.out.println("El %d es mayor".formatted(a));
        } else if (b > a && b > c) {
            System.out.println("El %d es mayor".formatted(b));
        } else if (c > a && c > b) {
            System.out.println("El %d es mayor".formatted(c));
        } else {
            System.out.println("Todos los numeros son iguales");
        }



        
    }
}
