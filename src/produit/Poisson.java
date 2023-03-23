package produit;

public class Poisson extends Produit {
    private String datePeche;
  
    public Poisson(String datePeche, String nom, Unite unite) {
		super(nom, unite);
		this.datePeche = datePeche;
	}

	public String Description() {
        return "poisson pêché " + datePeche + ".";
    }
}