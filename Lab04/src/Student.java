// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 3
// �������� : �л� �����

public class Student extends Human{
	String major;
	int sID;
	
	// ������ �ۼ�
	public Student() {
		major = "none"; sID = 0;
	}
	public Student(String name, int age, String major, int sID) {
		super(name, age);
		this.major = major; this.sID = sID;
	}
	
	
	// ������ �ۼ�
	public String getStudentMajor() {
		return major;
	}
	
	// ������ �ۼ�
	void setStudentMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + "����: " + major + ", �й�: " + sID + "\n";
	}
}
