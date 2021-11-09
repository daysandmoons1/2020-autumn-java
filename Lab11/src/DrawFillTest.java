// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 6.
// 문제번호 : 실습 2
// 문제설명 : 그리기 및 칠하기

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class DrawFillTest extends JFrame {
	
	// 패널 생성
	private GraphPanel graphPanel = new GraphPanel();
	private CirclePanel circlePanel = new CirclePanel();
	private StarPanel starPanel = new StarPanel();
	
	public DrawFillTest() {
		
		// 기본 설정
		setTitle("Draw Fill 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 3));
		
		// 컨테이너에 패널 부착
		c.add(graphPanel);c.add(circlePanel);c.add(starPanel);
		
		setSize(550, 250);
		setVisible(true);
	}
	
	// 그래프 그리기
	class GraphPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRoundRect(10, 10, 150, 150, 30, 30);
			g.setColor(Color.RED);
			g.fillRect(30, 50, 20, 100);
			g.setColor(Color.BLUE);
			g.fillRect(60, 70, 20, 80);
			g.setColor(Color.YELLOW);
			g.fillRect(90, 110, 20, 40);
			g.setColor(Color.GREEN);
			g.fillRect(120, 90, 20, 60);
		}
	}
	
	// 원 그리기
	class CirclePanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRoundRect(10, 10, 150, 150, 30, 30);
			g.setColor(Color.RED);
			g.fillArc(20, 20, 130, 130, 80, 110);
			g.setColor(Color.BLUE);
			g.fillArc(20, 20, 130, 130, 190, 30);
			g.setColor(Color.YELLOW);
			g.fillArc(20, 20, 130, 130, 220, 90);
			g.setColor(Color.GREEN);
			g.fillArc(20, 20, 130, 130, 310, 130);
		}
	}
	
	// 별 그리기
	class StarPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRoundRect(10, 10, 150, 150, 30, 30);
			
			int x2[] = { 210,175,60,150,110,210,310,270,360,245,210 };
			int y2[] = { 60,160,160,225,340,270,340,225,160,160,60 };
			
			for(int i=0; i<10; i++) {
				x2[i] = x2[i] / 3 + 15;
				y2[i] = y2[i] / 3 + 15;
			}
			
			g.setColor(Color.PINK);
			g.fillPolygon( x2, y2, 10 );
		}
	}
	public static void main(String[] args) {
		new DrawFillTest();
	}

}
