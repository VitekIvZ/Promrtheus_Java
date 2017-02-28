/*
Завдання 4
Напишіть застосування для сортування масиву методом сортування Шелла (ShellSort). 
*/
package week2;

public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		for(int d=length/2; d >= 1; d/=2){
            for(int i=d; i < length; i++){
            	for(int j = i; j>=d && array[j - d] > array[j]; j -= d){
                            array[j]+=(array[j-d]-(array[j-d] = array[j]));
            	}
            }
        }
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
