// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 29.
// 문제번호 : 실습 3
// 문제설명 : 도시 위, 경도 정보 저장 메소드

public class Location {
	String city;
	double latitude;	//위도
	double longitude;	//경도
	
	// 생성자
	public Location() {
		this.city = ""; this.latitude = 0; this.longitude = 0;
	}
	
	// 값 수정 및 저장 메소드
	public void Setter(String city, double latitude, double longitude) {
		this.city = city; this.latitude = latitude; this.longitude = longitude;
	}
	
	// 출력 메소드
	public void Getter() {
		System.out.println(city + "\t" + latitude + "\t" + longitude);
	}

}
