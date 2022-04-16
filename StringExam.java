package thisjava;

import java.util.Scanner;

//문자열이 주어졌을 때, 각 구성문자의 빈도수를 반환하는 메소드를 개발하라

// 1. 입력받은 문자열을 문자로 쪼개어서 char[] 배열로 저장한다.

// 2. 아스키코드 기준, 가장 첫번째 특수문자부터 가장 마지막 특수문자까지 반복을 진행

// 3. 해당문자를 배열(char[] arr)의 각 인덱스의 요소와 비교해서, 동일한 값이 있는지 확인 
//** 동일한 문자가 존재한다면 count++ 해준다.

// 4. 3번 진행 후, count (빈도수)가 0이 아닐 경우, 빈도수를 출력한다.

// 5. 2번으로 돌아가 반복을 재수행한다.

public class StringExam {
	
	public static void inputString(String input) {
		
		// 1. 입력받은 String 문자열을 toCharArray() 메소드를 사용하여 char[] 배열로 저장한다.
		//** 대소문자 구분을 하려면 toLowerCase() 메소드를 사용하지 않는다.
		//** 빈문자가 저장되지 않도록 replaceAll() 메소드를 사용하여 " "를 제거한다.
		char[] arr = input.replaceAll(" ", "").toLowerCase().toCharArray();
		
		// 2. 아스키코드 기준 가장 첫번째 특수문자부터 가장 마지막 특수문자까지 반복을 진행
		for(char i = '!'; i<='~'; i++) {
			int count = 0;					// 빈도수를 저장하는 변수 초기화
			
			//3. 해당문자를 char배열 arr의 각 인덱스의 요소와 비교해서, 동일한 값이 있는지 확인 
			for(int j=0; j<arr.length; j++) {
			
				if(i==arr[j]) { 
					count++;     //** 동일한 문자가 존재한다면 count++ 해준다.
				} //if
			
			} // inner - for
			
			// 빈도수를 출력
			if(count !=0) {
				System.out.println( i + " : " + count + "번");
			}
			
		} // outer - for
		
		
	} // inputString

	public static void main(String[] args) {    
	    Scanner scan = new Scanner(System.in);

	    String input = scan.nextLine();

	    scan.close();
	    
	    inputString(input);
	    
	} // main

} // end class

