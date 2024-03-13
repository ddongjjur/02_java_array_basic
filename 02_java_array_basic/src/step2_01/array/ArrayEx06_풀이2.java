package step2_01.array;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */



public class ArrayEx06_풀이2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		boolean isExist = false;
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.print("학번을 입력하세요: ");
		int inputHakbun = scan.nextInt();
		for (int i = 0; i < scores.length; i++) {
			if (inputHakbun == hakbuns[i]) {
				isExist = true;
				System.out.println("성적: " + scores[i] + "점");
			}
		}
		if (!isExist) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
	}
	
}
