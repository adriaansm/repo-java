package Funciones;

public class Functions {
    public static void main(String[] args) {
        
        helloPerson("Jesús");
        restaNumeros(2, 5);
        squareNumber(2);
        evenOdd(0);
        System.out.println(ageVerification(18));
        stringLenght("Hola, como estás");
    }

    // Haciendo un saludo dentro de una función
    public static void helloJava() {
        System.out.println("Bienvenido al mundo de java!");
    }

    // Haciendo un saludo dentro de una función con parámetros
    public static void helloPerson(String name) {
        System.out.println("Hola, como estás %s".formatted(name));
    }

    // Creando una función que devuelva la resta de 2 numeros
    public static int restaNumeros(int a, int b ) {
        var resta = a - b;
        System.out.println(resta);
        return resta;
    }

    // Creando una función que calcula el cuadrado de un numero
    public static void squareNumber(int a) {
        var exponente = a*a;
        System.out.println(exponente);
    }

    // Haciendo una función que diga si un numero es par o impar 
    public static void evenOdd(int n1) {
        if (n1%2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    // Haciendo una función que verifica si es mayor de edad y devuelve resultados booleanos
    public static boolean ageVerification(int edad) {

        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // Haciendo una función que tome una cadena y retorne una función
    public static String stringLenght(String frase) {
        var cleanFrase = frase.replace(" ", "");

        System.out.println(cleanFrase.length());
        return cleanFrase;
    }
}
