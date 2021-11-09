// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 7. 6.
// 문제번호 : 실습 2
// 문제설명 : 리스트 수정

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ListTest extends JFrame {
	
	// 필요한 변수 선언
	private JTextField tf = new JTextField(27);
	private Vector<String> v = new Vector<String>();
	private JList<String> list = new JList<String>(v);
	private int index = -1;
	
	public ListTest() {
		
		// 기본 설정
		super("Font 설정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 수정 및 삭제 패널 컴포넌트 생성
		JPanel btnPanel = new JPanel();
		JTextField correct = new JTextField(15);
		JButton btnCorrect = new JButton("수정");
		JButton btnDelete = new JButton("삭제");
		
		btnPanel.add(correct);
		btnPanel.add(btnCorrect);
		btnPanel.add(btnDelete);
		
		// 수정 버튼
		btnCorrect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 인덱스가 선택되었을 경우 값 수정
				if(index > -1) {
					v.set(index, correct.getText());
					list.setListData(v);
				}
			}
		});
		
		// 삭제 버튼
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 인덱스가 선택되었을 경우 값 삭제
				if(index > -1) {
					v.remove(index);
					correct.setText("");
					list.setListData(v);
				}
			}
		});
		
		// 상단 텍스트 필드 리스너
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				t.setText("");
				list.setListData(v);
			}
		});
		
		// 리스트 설정
		list.setVisibleRowCount(10);
		list.setFixedCellWidth(300);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// 목록에서 선택된 값
				String value = (String)list.getSelectedValue();
				correct.setText(value);
							
				// 목록에서 선택된 인덱스
				index = list.getSelectedIndex();
			}
		});
		
		c.add(tf);
		c.add(new JScrollPane(list));
		c.add(btnPanel);
		
		setSize(350, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListTest();
	}
}