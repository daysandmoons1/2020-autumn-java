// 1812515 �輱ȿ
// 21. 06. 22.
// 1��° ����
// 2�ڸ� ���� �Է� ��, 10�� �ڸ��� 1�� �ڸ� �� �� ��� ���

import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// �Է�
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int a = scanner.nextInt();
		
		// �Է��� ���� 10���� 99 ���̰� �ƴ� ��
		if(a < 10 || a > 99) {
			System.out.print("Error! 10���� 99 ������ ���ڸ� �Է����ּ���.");
			
		}
		
		// �Է��� ���� 10�� �ڸ��� 1�� �ڸ��� ���� ��
		else if(a/10 == a%10){
			System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		
		// �Է��� ���� 10�� �ڸ��� 1�� �ڸ��� �ٸ� ��
		else {
			System.out.print("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		
		scanner.close();
	}
}
