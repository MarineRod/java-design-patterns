package fr.diginamic.strategy;

public class StrategyExec {
	private IStrategy iStrategy;
	
	public StrategyExec(TypeDeTri type) {
        this.iStrategy = StrategyFactory.getStrategy(type);
    }

	public void exec(int[] tableau) {
        iStrategy.trier(tableau);
    }
	public static void main(String[] args) {
		int[] tableau = {64, 34, 25, 12, 22, 11, 90};
		
		
		StrategyExec execution = new StrategyExec(TypeDeTri.BUBBLE);
		
		execution.exec(tableau);
		System.out.println("Tri à bulles: " + java.util.Arrays.toString(tableau));
		
		 
		execution = new StrategyExec(TypeDeTri.INSERTION);
		execution.exec(tableau);
	    System.out.println("Tri par insertion: " + java.util.Arrays.toString(tableau));

	    tableau = new int[]{64, 34, 25, 12, 22, 11, 90};
	    execution = new StrategyExec(TypeDeTri.SELECTION);
	    execution.exec(tableau);
	    System.out.println("Tri par sélection: " + java.util.Arrays.toString(tableau));
	}

}
