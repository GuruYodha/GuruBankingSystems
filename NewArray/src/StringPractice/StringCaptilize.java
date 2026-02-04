package StringPractice;

import java.util.*;

public class StringCaptilize {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		String userInput=sc.nextLine();
		String[] userInput2=userInput.split(" ");
		String UserInput3=new String();
		for(int i=0;i<userInput2.length;i++){
			userInput2[i].substring(0, 1).toUpperCase();
			UserInput3+=userInput2[i].substring(0, 1).toUpperCase()//K
					+userInput2[i].substring(1)+ " ";
			
		}
		System.out.println(UserInput3);
		
		
	}

}
