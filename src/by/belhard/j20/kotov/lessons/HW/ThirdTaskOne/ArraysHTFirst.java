package by.belhard.j20.kotov.lessons.HW.ThirdTaskOne;

public class ArraysHTFirst {

    public static void main(String[] args) {

    /*Вывести в строку через пробел все числа от 1 до 100 (включая обе границы),
которые делятся без остатка на 3 и на 7 одновременно.
 */

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {

            array[i] = i + 1;  // присваивае 0 значению ассива 1, 99му  значение 100

            if (array[i] % 21 == 0) {

                System.out.print(array[i] + " ");

            }

        }
    }
}




     /*  public class ArraysExample {

    public static void main(String[] args) {

        int[] array = new int[5];



        for (int i = 0; i < array.length; i++) {
        array[i] = i * 2;
        }

        System.out.println("123");*/