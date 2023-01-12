let output1 = ''; // 출력 변수

/*
// 예시1) 입력받은 수 만큼 * 출력
let s1 = Number(prompt('예시1 별 개수'));
for( let i = 1; i <= s1; i++){
	output1 += '*';				// 누적 출력 설정
	console.log( output1 ); 	// 반복할 때마다 출력 (1부터 입력한 숫자까지 누적형태로)
}

console.log( output1 ); 	// 반복문 완료되고 입력된 누적 데이터 출력


// 예시2) 입력받은 수 만틈 *출력 [ 3개씩 묶어서 줄바꿈 처리 ]
output1 = '';

let s2 = Number(prompt('예시2 별 개수'));
for( let i = 1; i <= s2; i++){
	output1 += '*';
	// 해석: 누적 출력 설정						
	
	if( i % 3 == 0 ){ output += '\n' };
	// 해석: 조건문 추가 (누적 출력하다가 i값이 3의 배수가 되면(3개 입력이 되면) 줄바꿈 처리 실행)
}
console.log( output1 );

// 문제3) 입력받은 줄수[line]만큼 출력
/*	*
	**
	***
	****
	*****
*/

output1 = '';
let s3 = Number(prompt('문제3 별 출력'))

for( let i = 1; i <= s3; i++){	// for1 S

	for( let s = 1; s <= i; s++){// for2 S
	
		output1 += '*'
	}	// for2 E
	output1 += '\n'
}	// for1 E
console.log( output1 );

// 문제4) 입력받은 줄수[line]만큼 출력
/*	*****
	****
	***
	**
	*
*/

// 10 9 8 7 6 5 4 3 2 1

output1 = '';
let s4 = Number(prompt('문제4 별 출력'))
for( let i = s4; i >= 1; i--){ // 5 4 3 2 1
// 해석: i 초기값: 입력값(s4), 조건: 1까지, 1씩 감소
	for( let s = 1; s <= i; s++){ //
	// 해석: s 초기값: 1, 조건: i까지,  1씩 증가
		output1 += '*';
	}
	output1 += '\n';
}
console.log( output1 );

// 문제5) 입력받은 줄수[line]만큼 출력
/*		    *
		   **
		  ***
		 ****
		*****
*/
output1 = '';
let s5 = Number(prompt('문제5 별 출력'))

for( let i = 1; i <= s5; i++){
	for( let b = s5-1; b >= i; b--){
		output1 += ' ';
	}
	for (let s = 1; s <= i; s++){
		output1 += '*';
	}
	output1 += '\n';
}
console.log( output1 );

// 문제6) 입력받은 줄수[line]만큼 출력
/*		*
	   ***
	  *****
	 *******
	*********
*/
output1 = '';
let s6 = Number(prompt('문제6 별 출력'))
for( let i = 1; i <= s6; i++){
	for( let b = s6-1; b >= i; b--){
		output1 += ' ';
	}
	for (let s = 1; s <= (i+i)-1; s++){
		output1 += '*';
	}
	output1 += '\n';
}
console.log( output1 );

// 문제7) 입력받은 홀수 줄수[line]만큼 출력
/*
*           * (* 공백 11칸 *)
  *       * (공백 2칸 * 공백 7칸 * )
    *   * (공백 4칸 * 공백 3칸 *)  
      * (공백 6칸)
    *   * (공백 4칸 * 공백 3칸 *)
  *       * (공백 2칸 * 공백 7칸 * )
*           * (* 공백 11칸 *)
*/

