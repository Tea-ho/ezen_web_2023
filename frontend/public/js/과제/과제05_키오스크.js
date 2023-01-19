/*	주제: 키오스크
	
	공통
	1) 하나의 html에 2가지 요구사항 구현
	2) 기본 카테고리
	   let categoryList = [ 프리미엄, 스페셜, 와퍼, 올데이킹, 치킨버거 ]
	3) 객체 생성 [ 사용: prodct 데이터(서로 다른 유형)를 객체화]
	   let burger = {
		   img: 버거 사진
		   name: 버거 이름
		   price: 버거 가격
		   category: 버거 카테고리
	   }
	4) 카트 리스트
	   let cartList = [ {burger}, {burger}, {burger}, {burger}, {burger}, ....... ]
	   
	5) 주문객체
	   let order = {
	       orderno: 주문번호
	       orderitems: 주문된 cartlist = [  ] 
	       ordertime: 주문시간
	       orderstate: 주문상태 (true:주문, false:완료)
	       ordercomplete: 주문완료시간
	       orderprice: 주문가격
	   } 
	6) 주문목록
	   let orderList = [ {order}, {order}, {order}, {order}, ......... ]
	   
	   예시>
	   let 주문목록 = [
		   {주문번호:1, cartlist: [ burger{ [name, price, img, category] }, burger{}, burger{} ] },
		   {주문번호:2, cartlist: [ {}, {}, {} ] },
		   {주문번호:2, cartlist: [ {}, {}, {} ] }
	   ]
	   
	   
	
	고객 요구사항
	1) 프론트: 카톡 사진 활용 (슬라이드 화살표 제외)
	2) 기능
	 - 메뉴[카테고리]: 메뉴에 맞는 제품들만 출력
	 - 제품이미지 [클릭]: 클릭하면, 장바구니(카트)에 담기
	 - 장바구니(카트): 카트 내 1)제품수 및 2)토탈가격 출력
	 - 취소: 모든 카트내 제품 제거
	 - 주문: 모든 카트내 제품을 주문목록에 추가후 모든 카트내 제품 제거 (결제페이지 X)
	 
	 관리자 요구사항 (26(목)까지 제출)
	 1) 버거 등록
	 	=> 버거이름, 카테고리명, 가격, 이미지(img 폴더에 이미지명.확장자 맞춰서 등록)
	 	=> 예시> 버거이름: 직접 입력 / 카테고리명: 배열에 존재하는 값만 입력 가능 / 가격: 숫자만 입력(문자입력 시 등록 실패) / 이미지명: 비프불고기버거.jpg (img 폴더에 이미지 최소3개 미리 넣어두기)

	 2) 등록된 버거 현황 출력
	 	번호	이미지	버거이름	카테고리	가격		  비고
	 	1	[img]	버거이름	카테고리	가격	 [삭제][가격수정]

	 3) 주문된 주문 목록 현황 출력
		주문번호	버거이름	상태		비고
		1		버거1		주문완료	[주문완료]		=> 주문완료 버튼 클릭하면 주문요청 -> 주문완료로 상태 전환
		1		버거2		주문완료	[주문완료]		=> 상태: 주문완료 => [주문완료] 버튼 숨김 처리
		2		버거3		주문완료	[주문완료]
		3		버거1		주문완료	[주문완료]
		4		버거4		주문요청	[주문완료]
		4		버거2		주문요청	[주문완료]
	 4) 매출 현황 출력
	 	번호	버거이름	판매수량	매출액	순위[매출액기준]
	 
*/

//---------------------------------------------------------------- 공통데이터: 모든 함수에 공용으로 사용가능(전역변수)
let categoryList = [ '프리미엄', '스페셜', '와퍼', '올데이킹', '치킨버거' ];
// JS 배열 categoryList 선언 (목적: JS에서 반복문을 이용하여 HTML 화면에 출력하기 위함)

let burgerList = [
	{ name: '몬스터X', price: 9500, img: '버거킹_몬스터x.jpg' , category: '프리미엄' },
	{ name: '통새우스테이크', price: 6200, img: '버거킹_통새우스테이크.jpg' , category: '프리미엄' },
	{ name: '트러플머쉬룸X', price: 7500, img: '버거킹_트러플머쉬룸X.jpg' , category: '스페셜' }
]
// JS 배열 burgerList 선언 (목적: JS에서 반복문을 이용하여 HTML 화면에 출력하기 위함)

let cartList = []
// JS 배열 cartList 선언 (burgerList 선택된 요소 입력 )
let orderList = []
// JS 배열 orderList 선언 (cartList에서 주문완료로 연결된 요소 입력)

//---------------------------------------------------------------- JS 실행 즉시 출력
categoryPrint();
// 해석: JS 실행 시, 카테고리창 출력

category_select( 0 );
// 해석: JS 실행 시, 카테고리 인덱스 0번으로 출력

//---------------------------------------------------------------- 기능별 함수 정의
// 1. 카테고리 출력 함수
function categoryPrint(){
	
	let categorybox = `<ul>`
	
	for( let i = 0; i < categoryList.length; i++ ){
		categorybox += `<li class="categoryli" onclick="category_select( ${i} )"> ${ categoryList[i] } </li>`
	}
	// 해석: categoryList에 있는 모든 요소를 변수 categorybox에 입력
	
	categorybox += `</ul>`
	
	document.querySelector('.categorybox').innerHTML = categorybox
	// 해석: categorybox HTML 화면에 출력

}

//2. 카테고리 선택 함수
function category_select( index ){ // 매개변수 index = 선택된 li의 인덱스 값

	
	let categoryli = document.querySelectorAll('.categoryli')
	// 해석: 클래스명 categoryli 모두 JS 배열 categoryli에 저장
	
		// console.log( categoryli ) // --- 확인 완료
	
	for( let j = 0; j < categoryli.length; j++ ){
		if( j == index ){
			categoryli[j].classList.add( 'categoryselect' ); // classList.add() : 해당 마크업의 class 식별자에 이벤트 추가
		}
		else{
			categoryli[j].classList.remove( 'categoryselect' ); // classList.remove() : 해당 마크업의 class 식별자에 이벤트 제거
		}
	}
	// 해석: 배열 categoryli 길이까지 실행문 반복
	// 작동: 입력된 li 인덱스 값에 true 실행문 적용, 아닌경우 false 실행문 적용
	// 신규함수: 적용대상.classList.add( 클래스 ), 적용대상.classList.remove( 클래스 )
	// 함수원리: 적용대상에 클래스를 add 추가 or remove 제거
	// 참고사항: categoryselect 효과는 css에 정의함

	productPrint( index )
	// 해석: 선택한 카테고리의 인덱스 값을 productPrint의 매개변수로 전달
	// 기능: 제품목록 렌더링(화면 업데이트)
}

// 3. 제품 출력함수 (실행 시점: 1)JS 열렸을 때, 2) 카테고리 변경됐을 때)
function productPrint( index ){ // 매개변수 활용: 
	
		// console.log(index)
	
	let productBox = '';
	
	for( let i = 0; i < burgerList.length; i++){
		if( burgerList[i].category == categoryList[index] ){
			productBox += `<div onclick="cartSelect( ${ i } )" class="product">
								<img class="productimg" src="img/${ burgerList[i].img }" width="100%">
								<div class="productinfo">
									<div class="ptitle"> ${ burgerList[i].name } </div>
									<div class="pprice"> ${ burgerList[i].price.toLocaleString() } 원 </div>
								</div>
							</div>`
		}
	}
	document.querySelector('.productBox').innerHTML = productBox;
}

// 4. 카트 선택 함수
function cartSelect(i){
// 해석: 3.제품출력함수 중 productBox에 있는 CartSelect에서 선택된 변수 i를 매개변수로 받고, 해당 버거 정보를 cartList 배열에 저장
	
	cartList.push(burgerList[i]);
		// console.log(burgerList[i])
		// console.log(cartList)
	
	cartPrint()
}

// 4-1. 카트 출력 함수 (실행 시점: 1)제품 클릭할 때, 2)취소/주문할 때)
function cartPrint(){
	
	document.querySelector('.pcount').innerHTML = cartList.length;
	// 기능: 버거 개수 카운트
	
	let total = 0;
	
	for( let j = 0; j < cartList.length; j++){
		total += cartList[j].price
	}
	
	document.querySelector('.ptotal').innerHTML = total.toLocaleString();
	// 기능: 버거 총 금액	
	
	let cartBottom = ''
	
	for( let j = 0; j < cartList.length; j++){
		cartBottom += `	<div class="cartItem">
							<div class="itittle"> ${ cartList[j].name } </div>
							<div class="iprice"> ${ cartList[j].price.toLocaleString() } </div>
						</div>`
	}
	document.querySelector('.cartBottom').innerHTML = cartBottom;

}

// 5. 주문 취소 버튼
function cancle(){
	alert('주문이 취소되었습니다.')
	cartList.splice(0);		// 모두 삭제
	cartPrint();
}


// 6. 주문 하기 버튼
function orderBtn(){
	// 카트리스트 주문리스트에 전송
	
	let orderno = 0;
	// 변수 orderno 선언 (목적: 주문취소의 경우에도, 변하지 않는 주문번호 생성을 위함)
		
		console.log(orderno)
	if( orderList.length == 0 ){ orderno = 1; }
	else{ orderno = orderList[ orderList.length-1 ].orderno+1 }
	// orderList.length+1로 입력할 경우, 삭제하면 문제가 발생될 수 있음.
	// 때문에 orderList의 마지막 인덱스를 이용하여 해결 ( 마지막인덱스: 배열명.length-1 )
	// 작동: 주문 없으면 주문번호 1, 주문 발생되면 마지막 인덱스+1 출력
	// 참고사항: if문을 이용하여 orderList.length == 0을 설정한 이유는 orderList에 정보가 없으면 orderList[-1]이 되어 오류가 발생됨
	
		console.log(orderno)
	
	let map배열 = cartList.map( (o) => { return o; })
		//console.log( map배열 )
	// 신규문법: 배열명.map( (반복변수)=>{ 실행문; return 값; } )
	// 특징: for-each문과 동일하게 동작하나, 반복실행문에 return 값을 입력하면 return값을 반환할 수 있다.
	// map배열 선언 이유: 배열 cartList를 사용하고, cartList를 초기화할 경우 객체 order에 초기화된 값이 입력되는 문제를 해결하기 위함(변수를 이용하여 메모리 공간 공유) 		  
	// for문을 이용한 해결방안
	// for( let i = 0; i < cartList.length; i++ ){ 새로운배열.push(cartList[i])}
	
	let for배열 = cartList.forEach( (o) => { return o; }) 
		//console.log( for배열 )
		
	let total = 0;
	for( let i = 0; i < map배열; i++){ total += map배열[i].price }
	
	// order 객체 만들기
	let order = {
	       orderno: orderno,
	       orderitems: map배열,	       
	       ordertime: new Date() ,
	       // 신규문법: new date() - 현재 날짜/시간 호출
	       orderstate: true,
	       // true: 주문중, false: 주문완료
	       ordercomplete: 0,
	       // orderstate가 false로 변경되면 카운트 up
	       orderprice: total
	}
	
	orderList.push(order);
		console.log(orderno)
	
		console.log(orderList)

	
	alert('정상적으로 주문이 완료되었습니다.')
	
	cartList.splice(0);		// 모두 삭제
	cartPrint();
	orderCSPrint()
}

/*
	 관리자 요구사항 (26(목)까지 제출)
	 1) 버거 등록
	 	=> 버거이름, 카테고리명, 가격, 이미지(img 폴더에 이미지명.확장자 맞춰서 등록)
	 	=> 예시> 버거이름: 직접 입력 / 카테고리명: 배열에 존재하는 값만 입력 가능 / 가격: 숫자만 입력(문자입력 시 등록 실패) / 이미지명: 비프불고기버거.jpg (img 폴더에 이미지 최소3개 미리 넣어두기)

	 2) 등록된 버거 현황 출력
	 	번호	이미지	버거이름	카테고리	가격		  비고
	 	1	[img]	버거이름	카테고리	가격	 [삭제][가격수정]

	 3) 주문된 주문 목록 현황 출력
		주문번호	버거이름	상태		비고
		1		버거1		주문완료	[주문완료]		=> 주문완료 버튼 클릭하면 주문요청 -> 주문완료로 상태 전환
		1		버거2		주문완료	[주문완료]		=> 상태: 주문완료 => [주문완료] 버튼 숨김 처리
		2		버거3		주문완료	[주문완료]		=> 주문완료 클릭 시, 같은 주문번호 모두 주문완료처리
		3		버거1		주문완료	[주문완료]
		4		버거4		주문요청	[주문완료]
		4		버거2		주문요청	[주문완료]
	 4) 매출 현황 출력
	 	번호	버거이름	판매수량	매출액	순위[매출액기준]
*/

//------------------------------------------------------------- 관리자 페이지

categoryAdmin = [
	'버거 정보 등록/변경',
	'버거 등록 현황',
	'주문 현황',
	'매출 현황' ];

function categoryAdminPrint(){
	
	let categorybox = `<ul>`
	
	for( let i = 0; i < categoryList.length; i++ ){
		categorybox += `<li class="categoryli" onclick="category_select( ${i} )"> ${ categoryList[i] } </li>`
	}
	// 해석: categoryList에 있는 모든 요소를 변수 categorybox에 입력
	
	categorybox += `</ul>`
	
	document.querySelector('.categorybox').innerHTML = categorybox
	// 해석: categorybox HTML 화면에 출력

}

// 등록수정 버튼 함수 생성
// 기능: 버거 정보 등록/변경 화면 출력
function resisteditBtn(){	
	document.querySelector('.resisteditContent1Wap').style.display = 'inline'
	document.querySelector('.resistedBGContentWap').style.display = 'none'
	document.querySelector('.salesCSContentWap').style.display = 'none'
	document.querySelector('.orderCSContentWap').style.display = 'none'
}

// 버거 등록 - 저장버튼 함수
// 기능: 신규 버거 저장(유효성 검사: 가격 숫자만 입력)
function saveBtn_admin(){
	let bugerName = document.querySelector('.bugerName').value;
		// console.log(bugerName)
	let selectBox = document.querySelector('.selectBox').value;
		// console.log(selectBox)	// --- value값으로 확인 (class명 수정)
	let bugerPrice = document.querySelector('.bugerPrice').value;
		// console.log(bugerPrice)
	let bugerImg = document.querySelector('.bugerImg').value; 
		// console.log(bugerImg)
		
	let buger = {
		name: bugerName,
		price: bugerPrice,
		img: bugerImg,
		category: selectBox
	}
	
	if( isNaN(bugerPrice) ){ alert('숫자를 입력해주세요.') }
	else{ burgerList.push(buger) }
	
		// console.log(burgerList)
}

// 취소하기
function CancleBtn_admin(){
	document.querySelector('.resisteditContent1Wap').style.display = 'none'
	document.querySelector('.resistedBGContentWap').style.display = 'none'
	document.querySelector('.salesCSContentWap').style.display = 'none'
	document.querySelector('.orderCSContentWap').style.display = 'none'
}

//등록된 버거 현황 출력

function resistedBGBtn(){
		// console.log('작동확인')
	document.querySelector('.resisteditContent1Wap').style.display = 'none'
	document.querySelector('.resistedBGContentWap').style.display = 'inline'
	document.querySelector('.salesCSContentWap').style.display = 'none'
	document.querySelector('.orderCSContentWap').style.display = 'none'
	
	resistedBGPrint()
}

function resistedBGPrint(){
	let resistedBGTable = `<table class="resistedBGTable">
								<tr>
									<th> 번호 </th>
									<th> 사진 </th>
									<th> 버거이름 </th>
									<th> 카테고리 </th>
									<th> 가격 </th>
									<th> 비고 </th>
								</tr>
							</table>`
	
		// console.log(resistedBGTable)
	
	for( let i = 0; i < burgerList.length; i++ ){
		resistedBGTable += `<table class="resistedBGTable">
								<tr>
									<th> ${ (i+1) } </th>
									<th> <img class="productimg" src="img/${ burgerList[i].img }" width="100%"> </th>
									<th> ${burgerList[i].name} </th>
									<th> ${burgerList[i].category} </th>
									<th> ${burgerList[i].price} </th>
									<th>
										<button onclick="resistedBGTable_Delete( ${ i } )" type="button"> 삭제 </button>
										<button onclick="resistedBGTable_EditPrice( ${ i } )" type="button"> 가격 수정 </button>
									</th>
								</tr>
							</table>`
	}
	
	document.querySelector('.resistedBGContent1').innerHTML = resistedBGTable;
}



function resistedBGTable_Delete( Dindex ){
		// console.log(Dindex)	// --- Dindex: 클릭한 버튼의 인덱스값 인수로 받음 확인
	for( let i = 0; i < burgerList.length; i++){
		if(Dindex == i){ burgerList.splice( i, 1) }
	}
	
		// console.log(burgerList)	// --- 배열 삭제 정상 확인
	
	resistedBGPrint()
}

function resistedBGTable_EditPrice( Eindex ){
		// console.log(Eindex) // --- Eindex: 클릭한 버튼의 인덱스값 인수로 받음 확인
	
		// console.log(burgerList)
	
	let editPrice = prompt("수정할 금액을 입력하시오.")
		// console.log(editPrice)
	
	burgerList.map( ( o , i ) => { if( i == Eindex ){ burgerList[i].price = editPrice; } })
		// console.log(burgerList)
	resistedBGPrint()
	
}

// 주문된 주문 목록 현황 출력
function orderCSBtn(){
	document.querySelector('.resisteditContent1Wap').style.display = 'none'
	document.querySelector('.resistedBGContentWap').style.display = 'none'
	document.querySelector('.salesCSContentWap').style.display = 'none'
	document.querySelector('.orderCSContentWap').style.display = 'inline'

		// console.log(orderList)

	orderCSPrint()
	
}

let orderedList = []

function CompleteBtn(i){

	orderedList.push(orderList[i]);
	
		console.log(orderedList)

	orderCSPrint()
}

function orderCSPrint(){
	let orderCSTable = `<table class="orderCSTable">
								<tr>
									<th> 주문번호 </th>
									<th> 버거이름 </th>
									<th> 주문상태 </th>
									<th> 비고 </th>
								</tr>
							</table>`	


	for( let i = 0; i < orderList.length; i++ ){
		orderCSTable += `<table class="orderCSTable">
								<tr>
									<th> ${ (i+1) } </th>`
									
		for( let j = 0; j < orderList[i].orderitems.length; j++) {
			orderCSTable += `<th class="orderitems"> ${ orderList[i].orderitems[j].name } </th>`
		}
		
		orderCSTable += 	`<th> ${ orderedList.includes(orderList[i]) ? '주문완료' : '주문중' } </th>
									<th>
										<button class="orderBtn" onclick="CompleteBtn( ${ i } )" type="button"> 주문완료 </button>
									</th>
							</tr>
						</table>`
															
	}
	
		// console.log(orderCSTable)
	
		// -------------------------------------------------------------------------------------- 질문 o console.log(orderList.orderitems.name)
	
	document.querySelector('.orderCSContent2').innerHTML = orderCSTable;	
}


// 4) 매출 현황 출력
// 매출 현황 출력
function salesCSBtn(){
	document.querySelector('.resisteditContent1Wap').style.display = 'none'
	document.querySelector('.resistedBGContentWap').style.display = 'none'	
	document.querySelector('.orderCSContentWap').style.display = 'none'
	document.querySelector('.salesCSContentWap').style.display = 'inline'

	let salesCS = `<table class="salesCSTable">
								<tr>
									<th> 번호 </th>
									<th> 버거이름 </th>
									<th> 판매수량 </th>
									<th> 매출액 </th>
									<th> 순위 </th>
								</tr>
							</table>`

	
	document.querySelector('.salesCSContent2').innerHTML = salesCS;
	
}