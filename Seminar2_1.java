import java.util.Map;
import java.util.Scanner;

public class Seminar2_1 {
    
    public static void main(String[] args) {
         Equation();
    } 

    public static String GetString(){
        Scanner str = new Scanner(System.in);
        System.out.print("Введите формулу");
        String equation = str.nextLine();
        return equation;
    }

    public static void Equation(){
        Map<String, Integer> states = new HashMap<String, Integer>();
        states.put("0",0);
        Scanner str = new Scanner (System.in);
        String equation = GetString();
        equation = String.format(equation).replace(" ", "");
        String[] st1 = equation.split("\\+");
        int [] numers = new int [st1.length];
        int sum = 0;
        for (int i = 0; i < st1.length; i++) {
            for (Map.Entry<String, Integer> item : states.entrySet()) {
                if (item.getKey() != st1[i]){
                    int num = str.nextInt();
                    states.put(st1[i], num);
                    break;
                }
        }
           
        }
        for (Map.Entry<String, Integer> item : states.entrySet()) {
            sum += item.getValue();
        }
        System.out.print(sum);
    }
}
