package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SearchFrame {
	//声明JFrame成员变量
	private JFrame frame;
	//构造方法
	public SearchFrame(){
		makeFrame();
	}
	//构造搜索界面
	private void makeFrame() {
		// 创建JFrame对象
		frame = new JFrame("搜索");
		// 获得frame的内容面板，并设置内容面板的布局
		Container cp = frame.getContentPane();
		cp.setLayout(new BorderLayout());
		//创建容器和组件对象，设置容器的布局
		JPanel northPanel = 
				new JPanel(new FlowLayout());
		JTextField inputText = new JTextField(20);
		JButton jb = new JButton("搜索");
		JTextArea outputText = 
				new JTextArea(10, 20);
		//向容器和内容面板中添加组件
		northPanel.add(inputText);
		northPanel.add(jb);
		cp.add(northPanel, BorderLayout.NORTH);
		cp.add(outputText);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SearchFrame();
	}

}
