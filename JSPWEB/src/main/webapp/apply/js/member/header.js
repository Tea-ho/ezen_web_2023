console.log('작동확인');

getLogin();
function getLogin(){
	$.ajax({
		url: "/JSPWEB/apply/login",
		method: "get",
		success: (o)=>{
			
			let html = ``;
			
			if ( o == null){
				html += `<a href="/JSPWEB/apply/member/signup.jsp"> 회원가입 </a>`;
				html += `<a href="/JSPWEB/apply/member/login.jsp"> 로그인 </a>`;
			}
			else{
				if( o.mid == 'admin'){
					html += `<a href="/JSPWEB/apply/admin/info.jsp"> 관리자페이지 </a>`;
				}
				html += `<img src="/JSPWEB/apply/member/pimg/${ o.mimg == null ? 'default.webp' : o.mimg }" class="hpimg">`
				html += `${o.mid}님 안녕하세요.`
				html += `<a href="/JSPWEB/apply/member/logout.jsp"> 로그아웃 </a>`;
			}
			document.querySelector(".header").innerHTML = html;
		}
	})
}