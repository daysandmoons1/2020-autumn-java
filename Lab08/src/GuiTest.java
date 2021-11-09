// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 1.
// 문제번호 : 실습 4
// 문제설명 : 배치관리자 혼합 사용 실습

import javax.swing.*;
import java.awt.*;

public class GuiTest extends JFrame {
	public GuiTest() {
		setTitle("GUI TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컨테이너 생성
		Container c = getContentPane();
		c.setLayout(null);
		
		// label
		JLabel label = new JLabel("이름");
		label.setLocation(10, 10);
		label.setSize(200, 20);
		c.add(label);
		// 텍스트 입력란
		JTextField field = new JTextField("");
		field.setLocation(60, 10);
		field.setSize(200, 20);
		c.add(field);
		
		// 이하 동일
		label = new JLabel("학번");
		label.setLocation(10, 40);
		label.setSize(200, 20);
		c.add(label);
		field = new JTextField("");
		field.setLocation(60, 40);
		field.setSize(200, 20);
		c.add(field);
		
		label = new JLabel("전공");
		label.setLocation(10, 70);
		label.setSize(200, 20);
		c.add(label);
		field = new JTextField("");
		field.setLocation(60, 70);
		field.setSize(200, 20);
		c.add(field);
		
		label = new JLabel("연락처");
		label.setLocation(10, 100);
		label.setSize(200, 20);
		c.add(label);
		field = new JTextField("");
		field.setLocation(60, 100);
		field.setSize(200, 20);
		c.add(field);
		
		// 확인 & 취소 버튼
		JButton btn = new JButton("확인");
		btn.setLocation(80, 140);
		btn.setSize(60, 30);
		c.add(btn, BorderLayout.SOUTH);
		
		btn = new JButton("취소");
		btn.setLocation(150, 140);
		btn.setSize(60, 30);
		c.add(btn, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new GuiTest();
	}
}