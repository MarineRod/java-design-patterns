package fr.diginamic.factory;

public class ElementFactory implements InterfaceElementFactory {
	public Element getInstance(ElementType type, String name, double valeur, Unite unite) {

		switch (type) {
		case INGREDIENT:
			return new Ingredient(name, valeur, unite);
		case ALLERGENE:
			return new Allergene(name, valeur, unite);
		case ADDITIF:
			return new Additif(name, valeur, unite);

		}
		return null;
	}
}