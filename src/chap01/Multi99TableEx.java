package chap01;

/**
 * DOIT 01.기본알고리즘 연습문제(page 38)
 * @author lyj
 *
 */
public class Multi99TableEx {

	/**
	 * Q12. 곱셈표를 출력하는 프로그램을 작성하세요
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("   |");
		for(int i=1;i<=9;i++){
			System.out.printf("%3d",i);
		}
		System.out.println();
		System.out.println("---+---------------------------");
		
		for(int i=1;i<=9;i++){
			System.out.printf("%2d | ",i);
			for(int j=1;j<=9;j++){
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
	}

}
