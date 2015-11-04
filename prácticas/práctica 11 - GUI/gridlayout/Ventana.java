package gridlayout;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame{
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

	public Ventana(){
		super("Ventana de Ejemplo");
		setLayout(new GridLayout(3,3));

		b1 = new JButton("Botón 1");
		add(b1);
		b2 = new JButton("Botón 2");
		add(b2);
		b3 = new JButton("Botón 3");
		add(b3);
		b4 = new JButton("Botón 4");
		add(b4);
		b5 = new JButton("Botón 5");
		add(b5);
		b6 = new JButton("Botón 6");
		add(b6);
		b7 = new JButton("Botón 7");
		add(b7);
		b8 = new JButton("Botón 8");
		add(b8);
		b9 = new JButton("Botón 9");
		add(b9);
		
		setSize(400, 300);
		setVisible(true);	
	}

	public static void main(String args[]){
		Ventana v = new Ventana();	
	}
}