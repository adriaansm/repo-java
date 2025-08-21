package Exercises;

public class MyOwnExercises {
    public static void main(String[] args) {
        // Carta de presentación
        var name = "Jesús Adrián";
        var age = 17;
        var career = "Ingenieria informatica";
        var university = "UAO";

        System.out.println("***********************\n" + "*Tarjeta Personal  *\n" + "***********************" );
        System.out.println("Nombre: %s\nEdad: %d\nCarrera: %s\nUniversidad: %s".formatted(name,age,career,university));

        // Analizador de palabras 

        var word = "Aprendizaje";
        System.out.println("Palabra: " + word);
        System.out.println("Longitud: " + word.length());
        System.out.println("Primera letra: " + word.charAt(0));
        System.out.println("Última letra: " + word.charAt(word.length() -1));
        System.out.println("Subcadena: " + word.substring(0, 6));
        System.out.println("Mayusculas: " + word.toUpperCase());
        System.out.println("Contiene 'dizaje'?: " + word.contains("dizaje"));


    }
}
