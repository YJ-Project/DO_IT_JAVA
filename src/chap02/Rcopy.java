package chap02;

import java.util.Scanner;

/**
 * DOIT 02.기본 자료구조 연습문제(page 64)
 * @author lyj
 *
 */
public class Rcopy {

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
		
		
		rcopy(a, b);
		
		
		scan.close();
	}
	
	/**
	 * Q5. 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메소드
	 * @param a
	 * @param b
	 */
	static void rcopy(int[] a, int[] b){
		//b의 길이가 a보다 클 경우 a의 값만큼 복사를 해야한다. 
		//애초에 배열 길이 자체를 요솟값으로 고정해서 쓰는 것이고 a와 b의 배열 길이 값이 다를 수 있기 때문에 신경써서 작업한번 해줘야함
		int len = a.length <= b.length ? a.length:b.length;
		for(int i=0;i< len; i++){
			//b의 배열 끝에서부터 역순으로 가져와야 하기 때문에 b.length -i-1
			a[i] = b[b.length -i-1];
			System.out.print(a[i]);
		}
	}

}
