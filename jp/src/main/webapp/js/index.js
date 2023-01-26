
let productList=[
	{ img: 'p1.webp', tittle: '레이나 트위드자켓(하객룩/포켓/노카라)', size: '[ FREE ]' , price: 89000, discount: 0.25, like: 540, review: 1412 },
	{ img: 'p2.webp', tittle: '로일 크롭 니트가디건(라운드넥)', size: '[ FREE ]' , price: 60000, discount: 0.30, like: 154, review: 410 },
	{ img: 'p3.webp', tittle: '브리젯 핀턱 롱스커트(A라인/하객룩)', size: '[ S , M , L ]' , price: 75000, discount: 0.30, like: 514, review: 1421 },
	{ img: 'p4.webp', tittle: '데이린 플리츠 미니스커트(A라인)', size: '[ S , M , L ]' , price: 42500, discount: 0.25, like: 54, review: 124 },
	{ img: 'p5.webp', tittle: '블리안 리본 블라우스(하객룩/타이)', size: '[ S , M , L ]' , price: 50000, discount: 0.30, like: 541, review: 4112 },
	{ img: 'p6.webp', tittle: '라빈 스퀘어 롱 샤원피스(오프숄더/샤스커트)', size: '[ FREE ]' , price: 75000, discount: 0.25, like: 504, review: 2412 },
]

productPrint();
// 제품 출력함수
function productPrint(){
	
	let html = ``
	productList.forEach( ( o , i ) => { 
		html += `
			<div class="item">							<!-- 제품 1개 생성 -->
				<img src="img/${ o.img}">					<!-- 제품 이미지 -->
				<div class="item_info">					<!-- 제품 정보 -->
					<div class="item_tittle"> ${ o.tittle} </div>		<!-- 제품명 -->
					<div class="item_size"> ${ o.size} </div>		<!-- 제품사이즈 -->
					<div class="item_price"> ${ o.price.toLocaleString() }원 </div>		<!-- 제품 원가 -->
					<div>
						<span class="item_sale"> ${ ( o.price - parseInt(o.price*o.discount) ).toLocaleString() }원 </span>		<!-- 제품 할인가 -->
						<span class="item_discount"> ${ parseInt(o.discount*100)}% </span>	<!-- 제품 할인율 -->
					</div>
				</div>
				<div class="item_bottom">
					<div>
						<span class="badge rounded-pill text-bg-warning"> 주문폭주 </span>
						<span class="badge rounded-pill text-bg-danger"> 1+1 </span>
					</div>
					<div class="item_review"> 찜 ${ o.like } · 리뷰수 ${ o.review } </div>
				</div>
			</div>
		`
	})
	document.querySelector('.itembox').innerHTML = html;

}