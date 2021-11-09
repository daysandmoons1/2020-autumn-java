// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 29.
// 문제번호 : 실습 5
// 문제설명 : 영화 정보 프로그램 클래스 정의


public class Movie {
	String title;
	String director;
	String genre;
	int release;
	
	
	// 기본 생성자
	public Movie() {}

	// 각 변수 별 정보 저장 및 수정 메소드
	public void setTi(String title) {
		this.title = title;
	}
	
	public void setDir(String director) {
		this.director = director;
	}
	
	public void setGen(String genre) {
		this.genre = genre;
	}
	
	public void setRel(int release) {
		this.release = release;
	}
	
	// 객체 정보 출력 메소드
	public void printInfo() {
		System.out.println("제목: " + title); System.out.println("감독: " + director);
		System.out.println("장르: " + genre); System.out.println("개봉년도: " + release);
		System.out.println();
	}
}