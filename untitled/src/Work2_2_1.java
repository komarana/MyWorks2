import java.io.PrintStream;
import java.util.Scanner;

public class Work2_2_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int i = in.nextInt();
        String day = null;

        if (i == 1)
            day = "Понедельник";
         else if (i == 2)
            day = "Вторник";
         else if (i == 3)
            day = "Среда";
         else if (i == 4)
            day = "Четверг";
         else if (i == 5)
            day = "Пятница";
         else if (i == 6 || i == 7)
            day = "Выходной";

            System.out.println("День недели " + day);
        }
    }

