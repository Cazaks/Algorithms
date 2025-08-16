import java.util.Arrays;

public class ArraySumming{
	public static void main(String[]args){
	
		int[] grades = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;

		for(int count = 0; count < grades.length; count++){
			total += grades[count];
		}

		System.out.printf("The total grade score is %d%n", total);
	}
}