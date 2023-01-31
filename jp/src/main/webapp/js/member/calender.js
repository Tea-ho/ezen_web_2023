// console.log('작동 확인') //--- 확인 완료

/*
날짜 관련 함수
let date = new Date();
let date = new Date( 연도, 월+1, 0); => 연 / 월 자동 출력하고, 일은 마지막 일수 출력
let date = new Date( 연도, 월, 1); => 연 / 월 자동 출력하고, 일은 처음 일수 출력

console.log( 'date: ' + date )
console.log( 'date: ' + date.getFullYear() )
console.log( 'date: ' + date.getMonth() )
console.log( 'date: ' + date.getDate() )
console.log( 'date: ' + date.getDay() )
*/

let contents = [
]


// JS 열렸을 때, 현재 연도/월 변수로 저장
let year = new Date().getFullYear();
let month = new Date().getMonth()+1;

calPrint();
// 캘린더 상단에 내용 출력

// 캘린더 출력 함수
function calPrint(){
	// 기능1: 캘린더 상단 - 년도 월 출력
	document.querySelector('.top_date').innerHTML =  ` ${ year }년 ${ month }월  `
	
	// 기능2: 현재 설정된 날짜 출력 (선언 이유: 월에 맞춰 달력 생성을 하기 위함)
	let lastdate = new Date( year, month, 0 ).getDate();
		// console.log( '현 캘린더 날짜 확인: ' + date ) //--- 확인 완료
	
	let html = `<div class="day weekday sunday"> 일 </div>	<div class="day weekday"> 월 </div>
				<div class="day weekday"> 화 </div>			<div class="day weekday"> 수 </div>
				<div class="day weekday"> 목 </div>			<div class="day weekday"> 금 </div>
				<div class="day weekday"> 토 </div>`
	
	// 기능2-1: 해당 월의 시작 요일 구하기
	let weekday = new Date( year , month-1 , 1).getDay();
	
	for( let b = 1; b <= weekday; b++ ){
		html += `<div class="day"> </div>`
	}
	
	
	// 기능 2-2: 해당 월의 일수 출력하기
	for( let day = 1; day <= lastdate; day++ ){
		
		let curDate = dateForm(new Date( year, month-1, day ));
			// console.log(curDate) //--- 확인 완료
		
		html += `<div class="day" onclick="openModal( ${curDate} )"> ${ day } ${ contentsPrint(curDate) } </div>`
	}
	document.querySelector('.cal_day').innerHTML = html

}

// < 버튼 작동 함수
document.querySelector('.previousbtn').addEventListener( 'click', (e)=>{
		// console.log('작동확인') //--- 확인 완료
		month--;
		if( month < 1 ){ year--; month = 12; }
		calPrint();
})

// > 버튼 작동 함수
document.querySelector('.nextbtn').addEventListener( 'click', (e)=>{
		// console.log('작동확인') //--- 확인 완료
		month++;
		if( month > 12 ){ year++; month = 1; }
		calPrint();
})

// 날짜함수 형식 변형 함수 (생성 이유: contents 객체 데이터와 비교하여 사용하기 위함)
function dateForm( date ){
	
	let dYear = date.getFullYear();
	let dMonth = (date.getMonth()+1) <= 9 ? '0'+(date.getMonth()+1) : (date.getMonth()+1);
	// 자리수 통일하기 위하여 삼항연산자 사용 (조건: 한자리 숫자의 경우 앞에 0 추가)
	let dDay = (date.getDate()) <= 9 ? '0'+(date.getDate()) : (date.getDate());
	return `${ dYear }${ dMonth }${ dDay }`
}

// 객체에 저장되어 있는 이벤트 일정 출력 함수
function contentsPrint( curDate ){
	
	let html = ``
	
	contents.forEach( (o) => {
		if( curDate == o.date ){
			html += `<div class="content" style="background-color: ${o.bg_color}"> ${ o.content } </div>`
			// 배경색상 선택 입력
		}
	})
	return html;
}



// 모달 열기 함수
function openModal( curDate ){
	// 기능1: 모달창 활성화
	document.querySelector('.modal_wrap').style.display = "flex";
		// alert( curDate + '의 모달 열기')//--- 확인 완료
	// 기능2: 모달창의 날짜 최신화 (선택한 날짜 출력)
	document.querySelector('.modal_date').innerHTML = curDate;
		// console.log(curDate) //--- 확인 완료
	// 기능3: 선택 날짜에 저장된 일정 출력
	modalListPrint( curDate )
}

// 모달 닫기 함수1 (닫기 버튼)
function closeModal(){
	// 기능1: 입력창 데이터 초기화
	document.querySelector('.modal_input').value = ''
	// 기능2: 모달창 off
	document.querySelector('.modal_wrap').style.display = "none";

}

// 모달 닫기 함수2 (esc 버튼)
document.addEventListener( 'keydown' , (e) => { 
	let key = e.keyCode;
		
	if( key == 27 ){
		// 기능1: 입력창 데이터 초기화
		document.querySelector('.modal_input').value = ''
		// 기능2: 모달창 off
		document.querySelector('.modal_wrap').style.display = "none";
	}
})
	
// 모달 등록 함수
document.querySelector('.modal_write').addEventListener( 'click' , (e) =>{
	let content = {
		date: document.querySelector('.modal_date').innerHTML,
		content: document.querySelector('.modal_input').value,
		bg_color: document.querySelector('.modal_color').value
	}
	
		// console.log(content) //--- 확인 완료
	
	// 기능1: 신규 데이터 배열에 저장
	contents.push( content );
	// 기능2: 입력창에 입력된 데이터 초기화 처리
	document.querySelector('.modal_input').value = ''
	// 기능3: 모달창 off
	document.querySelector('.modal_wrap').style.display = "none";
	// 기능4: 캘린더 새로고침(랜더링)
	calPrint();
	
})

function deleteModal(i){
	// 기능1: 선택 삭제한 데이터 객체에서 삭제
	contents.splice( i , 1 )
	// 기능2: 모달창 off
	document.querySelector('.modal_wrap').style.display = "none";
	// 기능3: 캘린더 새로고침(랜더링)
	calPrint();
}


function modalListPrint( curDate ){
	
		// console.log(curDate) //--- 확인 완료
	
	let html = `<tr>
					<td width="5%"> # </td> <td> 일정내용 </td> <td width="15%"> 비고 </td>
				</tr>`
	
	let listNo = 0;
	
	for( let i = 0; i < contents.length; i++ ){
		if( curDate == contents[i].date ){
			listNo++;
			
			html += `<tr>
						<td> ${ listNo } </td> <td> ${ contents[i].content } </td> <td> <button onclick="deleteModal( ${i} )" class="form-control" type="button"> 삭제 </button> </td>
					</tr>`
		}
	}

	document.querySelector('.table').innerHTML = html			
}

