// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 6.
// ������ȣ : �ǽ� 5
// �������� : ���� ��Ʈ �����

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PieChartFrame extends JFrame{
	
	// �ʿ��� ������Ʈ �� ���� ����
	private JPanel t = new JPanel();
	private GraphPanel g = new GraphPanel();
	private JTextField [] tf = new JTextField[4];
	private JLabel [] label = new JLabel[4];
	private JLabel [] state = new JLabel[4];
	private String [] names = {"apple", "cherry", "strawberry", "prune"};
	private int [] value = new int[4];
	private Color [] colors = {new Color(251, 22, 13), new Color(72, 22, 243), new Color(236, 12, 253), new Color(255, 128, 0)};
	
	public PieChartFrame() {
		
		// �⺻ ����
		super("���� ��Ʈ �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		// ���� �Է� ���̺� ����
		for(int i=0; i<names.length; i++) {
			label[i] = new JLabel(names[i]);
			tf[i] = new JTextField(5);
			tf[i].addActionListener(new MyActionListener());
			t.add(label[i]);
			t.add(tf[i]);
		}
		
		// �г� ���� �� ����Ʈ �ҿ� ����
		t.setBackground(Color.LIGHT_GRAY);
		
		c.add(t, BorderLayout.NORTH);
		c.add(g, BorderLayout.CENTER);
		
		setSize(500, 400);
		setVisible(true);
	}
	
	// ���� ������ �� �׼� ������
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int sum = 0;
			
			// �Էµ� ���� ��� ����
			for(int i=0; i<names.length; i++)
				sum += Integer.valueOf(tf[i].getText());
			
			// �� �׸� ���� ��� �� ����
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
			
			// ���� ��� ���̺� ����
			for (int i = 0; i < names.length; i++) {
			    g.setColor(colors[i]);
			    g.drawString(names[i] + " " + Math.round(value[i] * 100 / 360) + "%", 50 + i * 100, 20);
			}
			
			// ����� ���� ���� ���� �׷��� �׸���
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
