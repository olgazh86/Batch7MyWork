package com.syntax.class21;

public class Book {
	
	String autor;
	String bookName;
	
	Book(String autor, String bookName){
		this(1);
		this.autor=autor;
		this.bookName=bookName;
		System.out.println(autor+bookName);
	}
	Book(int a){
		System.out.println("This is my favorite book");	
	}


	public static void main(String[] args) {
		Book obj = new Book("Antoine de Saint-Exupéry ", "The Little prince");

	}

}
