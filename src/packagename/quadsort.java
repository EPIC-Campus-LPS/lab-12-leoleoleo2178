package packagename;

public class quadsort {
	
	public static int[] bubbleSort(int[] arr) {
		boolean swap = false;
		for(int i =0; i< arr.length; i++) {
			for(int o = 0; o < arr.length-1; o++) {
				if (arr[o] >= arr[o+1]) {
					int temp = arr[o]; 
			        arr[o] = arr[o+1]; 
			        arr[o+1] = temp;
			        swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
		return arr;
	}
	
	
	public static int[] selectionSort(int[] arr) {
		
		int min;
		int select;
		int temp;
		
		for(int i = 0; i< arr.length; i++) {
			
			min = i;
			select = -1;
			temp = 0;
			
			for(int o = i; o < arr.length; o++) {
				
				if (arr[o] < arr[min]) {
					min = o;
					
				}
				
				
			}
			temp = arr[min]; 
	        arr[min] = arr[i]; 
	        arr[i] = temp;
			

		}
		
		return arr;
	}
	
	 public static int[] insertionSort(int[] arr) {
		 int temp;
		 for(int i = 1; i < arr.length; i++) {
			 int j = i-1;
			 int ah = arr[i];
			 
			 while (j >= 0 && arr[j] > ah) {
			        arr[j + 1] = arr[j];
			        j--;
			    }

			 arr[j + 1] = ah;
		 }
		 
		 
		 return arr;
		 
	 }
	 
	 public static int[] mergeSort(int[] arr) {
	        if (arr.length <= 1) {
	            return arr;
	        }

	        int m = arr.length / 2;

	        int[] l = new int[m];
	        int[] r = new int[arr.length - m];
	        for (int i = 0; i < m; i++) {
	            l[i] = arr[i];
	        }
	        
	        for (int i = m; i < arr.length; i++) {
	            r[i - m] = arr[i];
	        }

	        l = mergeSort(l);
	        r = mergeSort(r);
	        int[] arr2 = new int[arr.length];
	        
	        
	        int i = 0, j = 0, k = 0;
	        while (i < l.length && j < r.length) {
	            if (l[i] <= r[j]) {
	                arr2[k++] = l[i++];
	            } else {
	                arr2[k++] = r[j++];
	            }
	        }

	        while (i < l.length) {
	            arr2[k++] = l[i++];
	        }
	        while (j < r.length) {
	            arr2[k++] = r[j++];
	        }

	        return arr2;
	    }
}
