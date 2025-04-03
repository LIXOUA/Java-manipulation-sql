package Test;

import Model.DAO.ConnexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCon {

    public void TestCon() {
        try{
            Connection connect = ConnexionMySQL.getInstance();
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e); }

    }

    public static void main(String[] args) {

    }
}