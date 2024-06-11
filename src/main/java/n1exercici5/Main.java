package n1exercici5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String path;

        if (args.length != 1) {
            System.out.println("Escriu el path del fitxer ");
            Scanner teclat = new Scanner(System.in);
            path = teclat.nextLine();
            Persona jo = new Persona("Clara", "Pagès");
            String serFitxer = "serializable.ser";

            Directori.serialitzarObjecte(jo, serFitxer);

            Persona personaDesserialitzat = (Persona) Directori.desserialitzarObjecte(serFitxer);
            System.out.println("Objecte desserialitzat correctament " + personaDesserialitzat);
        } else {
            path = args[0];


        }
    }
}



