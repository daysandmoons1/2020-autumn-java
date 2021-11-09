// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 24.
// 문제번호 : 실습 6
// 문제설명 : 주사위를 Dice 클래스로 모델링

class Dice{
	private int value;
	public Dice() {
		value = 0;
	}
	
	// 랜덤함수를 사용하여 1-6 사이의 값을 저장
	void roll() {
		value = (int)(Math.random()*6 + 1);
	}
	
	// 주사위 변의 값을 반환
	int getValue() {
		return value;
	}
}
public class DiceTest {

	public static void main(String[] args) {
		// 주사위 2개 객체 생성
		Dice One = new Dice();
		Dice Two = new Dice();
		
		// 주사위 굴린 횟수를 세는 변수 선언 및 초기화
		int count = 0;
		
		do {
			// 주사위 2개 각각 굴리는 메소드 호출
			One.roll();
			Two.roll();
			
			// 실행 결과와 같이 주사위의 각 면의 값을 출력
			System.out.println("1번 주사위: " + One.getValue() + " 2번 주사위: " + Two.getValue());
			
			// 실행 횟수 증가
			count++;
			
		}while(One.getValue() + Two.getValue() != 2); // 반복 조건(종료 조건)
		System.out.print("(1, 1)이 나오는 데 걸린 횟수 = " + count);
	}

}
