package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int a;
        boolean b;
        double c =a/b;

        System.out.print("vedite dva chisla ");{

            if (b = 0)
                System.out.println(" Net reshenia");
            else
                System.out.println("chasnoe = " + c);
        }}}



  import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;


        System.out.print(" В каком году была основана Одесса ");
        if (a ==1794 )
            System.out.println("Ответ правильный ");{
                else
        }
        System.out.println(" Вы ошиблись ,Одесса была основана в 1794  " );

    }}


        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        int skidka = a / 100 * 3;
        double d = a / 100 * 5;

        System.out.print("Вычисление стоимости покупки с учетом скидки. ");
        if (a > 500)
            System.out.println("Вам предоставляется скидка 3%.\n Сумма с учетом скидки: " + skidka);
    } else

    {
        if (a > 1000)
            System.out.println("Вам предоставляется скидка 5%.\n Сумма с учетом скидки: " + d);

    }

}



package com.company;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;



        if (a%2)==0) {
            System.out.println("Число " + n + " четное ");
        }
        else{

            System.out.println("Число " + n + " нечетное ");
        }
    }

package com.company;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a;


            if (a%3)==0) {
                System.out.println("Число a  делится на 3  " );
            }
        else{

                System.out.println("Число a   не делится на 3  ");
            }
        }


package com.company;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                System.out.println("\nОператор множественного выбора. Пример 2");
                System.out.println("Введите номер дня недели: 1-2-3-4-5-6-7: ");

                String myDay = Scanner.next();
                double  prise ;
                double skidka=prise/100*20;
                double  sum=prise * skidka;
                int day = Integer.parseInt(myDay);

                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("цена равна " +prise);
                        break;
                    case 6:
                    case 7:
                        System.out.println("цена равна " +sum);
                        break;

                }

            }}


package com.company;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                int number = 0; // только для трехназных чисел

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter number : ");
                number = scanner.nextInt();

                int f = number / 100; // сотые
                int s = (number - 100 * f) / 10; // десятые
                int t = (number - 100 * f) - 10 * s; // единицы
                if (f>t)
                {System.out.println("Первое больше Последнего ");}
                else{
                    System.out.println("Первое меньше последнего ");}
                if (f>s){
                    System.out.println("Первое больше второго ");}
                else
                {System.out.println("первое менше второго ");}
                if (s>t)
                {System.out.println("второе больше последнего ");}
                else
                {System.out.println("Второе меньше последнего .");}}}


package com.company;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                int number = 0; // только для трехназных чисел

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter number : ");
                number = scanner.nextInt();

                int f = number / 100; // сотые
                int s = (number - 100 * f) / 10; // десятые
                int t = (number - 100 * f) - 10 * s; // единицы
                int chislo2 =number*number;
                int cub= f*f*f+s*s*s+t*t*t;
                if (chislo2==cub)
                {System.out.println(" равны  ");}
                else{

                    System.out.println("не равны");}
            }}

package com.company;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                int x = 0; // только для трехназных чисел

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter x: ");
                x = scanner.nextInt();
                int y = 0; // только для трехназных чисел


                System.out.print("Enter y: ");
                y = scanner.nextInt();


                if (x<y)
                    x=(x+y)/2;
                y=2*y*x;
                {System.out.println("x= "+x+
                        "y= "+y);}

                if (x>y)
                    y=(x+y)/2;
                x=2*y*x;
                {System.out.println("x= "+x+
                        "y= "+y);}

            }}}}


