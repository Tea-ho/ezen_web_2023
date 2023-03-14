// console.log('연결확인');
// console.log(empNo);

function updateModalOpen( no ){
	document.querySelector('.umodal_wrap').style.display = 'flex';
	printInfo( no );
}

function updateModalClose(){
	document.querySelector('.umodal_wrap').style.display = 'none';
}

function printInfo( no ){
	console.log( no )
	
	let empNo = no;
	
	$.ajax({
		url: "/JSPWEB/update",
		method: "get",
		data: { "empNo": empNo},
		success: ( o ) => {
			console.log(o);
			
			document.querySelector('.empImg').src =
				 `/JSPWEB/practice/과제/과제04/employee/eimg/${ o.empImg == null ? 'default.png' : o.empImg }`;
			document.querySelector('.newName').value = o.empName;
			document.querySelector('.newGrade').value = o.empGrade;
			document.querySelector('.newConstruct').value = o.empConstruct;
			document.querySelector('.newDepart').value = o.empDepart;
			document.querySelector('.newSdate').value = o.empSdate;
			document.querySelector('.newLdate').value = o.empLdate;
			document.querySelector('.newLcomment').value = o.empLcomment;
		}
	})
}

function doUpdate(){
	
		console.log('연결확인')
	
	let updateForm = document.querySelectorAll('.updateForm')[0];
	let updateFormData = new FormData( updateForm );
	
		// console.log(updateFormData);
	
	$.ajax({
		url: "/JSPWEB/employee",
		method: "put",
		data: updateFormData,
		contentType: false,
		processData: false,
		success: (o) => {
				console.log(o);
			if( o == 'true' ){
				alert('[수정성공] 다시 로그인해주세요.');
				location.href="/JSPWEB/practice/과제/과제04/employee.jsp"
			}
			else{ alert('[수정실패] 기존 비밀번호 확인해주세요.') }
		}
	})
}