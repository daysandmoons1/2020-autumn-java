// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 23.
// ������ȣ : �ǽ� 2
// �������� : a���� �Է��� ���ĺ����� ���

import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// ���ĺ� �Է�
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��ϼ���>>");
		String s = scanner.next();
		char c = s.charAt(0);
		
		// ���ĺ� ���
		for(char i=c;i>='a';i--) {
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
		scanner.close();
	}
}
