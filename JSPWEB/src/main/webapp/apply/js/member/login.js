console.log('작동 확인');

function login(){
	
	let mid = document.querySelector('.mid').value;
	let mpw = document.querySelector('.mpw').value;
	
	$.ajax({
		url: "/JSPWEB/apply/login",
		method: "post",
		data: {"mid": mid, "mpw": mpw},
		success: (o) => { 
			console.log(o)
			if( o == 'true' ){ location.href="/JSPWEB/apply/index.jsp" }
			else{ alert('회원정보가 다릅니다.') }
			
		}
	})
}