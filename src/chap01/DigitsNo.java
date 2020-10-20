package chap01;

import java.util.Scanner;

/**
 * DOIT 01.기본알고리즘 연습문제(page 33)
 * @author lyj
 *
 */
public class DigitsNo {

	/**
	 * Q11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
	 * 예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고, 1314를 입력하면 '그 수는 4자리입니다.'라고 출력하면 됩니다.
	 * ->해당문제에 대하여 String.valueOf(a).length 할 수도 있지만 해당 문제는 for문과 while 문에 대해여 실습하기 때문에 아래와 같이 답해야하 했다.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		do{
			a = scan.nextInt();
		}while(a<=0);
		
		int n=0;
		while(a>0){
			a/=10;
			n++;
		}
		System.out.println(n);
		
	}

}
