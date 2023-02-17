package Day11.Ex05;

public class Execute {
	public static void main(String[] args) {
		
		Child child = new Child();
		System.out.println(child);
		
		child.name = "유재석";
		child.job = "방송인";
		
		System.out.println(child.name + child.job);

		//----------------------------- 자동 타입 변환
		Parent parent1 = child;
		System.out.println(parent1);
		System.out.println(parent1.name);
		
		Parent parent2 = new Parent();
		System.out.println(parent2);
		
		parent2.name = "강호동";
		System.out.println(parent2.name); // parent.job 사용 불가
		
		
		parent2 = child;
		System.out.println(parent2);
		System.out.println(parent2.name); // parent.job 사용 불가
		
		parent2.method1();
		parent2.method2();
		// parent.method3(); // 호출불가		
		
		//----------------------------- 강제 타입 변환
		Child child2 = new Child();	
		System.out.println(child2);
		
		
		child2 = (Child) parent1;
		System.out.println(child2);
		// 해석: 부모 객체를 자식 객체로 이동[강제 타입 변환]
		
		child2.method1();
		child2.method2();
		child2.method3();
		
		System.out.println( child2.name );
		System.out.println( child2.job );
		
	}
}
