
public class Sort {
	public static void selectSort(int[] array) {
		for (int i = 1; i <= array.length; i++) {
			int min = i;
			for (int j = i; j <= array.length; j++) {
				if(array[min]>array[j]) {
					min = j;
				}
			}
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
	}
}
