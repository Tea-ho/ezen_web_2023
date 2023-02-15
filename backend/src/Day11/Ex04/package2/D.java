package Day11.Ex04.package2;

import Day11.Ex04.package1.A;

public class D extends A {

	public void method() {
		this.field = "D에서 정의";
		super.field = "D에서 super 통해 정의";
		
		this.method();
		super.method();
	}
	
	/*
	 public void method2() { 
	 	A a new A();
	 	a.field = "value";
	 	a.method();
	 }
	 */
	
}
