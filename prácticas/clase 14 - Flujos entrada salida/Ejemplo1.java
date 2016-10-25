import java.io.*;
public class Ejemplo1{
	public static void test(){ // throws FileNotFoundException{
		try{
			System.setErr(new PrintStream(new FileOutputStream("salida_error.txt")));
			System.setOut(new PrintStream(new FileOutputStream("salida_estandar.txt")));

			System.out.println("Buenos días =)");
			Object o = null;
			o.toString();
		}catch(NullPointerException e){
			System.err.println("Ocurrió un error..." + e);
		}catch(FileNotFoundException e1){
			
		}finally{
			System.out.println("En finally");
		}

	}

	public static void main(String args[]){
		//try{	
		test();
		//}catch(FileNotFoundException e){
		//}
		//throws FileNotFoundException
	}
}