// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 23.
// ������ȣ : �ǽ� 7
// �������� : ��ǻ�Ϳ� ����������

import java.util.Scanner;

public class GBBWithComputer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String user = "";
		int n;
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.print("���� ���� ��!>>");
			user = scanner.next();
			
			// �׸� �Է� �� Ż��
			if(user.equals("�׸�"))
				break;
			
			n = (int)(Math.random()*3);
			
			// ����� ��
			if(str[n].equals(user))
				System.out.println("����� = " + user + ", ��ǻ��  = " + str[n] + ", �����ϴ�.");
			
			// ����ڰ� �̰��� ��
			else if((n == 0 && user.equals("����")) || (n == 1 && user.equals("��")) || (n == 2 && user.equals("����")))
				System.out.println("����� = " + user + ", ��ǻ��  = " + str[n] + ", ����ڰ� �̰���ϴ�.");
			
			// ��ǻ�Ͱ� �̰��� ��
			else
				System.out.println("����� = " + user + ", ��ǻ��  = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
		}
		
		scanner.close();
	}
}
