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

// 1. 검색 버튼 함수 생성 (기능 - 입력된 데이터를 JS로 연결 / )
function bookSearch( ){
	
		console.log('검색완료');	// --- 기능 확인 (정상 입력됨)
		
	let bookSearch = document.querySelector( '.bookResist_HTML' ).value;
	// 해석: HTML 클래스 bookResist_HTML JS 사용 선언 [DOM 객체화]
	
	let confirm = 0;
	// 유효성 변수 선언
		
	if( bookSearch.length < 5 || bookSearch.length > 10 ){
		confirm++;
			console.log(confirm)
		alert("도서명을 다시 입력하시오.(입력범위: 5 ~ 10)")
		}	
	printBookList()
}

// 1-1. 저장 버튼 함수 생성 (기능 - 입력된 값이 설정된 길이에 부합하고 중복이 아니면, 데이터를 JS배열에 추가)
function bookSave( ){
		console.log('저장 확인');
	
	let bookSaveInformation = document.querySelector( '.bookResist_HTML' ).value;
			console.log(bookSaveInformation)
			console.log(BookList)
		
		confirm = 0;
		
		bookSearch( )
		
		for( let j = 0; j < BookList.length; j++ ){
				console.log(BookList[j])
			if( BookList.indexOf(j) >= 0){
				confirm++;
					console.log(confirm)
				alert("이미 등록된 도서입니다. 다시 확인해주세요.")
			}
		}
		
		BookList.push(bookSaveInformation)	;
		
}
		
		
	
			
		
	bookSearch()
	/*
		for( let i = 0; i < BookList.length; i++){
			if( bookSave == BookList[i] ){
				alert("이미 등록된 도서입니다. 다시 확인해주세요.")
				break;
			}
			else{
				BookList.push( bookSave );
			}
		}
	*/

// 2. 검색 버튼 함수 생성



// 출력함수 생성
function printBookList(){
	let tableBookList = '<table><tr> <th>번호</th> <th>도서명</th> <th>도서 대여 여부</th> <th>비고</tr></table>';
	// 해석: JS 변수 bookList 선언
	
	for(let i = 0; i < BookList.length; i++){
		tableBookList += `<table><tr> <th> ${(i+1)} </th><th> ${BookList[i]} </th> <th>도서대여 여부</th>
						  	   <th><button onclick="buttonDelete( ${i} )">삭제</button></th>
					 	  </tr></table>`	
	}
	document.querySelector('.adminBookListPrint').innerHTML = tableBookList
	
}
