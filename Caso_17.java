import java.util.Scanner;
import java.text.DecimalFormat;
//Creado por Sebastian Rojas
public class Caso_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00"); 
		
		float aprobados, desaprobados, retirados, total;
		
		System.out.print("Numero de aprobados: ");
		aprobados = sc.nextFloat();
		System.out.print("Numero de desaprobados: ");
		desaprobados = sc.nextFloat();
		System.out.print("Numero de retirados: ");
		retirados = sc.nextFloat();
		
		float PA, PD, PR;
		total = aprobados + desaprobados + retirados;
		PA = (100 * aprobados) / total;
		PD = (100 * desaprobados) / total;
		PR = (100 * retirados) / total;
		System.out.println("Aprobados: " + df.format(PA) + "%");
		System.out.println("Desaprobados: " + df.format(PD) + "%");
		System.out.println("Retirados: " + df.format(PR) + "%");

	}

}
