import java.util.Arrays;
public class ArraysExerciseTwo{

	public static int[] arraysOfNumbers(int[] arrays){

		for(int count = 0; count < arrays.length; count++){
		arrays[count] = arrays[count] - 1;
		}
	return arrays;
	}

	public static void main(String[]args){

		int[] newArrays = {5, 2, 8, 7, 4, 6, 3};

		System.out.println(Arrays.toString(ArraysExerciseTwo.arraysOfNumbers(newArrays)));
	}

}