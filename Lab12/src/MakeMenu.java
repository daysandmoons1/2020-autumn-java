// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 8.
// ������ȣ : �ǽ� 1
// �������� : �޴� �ǽ�

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MakeMenu extends JFrame{
	private MyDialog dialog;
	private JLabel label = new JLabel("Text");
	public MakeMenu() {
		// �⺻ ����
		setTitle("Menu ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		dialog = new MyDialog(this, "");
		
		c.add(new MyPanel(), BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		
		// �޴��� ����
		private JMenuBar mb = new JMenuBar();
		
		// ���� �޴� ����
		private JMenu fMenu = new JMenu("����");
		private JMenuItem open = new JMenuItem("����");
		private JMenuItem save = new JMenuItem("����");
		private JMenuItem exit = new JMenuItem("����");
		
		// ���� �޴� ����
		private JMenu eMenu = new JMenu("����");
		private JMenuItem color = new JMenuItem("�� ����");
		private JMenuItem font = new JMenuItem("��Ʈ");
		private JMenuItem editTxt = new JMenuItem("�ؽ�Ʈ ����");
		
		// ���� �޴� ����
		private JMenu hMenu = new JMenu("����");
		private JMenuItem version = new JMenuItem("���� ����");
		
//		// ���̺� ����
//		private JLabel label = new JLabel("Text");
		
		public MyPanel() {
			// �޴� ����
			fMenu.add(open);
			fMenu.add(save);
			fMenu.addSeparator(); // ���м�
			fMenu.add(exit);
			mb.add(fMenu);
			
			eMenu.add(color);
			eMenu.add(font);
			eMenu.add(editTxt);
			mb.add(eMenu);
			
			hMenu.add(version);
			mb.add(hMenu);
			
			setJMenuBar(mb);
			
			// ���̺� ����
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setVerticalAlignment(SwingConstants.NORTH);
			label.setToolTipText("������ ���� ����� �����Դϴ�.");
			add(label);
			
			// ���� �޴� ����
			exit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "���� Ȯ��", JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION)
						System.exit(0);
					else
						return;
				}
			});
			
			// �ؽ�Ʈ ���� �޴� ����
			editTxt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String txt = JOptionPane.showInputDialog("������ �ؽ�Ʈ�� �Է��ϼ���.");
					if (txt != null) {
						label.setText(txt);
					}
						
				}
			});
			
			// ���� Ȯ�� �޴� ����
			version.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "�׽�Ʈ v1.0", "���� ����", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			
			// ���� �޴� ����
			open.addActionListener(new ActionListener() {
				private JFileChooser chooser = new JFileChooser();
				public void actionPerformed(ActionEvent e) {
					int ret = chooser.showOpenDialog(null);
					if(ret == JFileChooser.APPROVE_OPTION) {
						String addr = chooser.getSelectedFile().getPath();
						label.setText(addr + "������ ���õǾ����ϴ�.");
					}else {
						return;
					}
				}
			});
			
			// ���� �޴� ����
			save.addActionListener(new ActionListener() {
				private JFileChooser chooser = new JFileChooser();
				public void actionPerformed(ActionEvent e) {
					int ret = chooser.showSaveDialog(null);
					if(ret == JFileChooser.APPROVE_OPTION) {
						String addr = chooser.getSelectedFile().getPath();
						label.setText(addr + "���Ͽ� ����Ǿ����ϴ�.");
					}else {
						return;
					}
				}
			});
			
			// �� ���� �޴�
			color.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					if(cmd.equals("�� ����")){
						Color selectedColor = JColorChooser.showDialog(null, "Color", new Color(204, 0, 204));
						if(selectedColor != null)
							label.setForeground(selectedColor);
					}
				}
			});
			
			// ��Ʈ ���� �޴�
			font.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dialog.setVisible(true);
				}
			});
		}
	}
	
	class MyDialog extends JDialog {
		
		private String [] fonts = {"����", "����", "����", "�ü�"};
		private String [] styles = {"BOLD", "ITALIC"};
		
		private JCheckBox [] style = new JCheckBox[2];
		private JButton setBtn = new JButton("����");
		
		// ���� �����ӿ� ������ ���� ����
		private int fontIndex = -1;
		private int setBold = -1;
		private int setItalic = -1;
		private int size = 0;

		public MyDialog(JFrame frame, String title) {
			super(frame, title, true); // ��� ���̾�α׷� ����
			setLayout(new FlowLayout());
			setSize(200, 200);
			
			// ��Ʈ ����
			JComboBox<String> fontCombo = new JComboBox<String>(fonts);
			fontCombo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JComboBox<String> cb = (JComboBox<String>)e.getSource();
					fontIndex = cb.getSelectedIndex();
				}
			});
			
			// ��Ʈ ��Ÿ��
			for(int i=0; i<styles.length; i++) {
				style[i] = new JCheckBox(styles[i]);
				style[i].addItemListener(new MyStyleListener());
			}
			
			// ������ ����
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
			
			// ������Ʈ ����
			add(new JLabel("��Ʈ ����"));add(fontCombo);
			add(new JLabel("��Ʈ ��Ÿ��"));add(style[0]);add(style[1]);
			add(new JLabel("��Ʈ ũ��"));add(tf);
			add(setBtn);
			
			// ���� ��ư
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
		
		// üũ �ڽ� ������
		class MyStyleListener implements ItemListener{
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getItem() == style[0]) {
						setBold = 1;
						System.out.println("����");
					}else if(e.getItem() == style[1]) {
						setItalic = 1;
						System.out.println("��Ż��");
					}
				}else {
					if(e.getItem() == style[0]) {
						setBold = 0;
						System.out.println("��������");
					}else if(e.getItem() == style[1]) {
						setItalic = 0;
						System.out.println("��Ż������");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new MakeMenu();

	}

}