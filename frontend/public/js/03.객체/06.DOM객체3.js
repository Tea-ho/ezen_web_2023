/*
	1. 키보드 눌렀을 때 이벤트 생성
	 - keyup: 키에서 손을 떼었을 때, 동작
	 - keydown: 키를 누르고 있을 때, 동작

*/

const textarea = document.querySelector('textarea')
// 해석: HTML textarea 객체화

const h3 = document.querySelector('h3')

textarea.addEventListener( 'keyup' , ( event ) => {
	
	h3.innerHTML = `글자 수: ${ textarea.value.length }`
	
	console.log( event )
	// 해석: 이벤트 상태를 확인할 수 있음.
	console.log( 'alt 키를 조합으로 눌렀는지 확인: ' + event.altKey )
	console.log( 'ctrl 키를 조합으로 눌렀는지 확인: ' + event.ctrlKey )
	console.log( 'shift 키를 조합으로 눌렀는지 확인: ' + event.shiftKey )
	console.log( '누른 키(code) 확인: ' + event.code )
	console.log( '누른 키(key) 확인: ' + event.key )
	
})

textarea.style.position = 'absolute'
// 선언 이유: body 안에 있는 textarea를 이동키로 이동시키기 위함
// 해석: 1)JS에서 CSS 제어 가능, 2)HTML Body를 기준으로 포지션 조정 가능 상태


let x = 0;
let y = 0;
let block = 10;
// 해석: 변수 선언 및 초기화

print();

// print 함수 생성 
function print(){
	textarea.style.left = `${ x*block }px`
	textarea.style.top = `${ y*block }px`
	// 해석: 1)style.left: 왼쪽 위치 (초기값: 0), 2)style.top: 위쪽 위치 (초기값: 0)		
}

document.body.addEventListener( 'keydown' , ( e )=>{
// 해석: HTML body에 이벤트 함수 적용 (적용 이벤트: keydown, 작동한 상태를 함수 매개 변수로 넣어준다)

		console.log('키 눌림 확인')	// --- 함수 작동 확인 
	
		console.log(e)				// --- e값 확인
	
		console.log( e.keyCode ) 	// --- 방향키 keyCode 확인 (왼쪽:37, 위:38, 오른쪽:39, 아래:40)
	
	let key = e.keyCode;
	// 해석: JS 변수 key 선언 및 초기화 (입력값: e.keyCode)
	
	if( control ){
		if( key == 37 ){ x--; }
		else if( key == 38 ){ y--; }
		else if( key == 39 ){ x++; }
		else if( key == 40 ){ y++; }	
		// 해석: 방향키와 매칭된 keycode를 이용하여 x,y 값 조정
	}
	print();
	// 해석: HTML body에 적용한 이벤트 keydown이 작동할 때마다 출력함수 작동 
} )

let control = true;
// JS control 변수 선언 (초기값: true) (목적: 배치하기 버튼으로, textarea 움직임을 제어하기 위함)

document.querySelector('.moving').addEventListener('click', ()=>{
	
	// 스위치 on/off 변경
	
	control = !control
	// 해석: 1회 클릭하면 control 값이 false로 변경되어 위의 keydown 동작이 불가능해짐
	// 해석: 2회 클릭하면 control 값이 다시 true로 변경되어 위의 keydown 동작을 다시 진행할 수 있음.
	// 무한 반복
})



