import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1 = 0, n2 = 0, suma, resta, producto, division, resto_entero;
		
		System.out.print("Ingrese primer numero: ");
		n1 = sc.nextFloat();
		System.out.print("Ingrese segundo numero: ");
		n2 = sc.nextFloat();
		
		suma = n1 + n2;
		resta = n1 - n2;
		producto = n1 * n2;
		division = n1 / n2;
		resto_entero = n1 % n2;
		System.out.println("Resultados");
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicacion: " + producto);
		System.out.println("Division: " + division);
		System.out.println("Resto entero: " + resto_entero);

	}

}
