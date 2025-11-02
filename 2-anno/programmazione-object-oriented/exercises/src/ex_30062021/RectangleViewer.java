package ex_30062021;
import javax.swing.JFrame;
public class RectangleViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Due Rettangoli");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}
