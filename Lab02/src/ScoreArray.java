// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 23.
// ������ȣ : �ǽ� 6
// �������� : ���� �Է� �� ���� ���

import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// �� ����
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		int key=0;
		
		while(true) {
			System.out.print("���� �̸�>>");
			String name = scanner.next();
			
			// "�׸�" �Է� ��
			if("�׸�".equals(name)) {
				break;
			}
			
			// ���� �� ���� ���
			for(int i=0; i<5; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					key = 1;
				}
			}
			
			// �������� �ʴ� ������ �Է����� ���
			if(key == 0) {
				System.out.println("���� �����Դϴ�.");
			}
			key = 0;
		}
		scanner.close();
	}
}
