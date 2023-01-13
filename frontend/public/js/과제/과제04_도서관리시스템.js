alert('js작동 확인')

/*
	배열 베이스 조건
	1) let BookList = ['혼자공부하는자바','이것이자바다','열혈 C언어']
	2) let RentList = []

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
				printBookList()
				alert("이미 등록된 도서입니다. 다시 확인해주세요.")
			}		
		}
	}
	if(confirm == 0){
		BookList.push(bookSave)		
		printBookList()		

		// console.log(BookList)
	}
}

// 2-1. 도서 현황 출력 함수 생성
function printBookList(){
	let tableBookList = '<table class="tableBookList"><tr> <th class="list1">번호</th> <th class="list2">도서명</th> <th class="list3">도서 대여 여부</th> <th class="list4">비고</tr></table>';
	// 해석: JS 변수 bookList 선언
	
	for(let i = 0; i < BookList.length; i++){
		tableBookList += `<table class="tableBookList">
							<tr>
								<th class="list1"> ${(i+1)} </th>
								<th class="list2"> ${BookList[i]} </th>
								<th class="list3"> <button onclick="checkRent( ${i} )">대여현황 확인</button></th>
						  	   	<th class="list4"> <button onclick="buttonDelete( ${i} )">삭제</button> </th>
					 	  </tr>
					 	 </table>`	
	}
	document.querySelector('.adminBookListPrint').innerHTML = tableBookList	
}

// 2-2. 도서대여 여부 (합체)


// 2-3. 삭제버튼 함수 생성
function buttonDelete( dNum ){

	BookList.splice( dNum, 1 )
	printBookList()
	alert("정상적으로 삭제되었습니다.")
}


