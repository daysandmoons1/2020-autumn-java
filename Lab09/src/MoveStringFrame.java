// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 5.
// ������ȣ : �ǽ� 6
// �������� : Ű���� �Է�

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveStringFrame extends JFrame {
	public MoveStringFrame() {
		
		// �⺻ ����
		setTitle("Left Ű�� ���ڿ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �ʿ��� ������Ʈ ���� �� ����Ʈ �ҿ� ����
		JLabel luv = new JLabel("Love Lava");
		c.add(luv);

		// Ű ������
		c.addKeyListener(new KeyAdapter() {
			
			// Ű�� �Էµ��� ��
			public void keyPressed(KeyEvent e) {
				
				// ���� ȭ��ǥ��� JLabel �� �޾� tmp�� ���� ��
				// tmp ���� ȸ��
				// ȸ���� tmp ���� JLabel �ʵ忡 ����
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					String tmp = luv.getText();
					tmp = luv.getText().substring(1).concat(luv.getText().substring(0, 1));
					luv.setText(tmp);
				}
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new MoveStringFrame();
	}
}