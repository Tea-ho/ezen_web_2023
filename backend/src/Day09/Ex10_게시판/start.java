package Day09.Ex10_게시판;
// start 클래스 역할: 실행

import Day09.Ex10_게시판.view.Front;

public class start {
	public static void main(String[] args) {
		
		Front.getInstance().index();
		// 해석: Front.getInstance() = Front 클래스에서 생성한 front 인스턴스
	}
}
