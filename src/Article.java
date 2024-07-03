public class Article {
    private String reference;
    private String nom;
    private double prixUnitaire;
    private  int qteStock ;


    public Article(String reference, String nom, double prixUnitaire, int qteStock) {
        this.reference = reference;
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.qteStock = qteStock;
    }

    public int getQteStock() {
        return qteStock;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public String getReference() {
        return reference;
    }

    // Méthode pour augmenter la quantité en stock
    public void approvisionner(int nbArticles) {
        this.qteStock += nbArticles;
        System.out.println("L'article " + this.getNom() + " a été approvisionné. Quantité en stock : " + this.qteStock);
    }

    // Méthode pour calculer le prix TTC (apres taxes)
    public double prixTTC(int quantiteVendue) {
        double prixTotalHT = prixUnitaire * quantiteVendue;
        double tauxTVA = 0.20; // taxes
        double prixTotalTTC = prixTotalHT + (prixTotalHT * tauxTVA);
        return prixTotalTTC;
    }


    public boolean vendre(int quantiteVendue) {
        if (qteStock >= quantiteVendue) {
            qteStock -= quantiteVendue;
            System.out.println("Vente réussi  " + quantiteVendue + " articles de " + nom + ". Quantité restante  : " + qteStock);
            return true;
        } else {
            System.out.println("Échec de la vente. Stock insuffisant.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Référence: " + reference + ", Nom: " + nom + ", Prix HT: " + prixUnitaire + ", Quantité en stock: " + qteStock;
    }
}
