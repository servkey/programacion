package diariogui;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Principal extends FrmBase{
	private JButton btnAgregar;
	private JButton btnConsultar;
	private JButton btnSalir;

	public Principal(){
		super("Menú principal");
		inicializar();
		configurar();
		agregarComponentes();
		agregarEventos();	
	}

	public void inicializar(){
		//Creación de componentes
		btnAgregar = new JButton("Agregar persona");		
		btnConsultar = new JButton("Consultar personas");	
		btnSalir = new JButton("Salir");
	}	

	public void configurar(){
		setLayout(new GridLayout(3,1));
		setSize(200,200);
	}

	public void agregarComponentes(){
		add(btnAgregar);
		add(btnConsultar);
		add(btnSalir);
	}


	public void agregarEventos(){
		super.agregarEventos();
		//Agregar eventos particulares de la ventana

		btnAgregar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FrmAgregar frmAgregar = new FrmAgregar();
				frmAgregar.mostrar();
			}
		});

		btnSalir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
	}

	public static void main(String args[]){
		Principal frmPrincipal = new Principal();
		frmPrincipal.mostrar();		
	}
}