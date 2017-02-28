/*
Завдання 2


Використовуючи цикл for виведіть на екран матрицю. Зверніть увагу на форматування (відступи):

 *  2  3  4  * 
 6  *  8  * 10 
11 12  * 14 15 
16  * 18  * 20 
 * 22 23 24  * 

*/

package week2;

public class MatrixPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=1;
		String str_x;
		String str_temp = new String("1, 5, 7, 9, 13, 17, 19, 21, 25");
      
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { 
            	str_x = Integer.toString(x);
            	if (x!=2&&x!=3&&str_temp.matches("(.*)"+str_x+"(.*)")){
            		System.out.print(" " + "*" + " ");
                    
            	}
            	else if (x<10) System.out.print(" " + x + " ");
                else{
                	System.out.print(x + " ");	
                }
                x+=1;
            }
            System.out.println();          
            
        }

	}

}
