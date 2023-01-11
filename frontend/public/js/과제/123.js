/* 과제2>
   주제: 입력된 값으로 구구단 출력
   
   조건1> 단[input]과 곱[input] 입력 받기
   조건2> 확인[button] 클릭하면 결과 실행
   조건3> 테이블에 출력

*/

let tablecontent = '<tr> <th>단</th> <th>곱</th> <th>결과</th> </tr>'

let xNum_Store = [];
let yNum_Store = [];

function confirm(){		// 함수 S
	
	let anum = document.querySelector( '.anum' );
	let bnum = document.querySelector( '.bnum' );
	// HTML Num1,2 클래스 JS 사용 선언 [DOM 객체화]
	
	let xNum = numX.value;	// --- 조건1>
	let yNum = numY.value;	// --- 조건1>
		console.log( anum );	// --- 기능확인(입력 확인)
		console.log( bnum );	// --- 기능확인(입력 확인)
		
	let xindex = xNum_Store.indexOf( xNum );	// 기능: 입력받은 data 저장
	let yindex = yNum_Store.indexOf( yNum );	// 기능: 입력받은 data 저장
		console.log( xindex );	// --- 기능확인
		console.log( yindex );	// --- 기능확인
	
	let confirm = 0;
	
	if ( numX.value == '' || numY.value == '' ){
		alert( "숫자를 입력해주세요.(오류: 미입력)" );
		numX.value = null;
		numY.value = null;
		confirm++;
	}
	
	if ( confirm == 0 && (numX.value.length != 1 || numY.value.length !=1) ){
		alert( "숫자를 다시 입력해주세요.(오류: 자리수 초과(1~9까지 입력))" );
		numX.value = null;
		numY.value = null;
		confirm++;
	}
	
	if ( confirm == 0 ){	// if S
		
		let output = '';
		
		for( let xNum; xNum <= 9; xNum++ ){	// for1 S
			for( let yNum; yNum <= 9; yNum++){	// for2 S
				console.log( xNum + 'x' + yNum + '=' + (xNum * yNum))		// 기능확인(결과값 확인)
				output = 'xNum + '*' + yNum + '=' + (xNum * yNum)';
			
			}	// for2 E
		}	// for1 E
	}	// if E
} 	// 함수 E