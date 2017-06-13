/**
 * Created by 057000-07165 on 13.06.2017.
 */
import java.util.Random;
import java.util.Scanner;

public class ArrayInit {

    int arrayLength;
    int blackBox[];

    ArrayInit() {

    }

    void setArrayLength() {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте длину массива (от 1 до 100):");
        int l = in.nextInt();
        if (l <= 0) {
            System.out.println("Ошибка! Длина массива должна быть от 1 до 100!");
        } else if (l > 100) {
            System.out.println("Ошибка! Длина массива должна быть от 1 до 100!");
        } else {
            arrayLength = l;
        }
    }

    void createArray() {
        blackBox = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < blackBox.length; i++) {
            blackBox[i] = random.nextInt(999);
        }
        System.out.println("");
    }

    void displayArray () {
        System.out.println("Содержимое массива: ");
        for (int i = 0; i < blackBox.length; i++) {
            System.out.print(blackBox[i] + ", ");
        }
        System.out.println("");
    }

    int getMinValue() {
        int min = blackBox[0];
        for (int j = 0; j < blackBox.length; j++) {
            if (min > blackBox[j]) {
                min = blackBox[j];
            }

        }
        return min;

    }

    int getMaxValue() {
        int max = blackBox[0];
        for (int j = 0; j < blackBox.length; j++) {
            if (max < blackBox[j]) {
                max = blackBox[j];
            }

        }
        return max;

    }

}