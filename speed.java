import java.lang.*;
import java.util.Scanner;
class speed{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("distance value is:");
             int distance=sc.nextInt();
             System.out.println("time value is:");
             int time=sc.nextInt();
	     double speed=distance/time;
	     System.out.println("distance value is:"+distance);
             System.out.println("time value is:"+time);
             System.out.println("calculate the speed :"+speed);
}}