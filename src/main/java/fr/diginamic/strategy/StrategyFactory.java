package fr.diginamic.strategy;

public class StrategyFactory {
	
	 public static IStrategy getStrategy(TypeDeTri type) {
	        switch (type) {
	            case BUBBLE:
	                return new ClassBubble();
	            case INSERTION:
	                return new ClassSelection();
	            case SELECTION:
	                return new ClassInsertion();
	            default:
	                throw new IllegalArgumentException("Type de tri non supporté.");
	        }
	    }

}
