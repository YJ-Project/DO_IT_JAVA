package chap01;

import java.util.Scanner;

/**
 * DOIT 01.기본알고리즘 연습문제(page 29)
 * @author lyj
 *
 */
public class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		String result = "";
		
		for(int i=1;i<=n;i++){
			if(i!=1){
				result += " + ";
			}
			result += String.valueOf(i);
			
			sum += i;
		}
		System.out.println(result+" = "+sum);
	}

}
