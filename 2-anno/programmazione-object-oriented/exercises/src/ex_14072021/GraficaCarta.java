package ex_14072021;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GraficaCarta extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	public GraficaCarta(IstitutoBancario ib) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 279);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(null);
		setContentPane(panel);
		JLabel lblNumeroCarta = new JLabel("Numero Carta: ");
		lblNumeroCarta.setBounds(10, 107, 77, 13);
		panel.add(lblNumeroCarta);
		JComboBox cardNumberCbx = new JComboBox();
		cardNumberCbx.setBounds(86, 103, 87, 21);
		for(int i=0;i<ib.getSize();i++) {
			cardNumberCbx.addItem(ib.getListaCarteCredito().get(i).getNumero());
		}
		panel.add(cardNumberCbx);
		JLabel lblimport = new JLabel("Importo: ");
		lblimport.setBounds(10, 107, 77, 13);
		panel.add(lblimport);
		JTextField importTxtFld = new JTextField();
		importTxtFld.setBounds(255, 104, 96, 19);
		panel.add(importTxtFld);
		importTxtFld.setColumns(10);
		JButton depositButton = new JButton("Deposita");
		depositButton.setBounds(88, 147, 85, 21);
		panel.add(depositButton);
		JButton withdrawButton = new JButton("Preleva");
		withdrawButton.setBounds(183, 147, 85, 21);
		panel.add(withdrawButton);
		JLabel totLbl = new JLabel("Totale: ");
		totLbl.setBounds(278, 151, 45, 13);
		panel.add(totLbl);
		JLabel balanceLbl = new JLabel();
		balanceLbl.setBounds(328, 151, 45, 13);
		panel.add(balanceLbl);
		cardNumberCbx.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<ib.getSize();i++) {
					double n = ib.getListaCarteCredito().get(i).getContoBancario().getBalance();
					balanceLbl.setText(Double.toString(n));
				}
			}
			
		});
		depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double input = Double.parseDouble(importTxtFld.getText());
				ib.deposita(ib.getListaCarteCredito().get(0).getNumero(), input);
				
			}
		});
		this.setVisible(true);
	}
}
