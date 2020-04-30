import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float H_T, T_H, sueldo, bono, total, dolares;
		System.out.print("Ingrese Horas trabajadas: ");
		H_T = sc.nextFloat();
		System.out.print("Ingrese Tarifa por hora: ");
		T_H = sc.nextFloat();
		
		sueldo = H_T * T_H;
		bono = (float)(sueldo * 0.05);
		total = sueldo + bono;
		dolares = (float)(total / 3.24);
		System.out.println("Resultados");
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Bono: " + bono);
		System.out.println("Total: " + total);
		System.out.println("Dolares: " + dolares);
		

	}

}
