package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionMySQL {


    static String url = "jdbc:mysql://localhost/restaurant";
    static String user = "root";
    static String pass = "";
    static Connection connect;




    //Constructeur
    public ConnexionMySQL(String url, String user, String pass, Connection connect) {
        this.url = url;
        this.user = user;
        this.pass = pass;
        this.connect = connect;

    }


//Setter

    public static void setUrl(String url) {
        ConnexionMySQL.url = url;
    }

    public static void setUser(String user) {
        ConnexionMySQL.user = user;
    }

    public static void setPass(String pass) {
        ConnexionMySQL.pass = pass;
    }

    public static void setConnect(Connection connect) {
        ConnexionMySQL.connect = connect;
    }


//Getter
    public static String getUrl() {
        return url;
    }

    public static String getPass() {
        return pass;
    }

    public static String getUser() {
        return user;
    }

    public static Connection getConnect() {
        return connect;
    }





    public static Connection getInstance(){

        if (connect ==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection(url,user,pass);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } return connect;
    }
    public static void main(String[] args){


    }
}
