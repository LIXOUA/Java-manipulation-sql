package Model.BO;

public class Plat {


    private int idPla;
    private String nomPla;
    private float prixPla;

    //Constructeur
    public Plat(int idCat, String libCat, float prixPla) {
        this.idPla = idPla;
        this.nomPla = nomPla;
        this.prixPla = prixPla;
    }

    //Getter
    public int getidPla() {
        return idPla;
    }

    public String getnomPla() {
        return nomPla;
    }

    public float getprixPla() {
        return prixPla;
    }

    //Setter
    public void setidPla(int idPla) {
        this.idPla = idPla;
    }

    public void setnomPla(String nomPla) {
        this.nomPla = nomPla;
    }

    public void setprixPla(float prixPla) {
        this.prixPla = prixPla;
    }

    public String toString(){
        return "Plat{idPla : " + idPla + ", nomPla : " + nomPla + ", prixPla : " + prixPla + "}";
    }
}
