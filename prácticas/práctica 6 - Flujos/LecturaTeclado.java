import java.io.*;

public class LecturaTeclado{
	public static void main(String[] args) throws Exception{
		System.out.println("\t***Opciones***");
		System.out.println("\t\t1. Opción 1");
		System.out.println("\t\t2. Opción 2");
		System.out.println("\t\t3. Opción 3");
		
		System.out.print("Escriba una opción:");
		char lectura = (char)System.in.read();	
		if (lectura == '1'){
			System.out.println("Opción 1 seleccionada");
		}else if (lectura == '2'){
			System.out.println("Opción 2 seleccionada");
		}else if (lectura == '3'){
			System.out.println("Opción 3 seleccionada");
		}else{
			System.out.println("Opción Inválida");
		}
	}
}