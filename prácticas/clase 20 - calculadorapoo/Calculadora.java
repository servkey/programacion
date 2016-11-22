import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Calculadora extends JFrame implements ActionListener{
	private int memoria;
	private int operador; 
	private Font fuente;
	public final static int SUMA = 1;
	public final static int RESTA = 2;
	public final static int MULTIPLICACION = 3;
	public final static int DIVISION = 4;

	private JPanel pnlBotones;
	private JTextField txtResultado;
	private JButton btnMasMenos;
	private JButton btnIgual;
	private JButton btnPunto;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnMultiplicacion;
	private JButton btnDivision;

	private JButton btnC;
	private JButton btnCE;
	private JButton btnDEL;

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

	public Calculadora(){
		super("Calculadora");
		inicializar();
		configurar();
		agregarComponentes();
		agregarEventos();
		pack();
	}

	public void inicializar(){
		fuente = new Font("monspaced", Font.PLAIN, 20);

		pnlBotones = new JPanel();

		txtResultado = new JTextField(20);
		btnMasMenos = new JButton("±");
		btnIgual = new JButton("=");
		btnPunto = new JButton(".");
		btnSuma = new JButton("+");
		btnResta = new JButton("-");
		btnMultiplicacion = new JButton("x");
		btnDivision = new JButton("÷");


		btnC = new JButton("C");
		btnCE = new JButton("CE");
		btnDEL = new JButton("DEL");

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
	
	}
	

	public void configurar(){
		setLayout(new BorderLayout());
		pnlBotones.setLayout(new GridLayout(5, 4));
		setResizable(false);
		txtResultado.setFont(fuente);
		txtResultado.setEditable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public void agregarComponentes(){
		add(txtResultado, BorderLayout.CENTER);
		add(pnlBotones, BorderLayout.SOUTH);

		pnlBotones.add(btnCE);
		pnlBotones.add(btnC);
		pnlBotones.add(btnDEL);
		pnlBotones.add(btnDivision);

		pnlBotones.add(btnSiete);
		pnlBotones.add(btnOcho);
		pnlBotones.add(btnNueve);
		pnlBotones.add(btnMultiplicacion);

		pnlBotones.add(btnCuatro);
		pnlBotones.add(btnCinco);
		pnlBotones.add(btnSeis);
		pnlBotones.add(btnResta);

		pnlBotones.add(btnUno);
		pnlBotones.add(btnDos);
		pnlBotones.add(btnTres);
		pnlBotones.add(btnSuma);

		pnlBotones.add(btnMasMenos);
		pnlBotones.add(btnCero);
		pnlBotones.add(btnPunto);
		pnlBotones.add(btnIgual);

	}
		

	public void mostrar(){
		setVisible(true);
	}

	public void ocultar(){
		setVisible(false);
	}

	public void agregarEventos(){
		btnMasMenos.addActionListener(this);
		btnIgual.addActionListener(this);
		btnPunto.addActionListener(this);
		btnSuma.addActionListener(this);
		btnResta.addActionListener(this);
		btnMultiplicacion.addActionListener(this);
		btnDivision.addActionListener(this);

		btnC.addActionListener(this);
		btnCE.addActionListener(this);
		btnDEL.addActionListener(this);

		btnCero.addActionListener(this);
		btnUno.addActionListener(this);
		btnDos.addActionListener(this);
		btnTres.addActionListener(this);
		btnCuatro.addActionListener(this);
		btnCinco.addActionListener(this);
		btnSeis.addActionListener(this);
		btnSiete.addActionListener(this);
		btnOcho.addActionListener(this);
		btnNueve.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("Comando: " + e.getActionCommand());

		switch(e.getActionCommand()){
			case "DEL":
				txtResultado.setText("");
				break;
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				txtResultado.setText(txtResultado.getText() + e.getActionCommand());
				break;
			case "-":
				memoria = Integer.parseInt(txtResultado.getText());
				operador = RESTA;
				txtResultado.setText("");
				break;
		
			case "+":
				memoria = Integer.parseInt(txtResultado.getText());
				operador = SUMA;
				txtResultado.setText("");
				break;

			case "x":
				memoria = Integer.parseInt(txtResultado.getText());
				operador = MULTIPLICACION;
				txtResultado.setText("");
				break;

			case "÷":
				memoria = Integer.parseInt(txtResultado.getText());
				operador = DIVISION;
				txtResultado.setText("");
				break;

			case "=":
				int memoria_temp = Integer.parseInt(txtResultado.getText());
				txtResultado.setText("");
				if (operador == SUMA){
					int resultado = memoria + memoria_temp;
					txtResultado.setText(String.valueOf(resultado));
				}else if (operador == RESTA){
					int resultado = memoria - memoria_temp;
					txtResultado.setText(String.valueOf(resultado));
				}else if (operador == MULTIPLICACION){
					int resultado = memoria * memoria_temp;
					txtResultado.setText(String.valueOf(resultado));
				}else if (operador == DIVISION){
					try{
						int resultado = memoria / memoria_temp;
						txtResultado.setText(String.valueOf(resultado));
					}catch(ArithmeticException e1){
						txtResultado.setText("Error al dividir por cero");
					}
					
				}
				operador = 0;
				break;

		}
	}
	
}