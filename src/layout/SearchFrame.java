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
	//����JFrame��Ա����
	private JFrame frame;
	//���췽��
	public SearchFrame(){
		makeFrame();
	}
	//������������
	private void makeFrame() {
		// ����JFrame����
		frame = new JFrame("����");
		// ���frame��������壬�������������Ĳ���
		Container cp = frame.getContentPane();
		cp.setLayout(new BorderLayout());
		//��������������������������Ĳ���
		JPanel northPanel = 
				new JPanel(new FlowLayout());
		JTextField inputText = new JTextField(20);
		JButton jb = new JButton("����");
		JTextArea outputText = 
				new JTextArea(10, 20);
		//�����������������������
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
