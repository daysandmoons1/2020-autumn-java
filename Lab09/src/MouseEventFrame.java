// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 5.
// ������ȣ : �ǽ� 3
// �������� : �˶��

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		
		// �⺻ ����
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �ʿ��� ������Ʈ ���� �� ����
		JLabel luv = new JLabel("Love Lava");
		c.add(luv);
		
		// ���콺 ������
		luv.addMouseListener(new MouseAdapter() {
			
			// JLabel ������Ʈ ���� ���콺�� �ö� ��
			public void mouseEntered(MouseEvent e) {
				luv.setText("�����");
			}
			
			// ���콺�� ��� ��
			public void mouseExited(MouseEvent e) {
				luv.setText("Love Lava");
			}
		});
		
		setSize(500, 100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MouseEventFrame();
	}

}
