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

let s6 = Number(prompt('문제6 별 출력'))

for( let i = 1; i <= s6; i++){				// 1 2 3 4 5
	
	for( let b = s6-i; b >= 1; b--){		// 4 3 2 1 0
		output1 += ' ';
	}
	
	for (let s = 1; s <= (2*i)-1; s++){		// 1 3 5 7 9
		output1 += '*';
		
	}
	output1 += '\n';
}

for( let i = s6; i >= 1; i--){			// 5 4 3 2 1
	for( let b = 1; b <= (s6-i); b++){	// 0 1 2 3 4
		output1 += ' ';
	}
	for (let s = 1; s <= (2*i)-1; s++){ // 9 7 5 3 1 
		output1 += '*';
	}
	output1 += '\n';
}
console.log( output1 );
