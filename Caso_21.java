import java.util.Scanner;
//Crado por Sebastian Rojas
public class Caso_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float costo, venta1, venta2, c1, p1, p2, ganancia;
		String producto;
		System.out.println("El comerciante 1 le vende un producto al comerciante 2");
		System.out.print("Nombre del Producto: ");
		producto = sc.nextLine();
		System.out.print("precio Base: ");
		p1 = sc.nextFloat();
		System.out.print("Cantidad: ");
		c1 =sc.nextFloat();
		venta1 = c1 * p1;
		System.out.println("Venta1: " + venta1);
		
		
		System.out.println("El comerciante 2 revende el producto");
		System.out.print("Nuevo precio: ");
		p2 = sc.nextFloat();
		
		venta2 = c1 * p2;
		System.out.println("Venta2: " + venta2);
		costo = venta2 - venta1;
		System.out.println("El costo del comerciante 2 fue de:" + costo);
		
		float descremento;
		descremento = (float)(costo - (costo * 0.12));
		System.out.println("El descremento del costo es de: " + descremento);

	}

}
