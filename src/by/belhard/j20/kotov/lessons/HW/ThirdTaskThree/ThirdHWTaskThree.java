package by.belhard.j20.kotov.lessons.HW.ThirdTaskThree;

public class ArraysThree {

    public static void main(String[] args) {

/* Дано: «треугольный» массив, то есть двумерный массив,
в котором в нулевой ячейке содержится массив с 1 ячейкой,
 в первой – с двумя, во второй – с тремя и т.д. Высота равна n.
 Заполнить массив таким образом, чтобы каждый следующий элемент был в 2 раза больше предыдущего, и вывести его на консоль.
  Начинать со значения intStart.

Пример для n = 3 и intStart = 5:

5

10 20

40 60 80
*/

        int[][] array = new int[2][];

        array[0][0] = 1;

        array.length[0] = 0;

        array.length[1] = 1;

        array.length[2] = 2;

        for (int h = 0; h <= array.length[h]; h++) {

            for (int p = 0; p <= 2; p++) {

                array[h][p] *= 2;

                System.out.print(array[h][p] + " ");

            }

           // int[h + 1][p]array = n * 2;

        }

           // System.out.print(int[h - 1][p] array +" ");



                System.out.println();

        /* for (int[] innerArray : multiTable) {
            for (int i : innerArray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < multiTable.length; i++) {
            for (int j = 0; j < multiTable[i].length; j++) {
                System.out.print(multiTable[i][j] + " ");
            }
            System.out.println();
            */


        }
    }



