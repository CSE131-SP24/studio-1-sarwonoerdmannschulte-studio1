package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Average calculator");
		System.out.println("enter n1");
		int n1 = in.nextInt();
		System.out.println("enter n2");
		int n2 = in.nextInt();
		System.out.print((n1+n2)/2.0);
	}
}
