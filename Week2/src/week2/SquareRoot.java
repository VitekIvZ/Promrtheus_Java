
/*
Завдання 1


Створіть застосування що знаходить корені квадратного рівняння. Коефіцієнти задаються через змінні:

double a;
double b;
double c;

Примітка: для обрахування квадратного кореня використовуйте конструкцію Math.sqrt(). Наприклад:

double x = Math.sqrt(4);

після виконання х буде рівним 2

Результат повинен мати наступний формат (за умови що корені, наприклад, 2 та 3):

x1=2
x2=3

Якщо корінь один (наприклад 5)

x1=5
x2=5

Якщо корені відсутні

x1=
x2=

*/

package week2;

public final class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double a = 3;
		double b = 2.5;
		double c = -0.5;
        
        double x1;
        double x2;

        if ((a!=0)&&(b!=0)&&(c!=0)){
        double D = Math.pow(b,2) - 4 * a * c;
        
        if (D > 0.0){
            x1 = ((-b + Math.sqrt(D)) / (2 * a));
            x2 = ((-b - Math.sqrt(D)) / (2 * a));

            if ((x1 >= 0 | x1 < 0) & (x2 >= 0 | x2 < 0))
            {
                    System.out.println("x1="+x1);
                    System.out.println("x2="+x2);
            }

            else
            {
                    System.out.println("x1=");
                    System.out.println("x2=");
             }
       }

       else if (D == 0)
       {
           x1 = (- b)/(2*a);
           x2 = x1;

           if ((x1 >= 0 | x1 < 0) & (x2 >= 0 | x2 < 0))
           {
               System.out.println("x1="+x1);
               System.out.println("x2="+x1);
           }

           else
           {
               System.out.println("x1=");
               System.out.println("x2=");
            }
         }

         else
            {
                System.out.println("x1=");
                System.out.println("x2=");
            }
       }
       else if ((a==0)&&(b!=0)){
           if (c==0){
               x1=0;
               x2=x1;
               System.out.println("x1="+x1);
               System.out.println("x2="+x2);
           }
           else{
               x1=-c/b;
               x2=x1;
               System.out.println("x1="+x1);
               System.out.println("x2="+x2);
           }
       
       }
       else if ((a==0)&&(b==0))
            {
                System.out.println("x1=");
                System.out.println("x2=");
            }
       else
            {
                System.out.println("x1=");
                System.out.println("x2=");
            }
	}

}
