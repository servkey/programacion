import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

public class FrmVentanaPrueba extends JFrame implements ActionListener{
	private JTextField txtTitulo;
	private JTextField txtDirector;
	private JTextField txtAnio;
	private JLabel lblTitulo;
	private JLabel lblDirector;
	private JLabel lblAnio;

	private JButton btnGuardar;
	private JButton btnCerrar;


	public void inicializar(){
		//Construir componentes
		lblTitulo = new JLabel("Titulo:");
		lblDirector = new JLabel("Director:");
		lblAnio = new JLabel("Año:");
		txtTitulo = new JTextField(20);
		txtDirector = new JTextField(20);
		txtAnio = new JTextField(20);
		btnGuardar = new JButton("Guardar");
		btnCerrar = new JButton("Cerrar");

		//Distribución de componentes en la ventana
		setLayout(new GridLayout(4, 2));
	}
	
	public void agregarComponentes(){
		//Agregar componentes a la venta
		add(lblTitulo);
		add(txtTitulo);
		add(lblDirector);
		add(txtDirector);
		add(lblAnio);
		add(txtAnio);
		add(btnGuardar);
		add(btnCerrar);
		pack();
	}

	public void agregarEventos(){
		//Agregar eventos al botón
		btnGuardar.addActionListener(this);
		btnCerrar.addActionListener(this);

	}

	public FrmVentanaPrueba(String titulo){
		super(titulo);
		inicializar();	
		agregarComponentes();
		agregarEventos();
		//Mostrar la ventana
		setVisible(true);
	}
	


	public void actionPerformed(ActionEvent e){
		//System.out.println("Clic en el botón: " + e.getActionCommand());


		if (e.getSource() == btnGuardar){
			String titulo = txtTitulo.getText();
			String director = txtDirector.getText();
			String anio = txtAnio.getText();
			Pelicula p = new Pelicula(titulo, director, anio);
			PeliculaAD ad = new PeliculaAD();
			try{
				ad.guardar("peliculas.txt", p);
				System.out.println("Se guardó correctamente la película");
			}catch(FileNotFoundException e1){
					
			}catch(NombreArchivoInvalidoException e1)
			{
			
			}
		}else if (e.getSource() == btnCerrar){
			System.out.println("Clic en cerrar");
			System.exit(0);
		}
	}

	
	public static void main(String args[]){
		FrmVentanaPrueba frm = new FrmVentanaPrueba("Registro película");
	}

}