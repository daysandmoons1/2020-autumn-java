// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 23.
// ������ȣ : �ǽ� 4
// �������� : �迭�� ũ�⸦ �Է� �ް� ������ �迭�� �������� ���� ����

import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int key = 0;
		
		// �Է�
		System.out.print("���� �� ��? ");
		int n = scanner.nextInt();
		while(n > 100 || n < 0) {
			System.out.print("1~100�� ���� �Է����ּ���: ");
			n = scanner.nextInt();
		}
		
		// �迭 ����
		int intArray[] = new int[n];
		
		// ������ �迭�� �������� ���� ����
		for(int i=0;i<intArray.length;i++) {
			int random = (int)(Math.random()*100 + 1);
			for(int j=0;j<intArray.length;j++) {
				if(intArray[j] == random) {
					key = 1;
				}
			}
			
			// ���� ���� ������ ���� ���� �ʴ´ٸ� �迭�� ����
			if(key != 1) {
				intArray[i] = random;
			}
			
			// ������ �����Ѵٸ�  �������� �ʰ� ī��Ʈ�� 1 ����
			else {
				key = 0;
				i--;
			}
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i] + " ");
		}
		
		scanner.close();
	}
}
