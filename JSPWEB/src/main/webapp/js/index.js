alert('js파일 열림');

function ex1(){
	// HTML에서 입력받은 데이터 JS로 가져오는 방법 (document.querySelector or querySelectorAll 사용!)
	// document.querySelector( 식별자 ).속성명;
	// value: input, select, textarea 데이터
	// innerHTML: div, span, td 등의 데이터
	let data = document.querySelector('.inputdata').value;
	console.log(data);
}
