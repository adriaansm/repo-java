public class StringsProjects {
    public static void main(String[] args) {
        // Verificador de correo 
        var correo = "correoprueba@gmail.com";
        boolean contieneMarcado = correo.contains("@") && correo.contains(".");
        System.out.println("El correo contiene '@' y '.'? " + contieneMarcado);
        System.out.println("El dominio es: " + correo.substring(12,22));
        correo.replace(" ", ""); // Sacando los espacios (en caso de que se escriba con espacios)

        // Analizador de tickets

        var ticket = "Pelicula: Matrix - Sala 5 - Hora: 19:30";
        System.out.println("Cantidad de caracteres del ticket" + ticket.length());
        System.out.println("Nombre de la sala: " +  ticket.substring(19, 26));
        System.out.println("Contiene 'Matrix' ? " + ticket.contains("Matrix"));

    }
}