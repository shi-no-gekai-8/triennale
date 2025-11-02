package ex_09072021;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ProvaGrafica extends JFrame implements ActionListener {
	public ProvaGrafica() {
		pannello = new JPanel();
		pan1 = new JPanel(new GridLayout(0, 1));
		pan2 = new JPanel();
		txtTempCelsius = new JTextField("", 10);
		txtTempKelvin = new JTextField("", 10);
		lbTempCelsius = new JLabel("Temperatura in Celsius");
		lbTempKelvin = new JLabel("Temperatura in Kelvin");
		btnConverti = new JButton("Converti Temperatura");
		pan1.add(lbTempCelsius);
		pan1.add(txtTempCelsius);
		pan1.add(lbTempKelvin);
		pan1.add(txtTempKelvin);
		pan2.add(btnConverti);
		pan1.setBackground(new Color(184, 134, 11));
		pan2.setBackground(new Color(184, 134, 11));
		pannello.add(pan1);
		pannello.add(pan2);
		Border border = BorderFactory.createLineBorder(new Color(165, 42, 42));
		btnConverti.setBorder(border);
		pannello.setBackground(new Color(184, 134, 11));
		setContentPane(pannello);
		btnConverti.setBackground(new Color(165, 42, 42));
		btnConverti.setForeground(new Color(0, 255, 255));
		btnConverti.addActionListener(this);
		setTitle("Convertitore temperatura: ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setSize(400, 150);
		setVisible(true);
	}
	JButton btnConverti;
	JLabel lbTempCelsius, lbTempKelvin;
	JTextField txtTempCelsius, txtTempKelvin;
	JPanel pannello, pan1, pan2;
	public static void main(String[] args) {
		ProvaGrafica p = new ProvaGrafica();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = txtTempCelsius.getText();
		if(!str.equals("")) {
			double d = Double.parseDouble(str);
			d = d+273.15;
			txtTempKelvin.setText(""+d);
		}
		
	}

}
