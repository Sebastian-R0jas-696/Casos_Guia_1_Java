import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1 = 0, n2 = 0, promedio, incremento, descremento;
		
		System.out.println("Ingrese primer numero: ");
		n1 = sc.nextFloat();
		System.out.println("Ingrese segundo numero: ");
		n2 = sc.nextFloat();
		
		promedio = (n1 + n2) / 2;
		incremento = (float)(n1 + (n1 * 0.2));
		descremento = (float)(n2 - (n2 * 0.3));
		
		System.out.println("Resultados");
		System.out.println("Promedio: " + promedio);
		System.out.println("Incremento: " + incremento);
		System.out.println("Descremento: " + descremento);

	}

}
