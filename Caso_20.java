import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Articulo = "";
		float cantidad, precio, venta, incremento;
		
		System.out.print("Nombre del articulo: ");
		Articulo = sc.nextLine();
		System.out.print("Ingrese cantidad: ");
		cantidad = sc.nextFloat();
		System.out.print("Ingrese precio: ");
		precio = sc.nextFloat();
		
		venta = cantidad * precio;
		incremento =(float)(venta + (venta * 0.45));
		
		System.out.println("Venta: " + venta);
		System.out.println("Mas el incremento seria un total de: " + incremento);
	}

}
