import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float b = 0, a = 0, area;
		
		System.out.print("Ingrese la Base: ");
		b = sc.nextFloat();
		System.out.print("Ingrese la Altura: ");
		a = sc.nextFloat();
		
		area = (b * a) / 2;
		System.out.println("El area del triangulo es: " + area);
	}

}
