package chap01;

import java.util.Scanner;
/**
 * DOIT 01.기본알고리즘 연습문제(page 40)
 * @author lyj
 *
 */
public class StarPira {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 단?");
		int n = scan.nextInt();
		spira(n);
		scan.close();

	}
	
	/**
	 * Q17. n단의 숫자 피라미드를 출력하는 메서드를 작성하세요
	 * @param n
	 */
	static void spira(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i-1)*2+1;j++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}
