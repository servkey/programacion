import java.io.*;
import java.util.Scanner;

public class LecturaTecladoScanner{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("\t***Opciones***");
		System.out.println("\t\t1. Opción 1");
		System.out.println("\t\t2. Opción 2");
		System.out.println("\t\t3. Opción 3");
		System.out.print("Escriba una opción:");

		int opcion = in.nextInt();	
		switch(opcion){		
			case 1:
				System.out.println("Opción 1 seleccionada");
				break;
			case 2:
				System.out.println("Opción 2 seleccionada");
				break;
			case 3:
				System.out.println("Opción 3 seleccionada");
				break;
			default:
				System.out.println("Opción Inválida");
	
		}
	}
}