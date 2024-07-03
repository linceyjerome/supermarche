import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // yes

        // Création d'un nouvel article
        Article article = new Article("PATATE001", "Patates blanche", 10.50, 100);

        ArrayList<Article> articleList = new ArrayList<>();

        articleList.add(new Article("VIANDE001","viande",15.00,50));
        articleList.add(new Article("LAIT001","lait",5.00,30));
        articleList.add(article);

        System.out.println("nous avions "+ articleList.size() + " articles disponibles");


        // Test des méthodes
        System.out.println(article.toString());
        article.approvisionner(50);
        System.out.println(article.toString());

        System.out.println("Calcul du prix TTC pour 5 articles:");
        double prixTTC = article.prixTTC(5);
        System.out.println("Prix TTC: " + prixTTC);

        System.out.println("Vente de 30 articles:");
        System.out.println("Entrer une quantité d'article que vous voulez");

        int qte = scanner.nextInt();
        boolean venteReussie = article.vendre(qte);

        if (venteReussie) {
            System.out.println("Vente réussie");
        } else {
            System.out.println("Vente échouée");
        }

        System.out.println("Vente de 150 articles:");
        venteReussie = article.vendre(150);
        if (venteReussie) {
            System.out.println("Vente réussie");
        } else {
            System.out.println("Vente échouée");
        }


        for(Article a : articleList){
            a.prixTTC(20);
            a.approvisionner(30);
            a.vendre(20);
        }
    }

}