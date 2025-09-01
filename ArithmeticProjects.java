public class ArithmeticProjects {
    public static void main(String[] args) {
    // Nivel bajo - Creando una calculadora que imprima operaciones aritmeticas con asignaciones 
    var x = 10;
    x += 5;
    System.out.println(x);
    x = 10;
    x -= 5;
    System.out.println(x);
    x = 10;
    x *= 5;
    System.out.println(x);
    x = 10;
    x /= 5;
    System.out.println(x);

    // Nivel intermedio - Verificador de edad 

    var edad = 17; 
    System.out.println("Su edad es de: %d".formatted(edad));
    System.out.println("Usted es un adulto mayor? " + (edad >= 18));
    System.out.println("Usted es mayor de edad pero menor de 65? " + (edad >= 18 && edad <= 65));
    System.out.println("Usted es un adulto mayor? " + (edad >= 65));

    // Nivel alto - Juego de adivinanza simple

    var numeroAzar = 7;
    var intentos = 3;
    var input = 2;

    var numeroMayor = numeroAzar > input;
    var numeroMenor = numeroAzar < input;
    var numeroIgual = numeroAzar == input;

    System.out.println("Su numero es " + input);

    System.out.println("El numero escogido es mayor al numero secreto? " + numeroMayor);
    intentos -= 1;
    System.out.println("El numero escogido es menor al numero secreto? " + numeroMenor + " Quedan %d intentos".formatted(intentos));
    intentos -= 1;
    System.out.println("El numero escogido es igual al numero secreto? " + numeroIgual + " Quedan %d intentos".formatted(intentos));
    intentos -= 1;
    System.out.println("El numero escogido es igual al numero secreto? " + numeroMenor + " Quedan %d intentos".formatted(intentos));


    





    



    }

    
}
