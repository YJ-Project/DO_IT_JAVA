package chap01;

/**
 * DOIT 01.기본알고리즘 연습문제(page 30)
 * @author lyj
 *
 */
public class SumOf {
	/**
	 * Q9. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 매서드를 작성하세요
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(sumof(6, 9));
	}
	
	static int sumof(int a, int b){
		int min, max;
		
		if(a>b){
			min=b;
			max=a;
		}else{
			min=a;
			max=b;
		}
		
		int result = 0;
		for(int i=min;i<=max;i++){
			result+=i;
		}
		return result; 
	}

}
