import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float Pre = 0, C = 0;
		
		System.out.print("Nombre del Producto: ");
		String Pro = sc.nextLine();
		System.out.print("Precio: $");
		Pre = sc.nextFloat();
		System.out.print("Cantidad: ");
		C = sc.nextFloat();
		
		float Imp = 0, IGV = 0, Dsct = 0, To = 0;
		Imp = Pre * C;
		IGV = (float)(Imp * 0.18);
		Dsct = (float)(Imp * 0.03);
		To = (float)(Imp - (Dsct + IGV));
		System.out.println("Importe: $" + Imp);
		System.out.println("IGV: $" + IGV);
		System.out.println("Descuento: $" + Dsct);
		System.out.println("Total: $" + To);

	}

}
