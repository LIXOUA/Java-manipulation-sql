package Model.DAO;

import Model.BO.Categorie;
import Test.TestCategorie;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class CategorieDAO extends DAO<Categorie> {

    @Override
    public boolean create(Categorie obj) {

        System.out.println(obj);
        String sql = " insert into categorie (idCat, libCat)"
                + " values (?, ?)";


        try (
                PreparedStatement stmt = connect.prepareStatement(sql)
        ) {
            stmt.setInt(1, obj.getIdCat());   // Set ID at position 1
            stmt.setString(2, obj.getLibCat()); // Set name at position 2
            //System.out.println(sql);


            int lignesinser = stmt.executeUpdate();
            if (lignesinser > 0) {
                System.out.println("Catégorie insérée avec succès");
            } else  {
                System.out.println("Rien n'a été inséré");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(Categorie obj) {
        String sql = "DELETE FROM Categorie WHERE idCat = (?);";
        TestCategorie testcategorie1 = new TestCategorie();
        testcategorie1.testCategorieFindAll();
        System.out.println("Entrer l'id a supprimer");
        Scanner sc = new Scanner(System.in);
        int iddonné = Integer.parseInt(sc.nextLine());



        try (PreparedStatement stmt = connect.prepareStatement(sql)){
            stmt.setInt(1, iddonné);
            //System.out.println(sql);

            int lignesinser = stmt.executeUpdate();
            if (lignesinser > 0) {
                System.out.println("id supprimé avec succès");
            } else  {
                System.out.println("Rien n'a été modifié");
                return false;
            }

        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Categorie obj) {
        String sql = "UPDATE categorie" +
                " SET libCat = (?)\n" +
                "WHERE idCat = 99;";


        try (PreparedStatement stmt = connect.prepareStatement(sql)){
            stmt.setString(1, "Fromage de chèvre");
            //System.out.println(sql);

            int lignesinser = stmt.executeUpdate();
            if (lignesinser > 0) {
                System.out.println("Catégorie insérée avec succès");
            } else  {
                System.out.println("Rien n'a été modifié");
                return false;
            }

        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Categorie find(int id) {
        Categorie categorie1 = new Categorie(id, "");


        try (
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM categorie WHERE idCat = " + id + ";");
        ) {
            //
            if (rs.next()) {

                Categorie categorie = new Categorie(rs.getInt("idCat"), rs.getString("libCat"));


                System.out.println(categorie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Categorie> findAll() {
        Categorie categorie1 = new Categorie(1, "test");
        ArrayList<Categorie> liste = new ArrayList<Categorie>();


        try (
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM categorie;");
        ) {
            // iteration des resultats
            while (rs.next()) {

                Categorie categorie = new Categorie(rs.getInt("idCat"), rs.getString("libCat"));


                liste.add(categorie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return liste;
    }
}
