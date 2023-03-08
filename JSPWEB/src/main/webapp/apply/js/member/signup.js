console.log('연결 확인');

/*
	1. JS 정규표현식: 문자 특정 규칙, 패턴, 집합 표현에 사용하는 언어
	2. 관련 문법:
	1) /^ : 정규표현식 시작
	2) $/ : 정규표현식 끝
	3) [a-z] : 소문자 a-z패턴
	4) [A-Z] : 대문자 A-Z패턴
	5) [0-9] : 숫자 0-9 패턴
	6) [가-힣] : 한글 패턴
	7) { 최소길이, 최대길이 } : 문자열 길이 패턴
	
	3. 패턴검사 함수
	정규표현식.test( 데이터 ) : 패턴이 적합하면 true, 아니면 false 반환
	ex)
	/^[a-z]$/.test( qwe ) -- > true
	/^[a-z]$/.test( QWE ) -- > false
	
	4. 활용:
	[a-zA-Z] : 영문 입력
	[a-zA-Z0-9]: 영문 + 숫자 입력
	[a-zA-Z0-9가-힣]: 영문 + 숫자 + 한글 입력
*/

// 아이디 유효성검사
function idcheck(){
		console.log('함수 작동 확인');
	let mid = document.querySelector('.mid').value;
		console.log(mid);
	
	let midj = /^[a-z0-9]{5,30}$/
		console.log(midj.test(mid));
		
	if( midj.test(mid) ){

		$.ajax({
			url: "/JSPWEB/apply/confirm",
			method: "get",
			data: {"mid" : mid},
			success: (o) => {
				console.log( '작동 확인' );
				
				if(o){ document.querySelector('.idcheck').innerHTML = '사용중인 아이디'; }
				else{ document.querySelector('.idcheck').innerHTML = '사용가능한 아이디'; }
			}
		});
	}
	else{
		document.querySelector('.idcheck').innerHTML = '영소문자 + 숫자 조합으로 작성[아이디 길이: 5~30]';
	}
}

// 회원가입
function signup(){
	console.log('함수 작동 확인');
	
	// 첨부파일 없을 경우 사용하는 폼
	/*
	let info = {
		mid : document.querySelector(".mid").value,
		mpw : document.querySelector(".mpw").value,
		mpwc : document.querySelector(".mpwc").value,
		memail : document.querySelector(".memail").value,
		mimg : document.querySelector(".mimg").value
	}
	
	$.ajax({
		url: "/JSPWEB/apply/member",
		method: "post",
		data: info,
		success: ( o )=>{
			console.log('정상 작동')
			
			if( o ){
				alert('회원가입 성공');
				location.href="/JSPWEB/apply/index.jsp"
			} else{ alert('회원가입 실패') }
		}
	})
		console.log(info);
	*/
	let signupForm = document.querySelectorAll('.signupForm')[0];
	
	let signupFormData = new FormData( signupForm );
		console.log(signupFormData);
	
	
	// 첨부파일 있을 경우 사용하는 폼: html file input 직접적으로 조작 불가능함.
	

	
	// 첨부파일 있을 때 추가되는 속성
	$.ajax({
		url: "/JSPWEB/apply/member",
		method: "post",			// 첨부파일은 post/put으로만 전송 가능
		data: signupFormData,	// FormData 객체 전송
		contentType: false,		
		processData: false,		
		// 기본값: true [의미: application/x-www-form-urlencoded 형식으로 전송 (문자 전송)]
		// 설정 해제: false [의미: multipart/form 형식으로 전송]
		success: ( o )=>{
				console.log('정상 작동');
				console.log(o);
			
			if( o ){
				alert('회원가입 성공');
				location.href="/JSPWEB/apply/index.jsp"
			} else{ alert('회원가입 실패') }
		}
	})
}