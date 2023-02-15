package Day11.Ex05;

public class Execute {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.name = "유재석";
		child.job = "방송인";

		//----------------------------- 자동 타입 변환
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		// parent.method3(); // 호출불가
		
		System.out.println(parent.name);
		// System.out.println(parent.job);
		
		
		//----------------------------- 강제 타입 변환
		Child child2 = (Child) parent;
		// 해석: 부모 객체를 자식 객체로 이동[강제 타입 변환]
		
		child2.method1();
		child2.method2();
		child2.method3();
		
		System.out.println( child2.name );
		System.out.println( child2.job );
		
	}
}
