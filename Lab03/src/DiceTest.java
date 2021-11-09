// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 24.
// ������ȣ : �ǽ� 6
// �������� : �ֻ����� Dice Ŭ������ �𵨸�

class Dice{
	private int value;
	public Dice() {
		value = 0;
	}
	
	// �����Լ��� ����Ͽ� 1-6 ������ ���� ����
	void roll() {
		value = (int)(Math.random()*6 + 1);
	}
	
	// �ֻ��� ���� ���� ��ȯ
	int getValue() {
		return value;
	}
}
public class DiceTest {

	public static void main(String[] args) {
		// �ֻ��� 2�� ��ü ����
		Dice One = new Dice();
		Dice Two = new Dice();
		
		// �ֻ��� ���� Ƚ���� ���� ���� ���� �� �ʱ�ȭ
		int count = 0;
		
		do {
			// �ֻ��� 2�� ���� ������ �޼ҵ� ȣ��
			One.roll();
			Two.roll();
			
			// ���� ����� ���� �ֻ����� �� ���� ���� ���
			System.out.println("1�� �ֻ���: " + One.getValue() + " 2�� �ֻ���: " + Two.getValue());
			
			// ���� Ƚ�� ����
			count++;
			
		}while(One.getValue() + Two.getValue() != 2); // �ݺ� ����(���� ����)
		System.out.print("(1, 1)�� ������ �� �ɸ� Ƚ�� = " + count);
	}

}
