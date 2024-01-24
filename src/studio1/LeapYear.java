package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("leap year calculator");
		System.out.println("enter year");
		int leapyear=in.nextInt();
		boolean isleapyear=leapyear%4==0 && leapyear%400==0 && leapyear!=0;
		System.out.print(leapyear+" is a leap year.");
	}

}
