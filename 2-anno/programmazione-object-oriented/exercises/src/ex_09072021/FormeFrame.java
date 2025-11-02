package ex_09072021;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class FormeFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JComboBox<Object> cshape;
	private Forme pan;
	private final String shapeNames[] = {"LINEA", "ARCO", "RETTANGOLO", "ROUND RETTANGOLO", "ELLISSE"};
	public FormeFrame() {
		super("Venti forme a caso");
		cshape = new JComboBox<Object>(shapeNames);
		cshape.setMaximumRowCount(3);
		pan = new Forme();
		add(cshape, BorderLayout.SOUTH);
		add(pan, BorderLayout.CENTER);
		IL listener = new IL();
		cshape.addItemListener((ItemListener) listener);
	}
	 private class IL implements ItemListener
	  { public void itemStateChanged(ItemEvent e)
	    { pan.setTypeShape( cshape.getSelectedIndex());
	      pan.repaint();
	    }
	  }
	
}
