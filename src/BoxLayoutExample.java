import java.awt.*;
import javax.swing.*;

/**
 * Illustrate the layout style of a BoxLayout.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class BoxLayoutExample {
	private JFrame frame;

	/**
	 * Constructor for objects of class BoxLayoutExample
	 */
	public BoxLayoutExample() {
		makeFrame();
	}

	/**
	 * Create a BoxLayout and place five components within it.
	 */
	private void makeFrame() {
		frame = new JFrame("BoxLayout Example");

		Container contentPane = frame.getContentPane();
		//设置内容面板为盒式布局
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		contentPane.add(new JButton("first"));
		contentPane.add(new JButton("second"));
		contentPane.add(new JButton("the third string is very long"));
		contentPane.add(new JButton("fourth"));
		contentPane.add(new JButton("fifth"));

		frame.pack();
		frame.setVisible(true);
	}
}
