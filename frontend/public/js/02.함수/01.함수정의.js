/*	[함수]
	1. 정의: 입력값에 따라 출력값을 만들어 내는 "계산 상자"
	2. 특징
	 1) 재활용성: 1회 만들면, 반복적으로 사용이 가능하다.
	 2) 인수/반환: 인수에 따른 서로 다른 반환값을 얻을 수 있단.
	 	- 인수: 입력되는 수/코드 (계산 상자 안으로 들어가는 수)
	 	- 코드: 출력되는 수/코드 (계산 상자 밖으로 나오는 수)
	 3) 메모리 효율성
	 	함수 { } 안에서 실행되고, 끝나면 메모리 초기화 됨
	3. 필요성: 함수 특징인 재활용성과 메모리 효율성 측면에서 메소드(함수)를 적절하게 사용하면
			 메모리를 최적화시켜 프로그램을 구현할 수 있음.
	
	4. 함수 선언방법
	 1) function 함수명(인수1, 인수2, 인수3, .....){
			코드 정의
			return 값;
	 	}
	5. 함수 호출 방법
	 1) 함수명(인수1, 인수2, 인수3, .....)
	 2) 주의사항: 정의된 인수의 개수와 동일하게 입력해야 함.
	 	function 함수1( x ){ }			=> 호출: 함수1( 1 )
	 	function 함수2( x , y ){ }		=> 호출: 함수2( 1, 3 )
	 	function 함수3( x , y , z ){ }	=> 호출: 함수3( 1, 5, 3 )

	6. 미리 만들어진 함수
	 1) let 객체 1개 = document.querySelector('식별자')
	 2) let 객체 여러개 = document.querySelectorAll('식별자')
	 
	 3) document.querySelector('식별자').value
	 	*value 속성을 가지고 있는 마크업: input, textarea, select 등
	 4) document.querySelector('식별자').innerHTML
	 	*innerHTML 속성을 가지고 있는 마크업: div, span, table 등
	 
	 5) 배열명.indexOf(찾을데이터): 배열 내 찾을 데이터의 인덱스 번호 반환
	 	*존재할 경우, 인덱스 번호 반환 // 없을 경우, -1 값 반환
	 6) 배열명.includes(찾을데이터): 배열 내 찾을 데이터의 존재 여부 반환
	 	*존재할 경우, true // 없을 경우, false
	 
*/

// 1. 함수의 선언 [1. 재활용성 ]

console.log( 2*1 )
console.log( 2*2 )
console.log( 2*3 )
console.log( 2*4 )
console.log( 2*5 )

function 함수1( x ){ 	console.log(2*x); }

// 2. 함수 호출
function 함수2( x , y ) {		// 메소드 함수2 선언 (인수: 2개 선언, 기능: 인수1+인수2 값 콘솔 출력
	console.log( "함수2에서 실행된 결과" + (x + y));
}
함수2( 5 , 10 )	// 예상 출력값: 15
함수2( 3 , 10 )	// 예상 출력값: 13

// 3. 함수 반환
function 함수3( x, y, z ){
	let result = x + y + z;
	return result;
}
let result = 함수3( 1, 3, 5 )
console.log( '함수실행후 return 출력: ' + result)