package fr.diginamic.factory;

public interface InterfaceElementFactory {
	
	Element getInstance(ElementType type, String name, double valeur, Unite unite);

}
