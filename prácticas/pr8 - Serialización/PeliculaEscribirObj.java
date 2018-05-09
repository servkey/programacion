import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class PeliculaEscribirObj{
	public static void main(String args[]) throws IOException{
		File f = new File("peliculas.bin");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Pelicula p = new Pelicula("t1", "t2", "t3");
		
		oos.writeObject(p);
		oos.close();
	}
	
}