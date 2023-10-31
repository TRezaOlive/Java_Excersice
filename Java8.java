import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1からnまでの和を求めます。 ");
        System.out.print("nの値: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("1から" + n + "までの和は" + sum + "です。");
        
       
    }
}
