import java.util.Scanner;

public class Work2_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int i = in.nextInt();

        switch (i){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Выходные");
                break;
            case 7:
                System.out.println("Выходные");
                break;
        }
        }

}
