import java.util.Arrays;
public class ArrayExercise{

public static int[] arraysOfNumbers(int[] arrays){


	for(int count = 0; count < arrays.length; count++){
		arrays[count] = arrays[count] - 1;
	}
	return arrays;
	
}

public static void main(String[]args){
	int[] newArray = {2, 1, 4, 4};

	System.out.println(Arrays.toString(ArrayExercise.arraysOfNumbers(newArray)));
}
}