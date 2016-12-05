package diario.dao;
import diario.dominio.Alimento;
import java.io.File;
import diario.InvalidFileNameException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.StreamCorruptedException;

public class AlimentoAdmin{
	public static final String NOMBRE_ARCHIVO = "alimentos.txt";
	public static final String NOMBRE_ARCHIVO_BIN = "alimentos.bin";
	public static final int TAMANO_MAX = 30;

	public Alimento[] consultarObjetos(String arch) throws InvalidFileNameException{
		Alimento[] alimentos = new Alimento[AlimentoAdmin.TAMANO_MAX];
		try{
			if (!arch.equals("")){
				File f = new File(arch);
				FileInputStream fis = new FileInputStream(f);				
						
				for (int i = 0; i < AlimentoAdmin.TAMANO_MAX; i++){
					try{
						ObjectInputStream ois = new ObjectInputStream(fis);
						Object otmp = ois.readObject();
						if (otmp != null){ 
							alimentos[i] = (Alimento) otmp;
						}else{
							break;
						}						
					}catch(ClassNotFoundException e1){
						e1.printStackTrace();
						break;
					}catch(EOFException e2){
						//e2.printStackTrace();
						break;
					}catch(StreamCorruptedException e3){
						//e3.printStackTrace();
						break;
					}
				}
				//ois.close();
				fis.close();
			}else{
				throw new InvalidFileNameException();
			}
			
		}catch(IOException e)
		{
			System.err.println("Los objetos no pudieron ser leídos, consulte a su administrador!");
		}
		return alimentos;
	}

	public void guardar(String arch, Alimento alimento) throws InvalidFileNameException{
		try{
			if(!arch.equals("")){
				File f = new File(arch);
				FileOutputStream fos = new FileOutputStream(f, true);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(alimento);
				oos.close();
			}else{
				throw new InvalidFileNameException();
			}			

		}catch(IOException e){
			System.err.println("El objeto no pudo ser almacenado, consulte a su administrador!");
		}
 	}
	
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
			System.err.println("Ocurrió un error en la escritura");
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
			System.err.println("Ocurrió un error en la lectura");
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

