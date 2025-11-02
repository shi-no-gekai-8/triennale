package ex_15072021;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class GraficaMovies extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	public GraficaMovies(ElencoNoleggi en) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 350);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(null);
		setContentPane(panel);
		JLabel filmLbl = new JLabel("Film");
		filmLbl.setBounds(400, 20, 50, 10);
		panel.add(filmLbl);
		JTextField stringTxtFld = new JTextField();
		stringTxtFld.setBounds(400, 20, 100, 20);
		panel.add(stringTxtFld);
		stringTxtFld.setColumns(10);
		JButton searchBtn = new JButton("Cerca");
		searchBtn.setBounds(500, 20, 100, 20);
		panel.add(searchBtn);
		JTextArea showTxtPn = new JTextArea();
		showTxtPn.setBounds(197, 67, 517, 199);
		panel.add(showTxtPn);
		showTxtPn.setPreferredSize(getPreferredSize());
		showTxtPn.setColumns(50);
		showTxtPn.setRows(10);
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String getter = stringTxtFld.getText();
				for(int i=0;i<en.getSize();i++) {
					// int result = en.cerca(getter);
					// showTxtPn.setText(String.valueOf(result));
				}
			}
		});
		this.setVisible(true);
	}
}
