// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 1.
// ������ȣ : �ǽ� 3
// �������� : ������ ���� �����

import javax.swing.*;
import java.awt.*;

public class JLabelRandomTest extends JFrame {
	public JLabelRandomTest() {
		setTitle("Random Label's");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �����̳�
		Container c = getContentPane();
		c.setLayout(null);
		
		// �������� �� ��ġ
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel("");
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			label.setBackground(Color.blue);
			label.setLocation(x,y);
			label.setSize(10,10);
			label.setOpaque(true);
			c.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
		                          
	public static void main(String[] args) {
		new JLabelRandomTest();
	}
}
