// 1812515 �輱ȿ
// 21. 06. 22.
// 5��° ����
// ����ڰ� �Է��� �� ���� ���� ���� �浹�ϴ��� �Ǻ�

import java.util.Scanner;

public class Lab1_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// x1, y1, radius1
		System.out.print("���� �߽� x1, y1, ������ radius1>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		double radius1 = scanner.nextDouble();
		
		// x2, y2, radius2
		System.out.print("���� �߽� x2, y2, ������ radius2>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		double radius2 = scanner.nextDouble();
		
		double distance = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
		
		if(distance <= radius1 + radius2) {
			System.out.print("�� ���� ���� ��ģ��.");
		}
		else
			System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
		
		scanner.close();
	}
}