package chap01;

import java.util.Scanner;
/**
 * DOIT 01.기본알고리즘 연습문제(page 38)
 * @author lyj
 *
 */
public class Triangle {
	
	/**
	 * Q15. 직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do{
			System.out.print("몇  단 삼각형입니까? : ");
			n = scan.nextInt();
		}while(n<=0);
		triangeLU(n);
		
	}

	/**
	 * 왼쪽 아래가 직각인 이등변 삼각형을 출력
	 * @param n
	 */
	static void triangeLB(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 왼쪽 위가 직각인 이등변 삼각형을 출력
	 * @param n
	 */
	static void triangeLU(int n){
		for(int i=n;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 오른쪽 위가 직각인 이등변 삼각형을 출력
	 * @param n
	 */
	static void triangeRU(int n){
		for(int i=n;i>0;i--){
				
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 오른쪽 아래가 직각인 이등변 삼각형을 출력
	 * @param n
	 */
	static void triangeRB(int n){
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
