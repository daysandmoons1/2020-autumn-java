// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 7.
// 문제번호 : 실습 1
// 문제설명 : 글꼴 실습

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFontTest extends JFrame {
	
	//패널 생성
	private MyPanel panel = new MyPanel();
	
	public ColorFontTest() {
		setTitle("Color, Font 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(700, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//색상설정
			//폰트설정
			//출력 문자열
			g.setColor(Color.BLUE);
			g.setFont(new Font("궁서", Font.PLAIN, 30));
			g.drawString("국적: 대한민국(궁서 폰트)", 30, 50);
			
			g.setColor(Color.RED);
			g.setFont(new Font("양재깨비체B", Font.ITALIC, 30));
			g.drawString("주소: 서울시 용산구(양재깨비체B 폰트)", 30, 100);
			
			g.setColor(Color.YELLOW);
			g.setFont(new Font("휴먼매직체", Font.ITALIC, 50));
			g.drawString("성명: 김선효(휴먼매직체 폰트)", 30, 165);
			
			g.setColor(Color.GRAY);
			g.setFont(new Font("HY나무B", Font.BOLD, 20));
			g.drawString("학번:1812515(HY나무B 폰트)", 30, 230);
		}
	}
	
	public static void main(String[] args) {
		new ColorFontTest();
	}
}
