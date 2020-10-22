package chap02;

import java.util.Scanner;

/**
 * DOIT 02.기본 자료구조 연습문제(page 61)
 * @author lyj
 *
 */
public class SumOf {

	/**
	 * 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = scan.nextInt();
		
		int[] a = new int[n];
		
		System.out.print("값을 입력하세요 : ");
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		
		System.out.println("총 합계 : "+sumOf(a));
		
		scan.close();
	}
	
	static int sumOf(int[] a){
		int result = 0;
		
		for(int i=0;i<a.length;i++){
			result+=a[i];
		}
		
		return result;
	}

}
