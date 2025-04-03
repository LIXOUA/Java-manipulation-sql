package Test;

import Model.BO.Plat;
import Model.BO.Plat;
import Model.BO.Plat;
import Model.BO.Plat;
import Model.BO.Plat;
import Model.BO.Plat;
import Model.BO.Plat;
//?????????????????????ntm
import Model.DAO.PlatDAO;
import java.util.ArrayList;
import java.util.Scanner;


public class TestPlat {

    public void testPlatFindAll(){
        PlatDAO platdao = new PlatDAO();

        ArrayList<Plat> plats = platdao.findAll();

        for (Plat plat : plats) {
            System.out.println(plat);
        }

    }


    public void testPlatFind(int id){
        PlatDAO platdao1 = new PlatDAO();
        platdao1.find(id);


        System.out.println(platdao1);

    }

    public void testPlatCreate(Plat plat_){
        PlatDAO platdao1 = new PlatDAO();
        platdao1.create(plat_);
    }

    public void testPlatUpdate(Plat plat_){
        PlatDAO platdao1 = new PlatDAO();
        platdao1.update(plat_);
    }

    public void testPlatDelete(Plat plat_){
        PlatDAO platdao1 = new PlatDAO();
        platdao1.delete(plat_);
    }
}
