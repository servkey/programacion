package restaurante;
import java.util.Date;

public class Telefonica extends Orden{
	private String direccion;
	public Telefonica(Date fecha, String direccion){
		super(fecha);
		this.direccion = direccion;
	}
	
	public boolean solicitar(){
		System.out.println("Solicitando");
		return true;
	}
	
}