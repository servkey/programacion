package saludcliente;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SaludVentana extends JFrame{
	private JButton btnCalcularIMC, btnCalcularPG;
	private JLabel lblNombre, lblEdad, lblSexo, lblEstatura, lblPeso, lblCintura, lblCuello, lblCadera;
	private JTextField txtNombre, txtEdad, txtSexo, txtEstatura, txtPeso, txtCintura, txtCuello, txtCadera;

	private void inicializarComponentes(){
		btnCalcularIMC = new JButton("Calcular IMC");
		btnCalcularPG = new JButton("Calcular PG");

		lblNombre = new JLabel("Nombre");
		lblEdad = new JLabel("Edad");
		lblSexo = new JLabel("Sexo");
		lblEstatura = new JLabel("Estatura");
		lblPeso = new JLabel("Peso");
		lblCintura = new JLabel("Cintura");
		lblCuello = new JLabel("Cuello");
		lblCadera = new JLabel("Cadera");
		
		txtNombre = new JTextField();
		txtEdad = new JTextField();
		txtSexo = new JTextField();
		txtEstatura = new JTextField();
		txtPeso = new JTextField();
		txtCintura = new JTextField();
		txtCuello = new JTextField();
		txtCadera = new JTextField();
		
		add(lblNombre);
		add(txtNombre);
		add(lblEdad);
		add(txtEdad);
		add(lblSexo);
		add(txtSexo);
		add(lblEstatura);
		add(txtEstatura);
		add(lblPeso);
		add(txtPeso);
		add(lblCintura);
		add(txtCintura);
		add(lblCuello);
		add(txtCuello);
		add(lblCadera);
		add(txtCadera);

		add(btnCalcularIMC);
		add(btnCalcularPG);



		btnCalcularIMC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Click Botón 1 - Calculando IMC...");
				System.out.println(txtNombre.getText());
			}
		});

		btnCalcularPG.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Click Botón 1 - Calculando PG...");
			}
		});
	}

	private void obtenerDatos(){
		
	}


	public SaludVentana(){
		super("Cliente para calcular IMC, PG");
		setLayout(new GridLayout(9,2));
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializarComponentes();		
		setVisible(true);
	}

	public static void main(String args[]){
		SaludVentana v = new SaludVentana();	
	}
}