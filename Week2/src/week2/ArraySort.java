/*
Завдання 3

Напишіть застосування для сортування масиву методом бульбашки
*/

package week2;

public class ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		int tmp = 0;
		boolean flag = true;   // set flag to true to begin first pass
		
		while (flag){
			
			flag=false;
			for(int x = 0; x < length-1; x++){
				if (array[x]>array[x+1]){
					tmp=array[x+1];
					array[x+1]=array[x];
					array[x]=tmp;
					flag=true;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
