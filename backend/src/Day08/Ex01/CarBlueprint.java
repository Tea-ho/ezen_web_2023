package Day08.Ex01;

public class CarBlueprint {

	// 필드 영역
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 영역
	// 특징1: 생성자 선언을 하지 않더라도, 기본생성자를 클래스명과 동일하게 자동 생성하기 때문에 사용 가능하다.
	// 특징2: 리턴값이 없다.
	// 특징3: 생성자 선언 시, 매개변수 타입을 설정해야한다.
	// 특징4: 오버로딩 가능 (오버로딩: 이름이 동일한 경우, 매개변수 개수 혹은 타입으로 구분하여 식별 가능
	
	// 기본 생성자: 빈생성자(자동 생성)
	CarBlueprint(){ }
	
	CarBlueprint( String model, String color ){
		this.model = model;
		this.color = color;
		// 키워드 this를 이용한 인스턴스 변수의 접근
		// 필드에 정의한 변수명과 생성자의 매개변수명이 동일한 경우, 구분하기 위해 "this"를 사용한다.
		// 이 때, this로 내부 클래스와 외부 클래스를 구분할 수 있다. this는 내부 클래스를 가리킨다.
		// 형태: this.내부필드명 = 매개변수;
	}
	
	
	// 매개변수 활용한 생성자 선언
	CarBlueprint( String model, String color, int maxSpeed ){ 
		
	}

	// 메소드 영역
	// 특징1: 오버라이딩 가능 (오버라이딩: 부모의 메소드를 재정의[리모델링]하여 사용)
	@Override
	public String toString() {
		return "CarBlueprint [model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}


	
	
	

	
	
}
