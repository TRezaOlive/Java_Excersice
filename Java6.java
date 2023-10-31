public class Java6{

	public static void main(String[] args) {
		System.out.println("救の表面積と体積をまとめます");
		System.out.print("半径:");
		double r=new java.util.Scanner(System.in).nextDouble();
		double a=4*Math.PI*r*r;
		double b=(4.0/3)*Math.PI*r*r*r;
		System.out.println("表面積は:"+a+"です");
		System.out.print("体積は:"+b+"です");
		

	}

}
