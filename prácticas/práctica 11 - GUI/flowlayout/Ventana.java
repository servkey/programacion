package flowlayout;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame{
	private JButton b1, b2, b3;

	public Ventana(){
		super("Ventana de Ejemplo");
		setLayout(new FlowLayout());
		b1 = new JButton("Botón 1");
		add(b1);
		b2 = new JButton("Botón 2");
		add(b2);
		b3 = new JButton("Botón 3");
		add(b3);
			
		setSize(400, 300);
		setVisible(true);	
	}

	public static void main(String args[]){
		Ventana v = new Ventana();	
	}
}