# 🔗 Hibernate Many-to-Many Mapping Example

This project demonstrates how to implement a **Many-to-Many** relationship using **Hibernate ORM** with Java. It connects two entities where each entity can be associated with multiple records of the other, using a join table.

## 📘 Description

In this example, we model a many-to-many relationship between `Student` and `Course` entities:
- A **Student** can enroll in multiple **Courses**
- A **Course** can have multiple **Students**

Hibernate manages this using the `@ManyToMany` annotation and a **join table** called `student_course`.

## 🗃️ Database Structure

- **student**: Stores student data
- **course**: Stores course data
- **student_course**: Join table with foreign keys (`student_id`, `course_id`)

