// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 7.
// ������ȣ : �ǽ� 1
// �������� : �۲� �ǽ�

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFontTest extends JFrame {
	
	//�г� ����
	private MyPanel panel = new MyPanel();
	
	public ColorFontTest() {
		setTitle("Color, Font ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(700, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//������
			//��Ʈ����
			//��� ���ڿ�
			g.setColor(Color.BLUE);
			g.setFont(new Font("�ü�", Font.PLAIN, 30));
			g.drawString("����: ���ѹα�(�ü� ��Ʈ)", 30, 50);
			
			g.setColor(Color.RED);
			g.setFont(new Font("�������üB", Font.ITALIC, 30));
			g.drawString("�ּ�: ����� ��걸(�������üB ��Ʈ)", 30, 100);
			
			g.setColor(Color.YELLOW);
			g.setFont(new Font("�޸ո���ü", Font.ITALIC, 50));
			g.drawString("����: �輱ȿ(�޸ո���ü ��Ʈ)", 30, 165);
			
			g.setColor(Color.GRAY);
			g.setFont(new Font("HY����B", Font.BOLD, 20));
			g.drawString("�й�:1812515(HY����B ��Ʈ)", 30, 230);
		}
	}
	
	public static void main(String[] args) {
		new ColorFontTest();
	}
}
