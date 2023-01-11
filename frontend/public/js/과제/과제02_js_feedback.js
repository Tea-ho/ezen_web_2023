/* 과제2>
   주제: 입력된 값으로 구구단 출력
   
   조건1> 단[input]과 곱[input] 입력 받기
   => 단이나 곱이 입력하면, 입력한 값까지 자동 출력되도록
   조건2> 확인[button] 클릭하면 결과 실행
   조건3> 테이블에 출력

*/

function confirm(){		// --- 조건2> 함수 S

	let tablecontent = '<tr> <th>단</th> <th>곱</th> <th>결과</th> </tr>'
	
	let xNum = document.querySelector( '.xNum' );	//--- 조건1>
	let yNum = document.querySelector( '.yNum' );	//--- 조건2>
	// 해석: HTML Num1,2 클래스 JS 사용 선언 [DOM 객체화]
	
		let inputXNum = xNum.value
		let inputYNum = yNum.value

			for( let i = 1 ; i <= inputYNum; i++){	// for S
				tablecontent += '<tr> <th> '+inputXNum+' </th> <th> '+i+' </th> <th> '+(inputXNum * i)+' </th> </tr>';
				// 해석: JS 변수 tablecontent 값 초기화 (동작: 기존에 가지고 있던 데이터는 유지하면서, 데이터를 추가함)
				
				document.querySelector('.tablecontent_HTML').innerHTML = tablecontent
				// 해석: 1)"document.querySelector('tablecontent_HTML')" tablecontent_HTML 마크업을 JS에서 사용 선언,
				// 		2)".innerHTML = tablecontent" JS 변수 tablecontent값을 HTML화면 출력
				
				xNum.value = null;	yNum.value = null;
				// 해석: HTML x,yNum 입력란 초기화		
			} // for E
} 	// 함수 E


