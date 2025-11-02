package ex_09072021;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Random;

import javax.swing.JPanel;

public class Forme extends JPanel {
	private static final long serialVersionUID = 1L;
	private int typeShape = 0;
	private Random ran = new Random();
	public void setTypeShape(int typeShape) {
		this.typeShape = typeShape;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for(int i=0;i<20;i++) {
			switch(typeShape) {
			case 0: g2d.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256))); g2d.draw(new Line2D.Double(ran.nextInt(400),ran.nextInt(400),ran.nextInt(400),ran.nextInt(400)));break;
			case 1: g2d.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256))); g2d.draw(new Arc2D.Double(ran.nextInt(200),ran.nextInt(200),ran.nextInt(400),ran.nextInt(400), ran.nextInt(360),ran.nextInt(360),Arc2D.PIE));break;
			case 2: g2d.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256))); g2d.draw(new Rectangle2D.Double(ran.nextInt(200),ran.nextInt(200),ran.nextInt(400),ran.nextInt(400)));break;
			case 3: g2d.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256))); g2d.draw(new RoundRectangle2D.Double(ran.nextInt(200),ran.nextInt(200), ran.nextInt(400),ran.nextInt(400),10,10));break;
			case 4: g2d.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256))); g2d.draw(new Ellipse2D.Double(ran.nextInt(200),ran.nextInt(200), ran.nextInt(400),ran.nextInt(400)));break;       
			}
		}
	}
}
