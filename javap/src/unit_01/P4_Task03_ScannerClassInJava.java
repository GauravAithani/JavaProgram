package unit_01;
import java.util.Scanner;
public class P4_Task03_ScannerClassInJava {
public static void main(String[] args) {
		
		//Creating Scanner Object
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		//Read The First-Token:
		System.out.println("Enter the name by using 1st Scanner object:");
		String firstname=in.next();
		System.out.println("Name is:  " + firstname + "\n");
		
		System.out.println("Enter the name by using 2nd Scanner object:");
		String name=sc.nextLine();
		System.out.println("Enter the name by using 2nd Scanner object:");
		String name2=sc.nextLine();
		
		System.out.println("Name is: " + name + "\n");
		System.out.println("Name is: " + name2 + "\n");
		
		boolean b=sc.nextBoolean();
		System.out.println(b + "\n");
		
		in.close();
		sc.close();

	}
}
