// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 28.
// ������ȣ : �ǽ� 3
// �������� : Circle Ŭ������ �ۼ�

import java.util.Scanner;

public class StringRotate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ����� �ѱ�, Ư������ ��� �����մϴ�.");
		String string = scanner.nextLine();
		
		
		
		
		for(int i=0; i<string.length(); i++) {
			
			// i+1��° �ε������� ������ �ε������� ���
			System.out.print(string.substring(i+1));
			
			// 0��° �ε������� i��° �ε������� ���
			System.out.println(string.substring(0, i+1));
		}
		
		scanner.close();
	}
}