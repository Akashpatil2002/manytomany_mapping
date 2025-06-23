package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.AuthorsEntitie;
import com.entities.BooksEntitie;

public class BookDao {
//	A book can have multiple authors.
//	An author can write multiple books.
	public void addBookk() {
		Configuration c = new Configuration();
		c.configure();
		c.addAnnotatedClass(BooksEntitie.class);
		c.addAnnotatedClass(AuthorsEntitie.class);
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		BooksEntitie be1 = new BooksEntitie();
		be1.setBook_id(1);
		be1.setBook_name("The Java Journey");
		be1.setPublication_year(2019);
		be1.setPrice(350);

		BooksEntitie be2 = new BooksEntitie();
		be2.setBook_id(2);
		be2.setBook_name("Code Chronicles");
		be2.setPublication_year(2021);
		be2.setPrice(450);

		BooksEntitie be3 = new BooksEntitie();
		be3.setBook_id(3);
		be3.setBook_name("Debugging the Mind");
		be3.setPublication_year(2023);
		be3.setPrice(500);

		AuthorsEntitie ae1 = new AuthorsEntitie();
		ae1.setAuthor_id(101);
		ae1.setAuthor_name("Ravi Sharma");
		ae1.setNationality("Indian");
		ae1.setTotal_books_written(5);
		ae1.setEmail("user@gmail.com");
		ae1.setPhone_number("9876543210");

		AuthorsEntitie ae2 = new AuthorsEntitie();
		ae2.setAuthor_id(102);
		ae2.setAuthor_name("Emily Thompson");
		ae2.setNationality("British");
		ae2.setTotal_books_written(3);
		ae2.setEmail("emily@gmail.com");
		ae2.setPhone_number("7700123456");

		AuthorsEntitie ae3 = new AuthorsEntitie();
		ae3.setAuthor_id(103);
		ae3.setAuthor_name("Kenji Tanaka");
		ae3.setNationality("Japanese");
		ae3.setTotal_books_written(8);
		ae3.setEmail("demo@gmail.com");
		ae3.setPhone_number("9012345678");

		List<BooksEntitie> list1 = new ArrayList<BooksEntitie>();
		List<AuthorsEntitie> list2 = new ArrayList<AuthorsEntitie>();

		list1.add(be1);
		list1.add(be2);
		list1.add(be3);

		list2.add(ae1);
		list2.add(ae2);
		list2.add(ae3);
		
		// A book can have multiple authors
		be1.setAuthors(list2);
		be2.setAuthors(list2);
		be3.setAuthors(list2);

		// An author can write multiple books
		ae1.setBooks(list1);
		ae2.setBooks(list1);
		ae3.setBooks(list1);

//		s.save(be1);
		s.persist(be1);
		s.persist(be2);
		s.persist(be3);
		s.persist(ae1);
		s.persist(ae2);
		s.persist(ae3);

		System.out.println("Data inserted Successfully");

		t.commit();
		s.close();

	}

}
