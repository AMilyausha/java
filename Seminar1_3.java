//    Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся
//    только на себя и на единицу без остатка.
//    Чтобы найти остаток от деления используйте оператор % ,например 10%3 будет равно единице)
public class Seminar1_3 {
    public static void main(String[] args) {
        int count =0;
        for (int i = 1; i < 1000; i++) {
               if (ex4(i)) {
                   System.out.print(i + "\t");
                   count++;
                   if (count % 10 ==0){
                       System.out.println();
                   }
               }
           }
    }

    public static boolean ex4 ( int a){
    boolean d = false;
    if (a == 2) {
        d = true;
    }
    for (int j = 2; j < a; j++) {
        if (j == (a - 1)) {
            d = true;
        }
        if ((a % j) == 0) {
            break;
        }
    }
    return d;
}
}