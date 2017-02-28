/*
Завдання 5

Напишіть застосування, що виконує пошук заданого числа у 
відсортованому масиві — бінарний пошук

У випадку коли число знайдено виведіть на екран його 
позицію в масиві (позиції нумеруємо з нуля) або -1 в 
іншому випадку
*/

package week2;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;

		boolean flag = false; 
		for (int i = 0; i < data.length; i++){
			if(data[i]==numberToFind){
				System.out.println(i);
				flag = true;
			}
		}
		if(flag == false){
			System.out.println(-1);
		}

	}

}
