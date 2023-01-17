/*
	[객체]
	1. 미리 만들어진 객체
	 1) console 객체
	 	console.log(  )
	 2) Math 클래스
	 	Math.random(  )
	 3) DOM 객체
	  (1) document 객체
	  	[HTML 마크업 객체화] document.querySelector('식별자') / document.querySelectorAll('식별자')
	 	let 객체명 = document.querySelector( '.클래스명' or '#ID명' )
	 	let 객체배열명 = document.querySelectorAll( '.클래스명' or '#ID명' )
	 	=> 주로 변수 선언과 동시에 사용
	 	
	 	[객체화된 HTML 마크업에 이벤트 적용] document.addEventListener( '이벤트명', 함수 )
	 	객체명.addEventListener( '이벤트명', (e) => { 실행문; } )
	 	=> 주로 HTML 마크업 객체 시 변수 선언을 하기 때문에, 위와 같은 형태로 사용하는 경우가 많음
	 	Tip> 매개변수 e(event): 이벤트 실행 결과를 매개변수 인수로 받음
	 		
	 	[자주 사용하는 이벤트]
	 	- DOMContentLoaded: HTML이 열렸을 때 동작하는 이벤트
	 	- click: 클릭했을 때 동작하는 이벤트
	 	- keyup: 키보드 키에서 손을 떼었을 때, 동작
	 	- keydown: 키보드 키를 누르고 있을 때, 동작
	 	
	 	[객체화된 HTML 마크업에 스타일 적용]	
	 	- style: 스타일 적용 (카멜표기법 사용)
	 	
	 	[HTML 마크업에 JS 데이터 입력]
	 	document.querySelector('식별자').innerHTML = 출력하고자 하는 데이터(데이터, 변수, 객체, 배열 등);
	 			 	
	 4) window객체
	  	window.onload = 함수
	 	window.addEventListener( 'load' , 함수1 )

	2. 사용자 정의 객체

*/

// 1. DOM 객체 (HTML를 동적으로 만들어주는 객체)
let h1 = `<h1> ${ '안녕하세요' } </h1>`

document.body.innerHTML = h1

// 2. DOM 객체 이벤트
	// 2-1. 정의된 함수 사용 
	function 함수1(){ console.log( '문서열림1' ) }

	window.onload = 함수1										// onload: HTML 모든 자원이 열렸을 때 실행
	document.addEventListener( 'DOMContentLoaded' , 함수1 )	// DOMContentLoaded: HTML이 열렸을 때, 실행

	// 2-2. 익명[이름없는] 함수 사용
	window.onload = function(){ console.log( '문서열림2' ) }
	document.addEventListener( 'DOMContentLoaded' , function(){ console.log( '문서열림2' ) } )
	
	// 2-3. 화살표 함수 사용 [ 형태: ( 인수 ) => { 실행문 } ] 
	window.onload = () => {console.log('문서열림3')}
	document.addEventListener( 'DOMContentLoaded' , () => { console.log( '문서열림2' ) } )
	
	let 변수 = ( ) => { console.log( '문서열림4' ) }
	console.log( 변수 )