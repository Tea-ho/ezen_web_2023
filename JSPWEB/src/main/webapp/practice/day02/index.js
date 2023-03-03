// alert("js열림"); // ------- 연동 확인

function submit(){
	
	// 데이터 10개 Java로 어덯게 보낼까?
	// 1. 변수화 시킨다.
	// 2. 변수 10개를 객체 1개로 묶는다.
	// 3. 객체를 ajax 메소드를 이용하여 java에 전달한다.
	let info = {
		data1: document.querySelector('.data1').value,
		data2: document.querySelector('.data2').value,
		data3: document.querySelector('.data3').value,
		data4: document.querySelector('.data4').value,
		data5: document.querySelector('.data5').value,
		data6: document.querySelector('.data6').value,
		data7: document.querySelector('input[name="data7"]:checked').value,
		data8: document.querySelector('.data8').checked,
		data9: document.querySelector('.data9').value,
		data10: document.querySelector('.data10').value
	}
	
	console.log(info);
	

	$.ajax({
		url: "/JSPWEB/practice",
		method: "post",
		data: info,
		success: ( )=>{
			alert('통신');
			
		}
	 });

}
