
public class Test {
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = new int[]{5,8,2,9,6,1,10,3};
//		Sort.selectSort(array);		
//		Sort.bubbleSort(array);
		Sort.insertSort(array);
		Test.printArray(array);
	}
}
