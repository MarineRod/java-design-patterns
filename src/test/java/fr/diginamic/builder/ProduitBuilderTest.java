package fr.diginamic.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProduitBuilderTest {

	@Test
	public void testCasNominal() {
		ProduitBuilder produitBuilder = new ProduitBuilder();
		
		Categorie categorie = new Categorie("Catégorie A");
		Ingredient ingredient = new Ingredient("Ingrédient X", 100.0);
		Allergene allergene = new Allergene("Allergène Y", 50.0);
		Additif additif = new Additif("Additif Z", 10.0);
		Marque marque = new Marque("Danone");

		Produit produit = produitBuilder.appendGrade("A+").appendNom("Curcuma").appendAdditif(additif).appendAllergene(allergene).appendCategorie(categorie).appendIngredient(ingredient).appendMarque(marque).get();

		assertEquals("Curcuma", produit.getNom(), "Curcuma");
		assertEquals("A+", produit.getGrade(), "A+");
		assertEquals(additif, produit.getAdditif() );
		assertEquals(allergene, produit.getAllergene() );
		assertEquals(categorie, produit.getCategorie());
		assertEquals(ingredient, produit.getIngredient());
		assertEquals(marque, produit.getMarque());
		
	}

	@Test
	public void testCasAlternatif() {
		ProduitBuilder produitBuilder = new ProduitBuilder();

		Produit produit = produitBuilder.appendGrade("").appendNom("").get();

		assertEquals("", produit.getNom(), "");
		assertEquals("", produit.getGrade(), "");
	}

}
