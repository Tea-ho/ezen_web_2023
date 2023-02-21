package Day15.Ex02;

public class ExecuteHashCode {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "전요셉");
		 	System.out.println(s1);
		 Student s2 = new Student(1, "전요셉");
		 	System.out.println(s2);
		 	
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		 System.out.println(s1.hashCode() == s2.hashCode());
		 
		 System.out.println("전요셉".hashCode());
		 System.out.println("전요셉".hashCode());
		 System.out.println("전요셉".hashCode() == "전요셉".hashCode());

	}
}
