package NayaArrays;

import java.util.Scanner;

public class ArraysPractice {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter the number of subjects");
		int number=sc.nextInt();
		int[] MarksArr=new int[number];
		int subject=0;
		for(int i=0;i<MarksArr.length;i++) {
			System.out.println("enter the Marks of your subject " + ++subject);
			MarksArr[i]=sc.nextInt();
		}
		System.out.println("the average is "+ calAvg(MarksArr));
		
	}
	
	public static float calAvg(int[] MarksArr) {
		
		int sum=0;
		int avg=0;
	
		for(int i:MarksArr) {
			sum+=i;
		}
		avg=sum/MarksArr.length;
		return avg;
		
		
	}

}
