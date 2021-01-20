import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,8,1,0,2,3};
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("array elements after sorting first 4 elements");

		Arrays.parallelSort(arr,0,4);
		for(int j:arr) {
			System.out.print(+j+" ");
		}

		Arrays.parallelSort(arr);
		
		System.out.println("array elements after sorting");
		
		for(int j:arr) {
			System.out.print(+j+" ");
		}
		

	}

}
