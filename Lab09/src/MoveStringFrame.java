// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 5.
// 문제번호 : 실습 6
// 문제설명 : 키보드 입력

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveStringFrame extends JFrame {
	public MoveStringFrame() {
		
		// 기본 설정
		setTitle("Left 키로 문자열 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 필요한 컴포넌트 생성 후 컨텐트 팬에 붙임
		JLabel luv = new JLabel("Love Lava");
		c.add(luv);

		// 키 리스너
		c.addKeyListener(new KeyAdapter() {
			
			// 키가 입력됐을 때
			public void keyPressed(KeyEvent e) {
				
				// 왼쪽 화살표라면 JLabel 값 받아 tmp에 저장 후
				// tmp 값을 회전
				// 회전된 tmp 값을 JLabel 필드에 저장
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