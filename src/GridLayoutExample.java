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
		//�����������Ϊ����ʽ����
		contentPane.setLayout(new GridLayout(3, 2,10,10));
		//������ʽ���ֵ�������������˳�����
		contentPane.add(new JButton("first"));
		contentPane.add(new JButton("second"));
		contentPane.add(new JButton("the third string is very long"));
		contentPane.add(new JButton("fourth"));
		contentPane.add(new JButton("fifth"));

		frame.pack();
		frame.setVisible(true);
	}
}
