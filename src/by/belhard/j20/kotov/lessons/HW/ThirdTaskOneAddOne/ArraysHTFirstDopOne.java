package by.belhard.j20.kotov.lessons.HW.ThirdTaskOneAddOne;

public class ArraysHTFirstDopOne {

    public static void main(String[] args) {

    /*Вывести в строку через пробел все числа от 1 до 100,
 которые делятся без остатка либо на 5, либо на 7, но не одновременно на 5 и на 7.*/

        int[] arraydopone = new int[100];

        for (int i = 0; i < arraydopone.length; i++) {

            arraydopone[i] = i + 1;  // присваивает 0 значению Массива 1, 99му  значение 100


            if (arraydopone[i] % 35 != 0) { // проверяем главное условие - делится не одновременно на 5 и на 7

                if (arraydopone[i] % 5 == 0) {

                    if (arraydopone[i] % 7 != 0) {

                        System.out.print(arraydopone[i] + " ");
                    }
                }
            }

            if (arraydopone[i] % 7 == 0) {

                if (arraydopone[i] % 5 != 0) {

                    if (arraydopone[i] % 35 != 0) {

                        System.out.print(arraydopone[i] + " ");

                    }
                }
            }
        }
    }
}


