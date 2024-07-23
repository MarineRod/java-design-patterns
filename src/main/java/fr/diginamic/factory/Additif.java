package fr.diginamic.factory;

public class Additif extends Element {

	public Additif(String name, Double valeur, String unite) {
		super(name, valeur, unite);
		 System.out.println("Additif: " + name + ", Unité: " + unite);
	}
	

}
