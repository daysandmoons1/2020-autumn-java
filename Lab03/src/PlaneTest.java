// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 24.
// 문제번호 : 실습 5
// 문제설명 : PhoneBook 클래스를 작성

class Plane{
	// 멤버 변수(필드) 선언
	private String model;
	private int seats;
	private static int planes = 0;
	
	// 생성자 작성: 2-3개 중복 정의
	public Plane(){
		model = "A380"; seats = 500;
	}
	
	public Plane(String model, int maxPassenger){
		this.model = model; this.seats = maxPassenger;
	}
	
	// 멤버 변수를 접근할 수 있는 접근자와 설정자 메소드 작성
	public void Model() {  }
	public void Seats() {  }
	public static void planesCountUp() { planes++; }
	
	// 정적 변수 접근할 수 있는 접근자 메소드 getPlane() 작성
	public static int getPlane() { return planes; }
	
	// 객체의 정보를 문자열로 반환하는 toString 메소드 작성
	public String toString() {
		return "Plane [Model=" + this.model + ", Seats=" + this.seats + "]";
	}
}
public class PlaneTest {
	public static void main(String[] args) {
		// Plane 객체 여러개 생성
		Plane plane[] = new Plane[3];
		plane[0] = new Plane("보잉 777", 200);
		plane[1] = new Plane("에어버스 A380", 500);
		plane[2] = new Plane("보잉 737", 120);
		
		// 필요한 접근자 메소드 또는 설정자 메소드를 호출
		for(int i=0; i<plane.length; i++) { Plane.planesCountUp(); }
		
		// 전체 보유 비행기 수 출력
		System.out.println("전체 보유 비행기 수 = " + Plane.getPlane());
		
		// 비행기 정보 출력
		System.out.println("각 비행기 정보 출력");
		for(int i=0; i<plane.length; i++) { 
			System.out.println(plane[i].toString());
		}
		
	}

}
