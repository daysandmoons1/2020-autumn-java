// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 3
// �������� : �л� �����

public class Human {
	String name;
	int age;
	
	// ������ �ۼ�
	public Human() {
		name = "none"; age = 0;
	}
	public Human(String name, int age) {
		this.name = name; this.age = age;
	}
	
	// ������
	void getHuman() {
		System.out.print("�̸�: " + name);
		System.out.println(", ����: " + age);
	}
	
	// ������ �޼ҵ�
	void setHuman(String name, int age) {
		this.name = name; this.age = age;
	}
	
	// toString �޼ҵ�
	public String toString() {
		return "�̸�: " + name + ", ����: "+ age + ", ";
	}
}
