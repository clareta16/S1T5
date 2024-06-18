package n1exercici5;



import java.io.*;

public class Directori {

        public static void serialitzarObjecte(Persona jo, String fitxer) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fitxer))){
                objectOutputStream.writeObject(jo);
                System.out.println("Objecte serialitzat a " + fitxer);

            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }

        public static Persona desserialitzarObjecte(String fitxer){
            Persona person = null;
            try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fitxer))){
                person = (Persona) objectInputStream.readObject();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
            return person;
        }
        //
    }
