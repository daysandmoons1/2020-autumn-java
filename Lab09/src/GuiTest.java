// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 5.
// 문제번호 : 실습 1
// 문제설명 : GUI 작성

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiTest extends JFrame {
	public GuiTest() {
		
		// 기본 설정
		setTitle("GUI TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 필요한 컴포넌트 생성
		TextField tf1 = new TextField(20);
		TextField tf2 = new TextField(20);
		TextField tf3 = new TextField(20);
		TextField tf4 = new TextField(20);
		
		JButton check = new JButton("확인");
		JButton cancel = new JButton("취소");
		
		// 컨텐트 팬에 붙임
		c.add(new JLabel("이름     "));c.add(tf1);
		c.add(new JLabel("학번     "));c.add(tf2);
		c.add(new JLabel("전공     "));c.add(tf3);
		c.add(new JLabel("연락처 "));c.add(tf4);
		c.add(check);c.add(cancel);
		
		// 확인 버튼 눌렀을 시 액션 리스너 작성
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(tf1.getText() + "\t");
				System.out.print(tf2.getText() + "\t");
				System.out.print(tf3.getText() + "\t");
				System.out.print(tf4.getText() + "\t");
			}
		});
		
		// 취소 버튼 눌렀을 시 종료
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GuiTest();

	}

}


