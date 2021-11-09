// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 6.
// ������ȣ : �ǽ� 3
// �������� : �����̴� �ǽ�

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SliderTest extends JFrame {
	private JTextArea ta = new JTextArea(10, 20);
	private JLabel label = new JLabel();
	
	public SliderTest() {
		super("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		// �����̴� ����
		JPanel sliderPanel = new JPanel();
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		
		slider.setPreferredSize(new Dimension(300, 50));
		sliderPanel.add(slider);
		
		// �����̴� ������
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				try {
					ta.setText(ta.getText().substring(0, slider.getValue()));
				}catch(Exception ex){
					return;
				}
				
			}
		});
		
		// Text Area ����
		ta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				slider.setValue(ta.getText().length());
				if(ta.getText().length() > 99)
					ta.setEditable(false);
				else
					ta.setEditable(true);
			}
		});
		
		// ������Ʈ ����
		c.add(label);
		c.add(new JScrollPane(ta), BorderLayout.NORTH);
		c.add(sliderPanel, BorderLayout.SOUTH);
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SliderTest();

	}

}
