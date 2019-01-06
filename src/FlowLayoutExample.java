import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
	private JFrame frame;

	public FlowLayoutExample() {
		makeFrame();
	}

	private void makeFrame() {
		frame = new JFrame("FlowLayout Example");
		//��ô��ڵ��������
		Container contentPane = frame.getContentPane();
		//�����������Ĳ��ַ�ʽ������ʽ����
		contentPane.setLayout(new FlowLayout());
		//�����������������
		contentPane.add(new JButton("first"));
		contentPane.add(new JButton("second"));
		contentPane.add(new JButton("the third string is very long"));
		contentPane.add(new JButton("fourth"));
		contentPane.add(new JButton("fifth"));

		frame.pack();
		frame.setVisible(true);
	}
}
