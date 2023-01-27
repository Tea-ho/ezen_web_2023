alert('js작동 확인')

/*
	배열 베이스 조건
	1) let BookList = ['혼자공부하는자바','이것이자바다','열혈 C언어']
	2) let BookList = []

	관리자 part
	기능1) 도서 등록 [도서명] 					// bookResist
		  - 조건1> 중복 불가
		  - 조건2> 도서명 글자수(5~10)만 입력 가능
	기능2) 도서 현황 출력						// adminBookListPrint
		  - 번호
		  - 도서명
		  - 도서대여 여부 (대여중, 대여가능)		// checkRent	
		  - 삭제버튼							// buttonDelete
		  
		  예시) 번호	 도서		도서대여여부	비고(삭제버튼)

		  
	고객 part
	기능1) 도서 목록 확인						// clientBookListPrint
		  - 번호
		  - 도서명
		  - 도서대여 여부 (대여중, 대여가능)		// checkRent
		  - 대여 버튼 / 반납 버튼				// buttonRent, buttonReturn
		  
		  예시) 번호	 도서		도서대여여부	비고(대여/반납버튼)
		  
	기능2) 도서 대여
		  - 없는 도서명 불가능
		  - 대여중 도서 불가능

	기능3) 도서 반납
		  - 없는 도서명 불가능
		  - 대여 도서가 아니면 불가능
	
*/

// 230113, 김태호
let BookList = ['혼자공부하는자바','이것이자바다','열혈 C언어']
 let RentList = ['혼자공부하는자바'];

printBookList('admin'); printBookList('client');

// 1-1. 검색창 도서명 JS 연결 및 검색 버튼 함수 생성 (기능 )
function bookSearch(){
		//console.log("검색 함수 작동 확인")
	
	let bookSearch = document.querySelector('.bookResist_HTML').value;
	
	let confirm = 0;
	
	if( bookSearch.length >= 5 && bookSearch.length <= 10 ){
		//console.log(BookList)
		confirm = 0
		printBookList()
	}
	else{
			//console.log(confirm)
		alert("도서명을 다시 입력하시오.(입력범위: 5 ~ 10)")
		confirm++
	}
	return confirm
}

// 1-2. 저장 버튼 함수 생성
function bookSave(){
		//console.log('저장 함수 작동 확인')
	
	let bookSave = document.querySelector('.bookResist_HTML').value;
	
	let confirm = bookSearch();
		// console.log(confirm)
	
	if(confirm == 0){
		// console.log(BookList)
		
		for( let i = 0; i < BookList.length; i++){
			// console.log(BookList[i])
			if(bookSave == BookList[i]){
				confirm++;
				// console.log(confirm)
				printBookList('admin'); printBookList('client');
				alert("이미 등록된 도서입니다. 다시 확인해주세요.")
			}		
		}
	}
	if(confirm == 0){
		BookList.push(bookSave)		
		printBookList('admin'); printBookList('client');		

		// console.log(BookList)
	}
}

// 2-1. 도서 현황 출력 함수 생성
// 적용 시점: 1)JS 열렸을 때, 2)등록했을 때, 3)삭제했을 때
function printBookList( type ){
	let tableBookList = '<table class="tableBookList"><tr> <th class="list1">번호</th> <th class="list2">도서명</th> <th class="list3">도서 대여 여부</th> <th class="list4">비고</tr></table>';
	// 해석: JS 변수 bookList 선언
	
	for(let i = 0; i < BookList.length; i++){
		tableBookList += `<table class="tableBookList">
							<tr>
								<th class="list1"> ${ (i+1) } </th>
								<th class="list2"> ${ BookList[i] } </th>
								<th class="list3"> ${ RentList.includes(BookList[i]) ? '대여중' : '대여가능' } </th>
						`
		if( type == 'admin' ){
			tableBookList += 	`<th class="list4"> <button onclick="buttonDelete( ${i} )">삭제</button> </th>
					 	  		</tr>
					 	 	</table>`
					 	 	
			document.querySelector('.adminBookListPrint').innerHTML = tableBookList
		}
		
		else if( type == 'client' ){
			tableBookList += 	`<th><button onclick="buttonRent( ${i} )"> 대여 </button></th>
							  	 <th><button onclick="buttonReturn( ${i} )"> 반납 </button></th>
	 						  </tr>
					 	 	</table>`
			document.querySelector('#book_Checkout').innerHTML = tableBookList;
		}			  	   	
	}
}

// 2-2. 삭제버튼 함수 생성
function buttonDelete( dNum ){

	// 유효성 검사 - 대여중 확인
	if( RentList.includes( BookList[dNum] ) ){
		alert('해당 책은 대여중으로 삭제가 불가합니다.')
		return false;
	}
	
	BookList.splice( dNum, 1 )
	printBookList('admin'); printBookList('client');
	alert("정상적으로 삭제되었습니다.")
}

/*이경석 하단ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/

//대여버튼
function buttonRent( i ){
	
	// 유효성 검사 - 대여 현황 체크
	if(RentList.includes(BookList[i])){
		alert('대여중인 도서로, 대여가 불가능 합니다.')
		return false;
	}
	
	// 대여 기능
	RentList.push(BookList[i])
	
	// 랜더링
	 printBookList('admin'); printBookList('client');
	 return true;
}

//반납버튼
function buttonReturn( i ){
	
	if(RentList.includes(BookList[i])){
		RentList.splice( i , 1 );
		printBookList('admin'); printBookList('client');
		alert('정상적으로 반납되었습니다.');
		return true;
	}
	alert('대여중인 도서가 아닙니다.')
	return false;
}