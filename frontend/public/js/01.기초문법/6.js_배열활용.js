/*  
1. function 관련 내용
1) 형태: function 함수명(){};
2) function: 함수 선언
3) 함수명: 생성할 함수 명칭
4) ( ): 인수[함수 안으로 전달받는 데이터]
5) { }: 함수가 실행되는 구역

2. HTML 마크업을 JS에서 변수화 하는 방법 (DOM)
1) 문법: document.querySelector('.클래스명') or ('#아이디명')
2) 구현: let 변수명 = document.querySelector('.클래스명') or ('#아이디명')
3) 원리: JS 변수에 querySelector로 지정한 클래스 혹은 아이디의 데이터를 가져온다.
4) 출력: alter(sname.value);

Tip> JS -----> HTML로 데이터를 내보낼 경우, document.write(); 사용

기능1) html에서 입력받은 input value(학생명 데이터)을 가져온다.
기능2) 추가 버튼을 눌렀을 때 이벤트 생성
기능3) html에서 입력한 학생명 데이터를 JS 배열에 저장한
기능4) 저장된 학생명 데이터를 HTML에 출력
기능5) 삭제 버튼 실행 시, 입력된 데이터 삭제 처리

*/

let studentList = [ ] // 배열 선언 (입력값: X)
					  // 함수 밖에 선언한 이유는? 함수가 실행될 때마다 선언을 하게되면 기존 데이터가 삭제됨

function onAdd(){
	
	alert('입력완료') //--------------------------------------------------- 기능2)
	
	// [입력부]
	let sname = document.querySelector( '.sname' ); //------------------- 기능1)
	// 해석: JS 변수 sname 선언 및 기능(DOM객체화: HTML class sname 데이터를 변수에 저장)
	
	alert( sname.value );
	// HTML에 입력된 값 출력 (입력값 확인)
	// Q> sname은 HTML 클래스? JS 변수?
	// A> HTML 클래스 (HTML 클래스를 사용하기 위해 querySelector을 통해 클래스 sname을 사용하겠다고 선언함)
	
	
	studentList.push( sname.value ); //----------------------------------- 기능3)	
	// studentList 배열에 sname.value를 추가
	// Q> sname은 HTML 클래스? JS 변수?	
	// A> HTML 클래스
	
	console.log ( studentList );
	// console로 studentList 출력 (기능3 작동 체크)

	// [출력부]
	let s_list = document.querySelector( '#s_list' ); //------------------- 기능4)
	// 해석: JS 변수 s_list 선언 및 기능(DOM객체화: HTML id s_list 데이터를 변수에 저장)
	
	s_list.innerHTML = '<li>' + studentList + '</li>'
	// innerHTML을 이용하여 HTML <ul>에 JS 배열 studentList에 저장된 값 전송 및 출력
	
};	// onAA fun E

	
function onDelete(){
	// [입력부]
	let sname = document.querySelector( '.sname' )
	// <input(sname)> 데이터를 가져와 변수 sname에 저장 [DOM 객체화]
	
	let dname = sname.value; //-------------------------------------------- 기능6)
	// 해석: JS 변수 dname 선언 (기능: input에 입력된 값을 저장) 
	// Q> sname은 HTML 클래스? JS 변수?	
	// A> HTML 클래스 (HTML 클래스를 사용하기 위해 querySelector을 통해 클래스 sname을 사용하겠다고 선언함)
	
	let dindex = studentList.indexOf( dname );
	// 해석: JS 변수 dindex 선언 (기능: 배열 studentList에서 dname값 찾기)
	
	studentList.splice( dindex, 1 ); 
	// 해석: splice 함수 기능 실행 (배열 studentList에서 dindex값 1개 삭제)

	// [출력부]
	let s_list = document.querySelector( '#s_list' )
	// HTML <ul>을 가져와 JS 변수 s_list에 저장

	s_list.innerHTML = '<li>' + studentList + '</li>'
	// innerHTML을 이용하여 HTML <ul>에 JS 배열 studentList에 저장된 값 전송 및 출력	
}