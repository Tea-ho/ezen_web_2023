
console.log('1. js 작동 확인')

// 1-1. 로또 출력 함수 (기능 - 구매 버튼 눌렀을 때 선택번호상자(1~45) 생성 및 취소버튼 활성 )
function lottoPrint(){
	
	console.log('2. 함수 작동 확인')
	let numBox = '';
	
	// 1-2. 로또 숫자버튼 생성
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
		// lottoNum 함수 선언
		
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

// 1-3. 로또 취소 함수 (기능 - 초기 화면으로 돌아가기)
function lottoCancle(){
	// 해당 <div>를 공백으로하여 보이지 않게 설정
	document.querySelector('.numButtonBox').innerHTML = ''
	
	// 취소 버튼 안보이게 비활성화
	document.querySelector('.cancleButton').style.display = 'none'

	// 배열내 모든 요소 제거
	SelectNumList.splice(0);
	// 해석: 배열에서 index번호 0번부터 모두 삭제
	ResultNumList.splice(0);
	document.querySelector('.추첨번호상자').innerHTML=ResultNumList
	
	PrintSelectNum();

}

// 3-1. 선택한 숫자 6개 저장하는 배열
let SelectNumList = []


// 3-2. 선택한 번호 저장 함수 (기능: 생성된 숫자 버튼을 눌러 입력된 값을 SelectNumList 배열에 저장)
function lottoNum( i ){
// 해석: 위에서 생성한 숫자 버튼을 클릭했을 때, 동작되는 함수 생성

	console.log(i + "번호를 클릭하셨군요.")
	
	// 조건 설정 및 유효성 검사
	// 중복검사
	if( SelectNumList.indexOf(i) >= 0 ){		// if S
	// indexOf: 인덱스 번호 반환, 없으면 -1 반환
	
		alert('이미 선택한 번호입니다.[해당 번호는 삭제됩니다.]')
		
		// 중복 삭제 처리
		SelectNumList.splice(SelectNumList.indexOf(i),1);
		PrintSelectNum();
		
		return;
		// 해석 반환값은 없지만, 함수를 종료할 수 있음.
	}	// if E 
	
	// 6개까지만 저장
	if( SelectNumList.length == 6 ){		// if S
	// 해석: 배열 길이가 6이면 아래 실행
	
		alert('이미 모두[6개]를 선택했습니다.')
		
		return;
	}	// if E
	
	SelectNumList.push(i)
	PrintSelectNum();
	
}

// 4. SelectNumList 출력 및 추첨[결과]버튼 활성화
// [사용중인 부분: 1)구매취소, 2)버튼클릭 시 번호등록, 3)번호 취소]
function PrintSelectNum(){
	// 추첨(결과)버튼 활성화
	if( SelectNumList.length == 6 ){
		document.querySelector('.resultButton').style.display = 'inline'
	}
	else{
		document.querySelector('.resultButton').style.display = 'none'
	}
	
	document.querySelector('.selectNumBox').innerHTML=SelectNumList
}

// 4-1. ResultNumList 배열 선언
let ResultNumList = []

// 4-2. 결과값 확인 함수 (기능: 1~45사이에서 난수 6개를 생성하여 출력)
function lottoResult() {
	
	// 1) 컴퓨터가 난수 발생 [1~45사이의 수 6개]
	for( let j = 1; j <= 6; j++){
		console.log( parseInt( Math.random()*45+1 ) )
		
		if(ResultNumList.indexOf(j) >= 0 ){ // 배열내 존재한 난수
			j--;
			// 해석: i 6회 반복하는 과정에서 결과값이 겹치면 for 횟수 차감
		}
		else{	// 배열내 존재하지 않는 난수
			ResultNumList.push( parseInt( Math.random()*45+1 ) )
			// 해석: ResultNumList 배열에 입력값을 넣는다. (입력값: 1~46)
		}
	}
	console.log(ResultNumList)
	document.querySelector('.추첨번호상자').innerHTML=ResultNumList
	
	let correctScore = 0
	
	for( let k = 0; k < ResultNumList.length; k++ ){
		
		for( let l = 0; l < SelectNumList.length; l++ ){
			console.log(ResultNumList[k] + " : " + SelectNumList[l] );
			if( ResultNumList[k] == SelectNumList[l] ){
				correctScore++;
				console.log( correctScore )
			}
		}
	}
	alert(correctScore)
	
}

// 난수 만들기
// 1. Math 클래스 활용
// 2. random() 함수 => Math 클래스가 제공하는 미리 만들어둔 함수
// Ex> Math.random() : 0 ~ 1 사이의 난수(실수) 발생
// Ex> Math.random()+1 : 1 ~ 2 사이의 난수(실수) 발생
// Ex> Math.random()*45: 0 ~ 45 사이의 난수(실수) 발생
// Ex> Math.random()*45+1: 1 ~ 46 사이의 난수(실수) 발생
// 3. 정수로 변환시키고 싶은 경우, parseInt(Math.random())
// 	  혹은 Math.floor() 함수 이용