// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 29.
// 문제번호 : 실습 5
// 문제설명 : 영화 정보 프로그램

import java.util.*;

public class MovieTest {
	static Scanner scanner = new Scanner(System.in);
	static HashMap<String, Movie> movie = new HashMap<String, Movie>();
	
	public static void main(String[] args) {
		
		while(true) {
			
			//메뉴 출력 및 입력
			System.out.println("======영화 정보 관리======");
			System.out.println("1.입력 / 2.출력 / 3.검색");
			System.out.println("4.수정 / 5.삭제 / 6.종료");
			System.out.println();
			System.out.print("메뉴입력>>");
			int menu = scanner.nextInt();
			System.out.println();
			scanner.nextLine();
			
			// 각 메뉴에 따른 기능 수행
			// 하단 메소드에 상세하게 기술
			if(menu==1)
				inputMovie();
			else if(menu==2)
				printMovie();
			else if(menu==3) {
				System.out.print("검색할 제목 입력: ");
				String title = scanner.nextLine();
				System.out.println();
				searchMovie(title);
			}
			else if(menu==4) {
				System.out.print("수정할 제목 입력: ");
				String title = scanner.nextLine();
				System.out.println();
				corMovie(title);
			}
			else if(menu==5) {
				System.out.print("삭제할 제목 입력: ");
				String title = scanner.nextLine();
				System.out.println();
				delMovie(title);
			}
			else if(menu==6)
				break;
		}

	}
	
	// 영화 정보 입력 메소드
	public static void inputMovie() {
		System.out.print("제목: ");
		String title = scanner.nextLine();
		
		// 제목 입력 후 해쉬 맵과 Movie 객체 생성
		movie.put(title, new Movie());
		Movie mo = movie.get(title);
		
		// 입력 정보 객체에 저장. 이하 동일
		mo.setTi(title);

		System.out.print("감독: ");
		String director = scanner.nextLine();
		mo.setDir(director);
		
		System.out.print("장르: ");
		String genre = scanner.nextLine();
		mo.setGen(genre);
		
		System.out.print("년도: ");
		int release = scanner.nextInt();
		mo.setRel(release);
	}
	
	// 영화 정보 출력 메소드
	// Set 집합 이용, 순차 탐색하여 정보 출력
	public static void printMovie() {
		Set<String> keys = movie.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String title = it.next();
			Movie mo = movie.get(title);
			mo.printInfo();
		}
	}
	
	// 영화 검색 메소드
	// 동일 key 존재시 '영화 출력 메소드' 호출
	public static void searchMovie(String title) {
		if(movie.containsKey(title)) {
			Movie mo = movie.get(title);
			mo.printInfo();
		}
		else
			System.out.println(title + "은(는) 존재하지 않습니다.");
		System.out.println();
	}
	
	// 영화 수정 메소드
	// key 삭제 후 재입력
	public static void corMovie(String title) {
		Movie mo = movie.get(title);
		mo.printInfo();
		movie.remove(title);
		inputMovie();
	}
	
	// 영화 삭제 메소드
	public static void delMovie(String title) {
		movie.remove(title);
		System.out.println(title + "은(는) 삭제되었습니다.");
		System.out.println();
	}

}
