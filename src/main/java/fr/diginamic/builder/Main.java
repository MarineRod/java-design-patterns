package fr.diginamic.builder;

public class Main {

	public static void main(String[] args) {
		
		Categorie categorie = new Categorie("Catégorie A");
        Ingredient ingredient = new Ingredient("banane", 100.0);
        Allergene allergene = new Allergene("fruits à coques", 5.0);
        Additif additif = new Additif("E55", 1.0);
        Marque marque = new Marque("Danone");
		
		Produit produitA = new ProduitBuilder()
	            .appendNom("Produit A")
	            .appendGrade("A+")
	            .appendCategorie(categorie)
	            .appendIngredient(ingredient)
	            .appendAllergene(allergene)
	            .appendAdditif(additif)
	            .appendMarque(marque)
	            .get();

		 System.out.println(produitA);
		
	}

}
