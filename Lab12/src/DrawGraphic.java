// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 8.
// 문제번호 : 실습 6
// 문제설명 : 그래픽 그리기

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class DrawGraphic extends JFrame {
	public DrawGraphic() {
		
		// 기본 설정
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new DrawPanel(), BorderLayout.CENTER);
		
		setSize(500,500);
		setVisible(true);
	}
	
	// 그리기 패널
	class DrawPanel extends JPanel {
		// 툴바 생성
		private JToolBar tBar = new JToolBar("Menu");
		
		// 툴바 컴포넌트 생성
		private JButton [] graphicBtn = new JButton[4];
		private String [] types = {"line", "tri", "rect", "cir"};
		private JButton colorBtn = new JButton("color");
		
		// 그림 좌표 변수
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		
		// 그리기 속성
		private Color color = new Color(0);
		private String state = "";
		private Color selectedColor = new Color(0);
		
		public DrawPanel() {
			
			// 도형 툴
			tBar.add(new JLabel("도형"));
			for(int i=0; i<types.length; i++) {
				graphicBtn[i] = new JButton(types[i]);
				graphicBtn[i].addActionListener(new MyGraphicBtnListener());
				tBar.add(graphicBtn[i]);
			}
			
			// 색 선택 툴
			tBar.add(new JLabel("색 선택"));
			tBar.add(colorBtn);
			colorBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					if(cmd.equals("color")){
						selectedColor = JColorChooser.showDialog(null, "Color", new Color(204, 0, 204));
						if(selectedColor != null)
							repaint();
					}
				}
			});
			
			// 도형 그리기
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					// 새 그림 그릴 시 이전 그림 삭제
					vStart.clear();
					vEnd.clear();
					
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);
					repaint();
				}
			});
			add(tBar);
		}
		
		class MyGraphicBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				
				// 도형 버튼 누르면 state 값 변경
				if(e.getActionCommand() == "line") {
					state = "line";
				}else if(e.getActionCommand() == "tri") {
					state = "tri";
				}else if(e.getActionCommand() == "rect") {
					state = "rect";
				}else if(e.getActionCommand() == "cir") {
					state = "cir";
				}
			}
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(selectedColor);
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				// state 값에 따라 다른 도형 그림
				if(state == "line") {
					g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
				}else if(state == "tri") {
					//밑변
					g.drawLine((int)s.getX(), (int)e.getY(), (int)e.getX(), (int)e.getY());
					//왼쪽변
					g.drawLine((int)s.getX() + ((int)e.getX() - (int)s.getX()) / 2, (int)s.getY(), (int)s.getX(), (int)e.getY());
					//오른쪽변
					g.drawLine((int)s.getX() + ((int)e.getX() - (int)s.getX()) / 2, (int)s.getY(), (int)e.getX(), (int)e.getY());
				}else if(state == "rect") {
					g.drawRect((int)s.getX(), (int)s.getY(), (int)e.getX() - (int)s.getX(), (int)e.getY() - (int)s.getY());
				}else if(state == "cir") {
					g.drawOval((int)s.getX(), (int)s.getY(), (int)e.getX() - (int)s.getX(), (int)e.getY() - (int)s.getY());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new DrawGraphic();

	}

}
