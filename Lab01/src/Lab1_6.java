// 1812515 �輱ȿ
// 21. 06. 22.
// 3��° ����
// 369 ����

import java.util.Scanner;

public class Lab1_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// �Է�
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int a = scanner.nextInt();
		
		// 10�� �ڸ��� 369 ����
		if(a/10 == 3 || a/10 == 6 || a/10 == 9) {
			
			// 1�� �ڸ��� 369 ����
			if(a%10 == 3 || a%10 == 6 || a%10 == 9) {
				System.out.print("�ڼ�¦¦");
			}
			
			// 1�� �ڸ��� 369 �������� ����
			else
				System.out.print("�ڼ�¦");
		}
		
		// ���ڸ� �� �� ��
		else if(a/10 == 0){
			
			// 369 ����
			if(a%10 == 3 || a%10 == 6 || a%10 == 9) {
				System.out.print("�ڼ�¦");
			}
			
			// 369 �������� ����
			else
				System.out.print("�ڼ�����");
		}
		
		// �Էµ� ���� 2�ڸ� �̻��̰� 10�� �ڸ��� 369�� ���� ��
		else
			System.out.print("�ڼ�����");
		
		scanner.close();
	}

}
