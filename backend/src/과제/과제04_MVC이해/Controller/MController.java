package 과제.과제04_MVC이해.Controller;

import java.util.ArrayList;

import Day08.Ex05.Front;
import 과제.과제04_MVC이해.Model.Board;
import 과제.과제04_MVC이해.Model.MemberDB;

// 클래스 기능: 처리,제어 담당
public class MController {
	
	// 필드 영역
	ArrayList<MemberDB> memberDB = new ArrayList<>();
	ArrayList<Board> board = new ArrayList<>();
	
	// 생성자 영역
	// Empty 생성자 생성
	public MController() {
		// TODO Auto-generated constructor stub
	}
	
	// 메소드 영역
	// 1. 회원가입 로직
	public int signup( String id,  String pw, String pwConfirm, String name, String phone) {
		
		// 기능1: 유효성 검사
		if( !pw.equals(pwConfirm)) { return 1; }
		else {
			// 기능2: 객체 생성
			MemberDB member = new MemberDB( id, pwConfirm, name, phone );
			
			// 기능3: DB에 데이터 송신
			memberDB.add(member);
			return 0;
		}	
	}
	
	// 2. 로그인 로직
	public int login( String id, String pw ) {
	
		for( int i = 0; i < memberDB.size(); i++) {
			if( memberDB.get(i).id.equals(id) ) {
				if( memberDB.get(i).pw.equals(pw)){
					return i;
				}
				else {
					return -1;
				}
			}
		}
		return -2;
		
	}
	
	// 3-1. 아이디 찾기 로직(기능: 적부 판단)
	public int findId( String name, String phone ) {
		
		for( int i = 0; i < memberDB.size(); i++) {
			if( memberDB.get(i).name.equals(name) ) {
				if( memberDB.get(i).phone.equals(phone) ) {
					return i;
				}
				else {
					return -1;
				}
			}
		}
		return -2;
	}
	
	// 3-2. 아이디 찾기 로직(기능: 데이터 반환)
	public String returnId( int result ) {
		return memberDB.get(result).id;
	}
	
	
	// 4-1. 비밀번호 찾기 로직(기능: 적부 판단)
	public int findPassword( String id, String name, String phone ) {
		
		for( int i = 0; i < memberDB.size(); i++) {
			if( memberDB.get(i).id.equals(id) ) {
				if( memberDB.get(i).name.equals(name) ) {
					if( memberDB.get(i).phone.equals(phone) ) {
						return i;
					}
					else {
						return -1;
					}
				}
				else {
					return -2;
				}
			}
		}
		return -3;
	}
	// 4-2. 비밀번호 찾기 로직(기능: 데이터 반환)
	public String returnPw( int result ) {
		return memberDB.get(result).pw;
	}
	
	// 6. 게시판 내역 출력 로직(기능: 배열값 반환)
	public void boardList() {
		
		Front front = new Front();
	
		for( int i = 0; i < board.size(); i++) {
			int no = i;
			int view = board.get(i).view;
			String writer = board.get(i).writer;
			String title = board.get(i).title;
			
		}
	}
	
	// 5. 게시판 글쓰기 로직
	public String write( int logcheck, String title, String content ) {
		String writer = memberDB.get(logcheck).id;
		board.add(writer,title,content);
	}
	
}
	
	

