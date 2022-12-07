//    Вычислить n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Seminar1_2 {
    public static void main(String[] args) {
     int res2 = ex2();
     System.out.println(res2);
    }

    public static int ex2(){
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 2; i <=n ; i++) {
            factorial= factorial * i;
        }
        return factorial;
    }
}