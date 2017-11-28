import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame{
	private JPanel pnlResultado;
	private JTextField txtResultado;
	private JPanel pnlCentral;
	private JButton btnCero;
	private JButton btnUno;
	private JButton btnDos;
	private JButton btnTres;
	private JButton btnCuatro;
	private JButton btnCinco;
	private JButton btnSeis;
	private JButton btnSiete;
	private JButton btnOcho;
	private JButton btnNueve;
	private JButton btnCE;
	private JButton btnC;
	private JButton btnBorrar;
	private JButton btbMasMenos;
	private JButton btnPunto;
	private JButton btnIgual;
	private JButton btnDivision;
	private JButton btnMultiplicacion;
	private JButton btnResta;
	private JButton btnSuma;


	public Calculadora(){
		super("Calculadora");
		//Distribuidor de componentes
		setLayout(new BorderLayout());

		//Creación de componentes
		crearComponentes();		

		//Agregar componentes
		agregarComponentes();		

		//Agregar eventos
		agregarEventos();

		//Mostrar
		setSize(600, 600);
		setVisible(true);
	}


	public void crearComponentes(){
		txtResultado = new JTextField(40);
		txtResultado.setFont(new Font("Arial", Font.BOLD, 20));

		pnlResultado = new JPanel();
		pnlResultado.setLayout(new FlowLayout());

		pnlCentral = new JPanel();
		pnlCentral.setLayout(new GridLayout(5, 4));
		
		btnCero = new JButton("0");
		btnUno = new JButton("1");
		btnDos = new JButton("2");
		btnTres = new JButton("3");
		btnCuatro = new JButton("4");
		btnCinco = new JButton("5");
		btnSeis = new JButton("6");
		btnSiete = new JButton("7");
		btnOcho = new JButton("8");
		btnNueve = new JButton("9");
		btnCE = new JButton("CE");
		btnC = new JButton("C");
		btnBorrar = new JButton("BACK");
		btbMasMenos = new JButton("±");
		btnPunto = new JButton(".");
		btnIgual = new JButton("=");
		btnDivision = new JButton("÷");
		btnMultiplicacion = new JButton("×");
		btnResta = new JButton("-");
		btnSuma = new JButton("+");
	}


	public void agregarComponentes(){
		//Agregar al frame la caja de resultado (NORTE) y el panel (SUR)
		add(pnlResultado, BorderLayout.NORTH);
		add(pnlCentral, BorderLayout.CENTER);
		pnlResultado.add(txtResultado);
		//Agregar al panel todos los demás botones
		pnlCentral.add(btnCE);
		pnlCentral.add(btnC);
		pnlCentral.add(btnBorrar);
		pnlCentral.add(btnDivision);
		pnlCentral.add(btnSiete);
		pnlCentral.add(btnOcho);
		pnlCentral.add(btnNueve);
		pnlCentral.add(btnMultiplicacion);
		pnlCentral.add(btnCuatro);
		pnlCentral.add(btnCinco);
		pnlCentral.add(btnSeis);
		pnlCentral.add(btnResta);
		pnlCentral.add(btnUno);
		pnlCentral.add(btnDos);
		pnlCentral.add(btnTres);
		pnlCentral.add(btnSuma);
		pnlCentral.add(btbMasMenos);
		pnlCentral.add(btnCero);
		pnlCentral.add(btnPunto);
		pnlCentral.add(btnIgual);	
	}
	
	public void agregarEventos(){

	}

	public static void main(String args[]){
		Calculadora ventana = new Calculadora();
	}

}