// select 이벤트 - change
// 동작 시점: select value값이 변경되었을 때 동작
// 활용:

let selectBox = document.querySelector('.selectBox')
selectBox.addEventListener( 'change' , (e) => {
		console.log(e) // ---- 확인
	
	e.currentTarget // 이벤트를 실행한 마크업(타겟) 확인 (예상: selectBox)
		console.log(e.currentTarget) // ---- 확인
		
	let options = e.currentTarget.options	// select 모든 옵션을 배열로 반환
		console.log(e.currentTarget.options) // ---- 확인
		
	let selectedIndex = e.currentTarget.options.selectedIndex // select에서 선택한 인덱스 값 확인
		console.log(e.currentTarget.options.selectedIndex)
		
		console.log( options[selectedIndex].textContent )
		// 해석: select 모듭 옵션 중 선택된 인덱스의 text값 내용 반환
		console.log( options[selectedIndex].value )
		// 해석: select 모듭 옵션 중 선택된 인덱스의 value값 내용 반환
		
		// console.log( selectedIndex.value ) ---- 문법 오류
	
	document.querySelector('h3').innerHTML = `선택한 옵션: ${ options[selectedIndex].value }`	
})

// checkbox 이벤트 - change
// 동작 시점: check가 되었을 때 동작

let checkbox = document.querySelector('.checkbox')
checkbox.addEventListener( 'change', (e) =>{
		console.log(e) // ---- 확인
	
	e.currentTarget
		console.log(e.currentTarget) // ---- 확인
		
	e.currentTarget.checked	// check 여부 확인 (checked: true, unchecked: false)
		console.log(e.currentTarget.checked) // ---- 확인
})

// checkbox 활용 - 타이머
let timer = 0; 
let timerID = 0;
// 전역 변수 timer, timerID 생성

let timerbox = document.querySelector('.timerbox')
let timerspan = document.querySelector('.timerspan')
timerbox.addEventListener( 'change', (e)=>{
	
	if( e.currentTarget.checked ){
		
		timerID = setInterval( ()=>{
			timer++;
			timerspan.innerHTML = timer + '초'
		}, 1000 )
		// 기능: 특정 시간마다 함수 실행
		// 문법: setInterval( 함수명, 시간(밀리초=1/1000초) )
	}
	else{
		clearInterval( timerID )
	}
	
})
