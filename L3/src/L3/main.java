package L3;
import  java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is your name: ");
		String name=scanner.nextLine();
		
		
		System.out.println("How old are you?");
		int age=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What is your favourite food? ");
		String food=scanner.nextLine();
		
		
		System.out.println("My name is "+name);
		System.out.println("I'm "+age+" years old.");
		System.out.println("I love "+food);
		

	}

}
