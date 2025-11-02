package ex_09072021;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CiclaParola extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton btnSuccessiva;
	JLabel lbParola;
	JPanel pannello;
	String[] parole = {"Ida", "Nuda", "Prostituta"};
	int i = 0;
	public CiclaParola() {
		pannello = new JPanel(new GridLayout(0,1));
        lbParola = new JLabel();
        btnSuccessiva = new JButton("Parola Successiva");
        pannello.add(btnSuccessiva);
        pannello.add(lbParola);
        setContentPane(pannello);
        btnSuccessiva.addActionListener(this);
        setTitle("Cicla Parole");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(400,150);
        setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int c = i % parole.length;
		lbParola.setText(parole[c]);
		i++;
	}
	public static void main(String[] args) {
		CiclaParola p = new CiclaParola();
	}
	
}
