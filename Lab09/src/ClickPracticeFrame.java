// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 5.
// 문제번호 : 실습 3
// 문제설명 : 클릭 스윙 연습

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickPracticeFrame extends JFrame {
	public ClickPracticeFrame() {
		
		// 기본 설정
		setTitle("클릭 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		// 필요한 컴포넌트 생성 및 설정 후 컨텐트 팬에 붙임
		JLabel label = new JLabel("C");
		label.setLocation(100, 100);
		label.setSize(10, 10);
		c.add(label);
		
		// 마우스 리스너 작성
		label.addMouseListener(new MouseAdapter() {
			
			// 마우스 클릭시
			public void mouseClicked(MouseEvent e) {
				
				// 랜덤으로 값 변경
				label.setLocation((int)(Math.random()*500), (int)(Math.random()*500));
				System.out.println(label.getLocation());
			}
		});
		
		setSize(500, 500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ClickPracticeFrame();

	}

}
