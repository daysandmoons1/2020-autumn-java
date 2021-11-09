// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 24.
// 문제번호 : 실습 3
// 문제설명 : Circle 클래스와 CircleManager 클래스를 완성

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	
	//x, y, radius 초기화
	public Circle(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	
	// 화면에 출력
	public void show() {
		System.out.println("(" + x + "," + y + ") " + radius);
	}
	
	// 면적 계산해서 반환, PI 값은 Math 클래스의 PI 상수 활용 
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
}
public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i=0; i< c.length; i++) {
			System.out.print("x, y, radius>>");
			
			// x, y, 반지름 읽기
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			
			// Circle 객체 생성
			c[i] = new Circle(x, y, radius);
		}
		
		// 모든 Circle 객체 출력(해당 메소드 출력)
		for(int i=0; i<c.length; i++)
			c[i].show();
		
		int biggestIndex = 0;
		double max = 0;
		for(int i=0; i<c.length; i++) {
			
			 // 면적 함수를 통해 비교
			if(c[i].getArea()>max) {
				max = c[i].getArea();
				// 가장 큰 면적을 가진 Index 저장
				biggestIndex = i;
			}
		}
		System.out.print("가장 면적이 큰 원은");
		c[biggestIndex].show();
		scanner.close();
	}
}
