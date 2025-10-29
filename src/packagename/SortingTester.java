package packagename;
import java.util.Random;
public class SortingTester {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Random random = new Random();
		
		int[] arr1 = new Random().ints(1000000, 0, 100).toArray();
		
		for(int i =0; i<arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
		
		int[] arr11 = quadsort.mergeSort(arr1);
		
		System.out.println("");
		
		for(int i =0; i<arr11.length; i++) {
			System.out.print(arr11[i] + ",");
		}
		
		long end = System.currentTimeMillis();
		
		long time = end - start;
		
		System.out.println("");
		System.out.println(time);
	}

}
