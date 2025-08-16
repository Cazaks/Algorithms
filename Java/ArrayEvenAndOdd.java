import java.util.Arrays;

public class ArrayEvenAndOdd{

public static int[] arraysOfNumbers(int[] arrays){

	//int[] arrayNumber = new int[5];


	for(int count = 0; count < arrays.length; count++){
		if (arrays[count] % 2 == 0) {
			arrays[count] = 0;
		}
		else {
			arrays[count] = 1;	
		}
	
	}
	return arrays;
	
}

public static void main(String[]args){
	int[] newArray = {2, 1, 4, 4, 5};

	System.out.println(Arrays.toString(ArrayEvenAndOdd.arraysOfNumbers(newArray)));
}
}