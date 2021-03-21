import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Work2_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = in.nextInt();

        if (i < 10 ) {
            System.out.println("Положительное число меньше 10");
        }
        else {
            System.out.println("Положительное число >/= 10");
        }
    }

}





