// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 24.
// ������ȣ : �ǽ� 4
// �������� : Phone Ŭ���� �ۼ�

import java.util.Scanner;

class Phone {
	String name;
	String tel;
	
	// ������ �ۼ�
	public Phone (String name, String tel) {
		this.name = name; this.tel = tel;
	}
}
public class PhoneBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		String name, tel, target = "";
		
		// �迭 ����
		System.out.print("�ο���>>>");
		num = scanner.nextInt();
		Phone p[] = new Phone[num];
		
		// �̸�, ��ȭ��ȣ �б� �� Phone ��ü ����
		for(int i=0; i<num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>>");
			name = scanner.next();
			tel = scanner.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		// "�׸�" �ԷµǱ� ������ �˻� ��� �Է� �ݺ�
		while(!("�׸�".equals(target))) {
			System.out.print("�˻��� �̸�>>>");
			target = scanner.next();
			
			// �̸� �� �� ��ȭ��ȣ ���
			for(int i=0; i<p.length; i++) {
				if((target).equals(p[i].name))
					System.out.println(target + "�� ��ȣ�� " + p[i].tel + " �Դϴ�.");
			}
		}
		scanner.close();
	}
}
