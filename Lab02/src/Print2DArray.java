// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 23.
// ������ȣ : �ǽ� 1
// �������� : 2���� �迭 ���

public class Print2DArray {
	public static void main(String[] args) {
		
		//�迭 ����
		int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		
		//�迭 ���
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j] + "	");
			}
			System.out.print("\n");
		}
	}
}