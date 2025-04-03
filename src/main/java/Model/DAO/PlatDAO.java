package Model.DAO;

import Model.BO.Plat;
import Test.TestPlat;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class PlatDAO extends DAO<Plat> {

    @Override
    public boolean create(Plat obj) {

        System.out.println(obj);
        String sql = "insert into plats (idPla, nomPla, prixPla)"
                + " values (?, ?, ?)";


        try (
                PreparedStatement stmt = connect.prepareStatement(sql)
        ) {
            stmt.setInt(1, obj.getidPla());   // Set ID at position 1
            stmt.setString(2, obj.getnomPla()); // Set name at position 2
            stmt.setFloat(3, obj.getprixPla()); // Set name at position 2
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
    public boolean delete(Plat obj) {
        String sql = "DELETE FROM plats WHERE idPla = (?);";
        TestPlat testPlat1 = new TestPlat();
        testPlat1.testPlatFindAll();
        System.out.println("Entrer l'id a supprimer");
        Scanner sc = new Scanner(System.in);
        int iddonné = Integer.parseInt(sc.nextLine());



        try (PreparedStatement stmt = connect.prepareStatement(sql)){
            stmt.setInt(1, iddonné);
            //System.out.println(sql);

            int lignesinser = stmt.executeUpdate();
            if (lignesinser > 0) {
                System.out.println("id supprimé insérée avec succès");
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
    public boolean update(Plat obj) {
        String sql = "UPDATE plats" +
                " SET nomPla = (?)\n" +
                "WHERE idPla = 11;";


        try (PreparedStatement stmt = connect.prepareStatement(sql)){
            stmt.setString(1, "plats de fromage de chèvre");
            //System.out.println(sql);

            int lignesinser = stmt.executeUpdate();
            if (lignesinser > 0) {
                System.out.println("tabkle insérée avec succès");
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
    public Plat find(int id) {
        Plat plat1 = new Plat(id, "test", 0);


        try (
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM plats WHERE idPla = " + id + ";");
        ) {
            //
            if (rs.next()) {

                Plat plat = new Plat(rs.getInt("idPla"), rs.getString("nomPla"), rs.getFloat("prixPla"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Plat> findAll() {
        Plat plat1 = new Plat(99, "test", 0 );
        ArrayList<Plat> liste = new ArrayList<Plat>();


        try (
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM plats;");
        ) {
            // iteration des resultats
            while (rs.next()) {

                Plat plat = new Plat(rs.getInt("idPla"), rs.getString("nomPla"), rs.getFloat("prixPla"));
System.out.println(plat);

                liste.add(plat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return liste;
    }
}
