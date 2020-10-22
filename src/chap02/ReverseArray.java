package chap02;

import java.util.Scanner;
/**
 * DOIT 02.기본 자료구조 연습문제(page 61) 실습 2-6 연습
 * @author lyj
 *
 */
public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt(); //요솟수
		
		int [] x = new int[num];
		
		for(int i=0; i<num;i++){
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt(); 
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<num;i++){
			System.out.println("x["+i+"] = "+x[i]);
		}
		
	}
	
	static void swap(int[] a, int idx1, int idx2){
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a){
		for(int i=0; i<a.length/2;i++){ 
			swap(a, i, a.length-i-1); 
		}
	}

}
