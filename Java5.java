public class Java5 {

	public static void main(String[] args) {
		System.out.print("整数値:");
		int name=new java.util.Scanner(System.in).nextInt();
		int x=1275;
		int y=10;
		int a=x/y;
		int b=x%y;
		System.out.println("最下位桁を除いた値は："+a+"です");
		System.out.print("最下位桁は："+b+"です");

	}

}
