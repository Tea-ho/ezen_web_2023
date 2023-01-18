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
	 
	 관리자 요구사항 
*/

let categoryList = [ '프리미엄', '스페셜', '와퍼', '올데이킹', '치킨버거' ];
// JS 배열 categoryList 선언 (목적: JS에서 반복문을 이용하여 HTML 화면에 출력하기 위함)

let burgerList = [
	{ name: '몬스터X', price: 9500, img: '버거킹_몬스터x.jpg' , category: '프리미엄' },
	{ name: '통새우스테이크', price: 6200, img: '버거킹_통새우스테이크.jpg' , category: '프리미엄' },
	{ name: '트러플머쉬룸X', price: 7500, img: '버거킹_트러플머쉬룸X.jpg' , category: '스페셜' }
]
// JS 배열 burgerList 선언 (목적: JS에서 반복문을 이용하여 HTML 화면에 출력하기 위함)

let cartList = []

categoryPrint();
// 해석: JS 실행 시, 카테고리창 출력

category_select( 0 );
// 해석: JS 실행 시, 카테고리 인덱스 0번으로 출력

productPrint( 0 );
// 해석: JS 실행 시, 카테고리 인덱스 0번에 포함된 제품리스트 출력

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

// 3. 제품 출력함수
// 실행 시점: 1)JS 열렸을 때, 2) 카테고리 변경됐을 때
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

// 4-1. 카트 출력 함수
// 적용 시점: 1)제품 클릭할 때, 2)취소/주문할 때

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

let orderList = []


// 6. 주문 하기 버튼
function orderBtn(){
	// 카트리스트 주문리스트에 전송
	
	let orderno = 0;
		
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
	
	//console.log(order)

	
	alert('정상적으로 주문이 완료되었습니다.')
	
	cartList.splice(0);		// 모두 삭제
	cartPrint();
}



