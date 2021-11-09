// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 6.
// 문제번호 : 실습 1
// 문제설명 : 폰트 설정 화면

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class FontTest extends JFrame {
	
	// 필요한 변수 선언 및 생성
	private JRadioButton [] font = new JRadioButton[3];
	private JCheckBox [] style = new JCheckBox[2];
	
	private String [] fontTxt = {"굴림", "돋움", "궁서"};
	private String [] styleTxt = {"BOLD", "ITALIC"};
	
	private JLabel result = new JLabel("");
	
	public FontTest() {
		
		// 기본 설정
		super("Font 설정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel resultPanel = new JPanel();
		
		// 결과 출력창 설정
		Border resultBorder = BorderFactory.createTitledBorder("Font 설정 결과");
		resultPanel.setBorder(resultBorder);
		resultPanel.setPreferredSize(new Dimension(230, 75)); 

		
		// 라디오 버튼 생성
		ButtonGroup fonts = new ButtonGroup();
		for(int i=0; i<fontTxt.length; i++) {
			font[i] = new JRadioButton(fontTxt[i]);
			fonts.add(font[i]);
			font[i].addItemListener(new MyFontItemListener());
		}
		for(int i=0; i<fontTxt.length; i++){
			fonts.add(font[i]);
		}
		
		// 체크박스 생성
		for(int i=0; i<styleTxt.length; i++) {
			style[i] = new JCheckBox(styleTxt[i]);
			style[i].addItemListener(new MyStyleItemListener());
		}
		
		// 레이블 생성
		JLabel lb1 = new JLabel("Font 설정   ");
		JLabel lb2 = new JLabel("Style 설정   ");
		JLabel lb3 = new JLabel("Size 설정   ");
		JLabel lb4 = new JLabel("Text 내용   ");
		
		// 사이즈 조절
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
		
		// 내용 변환
		JTextField contxt = new JTextField(15);
		contxt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				result.setText(contxt.getText());
			}
		});
		
		// 컴포넌트 부착
		c.add(lb1);c.add(font[0]);c.add(font[1]);c.add(font[2]);
		c.add(lb2);c.add(style[0]);c.add(style[1]);
		c.add(lb3);c.add(size);
		c.add(lb4);c.add(contxt);
		resultPanel.add(result); c.add(resultPanel);
		
		setSize(270, 250);
		setVisible(true);
		
	}
	
	// 라디오 버튼 리스너
	class MyFontItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			
			if(font[0].isSelected())
				result.setFont(new Font("굴림", result.getFont().getStyle(), result.getFont().getSize()));
			else if(font[1].isSelected())
				result.setFont(new Font("돋움", result.getFont().getStyle(), result.getFont().getSize()));
			else
				result.setFont(new Font("궁서", result.getFont().getStyle(), result.getFont().getSize()));
		}
	}
	
	// 체크 박스 리스너
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
