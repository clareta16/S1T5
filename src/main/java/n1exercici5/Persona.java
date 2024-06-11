package n1exercici5;

import java.io.Serializable;

public class Persona implements Serializable {
    private final String nom;
    private final String cognom;

    public Persona(String nom, String cognom) {
        this.nom = nom;
        this.cognom =cognom;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
