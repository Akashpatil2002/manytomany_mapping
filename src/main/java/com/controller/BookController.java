package com.controller;

import com.service.BookService;

public class BookController {
	public static void main(String[] args) {
		BookService bs=new BookService();
		bs.addBook();
	}
}
