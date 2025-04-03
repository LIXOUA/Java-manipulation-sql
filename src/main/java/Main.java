import Model.BO.Categorie;
import Test.TestCategorie;
import Model.BO.Plat;
import Test.TestPlat;
import Test.TestCon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        TestCon testcon1 = new TestCon();
        testcon1.TestCon();


        System.out.println("\n Methode findAll : \n");
        TestCategorie testcategorie1 = new TestCategorie();
        testcategorie1.testCategorieFindAll();
        System.out.println("\n Methode find : \n");
        System.out.println("Quelle id afficher ? : ");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        testcategorie1.testCategorieFind(id);

        System.out.println("Inserer nouvel id dans la table ()? Entrer y pour oui ou n pour non");
        String yesorno = sc.nextLine();

        if (yesorno.equals("y")){
            System.out.println("\nChoisr un id ? (par défaut idCat : 99,libCat : Fromage) :");
            String yesorno4 = sc.nextLine();

            if (yesorno4.equals("y")) {
                System.out.println("\nEntrer un id ():");
                int un = Integer.parseInt(sc.nextLine());
                if (un != 0) {
                    System.out.println("\nEntrer un libellé :");
                    String deux = sc.nextLine();
                    if (deux != null) {
                        Categorie categoriec = new Categorie(un, deux);

                        testcategorie1.testCategorieCreate(categoriec);
                        System.out.println("\n Table Catégorie : \n");
                        testcategorie1.testCategorieFindAll();
                    }
                }
            }
            Categorie categoriec = new Categorie(99, "Fromage");
            testcategorie1.testCategorieCreate(categoriec);
            System.out.println("\n Table Catégorie : \n");
            testcategorie1.testCategorieFindAll();
        }
        Categorie categorie1 = new Categorie(99, "Fromage");
        System.out.println("\nModifier l'id 99 dans la table ?");
        String yesorno2 = sc.nextLine();
        if (yesorno2.equals("y")) {
            testcategorie1.testCategorieUpdate(categorie1);
            System.out.println("\n Table Catégorie : \n");
            testcategorie1.testCategorieFindAll();
        }
        System.out.println("\nSupprimer un élement dans la table ?");
        String yesorno3 = sc.nextLine();
        if (yesorno3.equals("y")) {
            testcategorie1.testCategorieDelete(categorie1);
            System.out.println("\n Table Catégorie : \n");
            testcategorie1.testCategorieFindAll();
        }
        //
/////////////////////
*/

        //
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTable Plat \n\n Methode findAll : \n");
        TestPlat testplat1 = new TestPlat();
        Plat plat1 = new Plat(99, "Plat de fromage", 4);
        testplat1.testPlatFindAll();
        System.out.println("\n Methode find : \n");
        System.out.println("Quelle id afficher ? : ");
        int idplat = Integer.parseInt(sc.nextLine());
        testplat1.testPlatFind(idplat);

        System.out.println("Inserer nouvel id dans la table ? Entrer y pour oui ou n pour non");
        Scanner scp = new Scanner(System.in);
        String yesornoplat = scp.nextLine();

        if (yesornoplat.equals("y")){
            System.out.println("\ninserer dans la table :");

            testplat1.testPlatCreate(plat1);
            System.out.println("\n Table Plats : \n");
            testplat1.testPlatFindAll();
        }
        System.out.println("\nModifier dans la table ?");
        String yesorno2plat = scp.nextLine();
        if (yesorno2plat.equals("y")) {
            testplat1.testPlatUpdate(plat1);
            System.out.println("\n Table Plats : \n");
            testplat1.testPlatFindAll();
        }
        System.out.println("\nSupprimer un élement dans la table ?");
        String yesorno3plat = scp.nextLine();
        if (yesorno3plat.equals("y")) {
            testplat1.testPlatDelete(plat1);
            System.out.println("\n Table Plat : \n");
            //testplat1.testPlatFindAll();
        }









    }
}