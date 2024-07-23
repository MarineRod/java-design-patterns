package fr.diginamic.factory;

public class Allergene extends Element {

	public Allergene(String name, Double valeur, String unite) {
		super(name, valeur, unite);
		 System.out.println("Allergène: " + name + ", Unité: " + unite);
	}

}
