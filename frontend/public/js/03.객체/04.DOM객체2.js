// 1. 문서가 열렸을 때 DOM 객체 이벤트 활용
// document.addEventListener( 'DOMContentLoaded' , () => { 실행문; } ) : HTML이 열렸을 때 실행
// alert( 실행문 ): JS가 열렸을 때 실행

document.addEventListener( 'DOMContentLoaded' , () => { alert( 'HTML 열림1' ) } );

	const h2 = document.querySelector('h2')	// HTML 마크업 1개를 객체로 반환
	
		console.log( h2 )
		console.log( typeof( h2 ) )	// typeof( ): 데이터 Type 확인
	
	h2.innerHTML = '안녕하세요'
	h2.style.color = 'green'
	h2.style.backgroundColor='blue' 
	h2.style.padding = '10px'

// document.addEventListener( 'DOMContentLoaded' , function(){ 실행문; } )
document.addEventListener( 'DOMContentLoaded' , function(){ alert( 'HTML 열림2' ) });

	const h2Array = document.querySelectorAll('h2') // HTML 마크업 여러개를 객체로 반환
		
		console.log( h2Array )
		console.log( typeof( h2Array ) )	// --- 데이터 Type 확인: 객체
		
	// 배열 내 데이터[요소]를 하나씩 꺼내는 방법
		// 1-1. for문 사용 [표준]
		for( let i = 0 ; i < h2Array.length; i++ ){ // for S
			h2Array[i].innerHTML = '안녕' + i
		} // for E
		
		// 1-2. JS for문 활용: 배열 내 요소 모든 인덱스를 마지막까지 하나씩 반복변수에 대입
		for ( let index in h2Array ){ 
			h2Array[index].innerHTML = '안녕' + i
		}
		
		// 1-3. JS for문 활용: 배열 내 요소 모든 데이터를 마지막까지 하나씩 반복변수에 대입
		for( let object of h2Array ){
			object.innerHTML = '안녕'
		}
		
		// 2-1. forEach [형태: 배열명.forEach( ( 인수 ) => { 실행문 } ) ]
		h2Array.forEach( (object) => { object.innerHTML = '안녕~~' } )
		
		// 2-2. forEach 데이터 사용
		h2Array.forEach( (object) => { console.log( object ) } )
		
		// 2-3. forEach 데이터, 인덱스 사용 
		h2Array.forEach( (object , index) => { console.log( object ); console.log( index ) } )
		
		// 2-4. forEach 데이터, 인덱스, 배열 사용
		h2Array.forEach( (object , index , array) => {
			console.log( object ); console.log( index ); console.log( array )
		})
		
		
		