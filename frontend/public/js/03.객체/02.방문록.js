	// console.log('연동 확인')

// 배열 선언 [ 기능: board 객체 누적 저장 ]
let boardArray = []

//1. 작성 버튼 클릭 시 실행 함수 생성
function 작성(){
	console.log('함수 작동 확인')
	
	let 작성자 = document.querySelector('.작성자').value;
		console.log( '작성자 : ' + 작성자)
	let 내용 = document.querySelector('.내용').value;
		console.log( '내용 : ' + 내용)
		
	// 데이터 1개로 객체화
	let board = { writer: 작성자, content: 내용 };
		console.log( board)
	
	// 객체 배열에 저장 [ 목적: 동일한 타입의 객체 여러개를 배열에 저장하기 위함 ]
	boardArray.push( board )
		console.log( boardArray )
		
	// 배열 내 객체 출력
	let html = `<tr><th>번호</th><th>내용</th><th>작성자</th></tr>`
	
	for( let i = 0; i < boardArray.length; i++){
		html += `<tr>
					<td> ${ i+1 } </td>
					<td> ${ boardArray[i].content } </td>
					<td> ${ boardArray[i].writer } </td>	
				</tr>`;
	}
	document.querySelector('.게시물테이블').innerHTML = html;
	
}