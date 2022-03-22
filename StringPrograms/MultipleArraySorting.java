package StringPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleArraySorting {
	public static void main(String[] args) {
		int[] arr1 = {1,5,8,2,9};
		int[] arr2 = {7,6,3,4,0};
		
		List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		list1.addAll(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
		
		sortingUsingStreams(list1);
		
		int[] arr3 = new int[arr1.length +arr2.length];
		arr3 = mergeArray(arr1, arr2, arr3.length);
		sortingUsingCoreJava(arr3);
	}

	private static void sortingUsingCoreJava(int[] arr3) {
		for(int i=0;i<arr3.length;i++) {
			for(int j=i+1;j<arr3.length;j++) {
				Integer temp = 0;
				if(arr3[i] > arr3[j]) {
					temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		System.out.println("Basic sorted list: " + Arrays.toString(arr3));	
	}

	private static int[] mergeArray(int[] arr1, int[] arr2, int length) {
		int[] arr3 = new int[length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i] = arr2[i];
		}
		return arr3;
	}

	private static void sortingUsingStreams(List<Integer> list1) {
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println("stream sorted List: " + sortedList);
		
	}
}
