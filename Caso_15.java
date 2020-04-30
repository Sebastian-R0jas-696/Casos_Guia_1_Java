import java.util.Scanner;
import java.text.DecimalFormat;
//Creado por Sebastian Rojas
public class Caso_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		float cantidad, precio, importe, dolares, euros;
		
		System.out.print("Ingrese cantidad: ");
		cantidad = sc.nextFloat();
		System.out.print("Ingrese precio: ");
		precio = sc.nextFloat();
		
		importe = cantidad * precio;
		dolares = (float)(importe / 3.24);
		euros = (float)(importe / 3.75);
		
		System.out.println("Resultados");
		System.out.println("Importe: " + df.format(importe));
		System.out.println("Dolares: " + df.format(dolares));
		System.out.println("Euros: " + df.format(euros));
		

	}

}
