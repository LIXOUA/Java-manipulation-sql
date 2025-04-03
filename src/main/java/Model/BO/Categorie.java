package Model.BO;

public class Categorie {


    private int idCat;
    private String libCat;

    //Constructeur
    public Categorie(int idCat, String libCat) {
        this.idCat = idCat;
        this.libCat = libCat;
    }

    //Getter
    public String getLibCat() {
        return libCat;
    }

    public int getIdCat() {
        return idCat;
    }

//Setter
    public void setLibCat(String libCat) {
        this.libCat = libCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String toString(){
        return "Categorie{idCat : " + idCat + ", libCat : " + libCat + "}";
    }
}
