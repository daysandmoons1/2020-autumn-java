// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 1.
// ������ȣ : �ǽ� 4
// �������� : ��ġ������ ȥ�� ��� �ǽ�

import javax.swing.*;
import java.awt.*;

public class GuiTest extends JFrame {
	public GuiTest() {
		setTitle("GUI TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �����̳� ����
		Container c = getContentPane();
		c.setLayout(null);
		
		// label
		JLabel label = new JLabel("�̸�");
		label.setLocation(10, 10);
		label.setSize(200, 20);
		c.add(label);
		// �ؽ�Ʈ �Է¶�
		JTextField field = new JTextField("");
		field.setLocation(60, 10);
		field.setSize(200, 20);
		c.add(field);
		
		// ���� ����
		label = new JLabel("�й�");
		label.setLocation(10, 40);
		label.setSize(200, 20);
		c.add(label);
		field = new JTextField("");
		field.setLocation(60, 40);
		field.setSize(200, 20);
		c.add(field);
		
		label = new JLabel("����");
		label.setLocation(10, 70);
		label.setSize(200, 20);
		c.add(label);
		field = new JTextField("");
		field.setLocation(60, 70);
		field.setSize(200, 20);
		c.add(field);
		
		label = new JLabel("����ó");
		label.setLocation(10, 100);
		label.setSize(200, 20);
		c.add(label);
		field = new JTextField("");
		field.setLocation(60, 100);
		field.setSize(200, 20);
		c.add(field);
		
		// Ȯ�� & ��� ��ư
		JButton btn = new JButton("Ȯ��");
		btn.setLocation(80, 140);
		btn.setSize(60, 30);
		c.add(btn, BorderLayout.SOUTH);
		
		btn = new JButton("���");
		btn.setLocation(150, 140);
		btn.setSize(60, 30);
		c.add(btn, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new GuiTest();
	}
}