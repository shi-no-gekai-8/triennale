package ex_09072021;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tendina extends JFrame implements ActionListener {
	public Tendina() {
	JPanel pannello = new JPanel(new GridLayout(0, 1));
	JComboBox<String> lista = new JComboBox<String>();
	lista.addItem("ida");
	lista.addItem("nuda");
	lista.addItem("prostituta");
	}
	public void main(String[] args) {
		Tendina t = new Tendina();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
