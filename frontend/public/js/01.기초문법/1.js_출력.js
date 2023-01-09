// 1. console 출력 함수
console.log( 'Hello World' )	// ' 데이터 ': 데이터 문자처리
console.log( "Hello World" )    // " 데이터 ": 데이터 문자처리
console.log( 100 )				// 숫자 문자처리 안함
console.log( "100" )			// 숫자 문자처리 하면 문자로 인식
console.log( true )				// 논리 문자처리 안함

// 2. 알람창 출력 함수
alert( 'Hello World' )
alert( "Hello World" )
alert( 200 + 200 )
alert( true )


// 3. 제어문자(이스케이프 문자)
console.log('Hello World, \nJS Start ')
console.log('Hello World, \tJS Start ')
console.log('Hello World, \\JS Start ')
console.log('Hello World, \'JS Start\' ')
console.log('Hello World, \"JS Start\" ')

// 4. document HTML 출력 함수
let html = "<h3> JS로 작성한 헤드</h3>"		// html 마크업 저장할 변수 선언
html += "<div> Test Message </div>"		// 변수에 마크업 추가
document.write( html );					// 해당 변수 값을 html 출력
