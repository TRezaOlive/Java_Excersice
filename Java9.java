import java.util.Scanner;

public class Java9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("カウントダウンします。 ");
        System.out.print("正の整数値: ");
        int n = scanner.nextInt();
        

        
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

      
        
    }
}