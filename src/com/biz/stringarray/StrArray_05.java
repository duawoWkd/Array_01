package com.biz.stringarray;

public class StrArray_05 {

	public static void main(String[] args) {
		
		
		String strName = "홍길동이몽룡성춘향";
		
		// 문자열.split("") method는
		// 문자열(변수)에 담긴 문자열들을
		// 한글자씩 분해해서
		// 문자열 개수만큼의 배열을 생성해준다.
		String[] strNames = strName.split("");
		for(int i = 0; i < strNames.length; i++) {
			System.out.println(strNames[i]);
		}
		
		int intNum = 10;
		int intNum2 = intNum + 100;
		

		
		}

	// makeString() method의 형태만 만들고
	// 내부의 구체적인 기능은 작성하지 않은 상태
	// 이런 코드를 proto type 이라고 한다.
	// 보통 proto type를 만들었을때
	// void형이 아닌경우에
	// return 문을 만들어야 하는데
	// return 형이 숫자이면 return 0 이라고 작성하고
	// 그외 형일 경우는 return null이라고 작성한다.
	public static String[] makeString(String strNations) {
		return null;

	}
	
}
