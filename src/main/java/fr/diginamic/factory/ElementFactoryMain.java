package fr.diginamic.factory;

public class ElementFactoryMain {

	public static void main(String[] args) {
		
		InterfaceElementFactory factory = new ElementFactory();
		
		Element ingredient = factory.getInstance(ElementType.INGREDIENT, "curcuma", 2.0, Unite.MILLI_GRAMMES );
		
		System.out.println(ingredient);
		

	}

}
