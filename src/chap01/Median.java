package chap01;

/**
 * DOIT 01.기본알고리즘 연습문제(page 22)
 * @author lyj
 *
 */
public class Median {

	public static void main(String[] args) {
		//Q4. 세 값의 대소 관계 13 종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // a＞b＞c
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // a＞b＝c
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // a＞c＞b
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // a＝c＞b
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // c＞a＞b
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // a＝b＞c
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // a＝b＝c
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // c＞a＝b
		System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // b＞a＞c
		System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // b＞a＝c
		System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // b＞c＞a
		System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // b＝c＞a
		System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // c＞b＞a
	}
	
	/**
	 * 중간값 구하는  실습 1C-1
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	static int med3(int a,int b,int c){
		if(a>=b)
			if(b>=c)
				return b;
			else if(a<= c)
				return a;
			else 
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
		return b;
	}
	
	/**
	 * Q5. 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다. 그러나 실습 1C-1의 med3 매서드에 비해 효율이 떨어지는데, 그 이유를 설명하세요
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	static int med3_q5(int a, int b, int c){
		/*
		  1번 if문에서 a라는 답안을 가져가기 위해 같은 판단인 두 조건을 모두 수행한뒤
	      2번 if문으로 간다는 점과 또 동일한 답인 b를 계산하기 위해 두 조건 모두 수행을 한다는 점이 비효율적입니다.
	     */
		if ((b >= a && c<= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (b <= a && c > b))
			return b;
		return c;
	}

}
