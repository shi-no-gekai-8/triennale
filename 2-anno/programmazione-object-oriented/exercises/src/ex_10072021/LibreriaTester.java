package ex_10072021;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LibreriaTester extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Libreria lib = new Libreria();
		Libro l1 = new Libro("Roraima", "Ambrose Locke", 500, "jdshfsekjralewk");
		Libro l2 = new Libro("Siberia Infernale", "Ambrose Locke", 500, "jdshfsekjralewk");
		lib.aggiungiLibro(l1);
		lib.aggiungiLibro(l2);
		JFrame frame = new JFrame("Libreria");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(new Dimension(600, 300));
		frame.setVisible(true);
		JPanel panel = new JPanel();
		// panel.setBackground(Color.RED);
		panel.setPreferredSize(new Dimension(600, 300));
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		JComboBox<String> combo1 = new JComboBox<String>((ComboBoxModel<String>) lib);
		combo1.addItem(l1.getTitolo());
		combo1.addItem(l2.getTitolo());
		panel.add(combo1, BorderLayout.CENTER);
	}

}
