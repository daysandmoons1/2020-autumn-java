// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 6.
// ������ȣ : �ǽ� 4
// �������� : ��ȣ�� �����

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficTest extends JFrame{
	
	// �ʿ��� ������Ʈ �� ���� ����
	private SignalPanel signals = new SignalPanel();
	private JButton btn = new JButton("Traffic Light Turns On");
	private int state = 0;
	
	public TrafficTest() {
		
		// �⺻ ����
		setTitle("��ȣ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		// ��ư �׼� �߰�
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ư �Է� �� ���� ����
				state++;
				if(state == 3)
					state = 0;
				// �ٽ� �׸���
				repaint();
			}
		});
		
		c.add(signals, BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);
		
		setSize(300, 500);
		setVisible(true);
	}
	
	class SignalPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(100, 100, 100, 100);
			g.drawOval(100, 200, 100, 100);
			g.drawOval(100, 300, 100, 100);
			
			// ���¿� ���� �ٸ� �׸��� �׸�
			if(state == 0) {
				g.setColor(Color.RED);
				g.fillOval(100, 100, 100, 100);
			}else if(state == 1) {
				g.setColor(Color.GREEN);
				g.fillOval(100, 200, 100, 100);
			}else {
				g.setColor(Color.YELLOW);
				g.fillOval(100, 300, 100, 100);
			}
				
		}

	}
	public static void main(String[] args) {
		new TrafficTest();
	}

}
