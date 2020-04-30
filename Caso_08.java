import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = 0;
		System.out.print("Ingrese el Lado del cuadrado: ");
		L = sc.nextInt();
		
		System.out.println("El Area del Cuadrado es: " + (L * L));
		System.out.println("El Perimetro del Cuadrado es : " + (L * 4));

	}

}
