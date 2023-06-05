package oopsdemo2;

import java.util.List;

//Composition Example
public class Library {
	
	List<Book> books;  //Object Reference --Composition

	
	//constructor to initialize books in library
	public Library(List<Book> books) {
		this.books = books;
	}

	//getter() method to getBooks in Library
	public List<Book> getBooks() {
		return books;
	}
	
	
	

}
