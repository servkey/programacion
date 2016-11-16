package diariogui;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public abstract class FrmBase extends JFrame{
	public FrmBase(String nombre){
		super(nombre);
	}		

	public abstract void inicializar();
	public abstract void configurar();
	public abstract void agregarComponentes();

	public void mostrar(){
		setVisible(true);
	}

	public void ocultar(){
		setVisible(false);
	}

	public void agregarEventos(){
		//Agregar evento a la venta
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});	
	}
}