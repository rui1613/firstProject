import java.awt.*;
import javax.swing.*;

/**
 * Illustrate the layout style of a BorderLayout.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class BorderLayoutExample {
	private JFrame frame;

	public BorderLayoutExample() {
		makeFrame();
	}

	private void makeFrame() {
		frame = new JFrame("BorderLayout Example");

		Container contentPane = frame.getContentPane();
		//设置内容面板的布局
		contentPane.setLayout(new BorderLayout());
		//向边界式布局的容器中添加组件时，指定位置
		contentPane.add(new JButton("north"), BorderLayout.NORTH);
		contentPane.add(new JButton("south"), BorderLayout.SOUTH);
		contentPane.add(new JButton("center"), BorderLayout.CENTER);
		contentPane.add(new JButton("west"), BorderLayout.WEST);
		contentPane.add(new JButton("east"), BorderLayout.EAST);

		frame.pack();
		frame.setVisible(true);
	}
}
