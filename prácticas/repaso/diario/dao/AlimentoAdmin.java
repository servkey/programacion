package diario.dao;
import diario.dominio.Alimento;
import java.io.File;
import diario.InvalidFileNameException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class AlimentoAdmin{
	public static final String NOMBRE_ARCHIVO = "alimentos.txt";
	
	public void guardar(String arch, String texto) throws InvalidFileNameException{
		PrintWriter out = null;
		try{
			if (!arch.equals("")){
				File f = new File(arch);
				FileOutputStream fos = new FileOutputStream(f, true);
				out = new PrintWriter(fos);
				out.println(texto);
			}else{
				throw new InvalidFileNameException();
			}
			
		}catch(IOException e){
			System.out.println("Ocurrió un error en la escritura");
		}finally{
			if (out != null){
				out.close();
			}
		}	
	}

	public void agregar(Alimento alimento){
		
	}	

	public void eliminar(Alimento alimento){
		
	}


	public String consultar(String arch) throws InvalidFileNameException{
		String resultado = "";
		BufferedReader br = null;
		try{
			if (!arch.equals("")){
				File f = new File(arch);
				FileInputStream fis = new FileInputStream(f);
				InputStreamReader isr = new InputStreamReader(fis);
				br = new BufferedReader(isr);

				String linea = br.readLine();
				resultado = linea;
				while(linea != null){					
					linea = br.readLine();
					resultado += "\n" + (linea != null ? linea : "\n");
				}
		
			}else{
				throw new InvalidFileNameException();
			}
			
		}catch(IOException e){
			System.out.println("Ocurrió un error en la lectura");
		}finally{
			if (br != null){
				try{
					br.close();
				}catch(IOException ebr){
				
				}
			}
		}	

		return resultado;
	}

}

