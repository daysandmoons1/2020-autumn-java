// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 5.
// ������ȣ : �ǽ� 3
// �������� : Ŭ�� ���� ����

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickPracticeFrame extends JFrame {
	public ClickPracticeFrame() {
		
		// �⺻ ����
		setTitle("Ŭ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		// �ʿ��� ������Ʈ ���� �� ���� �� ����Ʈ �ҿ� ����
		JLabel label = new JLabel("C");
		label.setLocation(100, 100);
		label.setSize(10, 10);
		c.add(label);
		
		// ���콺 ������ �ۼ�
		label.addMouseListener(new MouseAdapter() {
			
			// ���콺 Ŭ����
			public void mouseClicked(MouseEvent e) {
				
				// �������� �� ����
				label.setLocation((int)(Math.random()*500), (int)(Math.random()*500));
				System.out.println(label.getLocation());
			}
		});
		
		setSize(500, 500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ClickPracticeFrame();

	}

}
