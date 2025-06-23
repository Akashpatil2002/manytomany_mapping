# 🔗 Hibernate Many-to-Many Mapping Example

This project demonstrates how to implement a Many-to-Many relationship using Hibernate ORM with Java. It connects two entities where each entity can be associated with multiple records of the other, using a join table.

📘 Description
In this example, we model a many-to-many relationship between Author and Book entities:

An Author can write multiple Books
A Book can be written by multiple Authors

Hibernate manages this using the @ManyToMany annotation and a join table called author_book.

🗃️ Database Structure
author: Stores author data

book: Stores book data

author_book: Join table with foreign keys (author_id, book_id)

