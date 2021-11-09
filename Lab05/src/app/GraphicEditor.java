// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 28.
// 문제번호 : 실습 2
// 문제설명 : GraphicEditor 클래스는 app 패키지에 분리 작성

package app;

import base.Shape;
import derived.Circle2;

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle2();
		shape.draw();
	}
}