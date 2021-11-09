// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 6.
// 문제번호 : 실습 3
// 문제설명 : 그리기 및 칠하기

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageTest extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public ImageTest() {
		setTitle("그래픽 이미지 연습");
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
			
			//좌측 상단
			g.drawImage(img, 0, 0, (getWidth()-10)/2, (getHeight()-10)/2, 0, 0, img.getWidth(null)/2, img.getHeight(null)/2, this);
			
			//좌측 하단
			g.drawImage(img, 0, getHeight()/2+5, (getWidth()-10)/2, getHeight()+5, 0, img.getHeight(null)/2, img.getWidth(null)/2, img.getHeight(null), this);
			
			//우측 상단
			g.drawImage(img, getWidth()/2+5, 0, getWidth()+5, (getHeight()-10)/2, img.getWidth(null)/2, 0, img.getWidth(null), img.getHeight(null)/2, this);
			
			//우측 하단
			g.drawImage(img, getWidth()/2+5, getHeight()/2+5, getWidth()+5, getHeight()+10, img.getWidth(null)/2, img.getHeight(null)/2, img.getWidth(null), img.getHeight(null), this);
		}
	}
	
	public static void main(String[] args) {
		new ImageTest();
	}

}
