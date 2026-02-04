package NayaArrays;
import java.util.*;
public class TwoD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int student=0;
		int student1 =0;
			
			System.out.println("enter the number of students");
			int n=sc.nextInt();
			System.out.println("enter the number of subjects");
			int m=sc.nextInt();
		
		
			int[][] studentMarks=new int[n][m];
			
			for(int i=0;i<studentMarks.length;i++) {
				System.out.println("enter the Marks of student "+ ++student);
				for(int j=0;j<m;j++) {
					studentMarks[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<studentMarks.length;i++) {
				int total=0;
				for(int j=0;j<m;j++) {
					
					total+=studentMarks[i][j];
				}
				System.out.println("The total Marks of student "+ ++student1 +" is "+total);
			}
			
	}

}
