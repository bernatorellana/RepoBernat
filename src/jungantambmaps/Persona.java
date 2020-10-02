package jungantambmaps;

/**
 *
 * @author bernat
 */
public class Persona implements Comparable<Persona>{
    private int id;
    private String nom;

    public Persona(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int compareTo(Persona p) {
        return this.id - p.id;
        //return this.nom.compareTo(p.nom);
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nom=" + nom + '}';
    }
    
    
    
    
}
