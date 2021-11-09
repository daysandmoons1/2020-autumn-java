// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 5.
// ������ȣ : �ǽ� 5
// �������� : ����Ʈ�� �� �ٲٱ�

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseDraggingFrame extends JFrame {
	public MouseDraggingFrame() {
		
		// �⺻ ����
		setTitle("Yellow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		
		// ����Ʈ �ҿ� ���콺 �̺�Ʈ �߻� ��
		c.addMouseMotionListener(new MouseAdapter() {
			
			// �巡�� �ϸ� ���� ��������� ����
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			
			// ���콺�� �����̱⸸ �� �� ���� �ʷϻ����� ����
			public void mouseMoved(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}
		});
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseDraggingFrame();
	}

}
