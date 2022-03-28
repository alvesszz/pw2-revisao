	
public class ExercicioDois {
	public static void main(String[] args) {
		int numeroA = 30;
		int numeroB = 45;
		int numeroC;
		
		numeroC = numeroA;
		numeroA = numeroB;
		numeroB = numeroC;
		System.out.println("Valor de a dps da troca: " + numeroA);
	    System.out.println("Valor de b dps da troca: " + numeroB);
	}	
}
