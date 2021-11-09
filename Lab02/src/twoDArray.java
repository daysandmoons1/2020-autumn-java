// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 23.
// 문제번호 : 실습 5
// 문제설명 : 4x4 2차원 배열에 무작위로 숫자 삽입

public class twoDArray {

	public static void main(String[] args) {
		
		// 배열 생성
		int intArray[][];
		intArray = makeArray();
		
		int i, j, k=0, random;

		while(true) {
			
			//랜덤 수 생성
			i = (int)(Math.random()*4);
			j = (int)(Math.random()*4);
			random = (int)(Math.random()*10 + 1);
			
			// 저장되어 있는 값이 없다면 부여받은 랜덤 값 저장
			if(intArray[i][j] == 0) {
				intArray[i][j] = random;
				k++;
			}
			
			// 저장한 수의 개수가 10개 이상이면 반복문 탈출
			if(k>=10) {
				break;
			}
		}
		
		// 출력
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				System.out.print(intArray[i][j] + "	");
			}
			System.out.print("\n");
		}
	}
	
	static int[][] makeArray() {
		int temp[][] = new int[4][4];
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				temp[i][j] = 0;
			}
		}
		return temp;
	}
}
