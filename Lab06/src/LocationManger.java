// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 29.
// 문제번호 : 실습 3
// 문제설명 : 도시 위, 경도 정보 저장

import java.util.*;

public class LocationManger {
	public static void main(String[] args) {
		HashMap<String, Location> city = new HashMap<String, Location>();
		Scanner scanner = new Scanner(System.in);
		
		// 도시 정보 입력
		System.out.println("도시, 위도, 경도를 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String input = scanner.nextLine();
			
			// ', ' 기준으로 문자열 분리
			String[] tk = input.split(", ");
			
			// 객체 생성 및 해시 맵에 저장
			city.put(tk[0], new Location());
			
			// Setter 메소드로 위도, 경도 저장
			Location lo = city.get(tk[0]);
			lo.Setter(tk[0], Double.valueOf(tk[1]), Double.valueOf(tk[2]));
		}
		System.out.println("---------------------");
		
		// 예제 7-6과 동일
		// key 문자열 집합 Set 컬렉션 리턴
		// key 문자열 순차 접근을 위한 Iterator 리턴
		Set<String> keys = city.keySet();
		Iterator<String> it = keys.iterator();
		
		// 순차 탐색 및 출력
		while(it.hasNext()) {
			String name = it.next();
			Location lo = city.get(name);
			lo.Getter();
		}
		System.out.println("---------------------");
		
		
		// 도시 검색
		System.out.print("도시 이름>> ");
		String name = scanner.next();
		while(!(name.equals("그만"))) {
			Location lo = city.get(name);
			
			// 검색 도시 없을 시 경고 메세지 출력
			if(lo == null)
				System.out.println(name + "은 없습니다.");
			
			// 검색 도시 존재 시 Getter 메소드 호출
			else
				lo.Getter();
			System.out.print("도시 이름>> ");
			name = scanner.next();
		}
		
		scanner.close();
	}
}
