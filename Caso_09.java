import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L1 = 0, L2 = 0;
		System.out.print("Ingrese el Lado 1: ");
		L1 = sc.nextInt();
		System.out.print("Ingrese el Lado 2: ");
		L2 = sc.nextInt();
		
		System.out.println("El Area del Cuadrado es: " + (L1 * L2));
		System.out.println("El Perimetro del Cuadrado es : " + ((L1 + L2) * 2));

	}

}
