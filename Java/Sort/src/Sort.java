import java.util.Collections;
import java.util.List;

public class Sort {
	public static void selectSort(List<Integer> array) {
		for (int i = 0; i < array.size(); i++) {
			int min = i;
			for (int j = i; j < array.size(); j++) {
				if(array.get(min)>array.get(j)) {
					min = j;
				}
			}
			Collections.swap(array,i,min);
		}
	}
	
	public static void insertSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			int seat = i-1;
			while (seat >= 0 && temp < array[seat]) {
				array[seat+1] = array[seat];
				seat--;
			}
			array[seat+1] = temp;
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
