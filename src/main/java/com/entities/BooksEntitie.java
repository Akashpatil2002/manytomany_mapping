package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class BooksEntitie {
	@Id
	private int book_id;
	private String book_name;
	private int publication_year;
	private double price;

	@ManyToMany
	@JoinTable(name = "resultm2m", joinColumns = { @JoinColumn(name = "author_id") }, inverseJoinColumns = {
			@JoinColumn(name = "book_id") })
	private List<AuthorsEntitie> authors;

	public BooksEntitie() {

	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getPublication_year() {
		return publication_year;
	}

	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<AuthorsEntitie> getAuthors() {
		return authors;
	}

	public void setAuthors(List<AuthorsEntitie> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "BooksEntitie [book_id=" + book_id + ", book_name=" + book_name + ", publication_year="
				+ publication_year + ", price=" + price + ", authors=" + authors + "]";
	}

	public BooksEntitie(int book_id, String book_name, int publication_year, double price,
			List<AuthorsEntitie> authors) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.publication_year = publication_year;
		this.price = price;
		this.authors = authors;
	}

}
