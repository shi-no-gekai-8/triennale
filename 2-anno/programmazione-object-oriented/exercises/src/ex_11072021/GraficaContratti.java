package ex_11072021;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class GraficaContratti extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	public GraficaContratti(AgenziaImmobiliare ai) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 350);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(null);
		setContentPane(panel);
		JTextArea showText = new JTextArea();
		showText.setBounds(500, 20, 100, 20);
		showText.setColumns(50);
		showText.setRows(10);
		JScrollPane scrollPane = new JScrollPane(showText);
		panel.add(showText);
		showText.append(ai.dammiNumeroVani(3));
		this.setVisible(true);
	}
}
