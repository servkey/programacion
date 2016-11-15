import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ActionAdapter implements ActionListener{
	public void actionPerformed(ActionEvent e){
	}
}

public class Ventana{
	public static void main(String args[]){
		JFrame frm1 = new JFrame("Mi primera ventana");
		GridLayout grid = new GridLayout(5,2);
		frm1.setLayout(grid);
		frm1.setSize(400, 200);
		
		JTextField txtNombre = new JTextField();
		JTextField txtApellidoPaterno = new JTextField();
		JTextField txtApellidoMaterno = new JTextField();
		JTextField txtPeso = new JTextField();
		JButton btnOK = new JButton("OK");
		JButton btnCancelar = new JButton("Cancelar");

	
		frm1.add(new JLabel("Nombre:"));
		frm1.add(txtNombre);

		frm1.add(new JLabel("Apellido Paterno:"));
		frm1.add(txtApellidoPaterno);


		frm1.add(new JLabel("Apellido Materno:"));
		frm1.add(txtApellidoMaterno);


		frm1.add(new JLabel("Peso:"));
		frm1.add(txtPeso);

		frm1.add(btnOK);
		frm1.add(btnCancelar);


		frm1.addWindowListener(new WindowAdapter(){
			public void windowActivated(WindowEvent e){
					System.out.println("Activa...");
			}
			public void windowClosing(WindowEvent e){
					System.out.println("Saliendo...");
					System.exit(0);	
			}
		});


		btnOK.addActionListener(new ActionAdapter(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Click en OK");
			}		
		});


		btnCancelar.addActionListener(new ActionAdapter(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Click en Cancelar");
			}		
		});

		frm1.setVisible(true);		


	}	
}