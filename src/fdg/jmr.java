package fdg;

import java.util.Scanner;

public class jmr {
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("请输入一个数");
	   
	   int a=sc.nextInt();
	   shuchu(a);
   }
   public static void shuchu(int b){
	   for(int i = 1; i <= b;i++){
		   System.out.println(i);
	   }
   }
}
