import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import diario.dominio.Alimento;
import diario.dao.AlimentoAdmin;
import diario.InvalidFileNameException;
import javax.swing.JOptionPane;

public class FrmAlimentoConsulta extends JFrame implements IFrmBase{
	private JButton btnConsultar, btnCerrar;
	private JLabel lblNombre, lblCalorias, lblCarbohidratos;
	private JTextField txtCalorias, txtCarbohidratos;
	private JComboBox<Alimento> cmbNombre;
	private Alimento[] alimentos;
	
	public FrmAlimentoConsulta(){
		super("Consultar alimento");
		inicializar();
		configurar();
		agregarComponentes();
		agregarEventos();
		mostrar();
	}


	public void inicializar(){
		try{
			AlimentoAdmin admin = new AlimentoAdmin();
			alimentos = admin.consultarObjetos(AlimentoAdmin.NOMBRE_ARCHIVO_BIN);
			cmbNombre = new JComboBox<Alimento>(alimentos);

		}catch(InvalidFileNameException e){
			cmbNombre = new JComboBox<Alimento>();
			JOptionPane.showMessageDialog(this, "Error al consultar información");
		}
		
		lblNombre = new JLabel("Nombre");
		lblCalorias = new JLabel("Calorías");
		lblCarbohidratos = new JLabel("Carbohidratos");

		txtCalorias = new JTextField();
		txtCarbohidratos = new JTextField();
		
		btnConsultar = new JButton("Consultar");
		btnCerrar = new JButton("Cerrar");
	}

	public void configurar(){
		setLayout(new GridLayout(4, 2));
		setLocationRelativeTo(null);
		setResizable(false);
		txtCarbohidratos.setEditable(false);
		txtCalorias.setEditable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void agregarComponentes(){
		add(lblNombre);
		add(cmbNombre);
		add(lblCalorias);
		add(txtCalorias);
		add(lblCarbohidratos);
		add(txtCarbohidratos);
		add(btnConsultar);
		add(btnCerrar);
		pack();
	}
	
	public void agregarEventos()
	{
		btnCerrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});


		btnConsultar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int indiceSeleccionado = cmbNombre.getSelectedIndex();
				Alimento alimento = cmbNombre.getItemAt(indiceSeleccionado);
				
				txtCalorias.setText(String.valueOf(alimento.getCalorias()));
				txtCarbohidratos.setText(String.valueOf(alimento.getCarbohidratos()));
			}
		});
	}

	public void mostrar(){
		setVisible(true);
	}

	public void ocultar(){
		setVisible(false);
	}
}