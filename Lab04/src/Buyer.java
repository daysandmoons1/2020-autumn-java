// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 4
// �������� : Ŭ���� ����

public class Buyer extends Item{
	int money;
	
	public Buyer(int money) {
		this.money = money;
	}
	
	void buy(Item t, int n) {
		System.out.println(t.toString() + " => " + n + "�� ����");
		if(money - (t.price*n) < 0)
			System.out.println("�ܾ� ����: " + money);
		else {
			System.out.println("���� �Ϸ� �� �ܾ�: " + (money - t.price*n));
			money -= (t.price*n);
		}
	}
}
