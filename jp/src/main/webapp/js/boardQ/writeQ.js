console.log('작동확인')

let 문의사항임시저장 = []

function boardQWrite(){
	
	// 기능1-1: [첨부파일 없는 경우] 입력받은 input값 객체화
	let boardQ = {
		bQtitle: document.querySelector('.bQtitle').value,
		bQcontent: document.querySelector('.bQcontent').value,
		bQwriter: document.querySelector('.bQwriter').value,
		bQpassword: document.querySelector('.bQpassword').value	
	}
	
	// 기능1-2: [첨부파일 있는 경우] 입력양식 form 전체를 객체화
	let writeQform = document.querySelector('.writeform');
	let formdata = new FormData( writeQform );
		console.log( writeQform )
		console.log( formdata )	
	
	문의사항임시저장.push(boardQ)
	
		// console.log(문의사항임시저장) //--- 작동 확인		
		
	let result = true;
	if( result ){ alert('글쓰기 성공'); location.href = 'listQ.html'; }
	else{ alert( '글쓰기 실패' )}
	
}

$(document).ready(function() {
  $('#summernote').summernote( {
	  height: 350,
	  lang: 'ko-KR'
	} );
});