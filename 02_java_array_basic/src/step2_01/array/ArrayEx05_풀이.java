package step2_01.array;

//2022-10-11 오후 10 45분 ~ 오후 11시 1분

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

public class ArrayEx05_풀이 {

	public static void main(String[] args) {
	
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		
		int inputIndex = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			
		}
		System.out.println(arr[inputIndex] + "점");
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		
		System.out.println("성적 입력: ");
		
		int inputScore = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == inputScore) {
				System.out.print("인덱스: " + i);
			}
		}
		System.out.println();
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		System.out.println("학번 입력: ");
		
		int inputHakbuns = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			
			if (inputHakbuns == hakbuns[i]) {
				System.out.println(scores[i]);
			}
		}
		
		scan.close();
	}
	
}
