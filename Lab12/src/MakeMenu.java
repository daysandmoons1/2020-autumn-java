// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 8.
// 문제번호 : 실습 1
// 문제설명 : 메뉴 실습

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MakeMenu extends JFrame{
	private MyDialog dialog;
	private JLabel label = new JLabel("Text");
	public MakeMenu() {
		// 기본 설정
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		dialog = new MyDialog(this, "");
		
		c.add(new MyPanel(), BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		
		// 메뉴바 생성
		private JMenuBar mb = new JMenuBar();
		
		// 파일 메뉴 생성
		private JMenu fMenu = new JMenu("파일");
		private JMenuItem open = new JMenuItem("열기");
		private JMenuItem save = new JMenuItem("저장");
		private JMenuItem exit = new JMenuItem("종료");
		
		// 편집 메뉴 생성
		private JMenu eMenu = new JMenu("편집");
		private JMenuItem color = new JMenuItem("색 선택");
		private JMenuItem font = new JMenuItem("폰트");
		private JMenuItem editTxt = new JMenuItem("텍스트 변경");
		
		// 도움말 메뉴 생성
		private JMenu hMenu = new JMenu("도움말");
		private JMenuItem version = new JMenuItem("버전 정보");
		
//		// 레이블 생성
//		private JLabel label = new JLabel("Text");
		
		public MyPanel() {
			// 메뉴 설정
			fMenu.add(open);
			fMenu.add(save);
			fMenu.addSeparator(); // 구분선
			fMenu.add(exit);
			mb.add(fMenu);
			
			eMenu.add(color);
			eMenu.add(font);
			eMenu.add(editTxt);
			mb.add(eMenu);
			
			hMenu.add(version);
			mb.add(hMenu);
			
			setJMenuBar(mb);
			
			// 레이블 설정
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setVerticalAlignment(SwingConstants.NORTH);
			label.setToolTipText("편집에 따라 변경될 영역입니다.");
			add(label);
			
			// 종료 메뉴 설정
			exit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "종료 확인", JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION)
						System.exit(0);
					else
						return;
				}
			});
			
			// 텍스트 변경 메뉴 설정
			editTxt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String txt = JOptionPane.showInputDialog("변경할 텍스트를 입력하세요.");
					if (txt != null) {
						label.setText(txt);
					}
						
				}
			});
			
			// 버전 확인 메뉴 설정
			version.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "테스트 v1.0", "버전 정보", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			
			// 열기 메뉴 설정
			open.addActionListener(new ActionListener() {
				private JFileChooser chooser = new JFileChooser();
				public void actionPerformed(ActionEvent e) {
					int ret = chooser.showOpenDialog(null);
					if(ret == JFileChooser.APPROVE_OPTION) {
						String addr = chooser.getSelectedFile().getPath();
						label.setText(addr + "파일이 선택되었습니다.");
					}else {
						return;
					}
				}
			});
			
			// 저장 메뉴 설정
			save.addActionListener(new ActionListener() {
				private JFileChooser chooser = new JFileChooser();
				public void actionPerformed(ActionEvent e) {
					int ret = chooser.showSaveDialog(null);
					if(ret == JFileChooser.APPROVE_OPTION) {
						String addr = chooser.getSelectedFile().getPath();
						label.setText(addr + "파일에 저장되었습니다.");
					}else {
						return;
					}
				}
			});
			
			// 색 선택 메뉴
			color.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					if(cmd.equals("색 선택")){
						Color selectedColor = JColorChooser.showDialog(null, "Color", new Color(204, 0, 204));
						if(selectedColor != null)
							label.setForeground(selectedColor);
					}
				}
			});
			
			// 폰트 설정 메뉴
			font.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dialog.setVisible(true);
				}
			});
		}
	}
	
	class MyDialog extends JDialog {
		
		private String [] fonts = {"굴림", "돋움", "바탕", "궁서"};
		private String [] styles = {"BOLD", "ITALIC"};
		
		private JCheckBox [] style = new JCheckBox[2];
		private JButton setBtn = new JButton("설정");
		
		// 원래 프레임에 전달할 변수 설정
		private int fontIndex = -1;
		private int setBold = -1;
		private int setItalic = -1;
		private int size = 0;

		public MyDialog(JFrame frame, String title) {
			super(frame, title, true); // 모달 다이얼로그로 설정
			setLayout(new FlowLayout());
			setSize(200, 200);
			
			// 폰트 종류
			JComboBox<String> fontCombo = new JComboBox<String>(fonts);
			fontCombo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JComboBox<String> cb = (JComboBox<String>)e.getSource();
					fontIndex = cb.getSelectedIndex();
				}
			});
			
			// 폰트 스타일
			for(int i=0; i<styles.length; i++) {
				style[i] = new JCheckBox(styles[i]);
				style[i].addItemListener(new MyStyleListener());
			}
			
			// 사이즈 조절
			JTextField tf = new JTextField(15);
			tf.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					try {
						size = Integer.valueOf(tf.getText());
					}catch(Exception ex) {
						return;
					}
					
				}
			});
			
			// 컴포넌트 부착
			add(new JLabel("폰트 종류"));add(fontCombo);
			add(new JLabel("폰트 스타일"));add(style[0]);add(style[1]);
			add(new JLabel("폰트 크기"));add(tf);
			add(setBtn);
			
			// 설정 버튼
			setBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(setBold == 1 && setItalic == 1)label.setFont(new Font(fonts[fontIndex], Font.BOLD | Font.ITALIC, size));
					else if(setBold == 1) label.setFont(new Font(fonts[fontIndex], Font.BOLD, size));
					else if(setItalic == 1) label.setFont(new Font(fonts[fontIndex], Font.ITALIC, size));
					else label.setFont(new Font(fonts[fontIndex], Font.PLAIN, size));
					setVisible(false);
				}
			});
		}
		
		// 체크 박스 리스너
		class MyStyleListener implements ItemListener{
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getItem() == style[0]) {
						setBold = 1;
						System.out.println("볼드");
					}else if(e.getItem() == style[1]) {
						setItalic = 1;
						System.out.println("이탈릭");
					}
				}else {
					if(e.getItem() == style[0]) {
						setBold = 0;
						System.out.println("볼드해제");
					}else if(e.getItem() == style[1]) {
						setItalic = 0;
						System.out.println("이탈릭해제");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new MakeMenu();

	}

}
