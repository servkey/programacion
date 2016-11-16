package borderlayout;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame{
	private JButton b1, b2, b3, b4, b5;

	public Ventana(){
		super("Ventana de Ejemplo");
		setLayout(new BorderLayout());
		b1 = new JButton("Botón NORTH");
		add(b1, BorderLayout.NORTH);
		b2 = new JButton("Botón SOUTH");
		add(b2, BorderLayout.SOUTH);
		b3 = new JButton("Botón WEST");
		add(b3, BorderLayout.WEST);
		b4 = new JButton("Botón EAST");
		add(b4, BorderLayout.EAST);
		b5 = new JButton("Botón CENTER");
		add(b5, BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);	
	}

	public static void main(String args[]){
		Ventana v = new Ventana();	
	}
}