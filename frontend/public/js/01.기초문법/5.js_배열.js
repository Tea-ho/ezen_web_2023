/* 
	데이터[자료]: 문자, 숫자, 그림 형태의 단위
	
	메모리[주기억장치]: 실행 중 데이터 기억하는 장치
	특징: 휘발성으로 저장되지 않음.
	=> 자바, 자바스크립트 etc...
	
	SSD/HDD[보조기억장치]
	특징: 영구 저장, 비휘발성으로 저장이 가능함
	=> 데이터베이스[DB]
	
	변수/상수: 데이터[자료] 1개를 메모리[주기억장치]에 저장
	
	배열: 데이터 여러개를 저장
	1) 배열: [ ] 대괄호 사용
	2) 식별번호: 인덱스 0번 시작
	3) 선언방법
	   let 배열명 = [ 자료1, 자료2, 자료3, ...... ]
	   const 배열명 = [ 자료1, 자료2, 자료3, ...... ]
	
	Ex> 수강생 이름 배열
		let Ezen_Class = [ "김태호", "전요셉", "박훈희", "강인규", "허진성", "성예빈" ]
		인덱스(순서번호)로 표기:   0		  1		  2		   3	   4       5
		마지막 인덱스: 5
		학생길이(수): 6
	4) 배열 길이
	   Ezen_Class.length: 6		( 마지막 인덱스: 5 )
	   
	5) 배열에서 요소[자료] 추가
	   배열명.push( 신규 데이터 입력 )
	
	6) 배열에서 인덱스 찾기
	   let sindex = 배열명.indexOf("신동엽");
	
	7) 배열에서 요소[자료] 삭제
	 (1) 인덱스 번호로 삭제
	   배열명.splice( 제거할 인덱스의 시작번호, 제거개수 )
	
	Ex> 배열명.splice( 0 , 1 ) : 0번 인덱스 1개 제거 (0번 인덱스 삭제)
		배열명.splice( 2 , 3 ) : 2번 인덱스부터 3개 제거 (2,3,4번 인덱스 삭제)

	 (2) 요소[자료]값으로 삭제
	   배열명.splice(배열명.indexOf("삭제할 데이터 명칭"), 1);
	   
	8) 배열 내 요소 데이터 변경
	   배열명.splice( 1, 1, "변경할 데이터 명칭"); => 1번 인덱스 1개를 삭제하고, "변경할 데이터 명칭"을 추가함
	   
	9) 배열 요소 사이에 신규 데이터 추가
	   배열명.splice( 1, 0, "추가할 데이터 명칭"); => 1번 인덱스 0개를 삭제하고 "추가할 데이터 명칭"을 추가함
*/

// 1. 배열 선언: 대괄호[] 안에, 데이터를 "" or ''으로 구분하여 여러개의 자료를 입력한다.
let array = [ "김태호", "허진성", "전요셉", "강인규", "성예빈", "박훈희" ]

// 2. 배열 호출
console.log( array )
document.write( array )
document.write( "<h3>" + "Array" + "</h3>" )	// HTML 마크업을 JS에서 사용할 경우, 문자열 처리를 해줘야함.

// 3. 배열 내 특정 요소 호출: 인덱스 활용
console.log( array[5] + array[0] + array[2] );
document.write( '<ol>' )
document.write( '<li>' + array[5] + '</li>' )
document.write( '<li>' + array[4] + '</li>' )
document.write( '<li>' + array[3] + '</li>' )
document.write( '<li>' + array[2] + '</li>' )
document.write( '<li>' + array[1] + '</li>' )
document.write( '<li>' + array[0] + '</li>' )
document.write( '</ol>' )

// 4. 배열의 길이
console.log( '수강 인원: ' + array.length + '명' )
 

// 5. 배열 요소 추가
array.push( "전현무", "유재석", "강호동", "짭훈희" );
console.log( array );

// 6. 배열의 특정 요소 제거
array.splice(5, 1); console.log(array);

// 7. 데이터로 인덱스 찾기
let sindex = array.indexOf("박훈희"); console.log( "박훈희 인덱스:" + sindex );

// 8. 데이터로 요소 삭제
array.splice( array.indexOf("박훈희"), 1 );
array.splice( array.indexOf("짭훈희"), 1 );
console.log(array);

// 9. 배열내 요소 데이터 변경
array.splice( 1, 1, "짭훈희" ); console.log(array);

// 10. 배열 요소 중간에 신규 요소 추가
array.splice( 2, 0, "박훈희"); console.log(array);