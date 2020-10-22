package chap02;

import java.util.Scanner;

/**
 * DOIT 02.기본 자료구조 연습문제(page 61)
 * @author lyj
 *
 */
public class ReverseArrayEx {

	/**
	 * Q2. 오른쪽처럼 배열 요소를 역순으로 정렬하는 과정을 하나 하나 나타내는 프로그램을 작성하세요.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = scan.nextInt();
		int[] a= new int[n];
		
		System.out.print("입력하세요 : ");
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		
		reverse(a);
		System.out.println("역순 정렬을 마쳤습니다.");
		scan.close();
	}
	
	//역순 정렬을 하기 위한 메소드
	static void reverse(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]과(와) a["+(a.length-i-1)+"]를 교환합니다.");
			swap(a, i, a.length-i-1);
			print(a);
		}
		
	}
	
	//한번 바뀔때 마다 프린트하기 때문에 공통 로직으로 분리
	static void print(int[] a){
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
	
	//실질적으로 순서 변경하는 로직
	static void swap(int[] a, int idx1, int idx2){
		int t =a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t; 
	}

}
