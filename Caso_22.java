import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		
		System.out.print("Nombre del Alumno: ");
		String nombre = sc.nextLine();
		
		float n1 = 0, n2 = 0, n3 = 0, Pro;
		System.out.print("Nota1: ");
		n1 = sc.nextFloat();
		System.out.print("Nota2: ");
		n2 = sc.nextFloat();
		System.out.print("Nota3: ");
		n3 = sc.nextFloat();
		Pro = (float)(n1 * 0.2) + (float)(n2 * 0.3) + (float)(n3 * 0.5);
		System.out.println("Promedio: " + Pro);

	}

}
