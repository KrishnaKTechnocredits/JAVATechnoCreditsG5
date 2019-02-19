package ravi;
import java.util.Scanner;

//Class to teat members of class Book
public class TestBookClass {

	public static void main(String[] args) {
		System.out.println("Please enter Book's Title, Publisher and Author name : "); //Taking input from user on console
		Scanner scan = new Scanner(System.in);
		String title = scan.next();
		String publisher = scan.next();
		String author = scan.next();
		Book object = new Book(title, publisher, author);  //Object creation for book class with parameterized constructor
		object.displayBookDetails();				//Method call to display book details
	}
}
