// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 3
// �������� : �л� �����

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// �迭 ���� �� ����
		Human human[] = new Human[3];
		Student student[] = new Student[3];
		
		
		//Human �� �Է�
		for(int i=0; i<3; i++) {
			System.out.print("[" + (i+1) + "] Human �Է�: ");
			human[i] = new Human(scanner.next(), scanner.nextInt());
		}
		
		//Student �� �Է�
		for(int i=0; i<3; i++) {
			System.out.print("[" + (i+1) + "] Student �Է�: ");
			student[i] = new Student(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt());
		}
		
		// human.getHuman ȣ���ؼ� ���� ���
		for(int i=0; i<3; i++) {
			human[i].getHuman();
		}
		
		// student.toString ȣ���ؼ� ���� ���
		for(int i=0; i<3; i++) {
			System.out.print("[�л� ����]" + student[i].toString());
		}
		scanner.close();

	}

}
