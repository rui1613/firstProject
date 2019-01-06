import java.awt.*;
import javax.swing.*;

/**
 * Illustrate the layout style of a GridLayout.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class GridLayoutExample {
	private JFrame frame;

	public GridLayoutExample() {
		makeFrame();
	}

	private void makeFrame() {
		frame = new JFrame("GridLayout Example");

		Container contentPane = frame.getContentPane();
		//设置内容面板为网格式布局
		contentPane.setLayout(new GridLayout(3, 2,10,10));
		//向网格式布局的容器添加组件，顺序添加
		contentPane.add(new JButton("first"));
		contentPane.add(new JButton("second"));
		contentPane.add(new JButton("the third string is very long"));
		contentPane.add(new JButton("fourth"));
		contentPane.add(new JButton("fifth"));

		frame.pack();
		frame.setVisible(true);
	}
}
