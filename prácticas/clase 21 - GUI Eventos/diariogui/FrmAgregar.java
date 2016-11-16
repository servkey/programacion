package diariogui;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import diarioejercicio.Persona;

public class FrmAgregar extends FrmBase{
	private JLabel lblNombre;
	private JLabel lblApellidoPaterno;
	private JTextField txtNombre;
	private JTextField txtApellidoPaterno;
	private JButton btnGuardar;
	private JButton btnCerrar;

	public FrmAgregar(){
		super("Agregar persona");
		inicializar();
		configurar();
		agregarComponentes();
		agregarEventos();
	}
			

	public void inicializar(){
		lblNombre = new JLabel("Nombre");
		lblApellidoPaterno = new JLabel("Apellido paterno");
		txtNombre = new JTextField();
		txtApellidoPaterno = new JTextField();
		btnGuardar = new JButton("Guardar");
		btnCerrar = new JButton("Cerrar");
	}

	public void configurar(){
		setLayout(new GridLayout(3, 2));
		setSize(400, 200);
	}

	public void agregarComponentes(){
		add(lblNombre);
		add(txtNombre);
		add(lblApellidoPaterno);
		add(txtApellidoPaterno);
		add(btnGuardar);
		add(btnCerrar);
	}

	public void agregarEventos(){
		//super.agregarEventos();
		//Agregar eventos particulares de la ventana

		btnGuardar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Persona p = new Persona(txtNombre.getText(), txtApellidoPaterno.getText());
				System.out.println(p);

				txtNombre.setText("");
				txtApellidoPaterno.setText("");

			}
		});
	}
}
