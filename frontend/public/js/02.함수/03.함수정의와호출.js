// 1. 인수X 반환X 함수
function 함수1(){
	// function: 함수 선언시 사용되는 키워드
	// 함수1: 함수이름[식별자] 동일한 파일 내 중복이름 사용 불가
	// (): 매개변수(인수) 정의 하는 장소 (head)
	// {}: 함수가 호출되면 실행되는 장소 (body)
	alert('함수1 실행')
}

// 함수 호출
함수1()

// 2. 인수O 반환O 함수
function 함수2( x, y ){
	// x, y: 매개변수(인수) 정의
	alert('함수2 실행')
	return ( x + y );
}
let result = 함수2( 3, 5 );
// 함수2를 이용해 얻은 반환값을, 변수 result에 저장
alert( '함수2 실행 후 반환된 데이터를 변수 result에 저장한 값: ' + result );

// 3. 인수O 반환X 함수
function 함수3( x, y, z ){
	let result = x + y + z
	alert( '함수3 실행 됨: ' + reuslt)
}
함수3( 3, 5, 7);

// 4. 인수x 반환O 함수
function 함수4(){
	let result = 3 + 5 +8
	return result;
}

let reulst2 = 함수4()
alert( '함수4 실행 후 반환된 데이터: ' + result );