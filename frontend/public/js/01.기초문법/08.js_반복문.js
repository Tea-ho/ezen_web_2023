/*	알고리즘[순서도]: 코드 흐름 순서 (if / for)
	
	1. 반복문: 코드 반복
	2. 활용문법
	1) for문
	 (1) for( 초기값; 조건문; 증감식 ) { 실행문; }
	2) 활용 (배열/리스트)
	 (1) for( 초기값; 배열.length; 증감식 ) { 실행문; } ****** JAVA와 구조 동일하기 때문에 익숙해지면 아래 문법 사용 권고
	 (2) for( 반복변수 of 배열/리스트 ) { 실행문; }
	 (3) for( 반복변수 in 배열/리스트 ) { 실행문; }
	
	2) while문
	 (1) 형태
	  - 무한루프
	  	while( true ){ 실행문; }
	  - 조건부 실행(조건 true인 경우, 실행문 동작)
	  	while( 조건 ){ 실행문; }
	  - 순서에 따른 반복
	  	let i = 0;			=> 1. 반복변수 선언
	  	while( i < 10 ){	=> 2. 조건문
			i++;			=> 3. 증감식 (i+=3, i+=2, i*=2, .......)
			실행문	  		=> 4. 실행문
		}
*/

/*
// 2) while문1 (무한루프)
while(true){ alert('반복실행'); }

// 2) while문2_1 (조건부 동작 _ 조건 상수로 설정: 무한 반복)
while( 10 > 2 ){ alert('실행문'); }
// 해석: 10 > 2보다 크면 실행문 동작

// 2) while문2_2 (조건부 동작 _ 조건 변수로 이용한 조건부 무한 반복)
let input = prompt('input: ')
while( input != 'exit'){	// while S
	console.log('실행중')
	input = prompt('input')
}	// while E
// 해석: input에 입력된 값이 exit가 아니면, 실행문 실행

// 2) while문2_2 (조건부 동작 _ 순서 대로 반복)
let i = 0;
while( i < 10 ){ 	// while S
	console.log('실행문2: ' + i);
	i++;
}	// while E
// 해석: 변수 i가 10이하까지 실행문 실행 (즉, i = 10에서 false 값으로 인식되어 while문 종료)
*/
// 1) for문
for( let j = 0; j < 10; j++ ){	// for S
	console.log('실행문3: ' + j);
}	// for E

// 1) for문_배열 활용
let fruit_box = [ 'apple', 'grape', 'strawberry'];

for( let j = 0; j < fruit_box.length; j++ ){	// for S
	// 해석: 변수 j가 배열 fruit_box의 길이(길이: 인덱스 기준) 미만까지 변수 j를 +1씩 증가시키면서 실행문 반복
	// Q> 변수 증감을 선위로 해도 출력값은 같음 (why?)
	// A> 세미클론으로 구역 설정
	console.log(j + "번째 요소:" + fruit_box[j])
	// 해석: 콘솔출력 (출력값), fruit_box[j]의미: 배열 fruit_box index j번째 요소
}	// for E

// 1) for문_배열 활용(of keyword): 배열/리스트 내 요소 하나씩 왼쪽 변수에 반복 대입 (단점: 인덱스 확인 X)
for( let j of fruit_box ){	// for S
	console.log("배열/리스트 요소값 확인: " + j);
}	// for E

// 1) for문_배열 활용(in keyword): 배열/리스트 내 인덱스 정보를 왼쪽 변수에 반복 대입
for( let j in fruit_box ){	// for S
	console.log("배열/리스트 인덱스값 확인: " + j);
}	// for E






