// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 1
// �������� : �� �����


public class Person {
	private String name;
	private String address;
	private String phone;
	
	
	// ������ �ۼ�
	public Person() {
		name = "none"; address = "none"; phone = "none";
	}
	public Person(String name, String address, String phone) {
		this.name = name; this.address = address; this.phone = phone;
	}
	
	
	// ������� ��ü�ʵ�, �̸�, �ּ�, ��ȭ��ȣ�� ���� ������
	public void setPerson(String name, String address, String phone) {
		this.name = name; this.address = address; this.phone = phone;
	}
	public void setPersonName(String name) {
		this.name = name;
	}
	public void setPersonAddr(String address) {
		this.address = address;
	}
	public void setPersonPhone(String phone) {
		this.phone = phone;
	}
	
	
	// ������� ��ü�ʵ�, �̸�, �ּ�, ��ȭ��ȣ�� ���� ������
	public void getPerson() {
		System.out.println("�̸�: " + name);
		System.out.println("�ּ�: " + address);
		System.out.println("��ȭ��ȣ: " + phone);
	}
	public void getPersonName() {
		System.out.println("�̸�: " + name);
	}
	public void getPersonAddr() {
		System.out.println("�ּ�: " + address);
	}
	public void getPersonPhone() {
		System.out.println("��ȭ��ȣ: " + phone);
	}
}
