import java.util.Scanner;
//Creado por SEbastian Rojas
public class Caso_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float M1 = 0, M2 = 0, M3 = 0;
		System.out.print("Monto 1: $");
		M1 = sc.nextFloat();
		System.out.print("Monto 2: $");
		M2 = sc.nextFloat();
		System.out.print("Monto 3: $");
		M3 = sc.nextFloat();
		
		float rpt1 = 0, rpt2 = 0, rpt3 = 0;
		
		System.out.println("RESPUESTAS");
		System.out.println("==========");
		
		rpt1 = (float)(M1 / 5) + (float)(M2 * 0.2); 
		rpt2 = (float)(M3 +(M3 * 0.6)) / 2;
		rpt3 = (M1 + M2 + M3) - (float)(0.08 * (M1 + M2 + M3)) ;
		System.out.println("rpt1: $" + rpt1);
		System.out.println("rpt2: $" + rpt2);
		System.out.println("rpt3: $" + rpt3);


	}

}
