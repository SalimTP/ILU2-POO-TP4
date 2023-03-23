package produit;

public class Sanglier extends Produit {
    private String chasseur;
    private Double poids;

    public Sanglier(String chasseur, Double poids, String nom, Unite unite) {
		super(nom, unite);
		this.chasseur = chasseur;
		this.poids = poids;
	}

	public String Description() {
        return "sanglier de " + poids + " kg chassé par " + chasseur + ".";
    }
}
