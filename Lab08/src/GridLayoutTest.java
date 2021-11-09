// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 1.
// ������ȣ : �ǽ� 2
// �������� : ������ ���� �����

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame {
	public GridLayoutTest() {
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���� ����
		Container c = getContentPane();
		GridLayout grid =new GridLayout(1, 10, 1, 1);
		c.setLayout(grid);
		
		// ��ư ����
		JButton btn = new JButton("0");
		btn.setBackground(Color.red);
		c.add(btn);
		btn = new JButton("1");
		btn.setBackground(Color.orange);
		c.add(btn);
		btn = new JButton("2");
		btn.setBackground(Color.yellow);
		c.add(btn);
		btn = new JButton("3");
		btn.setBackground(Color.green);
		c.add(btn);
		btn = new JButton("4");
		btn.setBackground(Color.cyan);
		c.add(btn);
		btn = new JButton("5");
		btn.setBackground(Color.blue);
		c.add(btn);
		btn = new JButton("6");
		btn.setBackground(Color.magenta);
		c.add(btn);
		btn = new JButton("7");
		btn.setBackground(Color.gray);
		c.add(btn);
		btn = new JButton("8");
		btn.setBackground(Color.pink);
		c.add(btn);
		btn = new JButton("9");
		btn.setBackground(Color.lightGray);
		c.add(btn);
	
		setSize(600, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
