import java.util.Scanner;

/**
 * Created User on 12.05.22.
 * @author User 
 * @see #main(String[])
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: "); // пользователь вводит с клавиатуры первое число
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");  // пользователь вводит с клавиатуры второе число
        double b = scanner.nextDouble();
        System.out.println("Сумма чисел равна: ");
        System.out.printf("%.4f", a+b);
        scanner.close();
    }
}
