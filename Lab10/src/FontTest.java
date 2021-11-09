// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 6.
// ������ȣ : �ǽ� 1
// �������� : ��Ʈ ���� ȭ��

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class FontTest extends JFrame {
	
	// �ʿ��� ���� ���� �� ����
	private JRadioButton [] font = new JRadioButton[3];
	private JCheckBox [] style = new JCheckBox[2];
	
	private String [] fontTxt = {"����", "����", "�ü�"};
	private String [] styleTxt = {"BOLD", "ITALIC"};
	
	private JLabel result = new JLabel("");
	
	public FontTest() {
		
		// �⺻ ����
		super("Font ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel resultPanel = new JPanel();
		
		// ��� ���â ����
		Border resultBorder = BorderFactory.createTitledBorder("Font ���� ���");
		resultPanel.setBorder(resultBorder);
		resultPanel.setPreferredSize(new Dimension(230, 75)); 

		
		// ���� ��ư ����
		ButtonGroup fonts = new ButtonGroup();
		for(int i=0; i<fontTxt.length; i++) {
			font[i] = new JRadioButton(fontTxt[i]);
			fonts.add(font[i]);
			font[i].addItemListener(new MyFontItemListener());
		}
		for(int i=0; i<fontTxt.length; i++){
			fonts.add(font[i]);
		}
		
		// üũ�ڽ� ����
		for(int i=0; i<styleTxt.length; i++) {
			style[i] = new JCheckBox(styleTxt[i]);
			style[i].addItemListener(new MyStyleItemListener());
		}
		
		// ���̺� ����
		JLabel lb1 = new JLabel("Font ����   ");
		JLabel lb2 = new JLabel("Style ����   ");
		JLabel lb3 = new JLabel("Size ����   ");
		JLabel lb4 = new JLabel("Text ����   ");
		
		// ������ ����
		JTextField size = new JTextField(15);
		size.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				try {
					result.setFont(new Font(result.getFont().getName(), result.getFont().getStyle(), Integer.valueOf(size.getText())));
				}catch(Exception ex) {
					return;
				}
				
			}
		});
		
		// ���� ��ȯ
		JTextField contxt = new JTextField(15);
		contxt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				result.setText(contxt.getText());
			}
		});
		
		// ������Ʈ ����
		c.add(lb1);c.add(font[0]);c.add(font[1]);c.add(font[2]);
		c.add(lb2);c.add(style[0]);c.add(style[1]);
		c.add(lb3);c.add(size);
		c.add(lb4);c.add(contxt);
		resultPanel.add(result); c.add(resultPanel);
		
		setSize(270, 250);
		setVisible(true);
		
	}
	
	// ���� ��ư ������
	class MyFontItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			
			if(font[0].isSelected())
				result.setFont(new Font("����", result.getFont().getStyle(), result.getFont().getSize()));
			else if(font[1].isSelected())
				result.setFont(new Font("����", result.getFont().getStyle(), result.getFont().getSize()));
			else
				result.setFont(new Font("�ü�", result.getFont().getStyle(), result.getFont().getSize()));
		}
	}
	
	// üũ �ڽ� ������
	class MyStyleItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == style[0]) {
					result.setFont(new Font(result.getFont().getName(), Font.BOLD, result.getFont().getSize()));
				}
				else if(e.getItem() == style[1])
					result.setFont(new Font(result.getFont().getName(), Font.ITALIC, result.getFont().getSize()));
			}
			else {
				result.setFont(new Font(result.getFont().getName(), Font.PLAIN, result.getFont().getSize()));
			}
		}
	}
	
	public static void main(String[] args) {
		new FontTest();

	}
}
