package chap02;

import java.util.Scanner;

/**
 * DOIT 02.기본 자료구조 연습문제(page 64)
 * @author lyj
 *
 */
<<<<<<< HEAD
=======
/**
 * @author lyj
 *
 */
>>>>>>> branch 'main' of https://github.com/YJ-Project/DO_IT_JAVA.git
public class Copy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("a 요솟수 : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		System.out.print("a 배열 값을 입력하세요. : ");
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		
		System.out.print("b 요솟수 : ");
		int x = scan.nextInt();
		int[] b = new int[x];
		System.out.print("b 배열 값을 입력하세요. : ");
		for(int i=0;i<x;i++){
			b[i] = scan.nextInt();
		}
		
		
		copy(a, b);
		
		
		scan.close();
	}
	
	/**
	 * Q4. 배열 b의 모든 요소를 배열 a에 복사하는 메소드
	 * @param a
	 * @param b
	 */
	static void copy(int[] a, int[] b){
		//b의 길이가 a보다 클 경우 a의 값만큼 복사를 해야한다. 
		//애초에 배열 길이 자체를 요솟값으로 고정해서 쓰는 것이고 a와 b의 배열 길이 값이 다를 수 있기 때문에 신경써서 작업한번 해줘야함
		int len = a.length <= b.length ? a.length:b.length;
		for(int i=0;i< len; i++){
			a[i] = b[i];
			System.out.print(a[i]);
		}
	}

}
