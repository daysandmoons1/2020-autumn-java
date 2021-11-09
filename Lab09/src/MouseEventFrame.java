// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 5.
// 문제번호 : 실습 3
// 문제설명 : 알라뷰

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		
		// 기본 설정
		setTitle("마우스 올리고 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 필요한 컴포넌트 생성 후 붙임
		JLabel luv = new JLabel("Love Lava");
		c.add(luv);
		
		// 마우스 리스너
		luv.addMouseListener(new MouseAdapter() {
			
			// JLabel 컴포넌트 위에 마우스가 올라갈 때
			public void mouseEntered(MouseEvent e) {
				luv.setText("라랑해");
			}
			
			// 마우스가 벗어날 때
			public void mouseExited(MouseEvent e) {
				luv.setText("Love Lava");
			}
		});
		
		setSize(500, 100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MouseEventFrame();
	}

}
