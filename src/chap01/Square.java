package chap01;

import java.util.Scanner;

/**
 * DOIT 01.기본알고리즘 연습문제(page 38)
 * @author lyj
 *
 */
public class Square {

	/**
	 * Q14. 정사각형을 * 개호로 출력하는 프로그램을 작성하세요.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		int n;
		do{
			System.out.print("단 수 : ");
			n = scan.nextInt();
		}while(n<=0); 
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			} 
			System.out.println();
		}
		scan.close();

	}

}
