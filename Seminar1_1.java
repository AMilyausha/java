
  // Вычислить n-ое треугольного число(сумма чисел от 1 до n)
import java.util.Scanner;
public class Seminar1_1 {
    public static void main(String[] args) {
     int res = ex1();
     System.out.println(res);
    }

    public static int ex1(){
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = (N * (N + 1)) / 2;
        return result;
    }
}