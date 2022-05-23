package Assessment;

import java.util.Scanner;

public class problemFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x-cordinate for point 1");
		int x1=sc.nextInt();
		
		System.out.println("Enter value of y-cordinate for point 1");
		int y1=sc.nextInt();
		
		System.out.println("Enter value of x-cordinate for point 2");
		int x2=sc.nextInt();
		
		System.out.println("Enter value of x-cordinate for point 2");
		int y2=sc.nextInt();
		
		int distance=(int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		System.out.println("The distance betn two points:"+distance);
	}

}
