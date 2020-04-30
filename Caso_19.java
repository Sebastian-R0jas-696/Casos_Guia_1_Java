import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado = 0, perimetro = 0;
		
		System.out.print("Ingrese el lado del triangulo: ");
		lado = sc.nextInt();
		
		perimetro = lado * 3;
		System.out.println("El perimetro de triangulo es : " + perimetro);

	}

}
