package by.belhard.j20.kotov.lessons.HW.ThirdTaskTwo;

public class ThirdHTSecond {

    public static void main(String[] args) {


/*2) Создать массив целых чисел, записать в него 10 значений.
     Посчитать и вывести сумму всех значений и среднее  значение.
     *доп.Посчитать и вывести медиану Медиана (вики).*/

        int[] arrayTwo = {5, 11, 12, 50, 56, 7, 134, 6, 18, 56}; // удобная запись значений в массив

        double summa = arrayTwo[0]; // для начала присваиваем значение суммы нулевому занчанию массива

        double Sredneeznachenie;

        for (int k = 1; k < arrayTwo.length; k ++){

            summa += arrayTwo[k]; // простое сложение

        }

            System.out.println("Summa chisel = " + summa);

        System.out.println("Srednee znachenie  = " + summa / arrayTwo.length);

        /* доп.Посчитать и вывести медиану Медиана (вики)
         медианой упорядоченного ряда чисел с чётным числом членов называется среднее арифметическое двух чисел, записанных посередине.
         */



    }
}

