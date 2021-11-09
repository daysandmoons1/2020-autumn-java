// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 8.
// ������ȣ : �ǽ� 6
// �������� : �׷��� �׸���

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class DrawGraphic extends JFrame {
	public DrawGraphic() {
		
		// �⺻ ����
		setTitle("Menu ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new DrawPanel(), BorderLayout.CENTER);
		
		setSize(500,500);
		setVisible(true);
	}
	
	// �׸��� �г�
	class DrawPanel extends JPanel {
		// ���� ����
		private JToolBar tBar = new JToolBar("Menu");
		
		// ���� ������Ʈ ����
		private JButton [] graphicBtn = new JButton[4];
		private String [] types = {"line", "tri", "rect", "cir"};
		private JButton colorBtn = new JButton("color");
		
		// �׸� ��ǥ ����
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		
		// �׸��� �Ӽ�
		private Color color = new Color(0);
		private String state = "";
		private Color selectedColor = new Color(0);
		
		public DrawPanel() {
			
			// ���� ��
			tBar.add(new JLabel("����"));
			for(int i=0; i<types.length; i++) {
				graphicBtn[i] = new JButton(types[i]);
				graphicBtn[i].addActionListener(new MyGraphicBtnListener());
				tBar.add(graphicBtn[i]);
			}
			
			// �� ���� ��
			tBar.add(new JLabel("�� ����"));
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
			
			// ���� �׸���
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					// �� �׸� �׸� �� ���� �׸� ����
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
				
				// ���� ��ư ������ state �� ����
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
				
				// state ���� ���� �ٸ� ���� �׸�
				if(state == "line") {
					g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
				}else if(state == "tri") {
					//�غ�
					g.drawLine((int)s.getX(), (int)e.getY(), (int)e.getX(), (int)e.getY());
					//���ʺ�
					g.drawLine((int)s.getX() + ((int)e.getX() - (int)s.getX()) / 2, (int)s.getY(), (int)s.getX(), (int)e.getY());
					//�����ʺ�
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