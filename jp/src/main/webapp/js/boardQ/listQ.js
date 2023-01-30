boardQPrint(null, null)

function boardQPrint( keyword, key){
	
	
	if( keyword == null && key == null){
		alert('검색 없이 출력')
	}
	else{
		alert('검색 출력')
	}
	
	let boardQlist = [
		{ no : 5 , title : '문의드립니다A' , writer : '유재석' , date : '2023-01-29' , view:2 , state : '접수중' , completeday : '' },
		{ no : 4 , title : '문의드립니다B' , writer : '강호동' , date : '2023-01-28' , view:3 , state : '처리완료' , completeday : '2023-01-29' },
		{ no : 3 , title : '문의드립니다C' , writer : '전현무' , date : '2023-01-27' , view:4 , state : '처리완료' , completeday : '2023-01-28' },
		{ no : 2 , title : '문의드립니다D' , writer : '잔나비' , date : '2023-01-26' , view:3 , state : '처리완료' , completeday : '2023-01-27' },
		{ no : 1 , title : '문의드립니다E' , writer : '김희성' , date : '2023-01-25' , view:5 , state : '처리완료' , completeday : '2023-01-26' }
	]
	
	let html = ''
	
	for(let i = 0; i < boardQlist.length; i++){
		
		html += `<tr>
					<td> ${ boardQlist[i].no } </td>
					<td> <a href="viewQ.html"> ${ boardQlist[i].title } </a> </td>
					<td> ${ boardQlist[i].writer } </td>
					<td> ${ boardQlist[i].date } </td> 
					<td> ${ boardQlist[i].view } </td> 
					<td> ${ boardQlist[i].state } </td> 
					<td> ${ boardQlist[i].completeday } </td>
				</tr>`
	}
	
	document.querySelector('.Qboard').innerHTML = html
}

document.querySelector('.searchbtn').addEventListener( 'click' , (e) => {
	
		// console.log('클릭 함수 확인') //--- 작동 확인
	
	let keyword = document.querySelector('.keyword').value;
	let key = document.querySelector('.key').value;
	
		// console.log(keyword) //--- 작동 확인
		// console.log(key) //--- 작동 확인
	boardQPrint( keyword, key )
})