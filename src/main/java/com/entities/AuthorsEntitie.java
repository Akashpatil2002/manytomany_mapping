package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class AuthorsEntitie { // Many-To-Many
	@Id
	private int author_id;
	private String author_name;
	private String nationality;
	private int total_books_written;
	private String email;
	private String phone_number;

	@ManyToMany(mappedBy = "authors")
	private List<BooksEntitie> books;

	public AuthorsEntitie() {

	}

	@Override
	public String toString() {
		return "AuthorsEntitie [author_id=" + author_id + ", author_name=" + author_name + ", nationality="
				+ nationality + ", total_books_written=" + total_books_written + ", email=" + email + ", phone_number="
				+ phone_number + ", books=" + books + "]";
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getTotal_books_written() {
		return total_books_written;
	}

	public void setTotal_books_written(int total_books_written) {
		this.total_books_written = total_books_written;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public List<BooksEntitie> getBooks() {
		return books;
	}

	public void setBooks(List<BooksEntitie> books) {
		this.books = books;
	}

	public AuthorsEntitie(int author_id, String author_name, String nationality, int total_books_written, String email,
			String phone_number, List<BooksEntitie> books) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
		this.nationality = nationality;
		this.total_books_written = total_books_written;
		this.email = email;
		this.phone_number = phone_number;
		this.books = books;
	}

}
