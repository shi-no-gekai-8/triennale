package ex_10072021;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Grafica extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	public Grafica(ProgrammazioneDidattica x) {
		ProgrammazioneDidattica y = x;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPanel);
		JLabel lbl = new JLabel();
		contentPanel.add(lbl, BorderLayout.NORTH);
		lbl.setText("Costo di tutti i corsi: "+y.calcolaCosto());
		JComboBox comboBox = new JComboBox();
		for(int i=0;i<y.getSize();i++) {
			comboBox.addItem(y.getListaCorsi().get(i).getNome()+" "+y.getListaCorsi().get(i).calcolaCosto()+" "+y.getListaCorsi().get(i).getDocente());
		}
		contentPanel.add(comboBox, BorderLayout.CENTER);
		JLabel lblVerifica = new JLabel();
		contentPanel.add(lblVerifica,BorderLayout.WEST);
		JButton btnVerifica = new JButton("Verifica");
		btnVerifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(y.verifica()) {
					lblVerifica.setText("Ore Soddisfatte");
				} else {
					lblVerifica.setText("Ore non soddisfatte");
				}
			}
		});
		contentPanel.add(btnVerifica, BorderLayout.SOUTH);
		this.setVisible(true);
	}
}
