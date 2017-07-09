import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Test {
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public static void printArrayList(List<Integer> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = new int[]{5,8,2,9,6,1,10,3};
		List<Integer> al;
		al=Arrays.asList(ArrayUtils.toObject(array));
		Sort.selectSort(al);		
//		Sort.bubbleSort(array);
//		Sort.insertSort(array);
		Test.printArrayList(al);
	}
}
