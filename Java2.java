import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
		
		 Scanner myObj = new Scanner(System.in);
		    String userName;
		    Scanner myObj1 = new Scanner(System.in);
		    String userName1;
		    
		   
		    System.out.println("牲："); 
		    System.out.println("名："); 
		    userName = myObj.nextLine();
		    userName1=myObj1.nextLine();
		       
		    System.out.println("こんにちは" + userName+userName1+"さん");   
	}

}
