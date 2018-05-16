import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class PeliculaAD{
	public void guardar(String na, String texto) throws FileNotFoundException, NombreArchivoInvalidoException{
		if ( na != null && !na.equals("")){
			File f = new File(na);
			FileOutputStream fos = new FileOutputStream(f, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter out = new PrintWriter(bw);
			out.println(texto);
			out.close();
		}else{
			throw new NombreArchivoInvalidoException();
		}
	}


	public void guardar(String na, Pelicula p) throws FileNotFoundException, NombreArchivoInvalidoException{
		if ( na != null && !na.equals("")){
			File f = new File(na);
			FileOutputStream fos = new FileOutputStream(f, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter out = new PrintWriter(bw);
			out.println(p.toString());
			out.close();
		}else{
			throw new NombreArchivoInvalidoException();
		}
	}
}