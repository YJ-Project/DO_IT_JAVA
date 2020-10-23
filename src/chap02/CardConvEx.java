package chap02;

import java.util.Scanner;

/**
 * DOIT 02.기본 자료구조 연습문제(page 70)
 * @author lyj
 *
 */
public class CardConvEx {

	/**
	 * Q7. 오른쪽처럼 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요.
	 * @param x 정수
	 * @param r 진수
	 * @param d 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
	 * @return
	 */
	static int cardConvEx(int x,int r, char[] d){
		int cnt = 0;
		String dchar="0123456789ABCDEFGHIJKMNOPQRSTUVWXYZ";
		int n = String.valueOf(x).length();

		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		do{
			System.out.print("   +");

			for (int i = 0; i < n + 2; i++){
				System.out.print('-');
			}
			System.out.println();
			
			//몫이 0이면 마지막 줄이기 때문에 진수를 왼쪽에 표기할 이유가 없어 분기해야함
			if (x / r != 0){
				System.out.printf(String.format("%%2d | %%%dd    … %%d\n", n), r, x / r, x % r);
			}
			else{
				System.out.printf(String.format("     %%%dd    … %%d\n", n), x / r, x % r);
			}

			d[cnt++]= dchar.charAt(x%r);
			x = x/r;
		}while(x!=0);
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		
		do{
			System.out.print("변환하는 음이 아닌 정수 : ");
			no = scan.nextInt();
		}while(no < 0);
			
		do{
			System.out.print("어떤 진수로 변환할까요? (2~36) : ");
			cd = scan.nextInt();
		}while(cd < 2 || cd > 36);
		
		dno = cardConvEx(no, cd, cno);
		System.out.print(cd + "진수로 ");
		for(int i=0;i<dno; i++){
			System.out.print(cno[i]);
		}
		System.out.println("입니다.");
		
		scan.close();

	}

}
