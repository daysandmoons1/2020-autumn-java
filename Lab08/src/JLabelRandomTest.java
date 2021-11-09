// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 1.
// 문제번호 : 실습 3
// 문제설명 : 무작위 스윙 만들기

import javax.swing.*;
import java.awt.*;

public class JLabelRandomTest extends JFrame {
	public JLabelRandomTest() {
		setTitle("Random Label's");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컨테이너
		Container c = getContentPane();
		c.setLayout(null);
		
		// 랜덤으로 라벨 배치
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel("");
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			label.setBackground(Color.blue);
			label.setLocation(x,y);
			label.setSize(10,10);
			label.setOpaque(true);
			c.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
		                          
	public static void main(String[] args) {
		new JLabelRandomTest();
	}
}
