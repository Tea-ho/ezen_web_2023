console.log('js열림');

mList();
function mList(){
	$.ajax({
		url: "/JSPWEB/apply/member",
		method: "get",
		success: ( o )=>{
			console.log('정상 작동')
			
			let html = `<tr>
							<th> 번호 </th>
							<th> 프로필 </th>
							<th> 아이디 </th>
							<th> 이메일주소 </th>
							<th> 비고 </th>
						</tr>`
			
			
			o.forEach( (x) =>{
				html += `<tr>
							<td> ${x.mno} </td>
							<td> <img src="/JSPWEB/apply/member/pimg/${x.mimg == null ? 'default.webp' : x.mimg}" witdh="100%"> </td>
							<td> ${x.mid} </td>
							<td> ${x.memail} </td>
							<td> 비고 </td>
						</tr>`
				// 프로필 등록안하면 기본 양식으로 출력, 등록하면 등록한 사진으로 출력
			})
			
			document.querySelector('.mList').innerHTML = html;
		}
	})
}