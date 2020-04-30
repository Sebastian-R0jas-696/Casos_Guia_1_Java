import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, sumatoria;
		System.out.print("Ingrese numero: ");
		n1 = sc.nextInt();
		
		sumatoria = ((n1 * (n1 + 1)) / 2);
		System.out.println("Resultados");
		System.out.println("Sumatoria: " + sumatoria);

	}

}
