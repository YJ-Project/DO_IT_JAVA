package chap01;

import java.util.Scanner;
/**
 * DOIT 01.기본알고리즘 연습문제(page 30)
 * @author lyj
 *
 */
public class SumGauss {
	
	/**
	 * Q8. 1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있습니다.가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 
	 * 정수의 합을 구하는 프로그램을 작성하세요.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("end : ");
		int n = scan.nextInt();
		
		//홀수일 경우 
		int result = (1+n)*(n/2)+(n%2==1?(n+1)/2:0);
		System.out.println(result);
	}

}
