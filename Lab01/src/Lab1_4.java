// 1812515 �輱ȿ
// 21. 06. 22.
// 2��° ����
// 3���� ���� �Է� ��, �߰��� ���

import java.util.Scanner;

public class Lab1_4 {
	public static void main(String[] args) {
		int mid = 0; 	//���Ŀ� ���� �Է¹��� �Ŷ�� �ص� ������ �� �ָ� ������ �� ���� �� �ʱ�ȭ �ʿ�
		Scanner scanner = new Scanner(System.in);
		
		// 3���� �� �Է�
		System.out.print("���� 3�� �Է�>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		// x�� �߰����� ��
		if((x>y && x<z) || (x<y && x>z)) {
			mid = x;
		}
		
		// y�� �߰����� ��
		else if((y>x && y<z) || (y<x && y>z)) {
			mid = y;
		}
		
		// z�� �߰����� ��
		else if((z>x && z<y) || (z<x && z>y)) {
			mid = z;
		}
		
		System.out.print("�߰� ���� " + mid);
		
		scanner.close();
	}

}
