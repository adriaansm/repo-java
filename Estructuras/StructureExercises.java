package Estructuras;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;

public class StructureExercises {
    public static void main(String[] args) {
        // Creando un Array con 5 valores e imprimiento su longitud
        int[] lista = new int[5];
        System.out.println(lista.length);

        // Modificando uno de los valores del array y mostrando su resultado antes y despues
        System.out.println(lista[3]);
        lista[3] = 10;
        System.out.println(lista[3]);

        // Creando un ArrayList vacio
        var arrayVacio = new ArrayList<Integer>();

        arrayVacio.add(10);
        arrayVacio.add(20);
        arrayVacio.add(30);
        arrayVacio.add(40);
        System.out.println(arrayVacio); // Añadiendo 4 valores al ArrayList
        arrayVacio.remove(2); // Eliminando el 2 índice del ArrayList
        System.out.println(arrayVacio);

        // Creando un HashSet con 2 valores diferente
        var set = new HashSet<String>();
        set.add("Texto 1");
        set.add("Texto 2"); // 
        System.out.println(set);
        set.add("Texto 2"); // Añadiendo un valor repetido (No aparecerá por que no permite valores repetidos)
        set.add("Texto 3");
        System.out.println(set);
        set.remove("Texto 2"); // Elimando un elemento del HashSet
        System.out.println(set);

        // Añadiendo un HasMap simulando un agenda de codigos
        var contactos = new HashMap<String,Integer>();

        contactos.put("Carlos", 2345);
        contactos.put("Diana", 1135);
        contactos.put("Mariana", 2138);
        System.out.println(contactos);

        contactos.replace("Diana", 5677); // Modificando los valores (solo funciona si ya existe el key)
        contactos.remove("Mariana", 2138); // Elimnando el valor
        System.out.println(contactos);

        // Creando un Array, transformandolo en un ArrayList, y finalizandolo en un HashSet
        String[] arrayDeCadenas = {"Manzana","Pera","Durazno"};
        var arrayList = new ArrayList<String>();

        Collections.addAll(arrayList, arrayDeCadenas); // Se pasan los valores del array al ArrayList

        System.out.println(arrayList);

        HashSet<String> setCambiado = new HashSet<>(arrayList);
        System.out.println(setCambiado);




    }
}