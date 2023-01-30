
boardPrint( null, null );
// 게시물 출력함수
function boardPrint( keyword, key ){
	// 기능: JAVA[백엔드]로 부터 데이터 요청
	// 백엔드로부터 요청된 결과: DB -> JAVA 순서로 전달된 게시물리스트 데이터라고 가정
	// 조건1) JS열렸을 때, 리스트 순차 출력		조건2) 검색되었을 때, keyword/key에 맞는 게시물만 출력

		console.log( keyword )
		console.log( key )

	// JAVA[백엔드]로 부터 데이터 요청하여 출력시킬 예정
	if( keyword == null && key == null ){
		// alert('검색 없이 게시물 출력') //--- 확인완료
	}
	else{
		// alert('검색된 게시물 출력') //--- 확인완료
	}
	
	let boardlist = [
	   { no : 5 , title : '안녕하세요A' , writer : '유재석' , date : '2023-01-30' , view:325 , up : 9 , down : 1  } , 
	   { no : 4 , title : '안녕하세요B' , writer : '강호동', date : '2023-01-27' , view:123 , up : 2 , down : 0  } , 
	   { no : 3 , title : '안녕하세요C' , writer : '신동엽' , date : '2023-01-25' , view:753 , up : 3 , down : 0  } , 
	   { no : 2 , title : '안녕하세요D' , writer : '서장훈' , date : '2023-01-24' , view:521 , up : 10 , down : 3  } , 
	   { no : 1 , title : '안녕하세요E' , writer : '김희철' , date : '2023-01-23' , view:951 , up : 21 , down : 4 } 
	]
	
	let html = ``
	
	boardlist.forEach( ( board ) => { 
		html += `<tr>
					<td> ${ board.no } </td>
					<td> <a href= "view.html" > ${ board.title } </a> </td>
					<td> ${ board.writer } </td>
					<td> ${ board.date } </td>
					<td> ${ board.view } </td>
					<td> ${ board.up } </td>
					<td> ${ board.down } </td>
				 </tr>`
	})
	document.querySelector('.boardbox').innerHTML = html
}

// 검색 함수
document.querySelector('.searchbtn').addEventListener( 'click' , (e) => {
	
		console.log('검색 클릭')
	
	// 키워드
	let keyword = document.querySelector('.keyword').value;
	
	// 검색어
	let key = document.querySelector('.key').value;
		
		console.log('keyword: ' + keyword)
		console.log('keyword: ' + key)
		
	boardPrint( keyword, key )
})