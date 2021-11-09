// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 6.
// 문제번호 : 실습 4
// 문제설명 : 신호등 만들기

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficTest extends JFrame{
	
	// 필요한 컴포넌트 및 변수 선언
	private SignalPanel signals = new SignalPanel();
	private JButton btn = new JButton("Traffic Light Turns On");
	private int state = 0;
	
	public TrafficTest() {
		
		// 기본 설정
		setTitle("신호등");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		// 버튼 액션 추가
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼 입력 시 상태 변경
				state++;
				if(state == 3)
					state = 0;
				// 다시 그리기
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
			
			// 상태에 따라 다른 그림을 그림
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
