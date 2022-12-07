import java.util.Scanner;

public class Seminar1_4 {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        char oper = getOperation();
        System.out.println("Результат операции: "+calculator(a, b, oper));
        }

   public static char getOperation(){
        System.out.println("Укажите операцию, которую надо выполнить с этими числами:");
        Scanner scanner = new Scanner(System.in);
        char operation = scanner.next().charAt(0);
        return operation;
   }
       
    public static int calculator(int a, int b,char operation){
        int result = 0 ;
        switch(operation){
            case '+':
            result = a+b;
            break;
        case '-':
            result = a-b;
            break;
        case '*':
            result = a*b;
            break;
        case '/':
            result = a/b;
            break;
        }
      return result;
    }



}
