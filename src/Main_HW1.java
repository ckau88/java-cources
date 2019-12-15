//import com.epam.lessons.Human;

import java.util.Scanner;

public class Main_HW1 {
    public static void main(String[] args) {

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, и т.д.,
        //в которой первые два числа равны либо 1 и 1, либо 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел.
        //От вас требуется вывести в консоль (System.out.println) первые 10 чисел. Для этого задания нужно использовать цикл for.
        int [] array_fibbonachi = new int[20];
        array_fibbonachi[0]=0;
        array_fibbonachi[1]=1;
        //в которой первые два числа равны либо 1 и 1, либо 0 и 1.
        for (int i=2;i<20;i++)
            {
                // каждое последующее число равно сумме двух предыдущих чисел.
                array_fibbonachi[i]=array_fibbonachi[i-1]+array_fibbonachi[i-2];
            }
        System.out.println("Задание 1: Нужно вывести на экран ряд чисел фибоначи:");
        for (int i=0; i<10; i++)
            {
            System.out.println(array_fibbonachi[i]);
            //От вас требуется вывести в консоль (System.out.println) первые 10 чисел.
            }

//        2. Нужно вывести на экран факториал. Факториал числа — это произведение натуральных чисел от 1 до самого числа (включая данное число).
//                Пример факториала от 6: 1 · 2 · 3 · 4 · 5 · 6 = 720. Т.е программа должна посчитать произведение чисел и вывести конечный результат в консоль.
//
        System.out.println("Задание 2: Нужно вывести на экран факториал.");
        System.out.println("Введите число:");
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Число = ");
       System.out.print(number);

        for (int i=1; i<(number+1); i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Факториал = ");
        System.out.print(factorial);
        }


    }

