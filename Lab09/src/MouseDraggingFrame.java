// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 5.
// 문제번호 : 실습 5
// 문제설명 : 컨탠트팬 색 바꾸기

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseDraggingFrame extends JFrame {
	public MouseDraggingFrame() {
		
		// 기본 설정
		setTitle("Yellow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		
		// 컨텐트 팬에 마우스 이벤트 발생 시
		c.addMouseMotionListener(new MouseAdapter() {
			
			// 드래그 하면 색상 노란색으로 변경
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			
			// 마우스가 움직이기만 할 시 색상 초록색으로 변경
			public void mouseMoved(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}
		});
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseDraggingFrame();
	}

}
