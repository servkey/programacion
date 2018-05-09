import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class FrmVentana{
	public static void main(String args[]){
		JFrame 	frm1 = new JFrame("Primer ventana");
		frm1.setLayout(new FlowLayout());

		JTextField txt1 = new JTextField(20);

		JButton btn1 = new JButton("OK");
		frm1.add(txt1);
		frm1.add(btn1);

		frm1.pack();
		frm1.setVisible(true);
	}

}