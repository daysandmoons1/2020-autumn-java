// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 23.
// ������ȣ : �ǽ� 3
// �������� : �Էµ� �ݾ��� ���� ������ ȯ��

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //ȯ���� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		// �ݾ� �Է�
		System.out.print("�ݾ��� �Է��ϼ���>>");
		int money = scanner.nextInt();
		
		// ū �������� ���� ������ ���������� �����鼭 ���
		for(int j=0;j<unit.length;j++) {
			System.out.println(unit[j] + "�� ¥�� : " + money / unit[j] + "��");
			money -= (unit[j] * (money / unit[j]));
		}
		
		scanner.close();
	}
}
