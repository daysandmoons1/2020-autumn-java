// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 24.
// ������ȣ : �ǽ� 1
// �������� : Grade Ŭ������ �ۼ�

import java.util.Scanner;

public class Grade {
	
	// ��� ���� ����
	int math, science, english;
	
	// ������ �ۼ�(����, ����, ���� ������ ���� �Ű� ���� 3�� �޾Ƽ� ��� ������ ����)
	public Grade(int math, int science, int english) {
		this.math = math; this.science = science; this.english = english;
	}
	
	// �� ������ ����� �����ϴ� average() �޼ҵ� �ۼ�
	public int average() {
		return (math + science + english) / 3;
	}
	
	
	
	// pdf�� ���� ����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.print("����� " + me.average());
		scanner.close();
	}
}
