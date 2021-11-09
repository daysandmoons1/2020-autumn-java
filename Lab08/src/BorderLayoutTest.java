// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 1.
// ������ȣ : �ǽ� 1
// �������� : 400 x 200 ���� ���α׷��� �ۼ�

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �����̳�
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		
		// ��ư ����
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
