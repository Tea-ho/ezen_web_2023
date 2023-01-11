/* 과제2>
   주제: 입력된 값으로 구구단 출력
   
   조건1> 단[input]과 곱[input] 입력 받기
   조건2> 확인[button] 클릭하면 결과 실행
   조건3> 테이블에 출력

*/

let tablecontent = '<tr> <th>단</th> <th>곱</th> <th>결과</th> </tr>'

function confirm(){		// --- 조건2> 함수 S
	
	let xNum = document.querySelector( '.xNum' );	//--- 조건1>
	let yNum = document.querySelector( '.yNum' );	//--- 조건2>
	// 해석: HTML Num1,2 클래스 JS 사용 선언 [DOM 객체화]
	
	let xInputNum = xNum.value;						// --- 조건1>
	let yInputNum = yNum.value;						// --- 조건1>
	// 해석: JS변수 x,yInputNum 선언 (입력값: HTML x,yNum 값)
	
				console.log( xInputNum );	// --- 기능확인(입력 확인)
				console.log( yInputNum );	// --- 기능확인(입력 확인)
		
	let confirm = 0;	// --- 검사변수 confirm 생성 (역할: 유효성섬사 체크리스트)
	
				console.log(confirm);	// --- 기능확인 (0값 확인)
				console.log( xNum.value.length );	// --- 기능확인 (if문 들어가기 전 길이 체크 확인)
	
	// 빈칸 입력 시 오류 메시지 출력되도록 조건 생성
	if ( xNum.value == '' || yNum.value == '' ){
		alert( "숫자를 입력해주세요.(오류: 미입력)" );
		confirm++;
		
						console.log(confirm);	// --- 기능확인 (x, y값 미입력시 동작)
	}

	// 정상 입력 시 아래 조건문 실행
	if ( confirm == 0 ){	// if1 S
	
		// 구구단 한 자리 수만 입력하도록 조건 생성
		if( xNum.value.length != 1 || yNum.value.length != 1 ){		//if2 S
		
							console.log( xNum.value.length )	// --- 기능확인 (정상 동작)
							
			alert( "숫자를 다시 입력해주세요.(오류: 자릿수 초과 (허용범위: 1~9))" );
			confirm++;
			
							console.log(confirm);	// --- 기능확인 (정상 동작)
							
			xNum.value = null;	yNum.value = null;
			// 해석: HTML x,yNum 입력란 초기화
		}	// if2 E
		
		else{	// --- 조건3> else S
		tablecontent += '<tr> <th> '+xInputNum+' </th> <th> '+yInputNum+' </th> <th> '+(xInputNum * yInputNum)+' </th> </tr>';
		// 해석: JS 변수 tablecontent 값 초기화 (동작: 기존에 가지고 있던 데이터는 유지하면서, 데이터를 추가함)
		
		document.querySelector('.tablecontent_HTML').innerHTML = tablecontent
		// 해석: 1)"document.querySelector('tablecontent_HTML')" tablecontent_HTML 마크업을 JS에서 사용 선언,
		// 		2)".innerHTML = tablecontent" JS 변수 tablecontent값을 HTML화면 출력
		
		xNum.value = null;	yNum.value = null;
		// 해석: HTML x,yNum 입력란 초기화		
		}	// esle E
	}	// if1 E
} 	// 함수 E


