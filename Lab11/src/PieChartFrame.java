// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 6.
// 문제번호 : 실습 5
// 문제설명 : 파이 차트 만들기

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PieChartFrame extends JFrame{
	
	// 필요한 컴포넌트 및 변수 선언
	private JPanel t = new JPanel();
	private GraphPanel g = new GraphPanel();
	private JTextField [] tf = new JTextField[4];
	private JLabel [] label = new JLabel[4];
	private JLabel [] state = new JLabel[4];
	private String [] names = {"apple", "cherry", "strawberry", "prune"};
	private int [] value = new int[4];
	private Color [] colors = {new Color(251, 22, 13), new Color(72, 22, 243), new Color(236, 12, 253), new Color(255, 128, 0)};
	
	public PieChartFrame() {
		
		// 기본 설정
		super("파이 차트 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		// 상태 입력 레이블 설정
		for(int i=0; i<names.length; i++) {
			label[i] = new JLabel(names[i]);
			tf[i] = new JTextField(5);
			tf[i].addActionListener(new MyActionListener());
			t.add(label[i]);
			t.add(tf[i]);
		}
		
		// 패널 설정 및 컨텐트 팬에 부착
		t.setBackground(Color.LIGHT_GRAY);
		
		c.add(t, BorderLayout.NORTH);
		c.add(g, BorderLayout.CENTER);
		
		setSize(500, 400);
		setVisible(true);
	}
	
	// 엔터 눌렀을 시 액션 리스너
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int sum = 0;
			
			// 입력된 값을 모두 더함
			for(int i=0; i<names.length; i++)
				sum += Integer.valueOf(tf[i].getText());
			
			// 각 항목에 비율 계산 후 대입
			for(int i=0; i<names.length; i++) {
				value[i] = (int) Math.round((double) Integer.valueOf(tf[i].getText()) / (double) sum * 360);
				repaint();
			}
		}
	}
	
	class GraphPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int startChart = 0;
			
			// 상태 출력 레이블 설정
			for (int i = 0; i < names.length; i++) {
			    g.setColor(colors[i]);
			    g.drawString(names[i] + " " + Math.round(value[i] * 100 / 360) + "%", 50 + i * 100, 20);
			}
			
			// 계산한 값에 따라 원형 그래프 그리기
			for (int i = 0; i < names.length; i++) {
			    g.setColor(colors[i]);
			    g.fillArc(150, 50, 200, 200, startChart, value[i]);
			    startChart = startChart + value[i];
			}
		}
	}
	
	public static void main(String[] args) {
		new PieChartFrame();
	}

}
