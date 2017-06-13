/**
 * Created by 057000-07165 on 13.06.2017.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayInit array = new ArrayInit();
        array.setArrayLength();
        array.createArray();
        array.displayArray();
        System.out.println("");
        System.out.println("Минимальное значение = " + array.getMinValue());
        System.out.println("");
        System.out.println("Максимальное значение = " + array.getMaxValue());

    }
}