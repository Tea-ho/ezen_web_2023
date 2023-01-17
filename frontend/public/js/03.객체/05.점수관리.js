/*	CRUD: Create, Read, Update, Delete
*/

// 배열 생성: 학생들의 점수 객체 여러개를 저장하는 장소
let studentArray = []

// JS 열릴 때, <button> 객체 가져오기
let addBtn = document.querySelector('.addBtn')

addBtnPrint( )

// 해당 버튼에 클릭 이벤트 적용
addBtn.addEventListener( 'click' , ()=>{
	
	// 기능1) 입력받은 데이터 가져오기 [객체화] - 객체 활용
	let info = {
		name : document.querySelector('.name').value,
		kor : parseInt(document.querySelector('.kor').value),
		eng : parseInt (document.querySelector('.eng').value),
		mat : parseInt (document.querySelector('.mat').value)
	}
		console.log(info)
	
	// 기능2) 유효성검사 [ 데이터 체크 ]
	
		let check = true;
		// 유효성검사 상태 저장하는 변수 (기능: 밑의 조건을 검사 진행할 때, 1개라도 충족되면 저장실패)
	
		// 2-1) 이름 중복 확인 - forEach 활용
		for( let i = 0; i < studentArray.length; i++){
			if(studentArray[i].name == info.name){
				alert('이미 등록된 학생입니다.')
				check = false;
			}
		}
		
		/* 같은 기능 foreach문으로 작성 (for문이 속도 더 빠름)
		studentArray.forEach( (obj) => {
			
			if( obj.name == info.name ){
			// 해석: 배열에 저장 요소 값과, 입력한 데이터가 같으면 아래 실행문 작동
				alert('이미 등록된 학생입니다.')
				return;		// 중복인 경우, 함수 밖으로 out
			}
		})		
		*/
		
			// 2-2) type 확인
			console.log(typeof(info.name))
			console.log(typeof(info.kor))
			// 해석: document 함수는 HTML에 입력된 값을 문자로 가져옴
			console.log(typeof( parseInt( info.kor ) ))
			console.log(typeof(info.eng))
			// 활용: 데이터를 숫자로만 사용할 경우, document로 객체화 할 때 type을 parseInt를 이용하여 변환
		
		// 2-2) 점수 0~100 사이만 입력
		if( (info.kor < 0 || info.kor > 100) || 
			(info.eng < 0 || info.eng > 100) || 
			(info.mat < 0 || info.mat >100 ) ){
				alert('점수를 다시 입력해주세요. [입력 범위: 0~100]');
				check = false;
			}
		
		// 2-3) 이름 3~5 사이만 입력
		if( info.name.length < 3 || info.name.length > 5){
			alert('이름을 다시 입력해주세요. [입력 범위: 3~5]');
			check = false;
		}
		
		// 2-4) 점수 숫자만 입력 [isNaN() : 숫자형식 체크 (숫자면 false, 아니면 true)]
			console.log(isNaN(info.kor))
		if( isNaN( info.kor ) || isNaN( info.eng ) || isNaN( info.mat )){
			alert('숫자형식으로 입력해주세요.');
			check = false;
		}
		
	// 3. 저장 - 유효성검사 하나라도 충족되지 않을 경우에만 저장 (즉, 변수 check가 true인 경우에만 저장)
	if ( check ){
		studentArray.push( info )
		alert('정상적으로 등록되었습니다.')
	}
	
	addBtnPrint( )
	
 })
 
// 출력: 1)번호, 2)이름, 3)국어, 4)영어, 5)수학, 6)총점, 7)평균, 8)순위[총점기준]
// 실행시점: JS 가동될 때, 데이터가 입력될 때, 데이터 수정 혹은 삭제될 때 
addBtnPrint( )
function addBtnPrint( ){
	
	let listTable = `<tr>
					<th> 번호 </th>
					<th> 이름 </th>
					<th> 국어 </th>
					<th> 영어 </th>
					<th> 수학 </th>
					<th> 총점 </th>
					<th> 평균 </th>
					<th> 순위 </th>
					<th> 비고 </th>
				</tr>`

	

	for( let i = 0; i < studentArray.length; i++){
	

		let sum = (studentArray[i].kor + studentArray[i].eng + studentArray[i].mat)
		let avg = parseInt(sum/3)

		// 순위 구하기 (초기 설정: 기준값(sum)의 초기 rank를 1위로 설정)
		// 동작 원리: 기준값(sum)과 비교값(배열 내 모든 요소: sum2)을 비교하고, 기준값보다 비교값이 더 크면 rank 1씩 올리는 구조
	 	let rank = 1;
		for( let j = 0; j < studentArray.length; j++ ){
			let sum2 = (studentArray[j].kor + studentArray[j].eng + studentArray[j].mat)
			
			if (sum < sum2){ rank++; }
		}
		

		listTable+= `<tr>
						<td> ${ i+1 } </td>
						<td> ${ studentArray[i].name } </td>
						<td> ${ studentArray[i].kor } </td>
						<td> ${ studentArray[i].eng } </td>
						<td> ${ studentArray[i].mat } </td>
						<td> ${ sum } </td>
						<td> ${ avg } </td>
						<td> ${ rank } </td>
						<td>
							<button onclick="editBtn( ${ i } )"> 수정 </button>
							<button onclick="deleteBtn( ${ i } )"> 삭제 </button>
						</td>
					</tr>`
	
	}
	document.querySelector('.listTable').innerHTML = listTable;
}

// 삭제 함수 (기능: 1)삭제 버튼 활성화, 2)삭제할 인덱스 제거 3)내용 업데이트)
function deleteBtn(i){ // 기능1)
	
	// 기능2)
	studentArray.splice( studentArray[i], 1 )
	
	// 기능3)
	alert('학생 정보가 정상 삭제되었습니다.')
	addBtnPrint();
}


// 수정 함수 (기능: 1)수정 버튼 활성화, 2)수정페이지 활성화 )


let upindex = -1;
// 매개변수로 활용 (목적: 아래 2개 함수에서 i값 대신 사용하기 위함, 초기값: 0부터 설정되기 때문에 존재하지 않는 숫자로 임의 설정)

function editBtn(i){ // 기능1)
	
	upindex = i
	
	// 기능2)
	document.querySelector('.updateBox').style.display = "block"
	
	
	// 기능3) 선택한 i번째 객체 속성에 기존 데이터 대입
	document.querySelector('.upName').value = studentArray[upindex].name
	document.querySelector('.upKor').value = studentArray[upindex].kor
	document.querySelector('.upEng').value = studentArray[upindex].eng
	document.querySelector('.upMat').value = studentArray[upindex].mat
	
}

// 활성화 된 수정 페이지에서 수정버튼 클릭했을 때 동작 (기능1) 변경할 데이터 기존 배열에 입력, 기능2) 입력이 완료되면, 수정페이지 비활성화)
let updateBtn = document.querySelector('.updateBtn')

updateBtn.addEventListener('click', () =>{ 
		
	studentArray[upindex].kor = parseInt(document.querySelector('.upKor').value)
	studentArray[upindex].eng = parseInt(document.querySelector('.upEng').value)
	studentArray[upindex].mat = parseInt(document.querySelector('.upMat').value)
		
	document.querySelector('.updateBox').style.display = "none"
		
	addBtnPrint();
})


 
 
 