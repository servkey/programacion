import java.io.IOException;
public class Ejercicio2{

	public static void main(String args[]){
		try{
			System.out.println("Escriba 5 letras:");
 			byte[] bufferIn = new byte[5];
			System.in.read(bufferIn);

			for (int i = 0 ; i < bufferIn.length ; i++) {
				System.out.println("Escribiste: " + bufferIn[i]);
			}
		}catch(IOException e){
		}
	}
}
