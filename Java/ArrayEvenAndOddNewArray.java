import java.util.Arrays;

public class ArrayEvenAndOddNewArray{

public static int[] arraysOfNumbers(int[] arrays){

	int[] arrayNumber = new int[6];


	for(int count = 0; count < arrays.length; count++){
		if (arrays[count] % 2 == 0) {
			arrayNumber[count] = 0;
		}
		else {
			arrayNumber[count] = 1;	
		}
	
	}
	return arrayNumber;
	
}

public static void main(String[]args){
	int[] newArray = {3, 8, 9, 4, 6, 7};

	System.out.println(Arrays.toString(ArrayEvenAndOdd.arraysOfNumbers(newArray)));
}
}