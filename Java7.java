import java.util.Scanner;

public class Java7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("正の整数値を入力してください: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("正の整数値を入力してください。");
        } else {
            System.out.println("カウントアップします。");
            for (int i = 0; i <= n; i++) {
                System.out.println(i + " ");
            }
        }
        
        scanner.close();
    }
}
