package step2_01.array;

import java.util.Scanner;

//2022-10-11 오후 11시 2분 ~ 오후 11시 9분

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */



public class ArrayEx06_풀이 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		Scanner scan = new Scanner(System.in);
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.print("학번 입력: ");

		int inputHakbuns = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if (inputHakbuns == hakbuns[i]) {
				System.out.print("성적: " + scores[i] + "점");
			}
			
			else {
				System.out.println("해당 학번은 존재하지 않습니다.");
				break;
			}
		}
		scan.close();
	}
	
}
