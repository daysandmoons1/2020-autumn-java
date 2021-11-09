// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 7. 6.
// ������ȣ : �ǽ� 2
// �������� : ����Ʈ ����

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ListTest extends JFrame {
	
	// �ʿ��� ���� ����
	private JTextField tf = new JTextField(27);
	private Vector<String> v = new Vector<String>();
	private JList<String> list = new JList<String>(v);
	private int index = -1;
	
	public ListTest() {
		
		// �⺻ ����
		super("Font ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// ���� �� ���� �г� ������Ʈ ����
		JPanel btnPanel = new JPanel();
		JTextField correct = new JTextField(15);
		JButton btnCorrect = new JButton("����");
		JButton btnDelete = new JButton("����");
		
		btnPanel.add(correct);
		btnPanel.add(btnCorrect);
		btnPanel.add(btnDelete);
		
		// ���� ��ư
		btnCorrect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// �ε����� ���õǾ��� ��� �� ����
				if(index > -1) {
					v.set(index, correct.getText());
					list.setListData(v);
				}
			}
		});
		
		// ���� ��ư
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// �ε����� ���õǾ��� ��� �� ����
				if(index > -1) {
					v.remove(index);
					correct.setText("");
					list.setListData(v);
				}
			}
		});
		
		// ��� �ؽ�Ʈ �ʵ� ������
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				t.setText("");
				list.setListData(v);
			}
		});
		
		// ����Ʈ ����
		list.setVisibleRowCount(10);
		list.setFixedCellWidth(300);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// ��Ͽ��� ���õ� ��
				String value = (String)list.getSelectedValue();
				correct.setText(value);
							
				// ��Ͽ��� ���õ� �ε���
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