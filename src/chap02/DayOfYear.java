package chap02;

import java.util.Scanner;

/**
 * DOIT 02.기본 자료구조 연습문제(page 83)
 * @author lyj
 *
 */
/**
 * @author lyj
 *
 */
public class DayOfYear {
	//각 달의 일수
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //평년
			{31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
	};
	
	//서기 year년은 윤년인가?(윤년 : 1 / 평년 : 0)
	static int isLeap(int year){
		return (year%4 ==0 && year%100 !=0 || year %400 == 0) ? 1:0;
	}
	
	//서기 y년 m월 d일의 그 해 경과 일 수를 구함
	static int dayOfYear(int y, int m, int d){
		int days = d;	//일수
		
		for(int i = 1; i<m; i++){	//1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i -1];	//isLeap(y) -> 윤년이면 1, 평년이면 0
		}
		return days;
	}
	
	
	/** Q8. 메서드 dayOfYear를 변수 i와 days 없이 구현하세요. while문을 사용하세요.
	 * @param y
	 * @param m
	 * @param d
	 * @return
	 */
	static int dayOfYear_while(int y, int m, int d){
		//전달부터 계산해야하니 --m 
		while(--m!=0){
			d+=mdays[isLeap(y)][m];
		}
		return d;
	}
	
	/** Q9. y년 m월 d일의 그 해 남은 일 수(12월 31이면 0, 12월 31이면 1)를 구하는 아래 매서드를 작성하세요.
	 * @param y
	 * @param m
	 * @param d
	 * @return
	 */
	static int leftDayOfYear(int y, int m, int d){
		/*내 대답은 현재 달의 남은 일자와 나머지 달의 일자들을 합했다.
		d = mdays[isLeap(y)][m-1] - d;
		//달 차이부터
		for(int i=12;i>m;i--){
			d+=mdays[isLeap(y)][m];
		}
		*/
		
		//여기서부터는 책의 답안
		//현재 일자의 전날까지의 모든 일수를 더한 후 일년의 365 - 계산한 일수 + 윤년(0 or 1)
		//정답은 이거겠지만 정말 생각하는 흐름자체가 사람마다 많이 다르구나.. 내가 많이 부족하구나..
		int days = d; // 일수

		for (int i = 1; i < m; i++) // 1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i - 1];
		
		return 365 + isLeap(y) - days;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int retry;	//다시 한번?
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do{
			System.out.print("년 : "); int year = scan.nextInt();		//년
			System.out.print("월 : "); int month = scan.nextInt();	//월
			System.out.print("일 : "); int day = scan.nextInt();		//일
			
			//System.out.printf("그 해 %d일째입니다\n", dayOfYear_while(year, month, day));
			System.out.println("남은 일 수 : "+leftDayOfYear(year, month, day));
			System.out.print("한번 더 할까요? (1.예 / 0.아니오) : ");
			retry = scan.nextInt();
			
		}while(retry == 1);
		
		scan.close();
	}

}
