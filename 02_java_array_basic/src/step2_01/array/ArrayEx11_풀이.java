package step2_01.array;

//2022-10-12 오후 4시 31분 ~ 오후 4시 55분

import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 *  예)
 *  
 * [ 처음상태 ]
 * isFirst = {false , false , false , false , false}
 * arr     = {0, 0, 0, 0, 0}
 *  
 * 랜덤숫자 : 1
 * isFirst = {false , true , false , false , false}
 * arr     = {1, 0, 0, 0, 0}
 * 
 * 랜덤숫자 : 3
 * isFirst = {false , true , false , true , false}
 * arr     = {1, 3, 0, 0, 0}
 * 
 * 랜덤숫자 : 2
 * isFirst = {false , true , true , true , false}
 * arr     = {1, 3, 2, 0, 0}
 */


public class ArrayEx11_풀이 {

	public static void main(String[] args) {
	
		Random ran  = new Random(); 
		
		boolean[] isFirst = new boolean[5];
		int[] arr   = new int[5];
		int end = 0;
		
		while (end < 5) {
			
			int randomNumber = ran.nextInt(5);
			
			if (isFirst[randomNumber] == false) {
				isFirst[randomNumber] = true;
				arr[end] = randomNumber;
				end++;
			}
		}
		
		System.out.print("arr: ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
}
