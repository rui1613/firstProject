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
		//�����������Ĳ���
		contentPane.setLayout(new BorderLayout());
		//��߽�ʽ���ֵ�������������ʱ��ָ��λ��
		contentPane.add(new JButton("north"), BorderLayout.NORTH);
		contentPane.add(new JButton("south"), BorderLayout.SOUTH);
		contentPane.add(new JButton("center"), BorderLayout.CENTER);
		contentPane.add(new JButton("west"), BorderLayout.WEST);
		contentPane.add(new JButton("east"), BorderLayout.EAST);

		frame.pack();
		frame.setVisible(true);
	}
}
