package Day08.Ex03;

/* 	키워드 this를 이용한 매개변수, 생성자, 메소드 호출
 	this.매개변수
 	this( )
 	this

*/

public class CarBlueprint {
	
	// 필드 영역
	String company = "현대자동차";
	String model;
	String color;
	String maxSpeed;
	
	// 생성자 영역
	// Empty 생성자 (대개 기본으로 사용함)
	public CarBlueprint() {
		// TODO Auto-generated constructor stub
	}
	
	public CarBlueprint( String model) {
		this.model = model;
	}
	
	public CarBlueprint( String model, String color ){
		this.model = model;
		this.color = color;
	}
	
	public CarBlueprint( String model, String color, String maxSpeed){
		this(model, color);
		this.maxSpeed = maxSpeed;
	}
	
	// Full 생성자 (대개 기본으로 사용함)
	public CarBlueprint( String company, String model, String color, String maxSpeed ) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	// 메소드 영역
	@Override
	public String toString() {
		return "CarBlueprint [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
}
