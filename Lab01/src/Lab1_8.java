// 1812515 �輱ȿ
// 21. 06. 22.
// 4��° ����
// ����ڰ� �Է��� �簢���� �������� (100, 100), (200, 200)�� �簢���� �浹�ϴ��� �Ǻ�

import java.util.Scanner;

public class Lab1_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ���� �ϴ�
		System.out.print("x1, y1 �Է�>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		// ������ ���
		System.out.print("x2, y2 �Է�>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if(x1>200 || y1>200 || x2<100 || y2<100) {
			System.out.print("�浹 ����");
		}
		else
			System.out.print("�浹 �߻�");
		
		scanner.close();
	}
}
