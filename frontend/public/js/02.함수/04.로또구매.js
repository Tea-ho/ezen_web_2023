console.log('1. js 작동 확인')

// 1. 로또 출력 함수 생성
function lottoPrint(){
	
	console.log('2. 함수 작동 확인')
	let numBox = '';
	for( let i = 1; i <= 45; i++){
		console.log('3. 반복문 작동 확인' + i);
		
		// HTML 형식을 JS로 가져와 사용하는 방법
		// 1. 문자열 처리
		// '<button onclick="lottoNum('+i+')">' +i+ '</button>'
		
		// 2. 백틱 이용한 문자열 처리
		// `(백틱: esc 아래 문자)
		// 1) 전체를 백틱으로 감싼다.
		// 2) 변수/수식은 ${}로 감싼다.
		numBox += `<button style="width:60px; height=50px;" onclick="lottoNum(${i})">${i}</button>`
		
		 if( i % 5 == 0 ) {
			 numBox += '<br/>'
		 }
	}
	console.log( '4. 버튼 박스 생성 확인');
	// 해당 div에 숫자버튼 생성
	document.querySelector('.numButtonBox').innerHTML = numBox
	
	// 취소 버튼 보이게 활성화
	document.querySelector('.cancleButton').style.display = "inline"
}

// 2. 숫자 버튼 없애는 함수
function lottoCancle(){
	// 해당 <div>를 공백으로하여 보이지 않게 설정
	document.querySelector('.numButtonBox').innerHTML = ''
	
	// 취소 버튼 안보이게 비활성화
	document.querySelector('.cancleButton').style.display = 'none'
}

// 1. 선택한 숫자 6개 저장하는 배열
let 선택번호목록 = []


// 3. 버튼 클릭 함수
function lottoNum( i ){
// 해석: 위에서 생성한 숫자 버튼을 클릭했을 때, 동작되는 함수 생성
// 생성한 숫자 버튼과 동일한 숫자를 출력하기 때문에 매개변수(인수)를 i로 설정

	console.log(i + "번호를 클릭하셨군요.")
	
	// 조건 설정 및 유효성 검사
	// 중복검사
	if( 선택번호목록.indexOf(i) >= 0 ){		// if S
	// indexOf: 인덱스 번호 반환, 없으면 -1 반환
	
		alert('이미 선택한 번호입니다.[해당 번호는 삭제됩니다.]')
		
		// 중복 삭제 처리
		선택번호목록.splice(선택번호목록.indexOf(i),1);
		추첨버튼출력();
		
		return;
		// 해석 반환값은 없지만, 함수를 종료할 수 있음.
	}	// if E 
	
	// 6개까지만 저장
	if( 선택번호목록.length == 6 ){		// if S
	// 해석: 배열 길이가 6이면 아래 실행
	
		alert('이미 모두[6개]를 선택했습니다.')
		
		return;
	}	// if E
	
	선택번호목록.push(i)
	추첨버튼출력();
	
}

//4. 선택번호목록 출력 및 추첨[결과]버튼 활성화
function 추첨버튼출력(){
	// 추첨(결과)버튼 활성화
	if( 선택번호목록.length == 6 ){
		document.querySelector('.resultButton').style.display = 'inline'
	}
	else{
		document.querySelector('.resultButton').style.display = 'none'
	}
	
	document.querySelector('.selectNumBox').innerHTML=선택번호목록
}
