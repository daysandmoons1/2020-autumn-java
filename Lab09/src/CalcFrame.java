// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 5.
// 문제번호 : 실습 2
// 문제설명 : 계산기 만들기

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcFrame extends JFrame{
	public CalcFrame() {
		
		// 기본 설정
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 팬에 붙일 컴포넌트들 생성
		TextField num1 = new TextField(10);
		TextField num2 = new TextField(10);
		TextField result = new TextField(20);
		JButton cal = new JButton("=");
		
		// 컴포넌트 붙이기
		c.add(num1);c.add(new JLabel("x"));c.add(num2);
		c.add(cal);c.add(result);
		
		// 익명 리스너
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 새 변수 생성 후 해당 변수에 필드 값 저장
				int a = Integer.valueOf(num1.getText());
				int b = Integer.valueOf(num2.getText());
				int c = a * b;
				
				// result 컴포넌트에 값 입력
				result.setText(Integer.toString(c));
			}
		});
		
		setSize(500, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CalcFrame();
	}

}
