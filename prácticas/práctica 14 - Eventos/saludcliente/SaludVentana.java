package saludcliente;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import salud.*;

public class SaludVentana extends JFrame{
	private JButton btnCalcularIMC, btnCalcularPG;
	private JLabel lblNombre, lblEdad, lblSexo, lblEstatura, lblPeso, lblCintura, lblCuello, lblCadera, lblIMC, lblPG, lblIMCValor, lblPGValor;
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
		lblIMC = new JLabel("IMC");
		lblIMCValor = new JLabel();
		lblPG = new JLabel("PG");
		lblPGValor = new JLabel();
		
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

		add(lblIMC);
		add(lblIMCValor);
	
		add(lblPG);
		add(lblPGValor);

		add(btnCalcularIMC);
		add(btnCalcularPG);

		btnCalcularIMC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Click Botón 1 - Calculando IMC...");
				Persona p = obtenerDatos();
				System.out.println("IMC: " + p.indMasaCor());	
				lblIMCValor.setText("" + p.indMasaCor());
			}
		});

		btnCalcularPG.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Click Botón 1 - Calculando PG...");
				Persona p = obtenerDatos();
				System.out.println("PG: " + p.porGrasa());	
				lblPGValor.setText(""+ p.porGrasa());
			}
		});
	}

	private Persona obtenerDatos(){
		Persona p = null;
		
		String sexo = txtSexo.getText();
		String nombre = txtNombre.getText();
		int edad = Integer.parseInt(txtEdad.getText());
		float estatura = Float.parseFloat(txtEstatura.getText());
		float peso = Float.parseFloat(txtPeso.getText());
		float cintura = Float.parseFloat(txtCintura.getText());
		float cuello = Float.parseFloat(txtCuello.getText());				
		java.util.Date fechaNacimiento = new java.util.Date("10/10/1980");
		if (sexo.equals("M")){
			//Mujer
			float cadera = Float.parseFloat(txtCadera.getText());				
			p = new Mujer(nombre, edad, peso, estatura, fechaNacimiento, cintura, cuello, cadera); 
		}else if (sexo.equals("H")){
			//Hombre
			p = new Persona(nombre, edad, peso, estatura, fechaNacimiento, cintura, cuello);	
		}
		return p;
	}


	public SaludVentana(){
		super("Cliente para calcular IMC, PG");
		setLayout(new GridLayout(11,2));
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializarComponentes();		
		setVisible(true);
	}

	public static void main(String args[]){
		SaludVentana v = new SaludVentana();	
	}
}