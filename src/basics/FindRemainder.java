package basics;

import java.util.Scanner;

public class FindRemainder {
 public static void main(String[] args) {
	 int a,b;
	 final int  t;
	 
	 int res;
	 System.out.print("Enter numbers");
	 Scanner sc = new Scanner(System.in);
	 a = sc.nextInt();
	// b= sc.nextInt();
	 res= a % 10;
	 System.out.print(res);
	 
 }
}
