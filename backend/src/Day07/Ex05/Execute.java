package Day07.Ex05;

import java.util.ArrayList;
import java.util.Arrays;

public class Execute {
	public static void main(String[] args) {
		
		// 객체 생성
		Member m1 = new Member();
		m1.id = "qwe"; m1.pw = "qwe";
		
		Member m2 = new Member();
		m2.id = "asd"; m2.pw = "asd";
		
		Member m3 = new Member();
		m3.id = "zxc"; m3.pw = "zxc";
		
		// 배열: 프로그래밍 문법
		// 특징: 고정길이
		Member[] memberList1 = new Member[3];
		memberList1[0] = m1;
		memberList1[1] = m2;
		memberList1[2] = m3;
		
		System.out.println(  Arrays.toString(memberList1) );
		System.out.println(  memberList1.length );
		memberList1[1] = null;
		System.out.println(  Arrays.toString(memberList1) );
		System.out.println(  memberList1.length );
		
		// 컬렉션(수집) 프레임워크: Java에서 만들어 놓은 클래스
		// 특징: 가변길이
		ArrayList<Member> memberList2 = new ArrayList<>();
		memberList2.add(m1);
		memberList2.add(m2);
		memberList2.add(m3);
		
		System.out.println(memberList2);
		System.out.println(memberList2.size());
		memberList2.remove(1);
		System.out.println(memberList2);
		System.out.println(memberList2.size());	
		
	}
}
