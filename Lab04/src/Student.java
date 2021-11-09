// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 3
// 문제설명 : 학생 만들기

public class Student extends Human{
	String major;
	int sID;
	
	// 생성자 작성
	public Student() {
		major = "none"; sID = 0;
	}
	public Student(String name, int age, String major, int sID) {
		super(name, age);
		this.major = major; this.sID = sID;
	}
	
	
	// 접근자 작성
	public String getStudentMajor() {
		return major;
	}
	
	// 변경자 작성
	void setStudentMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + "전공: " + major + ", 학번: " + sID + "\n";
	}
}
