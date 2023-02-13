package Day09.Ex04; // 오버로딩

/*
	오버로딩: 이름은 같지만, 매개변수의 타입, 개수, 순서가 다른 메소드를 여러개 선언하는 것을 뜻한다. (활용: 생성자, 메소드)
	오버라이딩: 이미 존재하는 메소드를 재정의[리모델링]하는 것을 뜻한다. (활용: 메소드)
*/

public class Calculator {
	
	// 필드 영역
	
	// 생성자 영역
	
	// 메소드 영역
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
