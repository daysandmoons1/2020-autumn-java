// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 2
// �������� : Magazine �����

public class Magazine extends Book1 {
	String date;
	
	
	// ������ �ۼ�
	public Magazine () {
		this.date = "none";
	}
	public Magazine (String date) {
		super();
		this.date = date;
	}

	
	// �߸��Ͽ� ���� ������
	public void setMagazine(String date) {
		this.date = date;
	}
	
	
	// �߸��Ͽ� ���� ������
	public void getMagazine() {
		System.out.println("�߸���: " + date);
	}
	
}
