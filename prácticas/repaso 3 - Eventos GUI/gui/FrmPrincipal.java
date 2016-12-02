import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal extends JFrame implements IFrmBase{
	private JButton btnAlimentoRegistro;
	private JButton btnAlimentoConsulta;
	private JButton btnSalir;

	public FrmPrincipal(){
		super("Menú principal");
		//setSize(100,200);
		inicializar();
		configurar();
		agregarComponentes();
		agregarEventos();
	}

	public void inicializar(){
		btnAlimentoRegistro = new JButton("Registrar alimento");
		btnAlimentoConsulta = new JButton("Consultar alimento");
		btnSalir = new JButton("Salir");
	}

	public void configurar(){
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	public void agregarComponentes(){
		add(btnAlimentoRegistro);
		add(btnAlimentoConsulta);
		add(btnSalir);
		pack();
	}

	public void agregarEventos(){
		btnAlimentoRegistro.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//Mostrar la ventana de registro
				new FrmAlimentoRegistro();
			}
		});
		
		btnSalir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
	}
	
	public void mostrar(){
		setVisible(true);
	}

	public void ocultar(){
		setVisible(false);
	}

	public static void main(String args[]){
		FrmPrincipal frm = new FrmPrincipal();
		frm.setVisible(true);

		//new FrmPrincipal().mostrar();
		
	}
}