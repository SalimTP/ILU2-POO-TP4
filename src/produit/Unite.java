package produit;

public enum Unite {
	LITRE("litre"),
	GRAMME("gramme"),
	KILOGRAMME("kilogramme"),
    CENTILITRE("centilitre"),
    MILLILITRE("millilitre"),
    PIECE("par pièce");
	
    private String nom=" ";
       
    private Unite(String chaine) {
        this.nom=chaine;
    }    
    
    public String toString() {
        return this.nom;
    }
}
