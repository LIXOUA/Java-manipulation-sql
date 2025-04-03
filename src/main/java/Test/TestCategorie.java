package Test;

import Model.BO.Categorie;
import Model.DAO.CategorieDAO;
import java.util.ArrayList;
import java.util.Scanner;


public class TestCategorie {

    public void testCategorieFindAll(){
        CategorieDAO categoriedao = new CategorieDAO();

        ArrayList<Categorie> categories = categoriedao.findAll();

        for (Categorie categorie : categories) {
            System.out.println(categorie);
        }
    }

    public void testCategorieFind(int id){
        CategorieDAO categoriedao1 = new CategorieDAO();
        categoriedao1.find(id);



    }

    public void testCategorieCreate(Categorie categorie_){
        CategorieDAO categoriedao1 = new CategorieDAO();
        categoriedao1.create(categorie_);
    }

    public void testCategorieUpdate(Categorie categorie_){
        CategorieDAO categoriedao1 = new CategorieDAO();
        categoriedao1.update(categorie_);
    }

    public void testCategorieDelete(Categorie categorie_){
        CategorieDAO categoriedao1 = new CategorieDAO();
        categoriedao1.delete(categorie_);
    }
}
