import java.util.Objects;

public class département {
    private int id ;

    private String nom ;
    private int nbemp ;

    public département(int id, int nbemp, String nom) {
        this.id = id;
        this.nbemp = nbemp;
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        département that = (département) o;
        return id == that.id && nbemp == that.nbemp && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, nbemp);
    }

    public département() {
    }

    public int getNbemp() {
        return nbemp;
    }

    public void setNbemp(int nbemp) {
        this.nbemp = nbemp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "département{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbemp=" + nbemp +
                '}';
    }
}