// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 23.
// 문제번호 : 실습 1
// 문제설명 : 2차원 배열 출력

public class Print2DArray {
	public static void main(String[] args) {
		
		//배열 선언
		int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		
		//배열 출력
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j] + "	");
			}
			System.out.print("\n");
		}
	}
}