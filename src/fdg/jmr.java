package fdg;

import java.util.Scanner;

public class jmr {
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("������һ����");
	   
	   int a=sc.nextInt();
	   shuchu(a);
   }
   public static void shuchu(int b){
	   for(int i = 1; i <= b;i++){
		   System.out.println(i);
	   }
   }
}
