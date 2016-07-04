import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// We will ask the user to input the number so we need scanner
		Scanner scanner = new Scanner(System.in);
		// We will ask the user to input the number here
		System.out.print ("Please enter a number to reverse");
		
		int original = scanner.nextInt();
		int reverse = 0;
		int remainder;
	
		//We will use a while loop to obtain the reverse number
		while (original !=0) {
		//We will first get the remainder of the original to obtain the last number 
			remainder = original % 10;
		//We will build our reverse number by multiplying the remainder by 10 
			reverse = reverse * 10 + remainder;
		//We will remove the last digit of the original number
			original = original/10;
		}
		//We will print the reverse number
		System.out.print ("The reverse of the entered number is " + reverse);
	}
			
		}
				
		
		
		
		
	


