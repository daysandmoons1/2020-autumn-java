// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 28.
// ������ȣ : �ǽ� 4
// �������� : �� ����� �ڱ� ���ʿ��� <Enter> Ű�� �Է��ϸ�, 3���� ������ �߻�

import java.util.Scanner;

class Person {
	String name;
	int n1, n2, n3;
	
	// ������ �ۼ�
	public Person(String name) {
		this.name = name;
	}
	
	// ���� �߻� �޼ҵ�
	public void random() {
		n1 = (int)(Math.random()*3 + 1);
		n2 = (int)(Math.random()*3 + 1);
		n3 = (int)(Math.random()*3 + 1);
	}
	
	// �̸� ��� �޼ҵ�
	public void printName() {
		System.out.print("[" + this.name + "] : <Enter>");
	}
	
	// ���� �� �� ��� �޼ҵ�
	// ��(�� ���� ������ ��)�� ��� 1 ��ȯ
	// ����(�� ���� �ٸ� ��)�� ��� 0 ��ȯ 
	public boolean compare() {
		System.out.print("\t\t" + n1 + "\t" + n2 + "\t" + n3 + "\t");
		if(n1 == n2 && n2 == n3) {
			System.out.println(name + "���� �̰���ϴ�!");
			return true;
		}
		else {
			System.out.println("�ƽ�����!");
			return false;
		}
	}
	
}
public class GamblingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person player[] = new Person[2];
		String name, enter;
		
		// ���� �̸� �Է�
		System.out.print("1��° ���� �̸�>>");
		name = scanner.next();
		player[0] = new Person(name);
		
		System.out.print("2��° ���� �̸�>>");
		name = scanner.next();
		player[1] = new Person(name);
		
		
		// ���� ����
		scanner.nextLine();
		while(true) {
			
			
			// 1��° �÷��̾�
			// �̸� ���
			player[0].printName();
			
			// ���� �Է� �� ���� ����
			scanner.nextLine();
			player[0].random();
			
			// ���� �� �� ��� ���
			// ��(�� ���� ���� ��)�� ��� �ݺ��� Ż��
			if(player[0].compare())
				break;
			
			
			// 1��° �÷��̾�� ����
			player[1].printName();
			scanner.nextLine();
			player[1].random();
			if(player[1].compare())
					break;
		}
		
		scanner.close();
	}
}