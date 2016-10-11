package restaurante;
import java.util.Date;

public class Presencial extends Orden{
	private int mesa;
	public Presencial(Date fecha, int mesa){
		super(fecha);
		this.mesa = mesa;
	}
	
	public boolean solicitar(){
		System.out.println("Solicitando presencial");
		return true;
	}
	
}