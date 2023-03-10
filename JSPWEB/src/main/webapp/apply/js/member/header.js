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
				html += 
						`
						<div class="dropdown"> <!-- bs : 드롭다운 -->
							<button class="hpimgbtn" type="button" data-bs-toggle="dropdown" aria-expanded="false">
								<img src="/JSPWEB/apply/member/pimg/${ o.mimg == null ? 'default.webp' : o.mimg }" class="hpimg">
							</button>
							<ul class="dropdown-menu">	<!-- 드롭다운시 표기되는 구역 -->
								<li> <a class="dropdown-item" href="#"> 내프로필 </a></li>
								<li> <a class="dropdown-item" href="#"> 친구목록 </a></li>
								<li> <a class="dropdown-item" href="/JSPWEB/apply/member/logout.jsp"> 로그아웃 </a></li>
							</ul>
						</div>	<!-- 드롭다운 end  -->
						${o.mid}님
						<a href="#"> 쪽지함 </a>
						<a href="#"> 포인트 </a>
						`
				if( o.mid == 'admin'){
					html += `<a href="/JSPWEB/apply/admin/info.jsp"> 관리자페이지 </a>`;
				}
			}
			document.querySelector(".submenu").innerHTML = html;
		}
	})
}