package chap01;

import java.util.Scanner;

/**
 * DOIT 01.기본알고리즘 연습문제(page 33)
 * @author lyj
 *
 */
public class Difference {

	/**
	 * Q10 오른쪽과 같이 두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		int b = 0;
		while(true){
			System.out.print("b의 값 : ");
			b = scan.nextInt();
			if(b>a){
				break;
			}
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		System.out.println("b - a는 " + (b - a) + "입니다.");
			
		scan.close();
		
	}

}
