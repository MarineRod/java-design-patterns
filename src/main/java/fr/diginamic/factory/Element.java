package fr.diginamic.factory;

public class Element {

	private String name;
	private double valeur;
	private Unite unite;
	
	
	public Element(String name, Double valeur, Unite unite) {
		super();
		this.name = name;
		this.valeur = valeur;
		this.unite = unite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public Unite getUnite() {
		return unite;
	}

	public void setUnite(Unite unite) {
		this.unite = unite;
	}

	@Override
	public String toString() {
		return "Element [name=" + name + ", valeur=" + valeur + ", unite=" + unite + "]";
	}
	

}
