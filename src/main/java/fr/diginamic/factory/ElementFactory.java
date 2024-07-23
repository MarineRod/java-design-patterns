package fr.diginamic.factory;

public class ElementFactory {
	public ElementFactory(ElementType type,  Double valeur, Unite unite) {
	
		 switch (type) {
         case INGREDIENT:
             return new Ingredient(name, unite);
         case ALLERGENE:
             return new Allergene(name, unite);
         case ADDITIF:
             return new Additif(name, unite);
}

	}