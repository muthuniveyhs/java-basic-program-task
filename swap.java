import java.lang.*;
import java.util.Scanner;
class swap{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("a value is:");
             int a=sc.nextInt();
             System.out.println("b value is:");
             int b=sc.nextInt();
             System.out.println("a value is:"+a);
             System.out.println("b value is:"+b);
	     int temp=a+b;
             a=temp-a;
             b=temp-b;
	     System.out.println("a value is:"+a);
             System.out.println("b value is:"+b);
      
}}