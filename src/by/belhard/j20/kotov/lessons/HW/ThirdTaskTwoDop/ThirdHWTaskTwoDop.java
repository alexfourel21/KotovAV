package by.belhard.j20.kotov.lessons.HW.ThirdTaskTwoDop;

public class ThirdHWTaskTwoDop {

    public static void main(String[] args) {


/*2) Создать массив целых чисел, записать в него 10 значений.
          доп.Посчитать и вывести медиану Медиана (вики).
          медианой упорядоченного ряда чисел с чётным числом членов
           называется среднее арифметическое двух чисел, записанных посередине*/

        int[] arrayTwo = {5, 11, 12, 50, 56, 7, 134, 6, 18, 56}; // удобная запись значений в массив

        for (int b = 0; b < arrayTwo.length; b++) { // пока не понял как это работает!!!!

            int min = arrayTwo[b];

            int min_b = b;

            for (int j = b + 1; j < arrayTwo.length; j++) {

                if (arrayTwo[j] < min) {
                    min = arrayTwo[j];
                    min_b = j;
                }
            }

            if (b != min_b) {
                int tmp = arrayTwo[b];
                arrayTwo[b] = arrayTwo[min_b];
                arrayTwo[min_b] = tmp;
            }
        }


        double mediana = (arrayTwo[4] + arrayTwo[5]) / 2;

        System.out.println(mediana);


    }
    }




