// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 5.
// ������ȣ : �ǽ� 2
// �������� : ���� �����

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcFrame extends JFrame{
	public CalcFrame() {
		
		// �⺻ ����
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �ҿ� ���� ������Ʈ�� ����
		TextField num1 = new TextField(10);
		TextField num2 = new TextField(10);
		TextField result = new TextField(20);
		JButton cal = new JButton("=");
		
		// ������Ʈ ���̱�
		c.add(num1);c.add(new JLabel("x"));c.add(num2);
		c.add(cal);c.add(result);
		
		// �͸� ������
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// �� ���� ���� �� �ش� ������ �ʵ� �� ����
				int a = Integer.valueOf(num1.getText());
				int b = Integer.valueOf(num2.getText());
				int c = a * b;
				
				// result ������Ʈ�� �� �Է�
				result.setText(Integer.toString(c));
			}
		});
		
		setSize(500, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CalcFrame();
	}

}
