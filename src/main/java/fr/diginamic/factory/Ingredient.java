package fr.diginamic.factory;

public class Ingredient extends Element {

	public Ingredient(String name, Double valeur, String unite) {
		super(name, valeur, unite);
		 System.out.println("Ingrédient: " + name + ", Unité: " + unite);
	}

}
