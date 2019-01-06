import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
	private JFrame frame;

	public FlowLayoutExample() {
		makeFrame();
	}

	private void makeFrame() {
		frame = new JFrame("FlowLayout Example");
		//获得窗口的内容面板
		Container contentPane = frame.getContentPane();
		//设置内容面板的布局方式——流式布局
		contentPane.setLayout(new FlowLayout());
		//向内容面板中添加组件
		contentPane.add(new JButton("first"));
		contentPane.add(new JButton("second"));
		contentPane.add(new JButton("the third string is very long"));
		contentPane.add(new JButton("fourth"));
		contentPane.add(new JButton("fifth"));

		frame.pack();
		frame.setVisible(true);
	}
}
