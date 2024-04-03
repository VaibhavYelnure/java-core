package com.learning.core.day1session1;

public class TestBook {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.seBook_title("Java Programming");
		b.setBook_price(350.00);
        System.out.println("Book Title: "+b.getBook_title()+" Price: "+b.getBook_price());
	}

}
