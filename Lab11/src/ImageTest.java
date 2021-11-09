// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 6.
// ������ȣ : �ǽ� 3
// �������� : �׸��� �� ĥ�ϱ�

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageTest extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public ImageTest() {
		setTitle("�׷��� �̹��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("src/back.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//���� ���
			g.drawImage(img, 0, 0, (getWidth()-10)/2, (getHeight()-10)/2, 0, 0, img.getWidth(null)/2, img.getHeight(null)/2, this);
			
			//���� �ϴ�
			g.drawImage(img, 0, getHeight()/2+5, (getWidth()-10)/2, getHeight()+5, 0, img.getHeight(null)/2, img.getWidth(null)/2, img.getHeight(null), this);
			
			//���� ���
			g.drawImage(img, getWidth()/2+5, 0, getWidth()+5, (getHeight()-10)/2, img.getWidth(null)/2, 0, img.getWidth(null), img.getHeight(null)/2, this);
			
			//���� �ϴ�
			g.drawImage(img, getWidth()/2+5, getHeight()/2+5, getWidth()+5, getHeight()+10, img.getWidth(null)/2, img.getHeight(null)/2, img.getWidth(null), img.getHeight(null), this);
		}
	}
	
	public static void main(String[] args) {
		new ImageTest();
	}

}
