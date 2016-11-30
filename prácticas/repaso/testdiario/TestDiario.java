import diario.dominio.Alimento;
import diario.dao.AlimentoAdmin;
import diario.InvalidFileNameException;
import java.util.Scanner;

public class TestDiario{
	public static void main(String args[]) {
		String respuesta = "y";
		do{
			AlimentoAdmin aa = new AlimentoAdmin();
	
			System.out.println("Este es el catálogo de alimentos: ");
			try{
				String catalogo = aa.consultar(AlimentoAdmin.NOMBRE_ARCHIVO);
				System.out.println("***********************************************");
				System.out.println(catalogo);
				System.out.println("***********************************************");
			}catch(InvalidFileNameException ifne){
				System.out.println("El nombre del archivo es incorrecto!");
			}
			
			System.out.println("Agregando alimento =)....");
			
				
			Scanner in = new Scanner(System.in);
		
			System.out.print("Nombre de alimento: " );		
			String nombreAlimento = in.nextLine();

			System.out.print("Calorías: " );	
			int calorias = in.nextInt();
	
			System.out.print("Carbohidratos: " );	
			int carbohidratos = in.nextInt();
		
			Alimento alimento = new Alimento(nombreAlimento, calorias, carbohidratos);
			
			try{
				aa.guardar(AlimentoAdmin.NOMBRE_ARCHIVO, alimento.toString());
			}catch(InvalidFileNameException ifne){	
				System.out.println("No se pudo guardar la información, contacte al administrador :p");
			}
			in = new Scanner(System.in);

			System.out.println("Desea agregar otro alimento (y/n): ");
			respuesta = in.nextLine();	
		}while(respuesta.equals("y"));
	}
}