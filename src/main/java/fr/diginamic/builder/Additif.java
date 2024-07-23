package fr.diginamic.builder;

public class Additif {

	private String nom;
	private double qreMilligrammes;

	public Additif(String nom, double qreMilligrammes) {
		super();
		this.nom = nom;
		this.qreMilligrammes = qreMilligrammes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getQreMilligrammes() {
		return qreMilligrammes;
	}

	public void setQreMilligrammes(double qreMilligrammes) {
		this.qreMilligrammes = qreMilligrammes;
	}

}
