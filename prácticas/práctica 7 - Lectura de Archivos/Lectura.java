import java.io.*;
public class Lectura{
	public static void main(String args[]){
			System.out.println("Argumento Recibido:" + args[0]);
			System.out.println("Ejemplo de Lectura de un Archivo");
			System.out.println("*********************************************");
			try{
				BufferedReader reader = new BufferedReader(new FileReader(args[0])); 
				String linea = reader.readLine(); 
				while(linea != null) { 
					// Lectura de archivo 
					linea = reader.readLine();
					System.out.println("Línea: " + linea);
				} 
				reader.close();
			}/*catch(FileNotFoundException e){ 
				System.err.println("Archivo no econtrado!" + e);
				//No se encontró el archivo
			}*/catch(IOException e) {
				System.err.println("Error en la lecturade archivo: " + e);
			 	// Ocurrio un error al leer o cerrar el fichero 
			}

	}
}