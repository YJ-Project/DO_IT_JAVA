package chap01;

import java.util.Scanner;

/**
 * DOIT 01.기본알고리즘 연습문제(page 19)
 * @author lyj
 *
 */
public class Max3 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      sc.close();
      //max3
      System.out.println("max3 : "+max3(a,b,c));
      //max4
      System.out.println("max4 : "+max4(a,b,c,d));
      //min3
      System.out.println("min3 : "+min3(a,b,c));
      //min4
      System.out.println("min4 : "+min4(a,b,c,d));
   }
   
   
   /**
    * 기본 알고리즘 page 17 예시
    * @param a
    * @param b
    * @param c
    * @return
    */
   public static int max3(int a, int b, int c){
      int max = a; //최대값
      if(b>max){
         max = b;
      }
      if(c>max){
         max = c;
      }
      
      return max;
   }
   
   
   /**
    * Q1. 네 값의 최대값을 구하는 max4 메서드를 작성하세요
    * @param a
    * @param b
    * @param c
    * @param d
    * @return
    */
   public static int max4(int a, int b, int c, int d){
      int max = a; //최대값
      if(b>max){
         max = b;
      }
      if(c>max){
         max = c;
      }
      if(d>max){
         max = d;
      }
      
      return max;
   }

   
   /**
    * Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요
    * @param a
    * @param b
    * @param c
    * @param d
    * @return
    */
   public static int min3(int a, int b, int c){
      int max = a; //최솟값
      if(b<max){
         max = b;
      }
      if(c<max){
         max = c;
      }
      
      return max;
   }
   
   /**
    * Q4. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요
    * @param a
    * @param b
    * @param c
    * @param d
    * @return
    */
   public static int min4(int a, int b, int c, int d){
      int max = a; //최솟값
      if(b<max){
         max = b;
      }
      if(c<max){
         max = c;
      }
      if(d<max){
         max = d;
      }
      
      return max;
   }
}