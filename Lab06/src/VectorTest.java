// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 29.
// ������ȣ : �ǽ� 1
// �������� : Vector <Integer> �ǽ�

import java.util.Scanner;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		int num = 0;
		
		// -1�� �Էµ� ������ ���� �Է�
		System.out.print("����(-1�� �Էµ� ������)>> ");
		num = scanner.nextInt();
		while(num!=-1) {
			v.add(num);
			num = scanner.nextInt();
		}
		
		// ���� �� ���� ���
		System.out.print("���� ��: [");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i));
			if(i+1 < v.size())
				System.out.print(", ");
		}
		System.out.println("]");
		
		// ���� ū �� ���
		int maxIndex = 0;
		for(int i=1; i<v.size(); i++) {
			if(v.get(maxIndex) < v.get(i))
				maxIndex = i;
		}
		
		// ���� ū �� ����
		System.out.println("���� ū �� " + v.get(maxIndex) + " ����");
		v.remove(maxIndex);
		
		// ���� ū �� ���� �� ���� ���
		System.out.print("[");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i));
			if(i+1 < v.size())
				System.out.print(", ");
		}
		System.out.println("]");
		
		// ���� ���� �� ���
		int minIndex = 0;
		for(int i=1; i<v.size(); i++) {
			if(v.get(minIndex) > v.get(i))
				minIndex = i;
		}
		
		// ���� ���� �� ����
		System.out.println("���� ���� �� " + v.get(minIndex) + " ����");
		v.remove(minIndex);
		
		// ���� ���� �� ���� �� ���� ���
		System.out.print("[");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i));
			if(i+1 < v.size())
				System.out.print(", ");
		}
		System.out.println("]");
		
		scanner.close();
	}

}
