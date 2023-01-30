	//console.log('작동확인')

let 게시물임시저장소 = []


function boardWrite(){
	// 기능1: [첨부파일 없는 경우] 입력받은 input 데이터 객체화 
	let board = {
		btitle: document.querySelector('.btitle').value,
		bcontent: document.querySelector('.bcontent').value,
		bwriter: document.querySelector('.bwriter').value,
		bpassword: document.querySelector('.bpassword').value
	}
		console.log(board)
		
	// 기능1: [첨부파일 있는 경우] 입력양식 form 전체를 객체화
	let writeform = document.querySelector('.writeform');
	let formdata = new FormData( writeform );
		console.log( writeform )
		console.log( formdata )
		
	
	// 기능2: JAVA에 데이터 전송 (생략)
	게시물임시저장소.push( board )
	
	// 기능3: 전송한 결과 수신 [통신-AJAX]
	let result = true;
	if( result ){ alert('글쓰기 성공'); location.href = 'list.html'; }
	else{ alert( '글쓰기 실패' )}
	
	// 피드백: JS 페이지 전환 함수
	// 		 loction.href="경로" (경로로 페이지 전환)
	
	// JAVA로부터 전송결과 수신
	
	// 기능4: 결과에 따른 이벤트
	
}

$(document).ready(function() {
  $('#summernote').summernote( {
	  height: 350,
	  lang: 'ko-KR'
	} );
});