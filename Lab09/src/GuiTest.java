// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 5.
// ������ȣ : �ǽ� 1
// �������� : GUI �ۼ�

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiTest extends JFrame {
	public GuiTest() {
		
		// �⺻ ����
		setTitle("GUI TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �ʿ��� ������Ʈ ����
		TextField tf1 = new TextField(20);
		TextField tf2 = new TextField(20);
		TextField tf3 = new TextField(20);
		TextField tf4 = new TextField(20);
		
		JButton check = new JButton("Ȯ��");
		JButton cancel = new JButton("���");
		
		// ����Ʈ �ҿ� ����
		c.add(new JLabel("�̸�     "));c.add(tf1);
		c.add(new JLabel("�й�     "));c.add(tf2);
		c.add(new JLabel("����     "));c.add(tf3);
		c.add(new JLabel("����ó "));c.add(tf4);
		c.add(check);c.add(cancel);
		
		// Ȯ�� ��ư ������ �� �׼� ������ �ۼ�
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(tf1.getText() + "\t");
				System.out.print(tf2.getText() + "\t");
				System.out.print(tf3.getText() + "\t");
				System.out.print(tf4.getText() + "\t");
			}
		});
		
		// ��� ��ư ������ �� ����
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GuiTest();

	}

}


