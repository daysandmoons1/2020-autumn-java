// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 29.
// ������ȣ : �ǽ� 2
// �������� : ������ ���� ���α׷�

import java.util.Scanner;
import java.util.Vector;

public class VectorRainfall {
	
	// ���� ��� �޼ҵ�
	public static void printVector(Vector<Integer> v) {
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
	}
	
	// ��� �� ��� �޼ҵ�
	public static void printAverage(Vector<Integer> v) {
		int sum=0;
		for(int i=0; i<v.size(); i++)
			sum += v.get(i);
		System.out.println("���� ��� " + sum/v.size());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		// ������ �Է�, ���� ���, ��� ���
		int rainfall = -1;
		System.out.print("������ �Է� (0 �Է½� ����)>> ");
		rainfall = scanner.nextInt();
		while(rainfall!=0) {
			v.add(rainfall);
			printVector(v);
			printAverage(v);
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			rainfall = scanner.nextInt();
		}
		
		scanner.close();
	}
}
