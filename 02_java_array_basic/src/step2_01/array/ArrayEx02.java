package step2_01.array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		//배열 사용 예시 1
		
		String[] test1 = new String[3];
		double[] test2 = new double[5];
		char[] test3 = new char[1];
		boolean[] test4 = new boolean[10];
		
		int[] arr1 =new int[3];
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		// 배열 사용예시 2: 축약형 (배열을 처음 생성할 때만 가능하다.)
		
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		String[] arr3 = {"하나", "두울", "세엣", "네엣", "다섯"};
		char[] arr4 = {'1', '2', '3', '4'};
		
		//arr2 = {100, 200, 300}
		//arr3 = {"서울", "경기", "인천"}
		
		// 배열 사용 예시 3: 다른 문법과의 조합
		
		int[] arr5 = new int[100];
		
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = i + 1;
		}
		
		//출력
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		// 참고 (배열이 익숙해진 후에 사용) Arrays.tostring(배열이름): 배열의 전체 요소를 출력
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		
		

	}

}
