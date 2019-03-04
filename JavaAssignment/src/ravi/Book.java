package ravi;

//Class has one parameterized constructor and will display book details
public class Book {
	String bookTitle;			//instance variable declaration
	String bookPublisher;
	String bookAuthor;
	
	Book(String title, String publisher, String author){	//parameterized constructor to take dynamic values
		this.bookTitle=title;
		this.bookPublisher=publisher;
		this.bookAuthor=author;
	}
	
	void displayBookDetails(){			//Method to display book details
		System.out.println("Book Details are as below"); 
		System.out.println("Book Title is --> "+bookTitle);
		System.out.println("Book published by --> "+bookPublisher);
		System.out.println("Book written by --> "+bookAuthor);
	}
}
