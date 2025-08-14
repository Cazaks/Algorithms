import java.util.Scanner;
public class PrintingNumbersLoopAttemptCounting{
public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	int userInput = 1;
	int attemptCount = 0;

	while (true){
		System.out.println("Eneter a number between 0 - 9");
		userInput = scan.nextInt();

		if(userInput >= 0 && userInput <= 9){
		break;
		}

		else{
		System.out.println("Invalid");
		}
	
	}

}
}