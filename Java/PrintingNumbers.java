import java.util.Scanner;

public class PrintingNumbers{
public static void main (String [] args){

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a number between 0 and 9:");
	int userInput = scan.nextInt();

	if(userInput == 0){
		System.out.println("Zero");	
	}

	else
	if(userInput == 1){
		System.out.println("One");	
	}

	else
	if(userInput == 2){
		System.out.println("Two");	
	}

	else
	if(userInput == 3){
		System.out.println("Three");	
	}

	else
	if(userInput == 4){
		System.out.println("Four");	
	}

	else
	if(userInput == 5){
		System.out.println("Five");	
	}

	else
	if(userInput == 6){
		System.out.println("Six");	
	}

	else
	if(userInput == 7){
		System.out.println("Seven");	
	}

	else
	if(userInput == 8){
		System.out.println("Eight");	
	}

	else
	if(userInput == 9){
		System.out.println("Nine");	
	}

	else{
		System.out.println("Invalid input. Enter a valid number between 0 - 9");

	}
	
}
}