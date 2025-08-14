import java.util.Scanner;
public class TraficLight{
public static void main(String[]args){

Scanner scan = new Scanner(System.in);

	System.out.println("Enter a letter: R=stop, Y=Get read, G=Go");
	String options = scan.nextLine();

	if(options.equalsIgnoreCase("R")){
		System.out.println("Stop");
	}

	else
	if(options.equalsIgnoreCase("Y")){
		System.out.println("Get read");
	}

	else
	if(options.equalsIgnoreCase("G")){
		System.out.println("Go");
	}

	else{
		System.out.println("Ivalid option");
	}
}
}