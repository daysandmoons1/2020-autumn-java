// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 23.
// ������ȣ : �ǽ� 5
// �������� : 4x4 2���� �迭�� �������� ���� ����

public class twoDArray {

	public static void main(String[] args) {
		
		// �迭 ����
		int intArray[][];
		intArray = makeArray();
		
		int i, j, k=0, random;

		while(true) {
			
			//���� �� ����
			i = (int)(Math.random()*4);
			j = (int)(Math.random()*4);
			random = (int)(Math.random()*10 + 1);
			
			// ����Ǿ� �ִ� ���� ���ٸ� �ο����� ���� �� ����
			if(intArray[i][j] == 0) {
				intArray[i][j] = random;
				k++;
			}
			
			// ������ ���� ������ 10�� �̻��̸� �ݺ��� Ż��
			if(k>=10) {
				break;
			}
		}
		
		// ���
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				System.out.print(intArray[i][j] + "	");
			}
			System.out.print("\n");
		}
	}
	
	static int[][] makeArray() {
		int temp[][] = new int[4][4];
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				temp[i][j] = 0;
			}
		}
		return temp;
	}
}
