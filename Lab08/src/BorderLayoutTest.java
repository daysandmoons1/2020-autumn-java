// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 1.
// 문제번호 : 실습 1
// 문제설명 : 400 x 200 스윙 프로그램을 작성

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컨테이너
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		
		// 버튼 생성
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
