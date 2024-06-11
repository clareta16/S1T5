package n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static n1exercici3.DirectoryTreeModified.buscarDinsDirectori;

public class Main3 {
    public static void main(String[] args) {
        File ruta = new File("/Users/clara/IdeaProjects/S1T5/Directoris");
        File rutaFinal= new File("/Users/clara/IdeaProjects/S1T5/Directoris/resultats.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(rutaFinal))) {
          //  PrintWriter per escriure text en un fitxer
            // FileWriter per crear un printwriter que escrigui el fitxer concret

            buscarDinsDirectori(ruta, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
