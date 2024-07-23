package fr.diginamic.builder;

public class ProduitBuilder {

	private Produit produit;

	public ProduitBuilder() {
		this.produit = new Produit();

	}

    public ProduitBuilder appendNom(String nom) {
        produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendGrade(String grade) {
        produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder appendCategorie(Categorie categorie) {
        produit.setCategorie(categorie);
        return this;
    }

    public ProduitBuilder appendIngredient(Ingredient ingredient) {
        produit.setIngredient(ingredient);
        return this;
    }

    public ProduitBuilder appendAllergene(Allergene allergene) {
        produit.setAllergene(allergene);
        return this;
    }

    public ProduitBuilder appendAdditif(Additif additif) {
        produit.setAdditif(additif);
        return this;
    }
    
    public ProduitBuilder appendMarque(Marque marque) {
        produit.setMarque(marque);
        return this;
    }

    public Produit get() {
        return produit;
    }
}


