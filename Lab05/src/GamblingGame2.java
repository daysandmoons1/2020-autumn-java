// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 28.
// ������ȣ : �ǽ� 5
// �������� : �ǽ� 4�� ���� ������ n���� �ϵ��� ����

import java.util.Scanner;

public class GamblingGame2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, enter;
		int num, flag = 0;
		
		// ���� �ο� �Է�
		System.out.print("���� ���ӿ� ���� �� ���� �ο�>>");
		num = scanner.nextInt();
		Person player[] = new Person[num];
		
		// ���� �̸� �Է�
		for(int i=0; i<num; i++) {
			System.out.print((i+1) + "��° ���� �̸�>>");
			name = scanner.next();
			player[i] = new Person(name);
		}
		
		
		// ���� ����
		// while�� Ż���� ���� flag ���� ���
		// person ��ü�� �� ���� ������ ��(��)�� ��� flag = 1 ��
		scanner.nextLine();
		while(flag!=1) {
			
			for(int i=0; i<num; i++) {
				player[i].printName();
				scanner.nextLine();
				player[i].random();
				if(player[i].compare()) {
					flag = 1;			// while�� Ż�� ����
					break;
				}
			}
		}
		
		scanner.close();
	}
}