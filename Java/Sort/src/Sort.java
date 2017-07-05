
public class Sort {
	public static void selectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i; j < array.length; j++) {
				if(array[min]>array[j]) {
					min = j;
				}
			}
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
	}
	
	public static void insertSort(int[] array) {
		for (int i = 2; i <= array.length; i++) {
			int temp = array[i];
			int seat = i;
			while (seat > 1 && temp < array[seat - 1]) {
				array[seat] = array[seat - 1];
				seat--;
			}
			array[seat] = temp;
		}
	}
	
	public static void bubbleSort(int[] array) {
		int flag,temp;
		for (int i = array.length-1; i >= 1; i--) {
			flag = 0;
			for (int j = 1; j <= i; j++) {
				if(array[j-1]>array[j]) {
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				return;
			}
		}
	}
}
