import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import diario.dominio.Alimento;
import diario.InvalidFileNameException;
import diario.dao.AlimentoAdmin;


public class FrmAlimentoRegistro extends JFrame implements ActionListener{
	private JLabel lblNombreAlimento;
	private JLabel lblCalorias;
	private JLabel lblCarbohidratos;

	private JTextField txtNombreAlimento;
	private JTextField txtCalorias;
	private JTextField txtCarbohidratos;

	private JButton btnRegistrar;
	private JButton btnCerrar;
	
	public FrmAlimentoRegistro(){
		super("Registro de alimentos");
		inicializar();
		configurar();
		agregarComponentes();
		agregarEventos();
		mostrar();
	}

	public void inicializar(){
		lblNombreAlimento = new JLabel("Nombre de alimento");
		lblCalorias = new JLabel("Calorías");
		lblCarbohidratos = new JLabel("Carbohidratos");
		
		txtNombreAlimento = new JTextField();
		txtCalorias = new JTextField();
		txtCarbohidratos = new JTextField();
		
		btnRegistrar = new JButton("Registrar");
		btnCerrar = new JButton("Cerrar");
	}

	public void configurar(){
		setLayout(new GridLayout(4,2));
		setResizable(false);
		setLocationRelativeTo(null);
	}

	public void agregarComponentes(){
		add(lblNombreAlimento);
		add(txtNombreAlimento);

		add(lblCalorias);
		add(txtCalorias);

		add(lblCarbohidratos);
		add(txtCarbohidratos);

		add(btnRegistrar);
		add(btnCerrar);

		pack();
	}
	
	public void agregarEventos(){
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});	

		btnRegistrar.addActionListener(this);

		btnCerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		Object objSrc = e.getSource();
		
		if (objSrc instanceof JButton){
			JButton src = (JButton) objSrc;
			if (src == btnRegistrar){
				agregarAlimento();
			}else if(src == btnCerrar){
				dispose();
			}			
		}
	}

	public void mostrar(){
		setVisible(true);
	}

	public void ocultar(){
		setVisible(false);
	}

	public void agregarAlimento(){
		AlimentoAdmin admin = new AlimentoAdmin();
		Alimento alimento = new Alimento(txtNombreAlimento.getText(), Integer.parseInt(txtCalorias.getText()), Integer.parseInt(txtCarbohidratos.getText()));	

		try{
			admin.guardar(AlimentoAdmin.NOMBRE_ARCHIVO_BIN, alimento);
			JOptionPane.showMessageDialog(this, "¡Alimento registrado!");
		}catch(InvalidFileNameException e){
			JOptionPane.showMessageDialog(this, "Hubo un error en el registro");
		}

		txtNombreAlimento.setText("");
		txtCalorias.setText("");
		txtCarbohidratos.setText("");
		
		txtNombreAlimento.requestFocus();
	}
}





