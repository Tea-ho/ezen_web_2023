// 문제6) 입력받은 줄수[line]만큼 출력
/*		*
	   ***
	  *****
	 *******
	*********
	*********	
	 *******
	  *****
	   ***
	    *
*/
let output1 = '';
// 해석: 변수 output1 생성 (초기값: 공란)

let s6 = Number(prompt('문제6 별 출력'))
// 해석: 입력창 생성(Number 선언으로 숫자 변환)

for( let i = 1; i <= s6; i++){	// for1-1로 칭함
// 해석: 조건까지 아래 실행, 조건 - (시작값: 1, 리밋: 입력값, 반복주기: 1씩 증가)
// 예시(입력값: 5) - 1 2 3 4 5까지 총 5회 반복실행


	for( let b = s6-i; b >= 1; b--){
		output1 += ' ';
	}
	// 해석: 조건까지 output1에 공란 누적 입력, 조건 - (시작값: (입력값-for1문 입력값), 리밋: 1, 반복주기: 1씩 감소)
	// 예시(입력값: 5) - for1-1 1회 진행될 때마다 4 3 2 1 0번 횟수로 output1에 공백이 저장됨
	
	
	for (let s = 1; s <= (2*i)-1; s++){
		output1 += '*';
	// 해석: 조건까지 output1에 * 누적 입력, 조건 - (시작값: 1, 리밋: (for1문 입력값)x2-1, 반복주기: 1씩 증가)
	// 예시(입력값: 5) - for1-1 1회 진행될 때마다 1 3 5 7 9번 횟수로 outpu1에 *이 저장됨
	}
	
	output1 += '\n';
	// 해석: for1-1 1회 진행될 때마다 띄어쓰기 1회 진행
}

for( let i = s6; i >= 1; i--){	// for1-2로 칭함
// 해석: 조건까지 아래 실행, 조건 - (시작값: 입력값, 리밋: 1, 반복주기: 1씩 감소)
// 예시(입력값: 5) - 5 4 3 2 1까지 총 5회 반복실행

	for( let b = 1; b <= (s6-i); b++){	// 0 1 2 3 4
		output1 += ' ';
	}
	// 해석: 조건까지 output1에 공란 누적 입력, 조건 - (시작값: 1, 리밋: 입력값-for1문 입력값, 반복주기: 1씩 증가)
	// 예시(입력값: 5) - for1-2 1회 진행될 때마다 0 1 2 3 4번 횟수로 output1에 공백이 저장됨
	
	for (let s = 1; s <= (2*i)-1; s++){ // 9 7 5 3 1 
		output1 += '*';
	}
	// 해석: 조건까지 output1에 * 누적 입력, 조건 - (시작값: 1, 리밋: (for1문 입력값)x2-1, 반복주기: 1씩 증가)
	// 예시(입력값: 5) - for1-2 1회 진행될 때마다 9 7 5 3 1번 횟수로 output1에 *이 저장됨
	
	output1 += '\n';
	// 해석: for1-2 1회 진행될 때마다 띄어쓰기 1회 진행
}
console.log( output1 );
// 해석: output1 console로 출력
