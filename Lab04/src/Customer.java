// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 1
// �������� : �� �����

class Customer extends Person {
	private String number;
	private int mileage;
	
	// ������ �ۼ�
	public Customer() {
		number = "none"; mileage = 0;
	}
	public Customer(String number, int mileage) {
		this.number = number; this.mileage = mileage;
	}
	
	// ������� ��ü �ʵ�, ȸ����ȣ, ���ϸ����� ���� ������
	public void setCustomer(String number, int mileage) {
		this.number = number; this.mileage = mileage;
	}
	public void setCustomerNumber(String number) {
		this.number = number;
	}
	public void setCustomerMileage(int mileage) {
		this.mileage = mileage;
	}
	
	// ������� ��ü �ʵ�, ȸ����ȣ, ���ϸ����� ���� ������
	public void getCustomer() {
		System.out.println("ȸ����ȣ: " + number);
		System.out.println("���ϸ���:  " + mileage);
	}
	public void getCustomerNumber() {
		System.out.println("ȸ����ȣ: " + number);
	}
	public void getCustomerMileage() {
		System.out.println("���ϸ���:  " + mileage);
	}
}
