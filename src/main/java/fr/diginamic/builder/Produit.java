package fr.diginamic.builder;

public class Produit {

	private String nom;
	private String grade;
	private Categorie categorie;
	private Ingredient ingredient;
	private Allergene allergene;
	private Additif additif;
	private Marque marque;

	public Produit() {
		super();
	}

	public Produit(String nom, String grade, Categorie categorie, Ingredient ingredient, Allergene allergene,
			Additif additif, Marque marque) {
		super();
		this.nom = nom;
		this.grade = grade;
		this.categorie = categorie;
		this.ingredient = ingredient;
		this.allergene = allergene;
		this.additif = additif;
		this.marque = marque;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public Allergene getAllergene() {
		return allergene;
	}

	public void setAllergene(Allergene allergene) {
		this.allergene = allergene;
	}

	public Additif getAdditif() {
		return additif;
	}

	public void setAdditif(Additif additif) {
		this.additif = additif;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", grade=" + grade + ", categorie=" + categorie + ", ingredient=" + ingredient
				+ ", allergene=" + allergene + ", additif=" + additif + ", marque=" + marque + "]";
	}

}
