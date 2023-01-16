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
	let 비밀번호 = document.querySelector('.비밀번호').value;
		console.log( '비번 : ' + 비밀번호)

	let board = { writer: 작성자, content: 내용, PW: 비밀번호 };
	// 해석: 객체 board 생성
		console.log( board)
	
	
	// 객체 배열에 저장 [ 목적: 동일한 타입의 객체 여러개를 배열에 저장하기 위함 ]
	boardArray.push( board )
		console.log( boardArray )
		
	printTable()	
}

function buttonDelete(i){
	let 비밀번호 = prompt('게시물 비밀번호 입력: ')
		console.log(비밀번호)
	
	let confirm = 0;
	
	if( 비밀번호 == boardArray[i].PW ){
		boardArray.splice( i, 1 );
		alert('해당 게시글이 정상적으로 삭제되었습니다.');
		printTable();
	}
	else{
		confirm++;
			console.log(confirm)
		alert('비밀번호 불일치')
	}
}

function buttonEdit(i){
	let 비밀번호 = prompt('게시물 비밀번호 입력: ')
	
	let confirm = 0;
	
	if( 비밀번호 == boardArray[i].PW ){
		let 수정내용 = prompt('수정할 내용 입력:');
		boardArray[i].content = 수정내용;
		alert('정상적으로 게시글 내용이 수정되었습니다.');
		printTable();
	}
	else{
		confirm++;
			console.log(confirm)
		alert('비밀번호 불일치')
	}
	
}


function printTable(){
	// 배열 내 객체 출력
	let html = `<tr><th>번호</th><th>내용</th><th>작성자</th><th>비고</th></tr>`
	
	for( let i = 0; i < boardArray.length; i++){
		html += `<tr>
					<td> ${ i+1 } </td>
					<td> ${ boardArray[i].content } </td>
					<td> ${ boardArray[i].writer } </td>
					<td> <button onclick="buttonDelete( ${i} )">삭제</button>
						 <button onclick="buttonEdit( ${i} )">수정</button>
					</td>	
				</tr>`;
	}
	document.querySelector('.게시물테이블').innerHTML = html;
}